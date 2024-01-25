import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class Class8 {

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "Lclient!hd;")
	protected final Class4_Sub20 aClass4_Sub20_31;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	protected int anInt9788;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8(@OriginalArg(0) Class4_Sub20 arg0) {
		this.aClass4_Sub20_31 = arg0;
		this.anInt9788 = this.method8383();
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		this.anInt9788 = arg0;
		this.aClass4_Sub20_31 = arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
	protected abstract void method8382(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)I")
	protected abstract int method8383();

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
	public final void method8384(@OriginalArg(0) int arg0) {
		if (this.method8387(arg0) != 3) {
			this.method8382(arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
	public abstract void method8386();

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(II)I")
	public abstract int method8387(@OriginalArg(1) int arg0);
}
