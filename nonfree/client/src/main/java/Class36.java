import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class Class36 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!gn;")
	protected final Class8_Sub25 aClass8_Sub25_31;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	protected int anInt10496;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36(@OriginalArg(0) Class8_Sub25 arg0) {
		this.aClass8_Sub25_31 = arg0;
		this.anInt10496 = this.method8464();
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		this.aClass8_Sub25_31 = arg1;
		this.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	public final void method8462(@OriginalArg(1) int arg0) {
		if (this.method8466(arg0) != 3) {
			this.method8465(arg0);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public abstract void method8463();

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)I")
	protected abstract int method8464();

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
	protected abstract void method8465(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)I")
	public abstract int method8466(@OriginalArg(0) int arg0);
}
