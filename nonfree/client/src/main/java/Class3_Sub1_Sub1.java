import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			Static604.method5915(local9, 0, Static206.anInt4182, Static9.anIntArray15[arg0]);
		}
		return local9;
	}
}
