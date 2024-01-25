import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class311 {

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
	private int anInt8673;

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
	private int anInt8674;

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
	public int anInt8675;

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
	private int anInt8677;

	@OriginalMember(owner = "client!tda", name = "h", descriptor = "I")
	private int anInt8678;

	@OriginalMember(owner = "client!tda", name = "k", descriptor = "Lclient!xa;")
	private Class13 aClass13_31;

	@OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
	private final int anInt8681;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
	private final int anInt8676;

	@OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
	private final int anInt8683;

	@OriginalMember(owner = "client!tda", name = "i", descriptor = "Z")
	private final boolean aBoolean602;

	@OriginalMember(owner = "client!tda", name = "p", descriptor = "I")
	private final int anInt8682;

	@OriginalMember(owner = "client!tda", name = "r", descriptor = "I")
	private final int anInt8684;

	@OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
	private final int anInt8680;

	@OriginalMember(owner = "client!tda", name = "j", descriptor = "I")
	private final int anInt8679;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt8681 = arg2;
		this.anInt8676 = arg3;
		this.anInt8683 = arg4;
		this.aBoolean602 = arg7;
		this.anInt8682 = arg1;
		this.anInt8684 = arg6;
		this.anInt8680 = arg5;
		this.anInt8679 = arg0;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)Z")
	public boolean method7128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean602) {
			this.anInt8675 = 1073741823;
			local7 = this.anInt8681;
			local12 = this.anInt8676;
			local17 = this.anInt8683;
		} else {
			local7 = this.anInt8681 - arg0;
			local12 = this.anInt8676 - arg1;
			local17 = this.anInt8683 - arg2;
			this.anInt8675 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt8675 == 0) {
				this.anInt8675 = 1;
			}
			local7 = (local7 << 8) / this.anInt8675;
			local12 = (local12 << 8) / this.anInt8675;
			local17 = (local17 << 8) / this.anInt8675;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt8678 = this.anInt8680 * arg3 / (this.aBoolean602 ? 1024 : this.anInt8675);
		} else {
			this.anInt8678 = 0;
		}
		if (this.anInt8678 < 8) {
			this.aClass13_31 = null;
			return false;
		}
		@Pc(143) int local143 = Static514.method7261(this.anInt8678);
		if (local143 > arg3) {
			local143 = Static337.method5028(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt8674) {
			this.anInt8674 = local143;
		}
		this.anInt8673 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt8677 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass13_31 = null;
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!oa;Lclient!tda;)V")
	private void method7129(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class311 arg1) {
		@Pc(6) Class266 local6 = Static329.method4945(Static275.aClass31_60, this.anInt8682);
		if (local6 == null) {
			return;
		}
		arg0.A(Static500.anIntArray665);
		arg0.ca(0, 0, this.anInt8674, this.anInt8674);
		arg0.C(0, 0, this.anInt8674, this.anInt8674, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean602) {
				local32 = -arg1.anInt8681;
				local34 = -arg1.anInt8676;
				local36 = -arg1.anInt8683;
			} else {
				local32 = this.anInt8681 - arg1.anInt8681;
				local34 = this.anInt8676 - arg1.anInt8676;
				local36 = this.anInt8683 - arg1.anInt8683;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt8673 != 0) {
			local81 = -this.anInt8673 & 0x3FFF;
			local85 = Class4_Sub11.anIntArray148[local81];
			local89 = Class4_Sub11.anIntArray147[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt8677 != 0) {
			local81 = -this.anInt8677 & 0x3FFF;
			local85 = Class4_Sub11.anIntArray148[local81];
			local89 = Class4_Sub11.anIntArray147[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class9 local172 = arg0.method6779(local6, 2048, 0, 64, 768);
		local85 = local172.M() - local172.ha();
		local89 = local172.EA() - local172.DA();
		local99 = local172.ha() + local85 / 2;
		@Pc(198) int local198 = local172.DA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.m(local99, local198, local205, local205);
		arg0.method6823(arg0.method6788());
		@Pc(218) Class134 local218 = arg0.method6842();
		local218.GA(0, 0, arg0.U() - local172.LA());
		local172.method4004(local218, null, arg0.U());
		this.aClass13_31 = arg0.method6802(0, 0, this.anInt8674, this.anInt8674, true);
		this.aClass13_31.t(0, 0, 3);
		arg0.ca(Static500.anIntArray665[0], Static500.anIntArray665[1], Static500.anIntArray665[2], Static500.anIntArray665[3]);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "()V")
	public void method7130() {
		this.aClass13_31 = null;
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(Lclient!oa;Lclient!tda;)V")
	private void method7131(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class311 arg1) {
		Static500.method7137(arg0);
		Static500.method7136(arg0);
		arg0.A(Static500.anIntArray665);
		arg0.ca(0, 0, this.anInt8674, this.anInt8674);
		arg0.method6795();
		arg0.C(0, 0, this.anInt8674, this.anInt8674, this.anInt8684 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean602) {
				local31 = -arg1.anInt8681;
				local33 = -arg1.anInt8676;
				local35 = -arg1.anInt8683;
			} else {
				local31 = arg1.anInt8681 - this.anInt8681;
				local33 = arg1.anInt8676 - this.anInt8676;
				local35 = arg1.anInt8683 - this.anInt8683;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt8673 != 0) {
			local79 = Class4_Sub11.anIntArray148[this.anInt8673];
			local84 = Class4_Sub11.anIntArray147[this.anInt8673];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt8677 != 0) {
			local79 = Class4_Sub11.anIntArray148[this.anInt8677];
			local84 = Class4_Sub11.anIntArray147[this.anInt8677];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class9 local147 = Static500.aClass9_5.method4006((byte) 0, 51200, true);
		if (arg0.method6837()) {
			local147.ka((short) 0, (short) this.anInt8682);
		} else {
			local147.UA((short) 127, Static288.anInterface3_9.method7249(this.anInt8682).aShort94);
			local147.ka((short) 0, (short) -1);
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt8674 * 1024 / (local147.M() - local147.ha());
		if (this.anInt8684 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.m(this.anInt8674 / 2, this.anInt8674 / 2, local84, local84);
		arg0.method6823(arg0.method6788());
		@Pc(223) Class134 local223 = arg0.method6788();
		local223.GA(0, 0, arg0.U() - local147.LA());
		local147.method4004(local223, null, 1024);
		@Pc(245) int local245 = this.anInt8674 * 13 / 16;
		@Pc(252) int local252 = (this.anInt8674 - local245) / 2;
		Static500.aClass13_33.KA(local252, local252, local245, local245, 0, this.anInt8684 | 0xFF000000, 1);
		this.aClass13_31 = arg0.method6802(0, 0, this.anInt8674, this.anInt8674, true);
		arg0.method6795();
		arg0.C(0, 0, this.anInt8674, this.anInt8674, 0, 0);
		Static500.aClass13_32.KA(0, 0, this.anInt8674, this.anInt8674, 1, 0, 0);
		this.aClass13_31.t(0, 0, 0);
		arg0.ca(Static500.anIntArray665[0], Static500.anIntArray665[1], Static500.anIntArray665[2], Static500.anIntArray665[3]);
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(Lclient!oa;Lclient!tda;)Z")
	private boolean method7132(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class311 arg1) {
		if (this.aClass13_31 == null) {
			if (this.anInt8679 == 0) {
				if (Static288.anInterface3_9.method7248(this.anInt8682)) {
					@Pc(23) int[] local23 = Static288.anInterface3_9.method7251(0.7F, this.anInt8674, this.anInt8682, this.anInt8674);
					this.aClass13_31 = arg0.method6843(local23, this.anInt8674, this.anInt8674, this.anInt8674);
				}
			} else if (this.anInt8679 == 2) {
				this.method7129(arg0, arg1);
			} else if (this.anInt8679 == 1) {
				this.method7131(arg0, arg1);
			}
		}
		return this.aClass13_31 != null;
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(Lclient!oa;Lclient!tda;)Z")
	public boolean method7133(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class311 arg1) {
		return this.aClass13_31 != null || this.method7132(arg0, arg1);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	public void method7135(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass13_31 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt8673 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt8677 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt8678) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt8678) / 2;
		if (local38 < arg4 && local38 + this.anInt8678 > 0 && local51 < arg3 && local51 + this.anInt8678 > 0) {
			this.aClass13_31.method8024(local51 + arg1, local38 + arg2, this.anInt8678, this.anInt8678);
		}
	}
}
