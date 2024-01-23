import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
	private int anInt1106 = 32768;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(3, false);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(21) int[] local21 = this.method3733(arg0, 1);
			@Pc(27) int[] local27 = this.method3733(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static157.anInt3431; local29++) {
				@Pc(40) int local40 = this.anInt1106 * local27[local29] >> 12;
				@Pc(48) int local48 = local21[local29] >> 4 & 0xFF;
				@Pc(56) int local56 = local40 * Static167.anIntArray244[local48] >> 12;
				@Pc(64) int local64 = local40 * Static49.anIntArray67[local48] >> 12;
				@Pc(73) int local73 = arg0 + (local56 >> 12) & Static148.anInt3213;
				@Pc(81) int local81 = Static74.anInt1679 & local29 + (local64 >> 12);
				@Pc(87) int[] local87 = this.method3733(local73, 0);
				local7[local29] = local87[local81];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(26) int[] local26 = this.method3733(arg0, 1);
			@Pc(32) int[] local32 = this.method3733(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static157.anInt3431; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt1106 * local32[local46] >> 12;
				@Pc(75) int local75 = Static49.anIntArray67[local58] * local67 >> 12;
				@Pc(84) int local84 = Static74.anInt1679 & local46 + (local75 >> 12);
				@Pc(92) int local92 = Static167.anIntArray244[local58] * local67 >> 12;
				@Pc(100) int local100 = Static148.anInt3213 & arg0 + (local92 >> 12);
				@Pc(106) int[][] local106 = this.method3737(0, local100);
				local36[local46] = local106[0][local84];
				local40[local46] = local106[1][local84];
				local44[local46] = local106[2][local84];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		Static67.method1167();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1106 = arg0.method3805() << 4;
		} else if (arg1 == 1) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}
}
