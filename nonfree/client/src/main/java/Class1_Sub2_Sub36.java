import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ug", name = "jb", descriptor = "I")
	private int anInt4095;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(17) int[] local17 = this.method3130(1, arg0);
			@Pc(23) int[] local23 = this.method3130(2, arg0);
			@Pc(27) int[] local27 = local7[0];
			@Pc(31) int[] local31 = local7[2];
			@Pc(35) int[] local35 = local7[1];
			for (@Pc(37) int local37 = 0; local37 < Static110.anInt2825; local37++) {
				@Pc(49) int local49 = local17[local37] * 255 >> 12 & 0xFF;
				@Pc(58) int local58 = local23[local37] * this.anInt4095 >> 12;
				@Pc(66) int local66 = local58 * Static110.anIntArray379[local49] >> 12;
				@Pc(74) int local74 = Static44.anIntArray145[local49] * local58 >> 12;
				@Pc(82) int local82 = (local66 >> 12) + local37 & Static99.anInt2523;
				@Pc(90) int local90 = Static64.anInt1680 & (local74 >> 12) + arg0;
				@Pc(96) int[][] local96 = this.method3118(local90, 0);
				local27[local37] = local96[0][local82];
				local35[local37] = local96[1][local82];
				local31[local37] = local96[2][local82];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		Static142.method2472();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(27) int[] local27 = this.method3130(1, arg0);
			@Pc(33) int[] local33 = this.method3130(2, arg0);
			for (@Pc(35) int local35 = 0; local35 < Static110.anInt2825; local35++) {
				@Pc(45) int local45 = local27[local35] >> 4 & 0xFF;
				@Pc(54) int local54 = local33[local35] * this.anInt4095 >> 12;
				@Pc(62) int local62 = Static44.anIntArray145[local45] * local54 >> 12;
				@Pc(71) int local71 = arg0 + (local62 >> 12) & Static64.anInt1680;
				@Pc(79) int local79 = Static110.anIntArray379[local45] * local54 >> 12;
				@Pc(87) int local87 = (local79 >> 12) + local35 & Static99.anInt2523;
				@Pc(93) int[] local93 = this.method3130(0, local71);
				local17[local35] = local93[local87];
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4095 = arg0.method878() << 4;
		} else if (arg1 == 1) {
			super.aBoolean215 = arg0.method861() == 1;
		}
	}
}
