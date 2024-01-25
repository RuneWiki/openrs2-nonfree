import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub4_Sub6 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(28) int[][] local28 = this.method5696(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			for (@Pc(42) int local42 = 0; local42 < Static395.anInt6592; local42++) {
				local11[local42] = (local32[local42] + local36[local42] + local40[local42]) / 3;
			}
		}
		return local11;
	}
}
