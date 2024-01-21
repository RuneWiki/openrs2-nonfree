import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
	private int anInt3741;

	@OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
	private int anInt3747;

	@OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
	private int anInt3754;

	@OriginalMember(owner = "client!tg", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
	private int anInt3742;

	@OriginalMember(owner = "client!tg", name = "Q", descriptor = "I")
	private int anInt3739;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
	private int anInt3743;

	@OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
	private int anInt3740;

	@OriginalMember(owner = "client!tg", name = "jb", descriptor = "I")
	private int anInt3752;

	@OriginalMember(owner = "client!tg", name = "nb", descriptor = "I")
	private int anInt3755;

	@OriginalMember(owner = "client!tg", name = "ob", descriptor = "I")
	private int anInt3756;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	private void method2550() {
		@Pc(8) Random local8 = new Random((long) this.anInt3739);
		this.anInt3742 = this.anInt3756 * this.anInt3743;
		this.anIntArrayArray68 = new int[this.anInt3742][2];
		@Pc(30) int local30 = 4096 / this.anInt3743;
		@Pc(35) int local35 = 4096 / this.anInt3756;
		this.anInt3754 = local30 >> 1;
		this.anInt3741 = local35 >> 1;
		@Pc(53) int local53 = this.anInt3754 * this.anInt3740 >> 12;
		@Pc(61) int local61 = this.anInt3741 * this.anInt3740 >> 12;
		for (@Pc(69) int local69 = 0; local69 < this.anInt3756; local69++) {
			@Pc(75) int local75 = local35 * local69;
			for (@Pc(77) int local77 = 0; local77 < this.anInt3743; local77++) {
				@Pc(87) int local87 = local69 * this.anInt3743 + local77;
				@Pc(98) int local98 = local53 * (Static77.method1232(8192, local8) - 4096) >> 12;
				@Pc(109) int local109 = local61 * (Static77.method1232(8192, local8) - 4096) >> 12;
				this.anIntArrayArray68[local87][0] = local30 * local77 + local98;
				this.anIntArrayArray68[local87][1] = local109 + local75;
			}
		}
		this.anInt3747 = this.anInt3743 > this.anInt3756 ? this.anInt3743 : this.anInt3756;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)[I")
	private int[] method2551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int[] local8 = new int[arg2];
		for (@Pc(10) int local10 = 0; local10 < arg2; local10++) {
			local8[local10] = Integer.MAX_VALUE;
		}
		arg1 += this.anInt3754;
		@Pc(31) int local31 = -1;
		arg0 += this.anInt3741;
		if (arg0 > 4096) {
			arg0 -= 4096;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46 = Integer.MAX_VALUE;
		if (arg1 > 4096) {
			arg1 -= 4096;
		}
		@Pc(57) int local57 = arg1 * this.anInt3743 >> 12;
		@Pc(64) int local64 = arg0 * this.anInt3756 >> 12;
		@Pc(66) int local66 = Integer.MAX_VALUE;
		@Pc(79) int local79 = this.anInt3743 > 2 ? 2 : this.anInt3743 - 1;
		@Pc(92) int local92 = this.anInt3756 > 2 ? 2 : this.anInt3756 - 1;
		@Pc(100) int local100;
		@Pc(111) int local111;
		@Pc(106) int local106;
		@Pc(160) int local160;
		@Pc(194) int local194;
		for (@Pc(95) int local95 = -local79; local95 <= local79; local95++) {
			for (local100 = -local92; local100 <= local92; local100++) {
				local106 = local100 + local64;
				local111 = local57 + local95;
				if (local106 < 0) {
					local106 += this.anInt3756;
				}
				if (local111 < 0) {
					local111 += this.anInt3743;
				}
				if (local106 >= this.anInt3756) {
					local106 -= this.anInt3756;
				}
				if (local111 >= this.anInt3743) {
					local111 -= this.anInt3743;
				}
				local160 = local111 + this.anInt3743 * local106;
				@Pc(167) int local167 = this.anIntArrayArray68[local160][1];
				@Pc(172) int local172 = arg0 - local167;
				if (local172 < 0) {
					local172 = -local172;
				}
				if (local172 > 2048) {
					local172 = 4096 - local172;
				}
				local194 = this.anIntArrayArray68[local160][0];
				@Pc(199) int local199 = arg1 - local194;
				if (local199 < 0) {
					local199 = -local199;
				}
				if (local199 > 2048) {
					local199 = 4096 - local199;
				}
				@Pc(222) int local222 = local199 * local199 + local172 * local172 >> 12;
				if (local46 > local222) {
					if (local44 == -1) {
						local44 = local160;
						local66 = local222;
					} else {
						local66 = local46;
						local44 = local31;
					}
					local31 = local160;
					local46 = local222;
				} else if (local31 == local44 && local160 != local44 || local66 > local222 && local160 != local31) {
					local66 = local222;
					local44 = local160;
				}
			}
		}
		local100 = arg1 - this.anIntArrayArray68[local31][0];
		local111 = arg0 - this.anIntArrayArray68[local31][1];
		if (local100 < 0) {
			local100 = -local100;
		}
		if (local111 < 0) {
			local111 = -local111;
		}
		if (local100 > 2048) {
			local100 = 4096 - local100;
		}
		if (local111 > 2048) {
			local111 = 4096 - local111;
		}
		local106 = arg1 - this.anIntArrayArray68[local44][0];
		local160 = arg0 - this.anIntArrayArray68[local44][1];
		if (local160 < 0) {
			local160 = -local160;
		}
		if (local106 < 0) {
			local106 = -local106;
		}
		if (local160 > 2048) {
			local160 = 4096 - local160;
		}
		if (local106 > 2048) {
			local106 = 4096 - local106;
		}
		local194 = this.anInt3755;
		if (local194 == 1) {
			local46 = (int) Math.sqrt((double) (local111 * local111 + local100 * local100));
			local66 = (int) Math.sqrt((double) (local160 * local160 + local106 * local106));
		} else if (local194 == 2) {
			local46 = Math.max(local100, local111);
			local66 = Math.max(local106, local160);
		} else {
			local46 = local111 * local111 + local100 * local100;
			local66 = local106 * local106 + local160 * local160;
		}
		local8[0] = local46 * this.anInt3747;
		if (arg2 > 1) {
			local8[1] = local66 * this.anInt3747;
		}
		return local8;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(15) int local15 = Static11.anIntArray8[arg0];
			@Pc(18) int local18 = this.anInt3752;
			@Pc(36) int local36;
			if (local18 == 2) {
				for (local18 = 0; local18 < Static120.anInt2812; local18++) {
					local36 = Static69.anIntArray117[local18];
					@Pc(43) int[] local43 = this.method2551(local15, local36, 2);
					local7[local18] = local43[1] - local43[0];
				}
			} else if (local18 == 1) {
				for (local18 = 0; local18 < Static120.anInt2812; local18++) {
					local36 = Static69.anIntArray117[local18];
					local7[local18] = this.method2551(local15, local36, 2)[1];
				}
			} else {
				for (local18 = 0; local18 < Static120.anInt2812; local18++) {
					local36 = Static69.anIntArray117[local18];
					local7[local18] = this.method2551(local15, local36, 1)[0];
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3743 = this.anInt3756 = arg0.method1402();
		} else if (arg1 == 1) {
			this.anInt3739 = arg0.method1402();
		} else if (arg1 == 2) {
			this.anInt3740 = arg0.method1397();
		} else if (arg1 == 3) {
			this.anInt3752 = arg0.method1402();
		} else if (arg1 == 4) {
			this.anInt3755 = arg0.method1402();
		} else if (arg1 == 5) {
			this.anInt3743 = arg0.method1402();
		} else if (arg1 == 6) {
			this.anInt3756 = arg0.method1402();
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		this.method2550();
	}
}
