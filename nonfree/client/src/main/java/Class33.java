import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class Class33 {

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!cq;")
	protected final Class2_Sub13 aClass2_Sub13_32;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	protected int anInt10093;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aClass2_Sub13_32 = arg0;
		this.anInt10093 = this.method8445();
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		this.aClass2_Sub13_32 = arg1;
		this.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public abstract void method8441();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	protected abstract void method8442(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)I")
	public abstract int method8443(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)V")
	public final void method8444(@OriginalArg(0) int arg0) {
		if (this.method8443(arg0) != 3) {
			this.method8442(arg0);
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I")
	protected abstract int method8445();
}
