import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class123 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	private int anInt3136;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	private int anInt3141;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
	public int anInt3143;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	private int anInt3144;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!hu;")
	private Class44 aClass44_12;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	private int anInt3146;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	private final int anInt3138;

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
	private final int anInt3147;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
	private final int anInt3142;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Z")
	private final boolean aBoolean265;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	private final int anInt3140;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	private final int anInt3139;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	private final int anInt3145;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
	private final int anInt3137;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3138 = arg2;
		this.anInt3147 = arg3;
		this.anInt3142 = arg4;
		this.aBoolean265 = arg7;
		this.anInt3140 = arg1;
		this.anInt3139 = arg6;
		this.anInt3145 = arg5;
		this.anInt3137 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ha;Lclient!gd;)Z")
	public boolean method2676(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class123 arg1) {
		return this.aClass44_12 != null || this.method2677(arg0, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!ha;Lclient!gd;)Z")
	private boolean method2677(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class123 arg1) {
		if (this.aClass44_12 == null) {
			if (this.anInt3137 == 0) {
				if (Static102.anInterface8_2.method7811(this.anInt3140)) {
					@Pc(23) int[] local23 = Static102.anInterface8_2.method7815(this.anInt3141, this.anInt3141, 0.7F, this.anInt3140);
					this.aClass44_12 = arg0.method7017(this.anInt3141, this.anInt3141, local23, this.anInt3141);
				}
			} else if (this.anInt3137 == 2) {
				this.method2680(arg0, arg1);
			} else if (this.anInt3137 == 1) {
				this.method2679(arg0, arg1);
			}
		}
		return this.aClass44_12 != null;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lclient!ha;Lclient!gd;)V")
	private void method2679(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class123 arg1) {
		Static175.method2684(arg0);
		Static175.method2678(arg0);
		arg0.K(Static175.anIntArray273);
		arg0.KA(0, 0, this.anInt3141, this.anInt3141);
		arg0.ya();
		arg0.aa(0, 0, this.anInt3141, this.anInt3141, this.anInt3139 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean265) {
				local31 = -arg1.anInt3138;
				local33 = -arg1.anInt3147;
				local35 = -arg1.anInt3142;
			} else {
				local31 = arg1.anInt3138 - this.anInt3138;
				local33 = arg1.anInt3147 - this.anInt3147;
				local35 = arg1.anInt3142 - this.anInt3142;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3146 != 0) {
			local79 = Class5_Sub12_Sub1.anIntArray748[this.anInt3146];
			local84 = Class5_Sub12_Sub1.anIntArray749[this.anInt3146];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt3136 != 0) {
			local79 = Class5_Sub12_Sub1.anIntArray748[this.anInt3136];
			local84 = Class5_Sub12_Sub1.anIntArray749[this.anInt3136];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class180 local147 = Static175.aClass180_5.method7945((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt3140);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3141 * 1024 / (local147.RA() - local147.V());
		if (this.anInt3139 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt3141 / 2, this.anInt3141 / 2, local84, local84);
		arg0.method7040(arg0.method6998());
		@Pc(206) Class117 local206 = arg0.method6998();
		local206.method7244(0, 0, arg0.i() - local147.HA());
		local147.method7950(local206, (Class14_Sub9) null, 1024, 1);
		@Pc(228) int local228 = this.anInt3141 * 13 / 16;
		@Pc(235) int local235 = (this.anInt3141 - local228) / 2;
		Static175.aClass44_10.method5310(local235, local235, local228, local228, 0, this.anInt3139 | 0xFF000000, 1);
		this.aClass44_12 = arg0.method6988(0, 0, this.anInt3141, this.anInt3141, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt3141, this.anInt3141, 0, 0);
		Static175.aClass44_11.method5310(0, 0, this.anInt3141, this.anInt3141, 1, 0, 0);
		this.aClass44_12.method5321(0);
		arg0.KA(Static175.anIntArray273[0], Static175.anIntArray273[1], Static175.anIntArray273[2], Static175.anIntArray273[3]);
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(Lclient!ha;Lclient!gd;)V")
	private void method2680(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class123 arg1) {
		@Pc(6) Class349 local6 = Static277.method4157(Static65.aClass384_24, this.anInt3140);
		if (local6 == null) {
			return;
		}
		arg0.K(Static175.anIntArray273);
		arg0.KA(0, 0, this.anInt3141, this.anInt3141);
		arg0.aa(0, 0, this.anInt3141, this.anInt3141, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean265) {
				local32 = -arg1.anInt3138;
				local34 = -arg1.anInt3147;
				local36 = -arg1.anInt3142;
			} else {
				local32 = this.anInt3138 - arg1.anInt3138;
				local34 = this.anInt3147 - arg1.anInt3147;
				local36 = this.anInt3142 - arg1.anInt3142;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3146 != 0) {
			local81 = -this.anInt3146 & 0x3FFF;
			local85 = Class5_Sub12_Sub1.anIntArray748[local81];
			local89 = Class5_Sub12_Sub1.anIntArray749[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt3136 != 0) {
			local81 = -this.anInt3136 & 0x3FFF;
			local85 = Class5_Sub12_Sub1.anIntArray748[local81];
			local89 = Class5_Sub12_Sub1.anIntArray749[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class180 local172 = arg0.method6982(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7040(arg0.method6998());
		@Pc(218) Class117 local218 = arg0.method7018();
		local218.method7244(0, 0, arg0.i() - local172.HA());
		local172.method7950(local218, (Class14_Sub9) null, arg0.i(), 1);
		this.aClass44_12 = arg0.method6988(0, 0, this.anInt3141, this.anInt3141, true);
		this.aClass44_12.method5321(3);
		arg0.KA(Static175.anIntArray273[0], Static175.anIntArray273[1], Static175.anIntArray273[2], Static175.anIntArray273[3]);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)Z")
	public boolean method2681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean265) {
			this.anInt3143 = 1073741823;
			local7 = this.anInt3138;
			local12 = this.anInt3147;
			local17 = this.anInt3142;
		} else {
			local7 = this.anInt3138 - arg0;
			local12 = this.anInt3147 - arg1;
			local17 = this.anInt3142 - arg2;
			this.anInt3143 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3143 == 0) {
				this.anInt3143 = 1;
			}
			local7 = (local7 << 8) / this.anInt3143;
			local12 = (local12 << 8) / this.anInt3143;
			local17 = (local17 << 8) / this.anInt3143;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3144 = this.anInt3145 * arg3 / (this.aBoolean265 ? 1024 : this.anInt3143);
		} else {
			this.anInt3144 = 0;
		}
		if (this.anInt3144 < 8) {
			this.aClass44_12 = null;
			return false;
		}
		@Pc(143) int local143 = Static522.method6795(this.anInt3144);
		if (local143 > arg3) {
			local143 = Static473.method6912(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3141) {
			this.anInt3141 = local143;
		}
		this.anInt3146 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt3136 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass44_12 = null;
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "()V")
	public void method2682() {
		this.aClass44_12 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method2683(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass44_12 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3146 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3136 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3144) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3144) / 2;
		if (local38 < arg4 && local38 + this.anInt3144 > 0 && local51 < arg3 && local51 + this.anInt3144 > 0) {
			this.aClass44_12.method5329(local51 + arg1, local38 + arg2, this.anInt3144, this.anInt3144);
		}
	}
}
