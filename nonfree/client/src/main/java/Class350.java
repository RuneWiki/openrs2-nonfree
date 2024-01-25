import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class350 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	private int anInt9732;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	public int anInt9733;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "Lclient!vr;")
	private Class33 aClass33_30;

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
	private int anInt9737;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	private int anInt9739;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	private int anInt9740;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
	private final int anInt9735;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
	private final int anInt9738;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	private final int anInt9741;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Z")
	private final boolean aBoolean749;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	private final int anInt9736;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	private final int anInt9734;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	private final int anInt9731;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	private final int anInt9730;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt9735 = arg2;
		this.anInt9738 = arg3;
		this.anInt9741 = arg4;
		this.aBoolean749 = arg7;
		this.anInt9736 = arg1;
		this.anInt9734 = arg6;
		this.anInt9731 = arg5;
		this.anInt9730 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ha;Lclient!ui;)Z")
	private boolean method8555(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class350 arg1) {
		if (this.aClass33_30 == null) {
			if (this.anInt9730 == 0) {
				if (Static189.anInterface4_9.method4672(this.anInt9736)) {
					@Pc(23) int[] local23 = Static189.anInterface4_9.method4677(this.anInt9737, this.anInt9736, 0.7F, this.anInt9737);
					this.aClass33_30 = arg0.method8479(this.anInt9737, local23, this.anInt9737, this.anInt9737);
				}
			} else if (this.anInt9730 == 2) {
				this.method8558(arg0, arg1);
			} else if (this.anInt9730 == 1) {
				this.method8562(arg0, arg1);
			}
		}
		return this.aClass33_30 != null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)Z")
	public boolean method8556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean749) {
			this.anInt9733 = 1073741823;
			local7 = this.anInt9735;
			local12 = this.anInt9738;
			local17 = this.anInt9741;
		} else {
			local7 = this.anInt9735 - arg0;
			local12 = this.anInt9738 - arg1;
			local17 = this.anInt9741 - arg2;
			this.anInt9733 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt9733 == 0) {
				this.anInt9733 = 1;
			}
			local7 = (local7 << 8) / this.anInt9733;
			local12 = (local12 << 8) / this.anInt9733;
			local17 = (local17 << 8) / this.anInt9733;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt9732 = this.anInt9731 * arg3 / (this.aBoolean749 ? 1024 : this.anInt9733);
		} else {
			this.anInt9732 = 0;
		}
		if (this.anInt9732 < 8) {
			this.aClass33_30 = null;
			return false;
		}
		@Pc(143) int local143 = Static282.method4521(this.anInt9732);
		if (local143 > arg3) {
			local143 = Static677.method9371(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt9737) {
			this.anInt9737 = local143;
		}
		this.anInt9740 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt9739 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass33_30 = null;
		return true;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method8557(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass33_30 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt9740 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt9739 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt9732) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt9732) / 2;
		if (local38 < arg4 && local38 + this.anInt9732 > 0 && local51 < arg3 && local51 + this.anInt9732 > 0) {
			this.aClass33_30.method7651(local51 + arg1, local38 + arg2, this.anInt9732, this.anInt9732);
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lclient!ha;Lclient!ui;)V")
	private void method8558(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class350 arg1) {
		@Pc(6) Class117 local6 = Static98.method1747(Static324.aClass15_87, this.anInt9736);
		if (local6 == null) {
			return;
		}
		arg0.K(Static606.anIntArray842);
		arg0.KA(0, 0, this.anInt9737, this.anInt9737);
		arg0.aa(0, 0, this.anInt9737, this.anInt9737, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean749) {
				local32 = -arg1.anInt9735;
				local34 = -arg1.anInt9738;
				local36 = -arg1.anInt9741;
			} else {
				local32 = this.anInt9735 - arg1.anInt9735;
				local34 = this.anInt9738 - arg1.anInt9738;
				local36 = this.anInt9741 - arg1.anInt9741;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt9740 != 0) {
			local81 = -this.anInt9740 & 0x3FFF;
			local85 = Class3_Sub20.anIntArray206[local81];
			local89 = Class3_Sub20.anIntArray204[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt9739 != 0) {
			local81 = -this.anInt9739 & 0x3FFF;
			local85 = Class3_Sub20.anIntArray206[local81];
			local89 = Class3_Sub20.anIntArray204[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class95 local172 = arg0.method8489(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8501(arg0.method8461());
		@Pc(218) Class239 local218 = arg0.method8447();
		local218.method9234(0, 0, arg0.i() - local172.HA());
		local172.method5659(local218, (Class28_Sub8) null, arg0.i(), 1);
		this.aClass33_30 = arg0.method8526(0, 0, this.anInt9737, this.anInt9737, true);
		this.aClass33_30.method7643(3);
		arg0.KA(Static606.anIntArray842[0], Static606.anIntArray842[1], Static606.anIntArray842[2], Static606.anIntArray842[3]);
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(Lclient!ha;Lclient!ui;)V")
	private void method8562(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class350 arg1) {
		Static606.method8560(arg0);
		Static606.method8561(arg0);
		arg0.K(Static606.anIntArray842);
		arg0.KA(0, 0, this.anInt9737, this.anInt9737);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9737, this.anInt9737, this.anInt9734 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean749) {
				local31 = -arg1.anInt9735;
				local33 = -arg1.anInt9738;
				local35 = -arg1.anInt9741;
			} else {
				local31 = arg1.anInt9735 - this.anInt9735;
				local33 = arg1.anInt9738 - this.anInt9738;
				local35 = arg1.anInt9741 - this.anInt9741;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt9740 != 0) {
			local79 = Class3_Sub20.anIntArray206[this.anInt9740];
			local84 = Class3_Sub20.anIntArray204[this.anInt9740];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt9739 != 0) {
			local79 = Class3_Sub20.anIntArray206[this.anInt9739];
			local84 = Class3_Sub20.anIntArray204[this.anInt9739];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class95 local147 = Static606.aClass95_7.method5664((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt9736);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt9737 * 1024 / (local147.RA() - local147.V());
		if (this.anInt9734 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt9737 / 2, this.anInt9737 / 2, local84, local84);
		arg0.method8501(arg0.method8461());
		@Pc(206) Class239 local206 = arg0.method8461();
		local206.method9234(0, 0, arg0.i() - local147.HA());
		local147.method5659(local206, (Class28_Sub8) null, 1024, 1);
		@Pc(228) int local228 = this.anInt9737 * 13 / 16;
		@Pc(235) int local235 = (this.anInt9737 - local228) / 2;
		Static606.aClass33_32.method7656(local235, local235, local228, local228, 0, this.anInt9734 | 0xFF000000, 1);
		this.aClass33_30 = arg0.method8526(0, 0, this.anInt9737, this.anInt9737, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9737, this.anInt9737, 0, 0);
		Static606.aClass33_31.method7656(0, 0, this.anInt9737, this.anInt9737, 1, 0, 0);
		this.aClass33_30.method7643(0);
		arg0.KA(Static606.anIntArray842[0], Static606.anIntArray842[1], Static606.anIntArray842[2], Static606.anIntArray842[3]);
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(Lclient!ha;Lclient!ui;)Z")
	public boolean method8563(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class350 arg1) {
		return this.aClass33_30 != null || this.method8555(arg0, arg1);
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "()V")
	public void method8565() {
		this.aClass33_30 = null;
	}
}
