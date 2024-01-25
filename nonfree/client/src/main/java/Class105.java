import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class105 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!hu;")
	private Class21 aClass21_4;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	private int anInt3936;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	private int anInt3943;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	private int anInt3945;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	public int anInt3946;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	private int anInt3947;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	private final int anInt3940;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
	private final int anInt3944;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
	private final int anInt3939;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "Z")
	private final boolean aBoolean284;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	private final int anInt3941;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	private final int anInt3938;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	private final int anInt3937;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	private final int anInt3942;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3940 = arg2;
		this.anInt3944 = arg3;
		this.anInt3939 = arg4;
		this.aBoolean284 = arg7;
		this.anInt3941 = arg1;
		this.anInt3938 = arg6;
		this.anInt3937 = arg5;
		this.anInt3942 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ha;Lclient!fm;)Z")
	private boolean method3176(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class105 arg1) {
		if (this.aClass21_4 == null) {
			if (this.anInt3942 == 0) {
				if (Static602.anInterface2_14.method4025(this.anInt3941)) {
					@Pc(23) int[] local23 = Static602.anInterface2_14.method4028(0.7F, this.anInt3945, this.anInt3941, this.anInt3945);
					this.aClass21_4 = arg0.method6132(this.anInt3945, local23, this.anInt3945, this.anInt3945);
				}
			} else if (this.anInt3942 == 2) {
				this.method3180(arg0, arg1);
			} else if (this.anInt3942 == 1) {
				this.method3177(arg0, arg1);
			}
		}
		return this.aClass21_4 != null;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lclient!ha;Lclient!fm;)V")
	private void method3177(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class105 arg1) {
		Static157.method3185(arg0);
		Static157.method3182(arg0);
		arg0.K(Static157.anIntArray208);
		arg0.KA(0, 0, this.anInt3945, this.anInt3945);
		arg0.ya();
		arg0.aa(0, 0, this.anInt3945, this.anInt3945, this.anInt3938 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean284) {
				local31 = -arg1.anInt3940;
				local33 = -arg1.anInt3944;
				local35 = -arg1.anInt3939;
			} else {
				local31 = arg1.anInt3940 - this.anInt3940;
				local33 = arg1.anInt3944 - this.anInt3944;
				local35 = arg1.anInt3939 - this.anInt3939;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt3936 != 0) {
			local79 = Class344.anIntArray579[this.anInt3936];
			local84 = Class344.anIntArray578[this.anInt3936];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt3943 != 0) {
			local79 = Class344.anIntArray579[this.anInt3943];
			local84 = Class344.anIntArray578[this.anInt3943];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class83 local147 = Static157.aClass83_3.method7993((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt3941);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt3945 * 1024 / (local147.RA() - local147.V());
		if (this.anInt3938 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt3945 / 2, this.anInt3945 / 2, local84, local84);
		arg0.method6066(arg0.method6076());
		@Pc(206) Class54 local206 = arg0.method6076();
		local206.method5128(0, 0, arg0.i() - local147.HA());
		local147.method8009(local206, null, 1024, 1);
		@Pc(228) int local228 = this.anInt3945 * 13 / 16;
		@Pc(235) int local235 = (this.anInt3945 - local228) / 2;
		Static157.aClass21_3.method5788(local235, local235, local228, local228, 0, this.anInt3938 | 0xFF000000, 1);
		this.aClass21_4 = arg0.method6104(0, 0, this.anInt3945, this.anInt3945, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt3945, this.anInt3945, 0, 0);
		Static157.aClass21_5.method5788(0, 0, this.anInt3945, this.anInt3945, 1, 0, 0);
		this.aClass21_4.method5794(0);
		arg0.KA(Static157.anIntArray208[0], Static157.anIntArray208[1], Static157.anIntArray208[2], Static157.anIntArray208[3]);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(Lclient!ha;Lclient!fm;)Z")
	public boolean method3179(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class105 arg1) {
		return this.aClass21_4 != null || this.method3176(arg0, arg1);
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(Lclient!ha;Lclient!fm;)V")
	private void method3180(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class105 arg1) {
		@Pc(6) Class344 local6 = Static600.method8252(Static350.aClass237_96, this.anInt3941);
		if (local6 == null) {
			return;
		}
		arg0.K(Static157.anIntArray208);
		arg0.KA(0, 0, this.anInt3945, this.anInt3945);
		arg0.aa(0, 0, this.anInt3945, this.anInt3945, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean284) {
				local32 = -arg1.anInt3940;
				local34 = -arg1.anInt3944;
				local36 = -arg1.anInt3939;
			} else {
				local32 = this.anInt3940 - arg1.anInt3940;
				local34 = this.anInt3944 - arg1.anInt3944;
				local36 = this.anInt3939 - arg1.anInt3939;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt3936 != 0) {
			local81 = -this.anInt3936 & 0x3FFF;
			local85 = Class344.anIntArray579[local81];
			local89 = Class344.anIntArray578[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt3943 != 0) {
			local81 = -this.anInt3943 & 0x3FFF;
			local85 = Class344.anIntArray579[local81];
			local89 = Class344.anIntArray578[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class83 local172 = arg0.method6094(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method6066(arg0.method6076());
		@Pc(218) Class54 local218 = arg0.method6124();
		local218.method5128(0, 0, arg0.i() - local172.HA());
		local172.method8009(local218, null, arg0.i(), 1);
		this.aClass21_4 = arg0.method6104(0, 0, this.anInt3945, this.anInt3945, true);
		this.aClass21_4.method5794(3);
		arg0.KA(Static157.anIntArray208[0], Static157.anIntArray208[1], Static157.anIntArray208[2], Static157.anIntArray208[3]);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIII)Z")
	public boolean method3181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean284) {
			this.anInt3946 = 1073741823;
			local7 = this.anInt3940;
			local12 = this.anInt3944;
			local17 = this.anInt3939;
		} else {
			local7 = this.anInt3940 - arg0;
			local12 = this.anInt3944 - arg1;
			local17 = this.anInt3939 - arg2;
			this.anInt3946 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3946 == 0) {
				this.anInt3946 = 1;
			}
			local7 = (local7 << 8) / this.anInt3946;
			local12 = (local12 << 8) / this.anInt3946;
			local17 = (local17 << 8) / this.anInt3946;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3947 = this.anInt3937 * arg3 / (this.aBoolean284 ? 1024 : this.anInt3946);
		} else {
			this.anInt3947 = 0;
		}
		if (this.anInt3947 < 8) {
			this.aClass21_4 = null;
			return false;
		}
		@Pc(143) int local143 = Static629.method8469(this.anInt3947);
		if (local143 > arg3) {
			local143 = Static258.method4554(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt3945) {
			this.anInt3945 = local143;
		}
		this.anInt3936 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt3943 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass21_4 = null;
		return true;
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "()V")
	public void method3183() {
		this.aClass21_4 = null;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method3184(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass21_4 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt3936 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt3943 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt3947) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt3947) / 2;
		if (local38 < arg4 && local38 + this.anInt3947 > 0 && local51 < arg3 && local51 + this.anInt3947 > 0) {
			this.aClass21_4.method5777(local51 + arg1, local38 + arg2, this.anInt3947, this.anInt3947);
		}
	}
}
