import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class99 {

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	private int anInt2172;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public int anInt2175;

	@OriginalMember(owner = "client!el", name = "s", descriptor = "Lclient!fia;")
	private Class45 aClass45_4;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	private int anInt2177;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	private int anInt2179;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "I")
	private int anInt2183;

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	private final int anInt2176;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	private final int anInt2181;

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	private final int anInt2180;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "Z")
	private final boolean aBoolean150;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "I")
	private final int anInt2185;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "I")
	private final int anInt2186;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	private final int anInt2178;

	@OriginalMember(owner = "client!el", name = "r", descriptor = "I")
	private final int anInt2182;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	private final int anInt2173;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "I")
	private final int anInt2174;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	private final int anInt2184;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2176 = arg2;
		this.anInt2181 = arg3;
		this.anInt2180 = arg4;
		this.aBoolean150 = arg7;
		this.anInt2185 = arg1;
		this.anInt2186 = arg6;
		this.anInt2178 = arg5;
		this.anInt2182 = arg0;
		this.anInt2173 = arg8;
		this.anInt2174 = arg9;
		this.anInt2184 = arg10;
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(Lclient!ha;Lclient!el;)V")
	private void method2084(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class99 arg1) {
		@Pc(6) Class72 local6 = Static227.method3839(Static613.aClass310_120, this.anInt2185);
		if (local6 == null) {
			return;
		}
		arg0.K(Static138.anIntArray140);
		arg0.KA(0, 0, this.anInt2172, this.anInt2172);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2172, this.anInt2172, 0, 0);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean150) {
				local34 = -arg1.anInt2176;
				local36 = -arg1.anInt2181;
				local38 = -arg1.anInt2180;
			} else {
				local34 = this.anInt2176 - arg1.anInt2176;
				local36 = this.anInt2181 - arg1.anInt2181;
				local38 = this.anInt2180 - arg1.anInt2180;
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(101) int local101;
		if (this.anInt2177 != 0) {
			local83 = -this.anInt2177 & 0x3FFF;
			local87 = Class141.anIntArray207[local83];
			local91 = Class141.anIntArray208[local83];
			local101 = local36 * local91 - local38 * local87 >> 14;
			local38 = local36 * local87 + local38 * local91 >> 14;
			local36 = local101;
		}
		if (this.anInt2183 != 0) {
			local83 = -this.anInt2183 & 0x3FFF;
			local87 = Class141.anIntArray207[local83];
			local91 = Class141.anIntArray208[local83];
			local101 = local38 * local87 + local34 * local91 >> 14;
			local38 = local38 * local91 - local34 * local87 >> 14;
			local34 = local101;
		}
		arg0.xa(1.0F);
		arg0.ZA(this.anInt2186, 1.0F, 1.0F, (float) local34, (float) local36, (float) local38);
		local6.method1686(this.anInt2184 & 0x3FFF, this.anInt2174 & 0x3FFF, this.anInt2173 & 0x3FFF);
		@Pc(190) Class129 local190 = arg0.method6908(local6, 2048, 0, 64, 768);
		local87 = local190.RA() - local190.V();
		local91 = local190.EA() - local190.fa();
		local101 = local87 > local91 ? local87 : local91;
		@Pc(216) int local216 = this.anInt2172 * 1024 / local101;
		@Pc(219) int[] local219 = arg0.Y();
		arg0.DA(this.anInt2172 / 2, this.anInt2172 / 2, local216, local216);
		arg0.method6896(arg0.method6914());
		@Pc(238) Class263 local238 = arg0.method6907();
		local238.method8444(0, 0, arg0.i() - local190.HA());
		local190.method5289(local238, (Class4_Sub1) null, arg0.i(), 1);
		this.aClass45_4 = arg0.method6938(0, 0, this.anInt2172, this.anInt2172, true);
		this.aClass45_4.method7505();
		arg0.DA(local219[0], local219[1], local219[2], local219[3]);
		arg0.KA(Static138.anIntArray140[0], Static138.anIntArray140[1], Static138.anIntArray140[2], Static138.anIntArray140[3]);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ha;IIIIIIIIII)V")
	public void method2086(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass45_4 == null) {
			return;
		}
		@Pc(6) int[] local6 = new int[3];
		@Pc(14) int local14 = -(this.anInt2176 - arg7 << 16);
		@Pc(21) int local21 = this.anInt2181 - arg8 << 15;
		@Pc(29) int local29 = -(this.anInt2180 - arg9 << 16);
		@Pc(32) Class263 local32 = arg0.method6943();
		local32.method8440(0, 0, 0, local6);
		@Pc(44) int local44 = local14 + local6[0];
		@Pc(50) int local50 = local21 + local6[1];
		@Pc(56) int local56 = local29 + local6[2];
		arg0.H(local44, local50, local56, local6);
		if (local6[2] < 0) {
			return;
		}
		@Pc(75) int local75 = local6[0] - this.anInt2179 / 2;
		@Pc(84) int local84 = local6[1] - this.anInt2179 / 2;
		if (local84 < arg4 && local84 + this.anInt2179 > 0 && local75 < arg3 && local75 + this.anInt2179 > 0) {
			this.aClass45_4.method7493(local75, local84, this.anInt2179, this.anInt2179, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(Lclient!ha;Lclient!el;)Z")
	public boolean method2087(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class99 arg1) {
		return this.aClass45_4 != null || this.method2088(arg0, arg1);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(Lclient!ha;Lclient!el;)Z")
	private boolean method2088(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class99 arg1) {
		if (this.aClass45_4 == null) {
			if (this.anInt2182 == 0) {
				if (Static338.anInterface4_9.method8974(this.anInt2185)) {
					@Pc(23) int[] local23 = Static338.anInterface4_9.method8979(this.anInt2172, 0.7F, this.anInt2185, this.anInt2172);
					this.aClass45_4 = arg0.method6941(this.anInt2172, this.anInt2172, local23, this.anInt2172);
				}
			} else if (this.anInt2182 == 2) {
				this.method2084(arg0, arg1);
			} else if (this.anInt2182 == 1) {
				this.method2092(arg0, arg1);
			}
		}
		return this.aClass45_4 != null;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)Z")
	public boolean method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean150) {
			this.anInt2175 = 1073741823;
			local7 = this.anInt2176;
			local12 = this.anInt2181;
			local17 = this.anInt2180;
		} else {
			local7 = this.anInt2176 - arg0;
			local12 = this.anInt2181 - arg1;
			local17 = this.anInt2180 - arg2;
			this.anInt2175 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2175 == 0) {
				this.anInt2175 = 1;
			}
			local7 = (local7 << 8) / this.anInt2175;
			local12 = (local12 << 8) / this.anInt2175;
			local17 = (local17 << 8) / this.anInt2175;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2179 = this.anInt2178 * arg3 / (this.aBoolean150 ? 1024 : this.anInt2175);
		} else {
			this.anInt2179 = 0;
		}
		if (this.anInt2179 < 8) {
			this.aClass45_4 = null;
			return false;
		}
		@Pc(143) int local143 = Static255.method4294(this.anInt2179);
		if (local143 > arg3) {
			local143 = Static64.method1041(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2172) {
			this.anInt2172 = local143;
		}
		this.anInt2177 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt2183 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass45_4 = null;
		return true;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ha;Lclient!el;)V")
	private void method2092(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class99 arg1) {
		Static138.method2089(arg0);
		Static138.method2085(arg0);
		arg0.K(Static138.anIntArray140);
		arg0.KA(0, 0, this.anInt2172, this.anInt2172);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2172, this.anInt2172, this.anInt2186 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean150) {
				local31 = -arg1.anInt2176;
				local33 = -arg1.anInt2181;
				local35 = -arg1.anInt2180;
			} else {
				local31 = arg1.anInt2176 - this.anInt2176;
				local33 = arg1.anInt2181 - this.anInt2181;
				local35 = arg1.anInt2180 - this.anInt2180;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2177 != 0) {
			local79 = Class141.anIntArray207[this.anInt2177];
			local84 = Class141.anIntArray208[this.anInt2177];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt2183 != 0) {
			local79 = Class141.anIntArray207[this.anInt2183];
			local84 = Class141.anIntArray208[this.anInt2183];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class129 local147 = Static138.aClass129_3.method5288((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt2185);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2172 * 1024 / (local147.RA() - local147.V());
		if (this.anInt2186 != 0) {
			local84 = local84 * 13 / 16;
		}
		@Pc(190) int[] local190 = arg0.Y();
		arg0.DA(this.anInt2172 / 2, this.anInt2172 / 2, local84, local84);
		arg0.method6896(arg0.method6914());
		@Pc(209) Class263 local209 = arg0.method6914();
		local209.method8444(0, 0, arg0.i() - local147.HA());
		local147.method5289(local209, (Class4_Sub1) null, 1024, 1);
		@Pc(231) int local231 = this.anInt2172 * 13 / 16;
		@Pc(238) int local238 = (this.anInt2172 - local231) / 2;
		Static138.aClass45_5.method7493(local238, local238, local231, local231, 0, this.anInt2186 | 0xFF000000, 1);
		this.aClass45_4 = arg0.method6938(0, 0, this.anInt2172, this.anInt2172, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2172, this.anInt2172, 0, 0);
		Static138.aClass45_3.method7493(0, 0, this.anInt2172, this.anInt2172, 1, 0, 0);
		this.aClass45_4.method7505();
		arg0.DA(local190[0], local190[1], local190[2], local190[3]);
		arg0.KA(Static138.anIntArray140[0], Static138.anIntArray140[1], Static138.anIntArray140[2], Static138.anIntArray140[3]);
	}
}
