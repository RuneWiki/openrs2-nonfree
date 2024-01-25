import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class304 {

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	private int anInt8826;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Lclient!mq;")
	private Class71 aClass71_33;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	public int anInt8828;

	@OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
	private int anInt8832;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
	private int anInt8834;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
	private int anInt8835;

	@OriginalMember(owner = "client!qq", name = "q", descriptor = "I")
	private final int anInt8837;

	@OriginalMember(owner = "client!qq", name = "p", descriptor = "I")
	private final int anInt8836;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	private final int anInt8831;

	@OriginalMember(owner = "client!qq", name = "r", descriptor = "Z")
	private final boolean aBoolean639;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
	private final int anInt8827;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	private final int anInt8830;

	@OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
	private final int anInt8833;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
	private final int anInt8829;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt8837 = arg2;
		this.anInt8836 = arg3;
		this.anInt8831 = arg4;
		this.aBoolean639 = arg7;
		this.anInt8827 = arg1;
		this.anInt8830 = arg6;
		this.anInt8833 = arg5;
		this.anInt8829 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "()V")
	public void method7803() {
		this.aClass71_33 = null;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)Z")
	public boolean method7804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean639) {
			this.anInt8828 = 1073741823;
			local7 = this.anInt8837;
			local12 = this.anInt8836;
			local17 = this.anInt8831;
		} else {
			local7 = this.anInt8837 - arg0;
			local12 = this.anInt8836 - arg1;
			local17 = this.anInt8831 - arg2;
			this.anInt8828 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt8828 == 0) {
				this.anInt8828 = 1;
			}
			local7 = (local7 << 8) / this.anInt8828;
			local12 = (local12 << 8) / this.anInt8828;
			local17 = (local17 << 8) / this.anInt8828;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt8832 = this.anInt8833 * arg3 / (this.aBoolean639 ? 1024 : this.anInt8828);
		} else {
			this.anInt8832 = 0;
		}
		if (this.anInt8832 < 8) {
			this.aClass71_33 = null;
			return false;
		}
		@Pc(143) int local143 = Static432.method7064(this.anInt8832);
		if (local143 > arg3) {
			local143 = Static427.method7013(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt8826) {
			this.anInt8826 = local143;
		}
		this.anInt8835 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt8834 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass71_33 = null;
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ha;Lclient!qq;)Z")
	private boolean method7805(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class304 arg1) {
		if (this.aClass71_33 == null) {
			if (this.anInt8829 == 0) {
				if (Static94.anInterface3_1.method1940(this.anInt8827)) {
					@Pc(23) int[] local23 = Static94.anInterface3_1.method1939(0.7F, this.anInt8827, this.anInt8826, this.anInt8826);
					this.aClass71_33 = arg0.method8111(this.anInt8826, local23, this.anInt8826, this.anInt8826);
				}
			} else if (this.anInt8829 == 2) {
				this.method7807(arg0, arg1);
			} else if (this.anInt8829 == 1) {
				this.method7810(arg0, arg1);
			}
		}
		return this.aClass71_33 != null;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lclient!ha;Lclient!qq;)V")
	private void method7807(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class304 arg1) {
		@Pc(6) Class159 local6 = Static452.method7285(Static153.aClass124_42, this.anInt8827);
		if (local6 == null) {
			return;
		}
		arg0.K(Static495.anIntArray443);
		arg0.KA(0, 0, this.anInt8826, this.anInt8826);
		arg0.aa(0, 0, this.anInt8826, this.anInt8826, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean639) {
				local32 = -arg1.anInt8837;
				local34 = -arg1.anInt8836;
				local36 = -arg1.anInt8831;
			} else {
				local32 = this.anInt8837 - arg1.anInt8837;
				local34 = this.anInt8836 - arg1.anInt8836;
				local36 = this.anInt8831 - arg1.anInt8831;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt8835 != 0) {
			local81 = -this.anInt8835 & 0x3FFF;
			local85 = Class12_Sub2.anIntArray204[local81];
			local89 = Class12_Sub2.anIntArray203[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt8834 != 0) {
			local81 = -this.anInt8834 & 0x3FFF;
			local85 = Class12_Sub2.anIntArray204[local81];
			local89 = Class12_Sub2.anIntArray203[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class14 local172 = arg0.method8064(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8067(arg0.method8141());
		@Pc(218) Class76 local218 = arg0.method8085();
		local218.method9639(0, 0, arg0.i() - local172.HA());
		local172.method8623(local218, (Class15_Sub6) null, arg0.i(), 1);
		this.aClass71_33 = arg0.method8077(0, 0, this.anInt8826, this.anInt8826, true);
		this.aClass71_33.method7696(3);
		arg0.KA(Static495.anIntArray443[0], Static495.anIntArray443[1], Static495.anIntArray443[2], Static495.anIntArray443[3]);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(Lclient!ha;Lclient!qq;)Z")
	public boolean method7808(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class304 arg1) {
		return this.aClass71_33 != null || this.method7805(arg0, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method7809(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass71_33 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt8835 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt8834 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt8832) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt8832) / 2;
		if (local38 < arg4 && local38 + this.anInt8832 > 0 && local51 < arg3 && local51 + this.anInt8832 > 0) {
			this.aClass71_33.method7699(local51 + arg1, local38 + arg2, this.anInt8832, this.anInt8832);
		}
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(Lclient!ha;Lclient!qq;)V")
	private void method7810(@OriginalArg(0) Class101 arg0, @OriginalArg(1) Class304 arg1) {
		Static495.method7802(arg0);
		Static495.method7801(arg0);
		arg0.K(Static495.anIntArray443);
		arg0.KA(0, 0, this.anInt8826, this.anInt8826);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8826, this.anInt8826, this.anInt8830 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean639) {
				local31 = -arg1.anInt8837;
				local33 = -arg1.anInt8836;
				local35 = -arg1.anInt8831;
			} else {
				local31 = arg1.anInt8837 - this.anInt8837;
				local33 = arg1.anInt8836 - this.anInt8836;
				local35 = arg1.anInt8831 - this.anInt8831;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt8835 != 0) {
			local79 = Class12_Sub2.anIntArray204[this.anInt8835];
			local84 = Class12_Sub2.anIntArray203[this.anInt8835];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt8834 != 0) {
			local79 = Class12_Sub2.anIntArray204[this.anInt8834];
			local84 = Class12_Sub2.anIntArray203[this.anInt8834];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class14 local147 = Static495.aClass14_6.method8622((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt8827);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt8826 * 1024 / (local147.RA() - local147.V());
		if (this.anInt8830 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt8826 / 2, this.anInt8826 / 2, local84, local84);
		arg0.method8067(arg0.method8141());
		@Pc(206) Class76 local206 = arg0.method8141();
		local206.method9639(0, 0, arg0.i() - local147.HA());
		local147.method8623(local206, (Class15_Sub6) null, 1024, 1);
		@Pc(228) int local228 = this.anInt8826 * 13 / 16;
		@Pc(235) int local235 = (this.anInt8826 - local228) / 2;
		Static495.aClass71_32.method7702(local235, local235, local228, local228, 0, this.anInt8830 | 0xFF000000, 1);
		this.aClass71_33 = arg0.method8077(0, 0, this.anInt8826, this.anInt8826, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt8826, this.anInt8826, 0, 0);
		Static495.aClass71_34.method7702(0, 0, this.anInt8826, this.anInt8826, 1, 0, 0);
		this.aClass71_33.method7696(0);
		arg0.KA(Static495.anIntArray443[0], Static495.anIntArray443[1], Static495.anIntArray443[2], Static495.anIntArray443[3]);
	}
}
