import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			Static326.method4267(local15, 0, Static22.anInt421, Static205.anIntArray450[arg0]);
		}
		return local15;
	}
}
