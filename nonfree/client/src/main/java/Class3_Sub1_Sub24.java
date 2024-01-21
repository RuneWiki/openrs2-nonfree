import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class3_Sub1_Sub24 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
	private int anInt3124;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(27) int[] local27 = this.method3120(1, arg0);
			@Pc(33) int[] local33 = this.method3120(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static129.anInt3285; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = local33[local35] * this.anInt3124 >> 12;
				@Pc(62) int local62 = Static61.anIntArray316[local45] * local54 >> 12;
				@Pc(71) int local71 = local35 + (local62 >> 12) & Static105.anInt2733;
				@Pc(79) int local79 = local54 * Static167.anIntArray680[local45] >> 12;
				@Pc(87) int local87 = (local79 >> 12) + arg0 & Static106.anInt2755;
				@Pc(93) int[] local93 = this.method3120(0, local87);
				local11[local35] = local93[local71];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(26) int[] local26 = this.method3120(1, arg0);
			@Pc(32) int[] local32 = this.method3120(2, arg0);
			@Pc(36) int[] local36 = local16[2];
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[1];
			for (@Pc(46) int local46 = 0; local46 < Static129.anInt3285; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt3124 >> 12;
				@Pc(75) int local75 = Static61.anIntArray316[local58] * local67 >> 12;
				@Pc(83) int local83 = Static167.anIntArray680[local58] * local67 >> 12;
				@Pc(92) int local92 = arg0 + (local83 >> 12) & Static106.anInt2755;
				@Pc(100) int local100 = Static105.anInt2733 & local46 + (local75 >> 12);
				@Pc(106) int[][] local106 = this.method3124(0, local92);
				local40[local46] = local106[0][local100];
				local44[local46] = local106[1][local100];
				local36[local46] = local106[2][local100];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3124 = arg1.method1510() << 4;
		} else if (arg0 == 1) {
			super.aBoolean191 = arg1.method1545() == 1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	@Override
	public void method3131() {
		Static160.method2981();
	}
}
