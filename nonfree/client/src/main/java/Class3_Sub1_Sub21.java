import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
	private int anInt5436 = 32768;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub21() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(28) int[] local28 = this.method7765(1, arg0);
			@Pc(36) int[] local36 = this.method7765(2, arg0);
			for (@Pc(38) int local38 = 0; local38 < Static206.anInt4182; local38++) {
				@Pc(48) int local48 = local28[local38] >> 4 & 0xFF;
				@Pc(57) int local57 = local36[local38] * this.anInt5436 >> 12;
				@Pc(65) int local65 = local57 * Static548.anIntArray648[local48] >> 12;
				@Pc(73) int local73 = Static88.anIntArray140[local48] * local57 >> 12;
				@Pc(82) int local82 = local38 + (local65 >> 12) & Static439.anInt7283;
				@Pc(90) int local90 = (local73 >> 12) + arg0 & Static469.anInt7679;
				@Pc(96) int[] local96 = this.method7765(0, local90);
				local16[local38] = local96[local82];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(26) int[] local26 = this.method7765(1, arg0);
			@Pc(32) int[] local32 = this.method7765(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static206.anInt4182; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt5436 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static548.anIntArray648[local58] >> 12;
				@Pc(83) int local83 = Static88.anIntArray140[local58] * local67 >> 12;
				@Pc(92) int local92 = local46 + (local75 >> 12) & Static439.anInt7283;
				@Pc(101) int local101 = arg0 + (local83 >> 12) & Static469.anInt7679;
				@Pc(107) int[][] local107 = this.method7766(0, local101);
				local36[local46] = local107[0][local92];
				local40[local46] = local107[1][local92];
				local44[local46] = local107[2][local92];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5436 = arg0.method3109() << 4;
		} else if (arg1 == 1) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	@Override
	public void method7763() {
		Static79.method1728();
	}
}
