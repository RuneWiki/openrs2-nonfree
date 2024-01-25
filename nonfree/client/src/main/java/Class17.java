import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class Class17 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!eka;")
	protected final Class3_Sub15 aClass3_Sub15_31;

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
	protected int anInt10323;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class17(@OriginalArg(0) Class3_Sub15 arg0) {
		this.aClass3_Sub15_31 = arg0;
		this.anInt10323 = this.method8732();
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(ILclient!eka;)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		this.aClass3_Sub15_31 = arg1;
		this.anInt10323 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I")
	protected abstract int method8732();

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	public abstract void method8733();

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)I")
	public abstract int method8734(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)V")
	public final void method8736(@OriginalArg(1) int arg0) {
		if (this.method8734(arg0) != 3) {
			this.method8737(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)V")
	protected abstract void method8737(@OriginalArg(0) int arg0);
}
