import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class193 {

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
	public int anInt6144;

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "Lclient!ac;")
	private Class5 aClass5_31;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!laa", name = "o", descriptor = "I")
	private int anInt6153;

	@OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
	private int anInt6154;

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
	private int anInt6155;

	@OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
	private final int anInt6149;

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
	private final int anInt6145;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
	private final int anInt6147;

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "Z")
	private final boolean aBoolean523;

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
	private final int anInt6146;

	@OriginalMember(owner = "client!laa", name = "j", descriptor = "I")
	private final int anInt6150;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "I")
	private final int anInt6151;

	@OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
	private final int anInt6148;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6149 = arg2;
		this.anInt6145 = arg3;
		this.anInt6147 = arg4;
		this.aBoolean523 = arg7;
		this.anInt6146 = arg1;
		this.anInt6150 = arg6;
		this.anInt6151 = arg5;
		this.anInt6148 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;Lclient!laa;)Z")
	public boolean method5203(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class193 arg1) {
		return this.aClass5_31 != null || this.method5208(arg0, arg1);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)Z")
	public boolean method5205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean523) {
			this.anInt6144 = 1073741823;
			local7 = this.anInt6149;
			local12 = this.anInt6145;
			local17 = this.anInt6147;
		} else {
			local7 = this.anInt6149 - arg0;
			local12 = this.anInt6145 - arg1;
			local17 = this.anInt6147 - arg2;
			this.anInt6144 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6144 == 0) {
				this.anInt6144 = 1;
			}
			local7 = (local7 << 8) / this.anInt6144;
			local12 = (local12 << 8) / this.anInt6144;
			local17 = (local17 << 8) / this.anInt6144;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6155 = this.anInt6151 * arg3 / (this.aBoolean523 ? 1024 : this.anInt6144);
		} else {
			this.anInt6155 = 0;
		}
		if (this.anInt6155 < 8) {
			this.aClass5_31 = null;
			return false;
		}
		@Pc(143) int local143 = Static95.method2482(this.anInt6155);
		if (local143 > arg3) {
			local143 = Static51.method1165(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6152) {
			this.anInt6152 = local143;
		}
		this.anInt6153 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt6154 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass5_31 = null;
		return true;
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(Lclient!ha;Lclient!laa;)V")
	private void method5206(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class193 arg1) {
		Static308.method5209(arg0);
		Static308.method5212(arg0);
		arg0.K(Static308.anIntArray362);
		arg0.KA(0, 0, this.anInt6152, this.anInt6152);
		arg0.ya();
		arg0.aa(0, 0, this.anInt6152, this.anInt6152, this.anInt6150 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean523) {
				local31 = -arg1.anInt6149;
				local33 = -arg1.anInt6145;
				local35 = -arg1.anInt6147;
			} else {
				local31 = arg1.anInt6149 - this.anInt6149;
				local33 = arg1.anInt6145 - this.anInt6145;
				local35 = arg1.anInt6147 - this.anInt6147;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6153 != 0) {
			local79 = Class3_Sub1_Sub2.anIntArray84[this.anInt6153];
			local84 = Class3_Sub1_Sub2.anIntArray85[this.anInt6153];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt6154 != 0) {
			local79 = Class3_Sub1_Sub2.anIntArray84[this.anInt6154];
			local84 = Class3_Sub1_Sub2.anIntArray85[this.anInt6154];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class128 local147 = Static308.aClass128_2.method6279((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt6146);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6152 * 1024 / (local147.RA() - local147.V());
		if (this.anInt6150 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt6152 / 2, this.anInt6152 / 2, local84, local84);
		arg0.method6233(arg0.method6223());
		@Pc(206) Class47 local206 = arg0.method6223();
		local206.method7863(0, 0, arg0.i() - local147.HA());
		local147.method6294(local206, null, 1024, 1);
		@Pc(228) int local228 = this.anInt6152 * 13 / 16;
		@Pc(235) int local235 = (this.anInt6152 - local228) / 2;
		Static308.aClass5_29.method7596(local235, local235, local228, local228, 0, this.anInt6150 | 0xFF000000, 1);
		this.aClass5_31 = arg0.method6153(0, 0, this.anInt6152, this.anInt6152, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt6152, this.anInt6152, 0, 0);
		Static308.aClass5_30.method7596(0, 0, this.anInt6152, this.anInt6152, 1, 0, 0);
		this.aClass5_31.method7587(0);
		arg0.KA(Static308.anIntArray362[0], Static308.anIntArray362[1], Static308.anIntArray362[2], Static308.anIntArray362[3]);
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "()V")
	public void method5207() {
		this.aClass5_31 = null;
	}

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "(Lclient!ha;Lclient!laa;)Z")
	private boolean method5208(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class193 arg1) {
		if (this.aClass5_31 == null) {
			if (this.anInt6148 == 0) {
				if (Static283.anInterface5_9.method6867(this.anInt6146)) {
					@Pc(23) int[] local23 = Static283.anInterface5_9.method6870(this.anInt6146, 0.7F, this.anInt6152, this.anInt6152);
					this.aClass5_31 = arg0.method6204(this.anInt6152, this.anInt6152, local23, this.anInt6152);
				}
			} else if (this.anInt6148 == 2) {
				this.method5213(arg0, arg1);
			} else if (this.anInt6148 == 1) {
				this.method5206(arg0, arg1);
			}
		}
		return this.aClass5_31 != null;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method5210(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass5_31 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6153 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6154 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6155) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6155) / 2;
		if (local38 < arg4 && local38 + this.anInt6155 > 0 && local51 < arg3 && local51 + this.anInt6155 > 0) {
			this.aClass5_31.method7590(local51 + arg1, local38 + arg2, this.anInt6155, this.anInt6155);
		}
	}

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "(Lclient!ha;Lclient!laa;)V")
	private void method5213(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class193 arg1) {
		@Pc(6) Class142 local6 = Static579.method8023(this.anInt6146, Static527.aClass181_110);
		if (local6 == null) {
			return;
		}
		arg0.K(Static308.anIntArray362);
		arg0.KA(0, 0, this.anInt6152, this.anInt6152);
		arg0.aa(0, 0, this.anInt6152, this.anInt6152, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean523) {
				local32 = -arg1.anInt6149;
				local34 = -arg1.anInt6145;
				local36 = -arg1.anInt6147;
			} else {
				local32 = this.anInt6149 - arg1.anInt6149;
				local34 = this.anInt6145 - arg1.anInt6145;
				local36 = this.anInt6147 - arg1.anInt6147;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6153 != 0) {
			local81 = -this.anInt6153 & 0x3FFF;
			local85 = Class3_Sub1_Sub2.anIntArray84[local81];
			local89 = Class3_Sub1_Sub2.anIntArray85[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt6154 != 0) {
			local81 = -this.anInt6154 & 0x3FFF;
			local85 = Class3_Sub1_Sub2.anIntArray84[local81];
			local89 = Class3_Sub1_Sub2.anIntArray85[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class128 local172 = arg0.method6157(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method6233(arg0.method6223());
		@Pc(218) Class47 local218 = arg0.method6225();
		local218.method7863(0, 0, arg0.i() - local172.HA());
		local172.method6294(local218, null, arg0.i(), 1);
		this.aClass5_31 = arg0.method6153(0, 0, this.anInt6152, this.anInt6152, true);
		this.aClass5_31.method7587(3);
		arg0.KA(Static308.anIntArray362[0], Static308.anIntArray362[1], Static308.anIntArray362[2], Static308.anIntArray362[3]);
	}
}
