import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class233 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public int anInt6907;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	private int anInt6910;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	private int anInt6911;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private int anInt6912;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "Lclient!xa;")
	private Class66 aClass66_28;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	private int anInt6914;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	private final int anInt6905;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	private final int anInt6915;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	private final int anInt6908;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
	private final boolean aBoolean516;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private final int anInt6904;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	private final int anInt6913;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	private final int anInt6909;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	private final int anInt6906;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6905 = arg2;
		this.anInt6915 = arg3;
		this.anInt6908 = arg4;
		this.aBoolean516 = arg7;
		this.anInt6904 = arg1;
		this.anInt6913 = arg6;
		this.anInt6909 = arg5;
		this.anInt6906 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "()V")
	public void method5819() {
		this.aClass66_28 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)Z")
	public boolean method5821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean516) {
			this.anInt6907 = 1073741823;
			local7 = this.anInt6905;
			local12 = this.anInt6915;
			local17 = this.anInt6908;
		} else {
			local7 = this.anInt6905 - arg0;
			local12 = this.anInt6915 - arg1;
			local17 = this.anInt6908 - arg2;
			this.anInt6907 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6907 == 0) {
				this.anInt6907 = 1;
			}
			local7 = (local7 << 8) / this.anInt6907;
			local12 = (local12 << 8) / this.anInt6907;
			local17 = (local17 << 8) / this.anInt6907;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6911 = this.anInt6909 * arg3 / (this.aBoolean516 ? 1024 : this.anInt6907);
		} else {
			this.anInt6911 = 0;
		}
		if (this.anInt6911 < 8) {
			this.aClass66_28 = null;
			return false;
		}
		@Pc(143) int local143 = Static247.method4363(this.anInt6911);
		if (local143 > arg3) {
			local143 = Static479.method7316(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6912) {
			this.anInt6912 = local143;
		}
		this.anInt6914 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt6910 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass66_28 = null;
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!oa;Lclient!oc;)V")
	private void method5822(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class233 arg1) {
		Static362.method5820(arg0);
		Static362.method5823(arg0);
		arg0.A(Static362.anIntArray489);
		arg0.ca(0, 0, this.anInt6912, this.anInt6912);
		arg0.method5430();
		arg0.C(0, 0, this.anInt6912, this.anInt6912, this.anInt6913 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean516) {
				local31 = -arg1.anInt6905;
				local33 = -arg1.anInt6915;
				local35 = -arg1.anInt6908;
			} else {
				local31 = arg1.anInt6905 - this.anInt6905;
				local33 = arg1.anInt6915 - this.anInt6915;
				local35 = arg1.anInt6908 - this.anInt6908;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6914 != 0) {
			local79 = Class179.anIntArray756[this.anInt6914];
			local84 = Class179.anIntArray757[this.anInt6914];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt6910 != 0) {
			local79 = Class179.anIntArray756[this.anInt6910];
			local84 = Class179.anIntArray757[this.anInt6910];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class23 local147 = Static362.aClass23_6.method7068((byte) 0, 51200, true);
		if (arg0.method5447()) {
			local147.ka((short) 0, (short) this.anInt6904);
		} else {
			local147.UA((short) 127, Static523.anInterface2_14.method3585(this.anInt6904).aShort125);
			local147.ka((short) 0, (short) -1);
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6912 * 1024 / (local147.M() - local147.ha());
		if (this.anInt6913 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.m(this.anInt6912 / 2, this.anInt6912 / 2, local84, local84);
		arg0.method5429(arg0.method5446());
		@Pc(223) Class8 local223 = arg0.method5446();
		local223.GA(0, 0, arg0.U() - local147.LA());
		local147.method7075(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6912 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6912 - local245) / 2;
		Static362.aClass66_26.KA(local252, local252, local245, local245, 0, this.anInt6913 | 0xFF000000, 1);
		this.aClass66_28 = arg0.method5454(0, 0, this.anInt6912, this.anInt6912, true);
		arg0.method5430();
		arg0.C(0, 0, this.anInt6912, this.anInt6912, 0, 0);
		Static362.aClass66_27.KA(0, 0, this.anInt6912, this.anInt6912, 1, 0, 0);
		this.aClass66_28.t(0, 0, 0);
		arg0.ca(Static362.anIntArray489[0], Static362.anIntArray489[1], Static362.anIntArray489[2], Static362.anIntArray489[3]);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!oa;Lclient!oc;)V")
	private void method5824(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class233 arg1) {
		@Pc(6) Class260 local6 = Static198.method3731(this.anInt6904, Static251.aClass168_63);
		if (local6 == null) {
			return;
		}
		arg0.A(Static362.anIntArray489);
		arg0.ca(0, 0, this.anInt6912, this.anInt6912);
		arg0.C(0, 0, this.anInt6912, this.anInt6912, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean516) {
				local32 = -arg1.anInt6905;
				local34 = -arg1.anInt6915;
				local36 = -arg1.anInt6908;
			} else {
				local32 = this.anInt6905 - arg1.anInt6905;
				local34 = this.anInt6915 - arg1.anInt6915;
				local36 = this.anInt6908 - arg1.anInt6908;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6914 != 0) {
			local81 = -this.anInt6914 & 0x3FFF;
			local85 = Class179.anIntArray756[local81];
			local89 = Class179.anIntArray757[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt6910 != 0) {
			local81 = -this.anInt6910 & 0x3FFF;
			local85 = Class179.anIntArray756[local81];
			local89 = Class179.anIntArray757[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ha(1.0F);
		arg0.YA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class23 local172 = arg0.method5404(local6, 2048, 0, 64, 768);
		local85 = local172.M() - local172.ha();
		local89 = local172.EA() - local172.DA();
		local99 = local172.ha() + local85 / 2;
		@Pc(198) int local198 = local172.DA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.m(local99, local198, local205, local205);
		arg0.method5429(arg0.method5446());
		@Pc(218) Class8 local218 = arg0.method5417();
		local218.GA(0, 0, arg0.U() - local172.LA());
		local172.method7075(local218, null, arg0.U());
		this.aClass66_28 = arg0.method5454(0, 0, this.anInt6912, this.anInt6912, true);
		this.aClass66_28.t(0, 0, 3);
		arg0.ca(Static362.anIntArray489[0], Static362.anIntArray489[1], Static362.anIntArray489[2], Static362.anIntArray489[3]);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!oa;IIIIII)V")
	public void method5825(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass66_28 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6914 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6910 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6911) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6911) / 2;
		if (local38 < arg4 && local38 + this.anInt6911 > 0 && local51 < arg3 && local51 + this.anInt6911 > 0) {
			this.aClass66_28.method8065(local51 + arg1, local38 + arg2, this.anInt6911, this.anInt6911);
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(Lclient!oa;Lclient!oc;)Z")
	private boolean method5826(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class233 arg1) {
		if (this.aClass66_28 == null) {
			if (this.anInt6906 == 0) {
				if (Static523.anInterface2_14.method3583(this.anInt6904)) {
					@Pc(23) int[] local23 = Static523.anInterface2_14.method3581(this.anInt6904, 0.7F, this.anInt6912, this.anInt6912);
					this.aClass66_28 = arg0.method5423(local23, this.anInt6912, this.anInt6912, this.anInt6912);
				}
			} else if (this.anInt6906 == 2) {
				this.method5824(arg0, arg1);
			} else if (this.anInt6906 == 1) {
				this.method5822(arg0, arg1);
			}
		}
		return this.aClass66_28 != null;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(Lclient!oa;Lclient!oc;)Z")
	public boolean method5827(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class233 arg1) {
		return this.aClass66_28 != null || this.method5826(arg0, arg1);
	}
}
