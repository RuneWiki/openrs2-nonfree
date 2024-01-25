import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class4_Sub2_Sub23 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qr", name = "K", descriptor = "I")
	private int anInt7843 = 32768;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7843 = arg1.method8859() << 4;
		} else if (arg0 == 1) {
			super.aBoolean793 = arg1.method8865() == 1;
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8771(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass304_41.method6699(arg0);
		if (super.aClass304_41.aBoolean604) {
			@Pc(26) int[] local26 = this.method8768(1, arg0);
			@Pc(32) int[] local32 = this.method8768(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static269.anInt4330; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt7843 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static190.anIntArray170[local58] >> 12;
				@Pc(83) int local83 = local67 * Static181.anIntArray229[local58] >> 12;
				@Pc(91) int local91 = local46 + (local75 >> 12) & Static215.anInt3481;
				@Pc(100) int local100 = Static489.anInt7677 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method8772(local100, 0);
				local36[local46] = local106[0][local91];
				local40[local46] = local106[1][local91];
				local44[local46] = local106[2][local91];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		Static282.method4074();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(25) int[] local25 = this.method8768(1, arg0);
			@Pc(31) int[] local31 = this.method8768(2, arg0);
			for (@Pc(33) int local33 = 0; local33 < Static269.anInt4330; local33++) {
				@Pc(43) int local43 = local25[local33] >> 4 & 0xFF;
				@Pc(52) int local52 = local31[local33] * this.anInt7843 >> 12;
				@Pc(60) int local60 = local52 * Static190.anIntArray170[local43] >> 12;
				@Pc(68) int local68 = Static181.anIntArray229[local43] * local52 >> 12;
				@Pc(76) int local76 = (local60 >> 12) + local33 & Static215.anInt3481;
				@Pc(84) int local84 = (local68 >> 12) + arg0 & Static489.anInt7677;
				@Pc(90) int[] local90 = this.method8768(0, local84);
				local11[local33] = local90[local76];
			}
		}
		return local11;
	}
}
