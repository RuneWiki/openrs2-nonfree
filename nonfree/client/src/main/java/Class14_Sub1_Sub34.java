import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class14_Sub1_Sub34 extends Class14_Sub1 {

	@OriginalMember(owner = "client!to", name = "M", descriptor = "I")
	private int anInt9990 = 32768;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		Static277.method4028();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9990 = arg0.method5900() << 4;
		} else if (arg1 == 1) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(26) int[] local26 = this.method8897(1, arg0);
			@Pc(32) int[] local32 = this.method8897(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static371.anInt6835; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = this.anInt9990 * local32[local34] >> 12;
				@Pc(61) int local61 = Static646.anIntArray808[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static656.anIntArray814[local44] >> 12;
				@Pc(78) int local78 = local34 + (local61 >> 12) & Static192.anInt3590;
				@Pc(86) int local86 = arg0 + (local69 >> 12) & Static52.anInt1266;
				@Pc(92) int[] local92 = this.method8897(0, local86);
				local16[local34] = local92[local78];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(26) int[] local26 = this.method8897(1, arg0);
			@Pc(32) int[] local32 = this.method8897(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static371.anInt6835; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt9990 >> 12;
				@Pc(75) int local75 = Static646.anIntArray808[local58] * local67 >> 12;
				@Pc(83) int local83 = Static656.anIntArray814[local58] * local67 >> 12;
				@Pc(91) int local91 = local46 + (local75 >> 12) & Static192.anInt3590;
				@Pc(100) int local100 = Static52.anInt1266 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method8904(0, local100);
				local36[local46] = local106[0][local91];
				local40[local46] = local106[1][local91];
				local44[local46] = local106[2][local91];
			}
		}
		return local16;
	}
}
