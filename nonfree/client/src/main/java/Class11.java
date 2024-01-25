import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class11 {

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	private int anInt249;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "Lclient!fs;")
	private Class134 aClass134_1;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	private int anInt254;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
	private final int anInt256;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
	private final int anInt258;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
	private final int anInt252;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "Z")
	private final boolean aBoolean27;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
	private final int anInt250;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	private final int anInt251;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	private final int anInt253;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	private final int anInt248;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt256 = arg2;
		this.anInt258 = arg3;
		this.anInt252 = arg4;
		this.aBoolean27 = arg7;
		this.anInt250 = arg1;
		this.anInt251 = arg6;
		this.anInt253 = arg5;
		this.anInt248 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(Lclient!ha;Lclient!ah;)Z")
	public boolean method245(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class11 arg1) {
		return this.aClass134_1 != null || this.method248(arg0, arg1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method246(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass134_1 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt254 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt255 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt259) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt259) / 2;
		if (local38 < arg4 && local38 + this.anInt259 > 0 && local51 < arg3 && local51 + this.anInt259 > 0) {
			this.aClass134_1.method9227(local51 + arg1, local38 + arg2, this.anInt259, this.anInt259);
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lclient!ha;Lclient!ah;)V")
	private void method247(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class11 arg1) {
		@Pc(6) Class192 local6 = Static213.method3061(Static206.aClass208_52, this.anInt250);
		if (local6 == null) {
			return;
		}
		arg0.K(Static14.anIntArray20);
		arg0.KA(0, 0, this.anInt249, this.anInt249);
		arg0.aa(0, 0, this.anInt249, this.anInt249, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean27) {
				local32 = -arg1.anInt256;
				local34 = -arg1.anInt258;
				local36 = -arg1.anInt252;
			} else {
				local32 = this.anInt256 - arg1.anInt256;
				local34 = this.anInt258 - arg1.anInt258;
				local36 = this.anInt252 - arg1.anInt252;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt254 != 0) {
			local81 = -this.anInt254 & 0x3FFF;
			local85 = Class5_Sub12.anIntArray544[local81];
			local89 = Class5_Sub12.anIntArray543[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt255 != 0) {
			local81 = -this.anInt255 & 0x3FFF;
			local85 = Class5_Sub12.anIntArray544[local81];
			local89 = Class5_Sub12.anIntArray543[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class164 local172 = arg0.method7700(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7657(arg0.method7676());
		@Pc(218) Class203 local218 = arg0.method7672();
		local218.method8332(0, 0, arg0.i() - local172.HA());
		local172.method9092(local218, (Class8_Sub7) null, arg0.i(), 1);
		this.aClass134_1 = arg0.method7712(0, 0, this.anInt249, this.anInt249, true);
		this.aClass134_1.method9238(3);
		arg0.KA(Static14.anIntArray20[0], Static14.anIntArray20[1], Static14.anIntArray20[2], Static14.anIntArray20[3]);
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lclient!ha;Lclient!ah;)Z")
	private boolean method248(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class11 arg1) {
		if (this.aClass134_1 == null) {
			if (this.anInt248 == 0) {
				if (Static156.anInterface1_3.method2860(this.anInt250)) {
					@Pc(23) int[] local23 = Static156.anInterface1_3.method2862(this.anInt249, 0.7F, this.anInt250, this.anInt249);
					this.aClass134_1 = arg0.method7679(this.anInt249, local23, this.anInt249, this.anInt249);
				}
			} else if (this.anInt248 == 2) {
				this.method247(arg0, arg1);
			} else if (this.anInt248 == 1) {
				this.method250(arg0, arg1);
			}
		}
		return this.aClass134_1 != null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ha;Lclient!ah;)V")
	private void method250(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class11 arg1) {
		Static14.method253(arg0);
		Static14.method249(arg0);
		arg0.K(Static14.anIntArray20);
		arg0.KA(0, 0, this.anInt249, this.anInt249);
		arg0.ya();
		arg0.aa(0, 0, this.anInt249, this.anInt249, this.anInt251 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean27) {
				local31 = -arg1.anInt256;
				local33 = -arg1.anInt258;
				local35 = -arg1.anInt252;
			} else {
				local31 = arg1.anInt256 - this.anInt256;
				local33 = arg1.anInt258 - this.anInt258;
				local35 = arg1.anInt252 - this.anInt252;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt254 != 0) {
			local79 = Class5_Sub12.anIntArray544[this.anInt254];
			local84 = Class5_Sub12.anIntArray543[this.anInt254];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt255 != 0) {
			local79 = Class5_Sub12.anIntArray544[this.anInt255];
			local84 = Class5_Sub12.anIntArray543[this.anInt255];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class164 local147 = Static14.aClass164_2.method9072((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt250);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt249 * 1024 / (local147.RA() - local147.V());
		if (this.anInt251 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt249 / 2, this.anInt249 / 2, local84, local84);
		arg0.method7657(arg0.method7676());
		@Pc(206) Class203 local206 = arg0.method7676();
		local206.method8332(0, 0, arg0.i() - local147.HA());
		local147.method9092(local206, (Class8_Sub7) null, 1024, 1);
		@Pc(228) int local228 = this.anInt249 * 13 / 16;
		@Pc(235) int local235 = (this.anInt249 - local228) / 2;
		Static14.aClass134_2.method9226(local235, local235, local228, local228, 0, this.anInt251 | 0xFF000000, 1);
		this.aClass134_1 = arg0.method7712(0, 0, this.anInt249, this.anInt249, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt249, this.anInt249, 0, 0);
		Static14.aClass134_3.method9226(0, 0, this.anInt249, this.anInt249, 1, 0, 0);
		this.aClass134_1.method9238(0);
		arg0.KA(Static14.anIntArray20[0], Static14.anIntArray20[1], Static14.anIntArray20[2], Static14.anIntArray20[3]);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)Z")
	public boolean method251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean27) {
			this.anInt257 = 1073741823;
			local7 = this.anInt256;
			local12 = this.anInt258;
			local17 = this.anInt252;
		} else {
			local7 = this.anInt256 - arg0;
			local12 = this.anInt258 - arg1;
			local17 = this.anInt252 - arg2;
			this.anInt257 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt257 == 0) {
				this.anInt257 = 1;
			}
			local7 = (local7 << 8) / this.anInt257;
			local12 = (local12 << 8) / this.anInt257;
			local17 = (local17 << 8) / this.anInt257;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt259 = this.anInt253 * arg3 / (this.aBoolean27 ? 1024 : this.anInt257);
		} else {
			this.anInt259 = 0;
		}
		if (this.anInt259 < 8) {
			this.aClass134_1 = null;
			return false;
		}
		@Pc(143) int local143 = Static94.method1393(this.anInt259);
		if (local143 > arg3) {
			local143 = Static228.method3242(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt249) {
			this.anInt249 = local143;
		}
		this.anInt254 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt255 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass134_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
	public void method254() {
		this.aClass134_1 = null;
	}
}
