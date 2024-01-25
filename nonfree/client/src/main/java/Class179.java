import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class179 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	private int anInt6207;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
	private int anInt6209;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
	private int anInt6210;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!mi;")
	private Class46 aClass46_18;

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
	private int anInt6216;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	public int anInt6217;

	@OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
	private final int anInt6213;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	private final int anInt6206;

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
	private final int anInt6214;

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	private final int anInt6212;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	private final int anInt6211;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
	private final int anInt6208;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	private final int anInt6215;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6213 = arg2;
		this.anInt6206 = arg3;
		this.anInt6214 = arg4;
		this.aBoolean466 = arg7;
		this.anInt6212 = arg1;
		this.anInt6211 = arg6;
		this.anInt6208 = arg5;
		this.anInt6215 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;Lclient!ki;)Z")
	private boolean method5268(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class179 arg1) {
		if (this.aClass46_18 == null) {
			if (this.anInt6215 == 0) {
				if (Static192.anInterface4_9.method8049(this.anInt6212)) {
					@Pc(23) int[] local23 = Static192.anInterface4_9.method8051(this.anInt6210, 0.7F, this.anInt6212, this.anInt6210);
					this.aClass46_18 = arg0.method7265(this.anInt6210, local23, this.anInt6210, this.anInt6210);
				}
			} else if (this.anInt6215 == 2) {
				this.method5278(arg0, arg1);
			} else if (this.anInt6215 == 1) {
				this.method5273(arg0, arg1);
			}
		}
		return this.aClass46_18 != null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)Z")
	public boolean method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean466) {
			this.anInt6217 = 1073741823;
			local7 = this.anInt6213;
			local12 = this.anInt6206;
			local17 = this.anInt6214;
		} else {
			local7 = this.anInt6213 - arg0;
			local12 = this.anInt6206 - arg1;
			local17 = this.anInt6214 - arg2;
			this.anInt6217 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6217 == 0) {
				this.anInt6217 = 1;
			}
			local7 = (local7 << 8) / this.anInt6217;
			local12 = (local12 << 8) / this.anInt6217;
			local17 = (local17 << 8) / this.anInt6217;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6207 = this.anInt6208 * arg3 / (this.aBoolean466 ? 1024 : this.anInt6217);
		} else {
			this.anInt6207 = 0;
		}
		if (this.anInt6207 < 8) {
			this.aClass46_18 = null;
			return false;
		}
		@Pc(143) int local143 = Static231.method4407(this.anInt6207);
		if (local143 > arg3) {
			local143 = Static14.method293(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6210) {
			this.anInt6210 = local143;
		}
		this.anInt6216 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt6209 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass46_18 = null;
		return true;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
	public void method5272() {
		this.aClass46_18 = null;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Lclient!ha;Lclient!ki;)V")
	private void method5273(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class179 arg1) {
		Static295.method5276(arg0);
		Static295.method5270(arg0);
		arg0.K(Static295.anIntArray363);
		arg0.KA(0, 0, this.anInt6210, this.anInt6210);
		arg0.ya();
		arg0.aa(0, 0, this.anInt6210, this.anInt6210, this.anInt6211 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean466) {
				local31 = -arg1.anInt6213;
				local33 = -arg1.anInt6206;
				local35 = -arg1.anInt6214;
			} else {
				local31 = arg1.anInt6213 - this.anInt6213;
				local33 = arg1.anInt6206 - this.anInt6206;
				local35 = arg1.anInt6214 - this.anInt6214;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6216 != 0) {
			local79 = Class177.anIntArray361[this.anInt6216];
			local84 = Class177.anIntArray360[this.anInt6216];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt6209 != 0) {
			local79 = Class177.anIntArray361[this.anInt6209];
			local84 = Class177.anIntArray360[this.anInt6209];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class166 local147 = Static295.aClass166_6.method6684((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt6212);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6210 * 1024 / (local147.RA() - local147.V());
		if (this.anInt6211 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt6210 / 2, this.anInt6210 / 2, local84, local84);
		arg0.method7241(arg0.method7257());
		@Pc(206) Class30 local206 = arg0.method7257();
		local206.method4649(0, 0, arg0.i() - local147.HA());
		local147.method6678(local206, null, 1024, 1);
		@Pc(228) int local228 = this.anInt6210 * 13 / 16;
		@Pc(235) int local235 = (this.anInt6210 - local228) / 2;
		Static295.aClass46_17.method6209(local235, local235, local228, local228, 0, this.anInt6211 | 0xFF000000, 1);
		this.aClass46_18 = arg0.method7286(0, 0, this.anInt6210, this.anInt6210, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt6210, this.anInt6210, 0, 0);
		Static295.aClass46_19.method6209(0, 0, this.anInt6210, this.anInt6210, 1, 0, 0);
		this.aClass46_18.method6207(0);
		arg0.KA(Static295.anIntArray363[0], Static295.anIntArray363[1], Static295.anIntArray363[2], Static295.anIntArray363[3]);
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(Lclient!ha;Lclient!ki;)Z")
	public boolean method5274(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class179 arg1) {
		return this.aClass46_18 != null || this.method5268(arg0, arg1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method5275(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass46_18 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6216 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6209 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6207) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6207) / 2;
		if (local38 < arg4 && local38 + this.anInt6207 > 0 && local51 < arg3 && local51 + this.anInt6207 > 0) {
			this.aClass46_18.method6212(local51 + arg1, local38 + arg2, this.anInt6207, this.anInt6207);
		}
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(Lclient!ha;Lclient!ki;)V")
	private void method5278(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class179 arg1) {
		@Pc(6) Class32 local6 = Static630.method9136(Static568.aClass157_281, this.anInt6212);
		if (local6 == null) {
			return;
		}
		arg0.K(Static295.anIntArray363);
		arg0.KA(0, 0, this.anInt6210, this.anInt6210);
		arg0.aa(0, 0, this.anInt6210, this.anInt6210, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean466) {
				local32 = -arg1.anInt6213;
				local34 = -arg1.anInt6206;
				local36 = -arg1.anInt6214;
			} else {
				local32 = this.anInt6213 - arg1.anInt6213;
				local34 = this.anInt6206 - arg1.anInt6206;
				local36 = this.anInt6214 - arg1.anInt6214;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6216 != 0) {
			local81 = -this.anInt6216 & 0x3FFF;
			local85 = Class177.anIntArray361[local81];
			local89 = Class177.anIntArray360[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt6209 != 0) {
			local81 = -this.anInt6209 & 0x3FFF;
			local85 = Class177.anIntArray361[local81];
			local89 = Class177.anIntArray360[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class166 local172 = arg0.method7228(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method7241(arg0.method7257());
		@Pc(218) Class30 local218 = arg0.method7308();
		local218.method4649(0, 0, arg0.i() - local172.HA());
		local172.method6678(local218, null, arg0.i(), 1);
		this.aClass46_18 = arg0.method7286(0, 0, this.anInt6210, this.anInt6210, true);
		this.aClass46_18.method6207(3);
		arg0.KA(Static295.anIntArray363[0], Static295.anIntArray363[1], Static295.anIntArray363[2], Static295.anIntArray363[3]);
	}
}
