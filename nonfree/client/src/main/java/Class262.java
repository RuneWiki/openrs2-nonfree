import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class262 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	private int anInt7198;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	private int anInt7199;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!l;")
	private Class17 aClass17_55;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	private int anInt7205;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	public int anInt7206;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	private int anInt7208;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	private final int anInt7202;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	private final int anInt7201;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	private final int anInt7200;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
	private final boolean aBoolean477;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	private final int anInt7197;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	private final int anInt7203;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	private final int anInt7204;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	private final int anInt7207;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7202 = arg2;
		this.anInt7201 = arg3;
		this.anInt7200 = arg4;
		this.aBoolean477 = arg7;
		this.anInt7197 = arg1;
		this.anInt7203 = arg6;
		this.anInt7204 = arg5;
		this.anInt7207 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)Z")
	public boolean method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean477) {
			this.anInt7206 = 1073741823;
			local7 = this.anInt7202;
			local12 = this.anInt7201;
			local17 = this.anInt7200;
		} else {
			local7 = this.anInt7202 - arg0;
			local12 = this.anInt7201 - arg1;
			local17 = this.anInt7200 - arg2;
			this.anInt7206 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt7206 == 0) {
				this.anInt7206 = 1;
			}
			local7 = (local7 << 8) / this.anInt7206;
			local12 = (local12 << 8) / this.anInt7206;
			local17 = (local17 << 8) / this.anInt7206;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt7198 = this.anInt7204 * arg3 / (this.aBoolean477 ? 1024 : this.anInt7206);
		} else {
			this.anInt7198 = 0;
		}
		if (this.anInt7198 < 8) {
			this.aClass17_55 = null;
			return false;
		}
		@Pc(143) int local143 = Static51.method863(this.anInt7198);
		if (local143 > arg3) {
			local143 = Static202.method3245(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt7208) {
			this.anInt7208 = local143;
		}
		this.anInt7199 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt7205 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass17_55 = null;
		return true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ya;IIIIII)V")
	public void method5687(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass17_55 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt7199 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt7205 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt7198) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt7198) / 2;
		if (local38 < arg4 && local38 + this.anInt7198 > 0 && local51 < arg3 && local51 + this.anInt7198 > 0) {
			this.aClass17_55.method5775(local51 + arg1, local38 + arg2, this.anInt7198, this.anInt7198);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
	public void method5688() {
		this.aClass17_55 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!ya;Lclient!we;)V")
	private void method5689(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class262 arg1) {
		Static439.method5696(arg0);
		Static439.method5690(arg0);
		arg0.da(Static439.anIntArray607);
		arg0.OA(0, 0, this.anInt7208, this.anInt7208);
		arg0.method4477();
		arg0.O(0, 0, this.anInt7208, this.anInt7208, this.anInt7203 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean477) {
				local31 = -arg1.anInt7202;
				local33 = -arg1.anInt7201;
				local35 = -arg1.anInt7200;
			} else {
				local31 = arg1.anInt7202 - this.anInt7202;
				local33 = arg1.anInt7201 - this.anInt7201;
				local35 = arg1.anInt7200 - this.anInt7200;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt7199 != 0) {
			local79 = Class162.anIntArray388[this.anInt7199];
			local84 = Class162.anIntArray387[this.anInt7199];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt7205 != 0) {
			local79 = Class162.anIntArray388[this.anInt7205];
			local84 = Class162.anIntArray387[this.anInt7205];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class91 local147 = Static439.aClass91_7.method3285((byte) 0, 51200, true);
		if (arg0.method4425()) {
			local147.I((short) 0, (short) this.anInt7197);
		} else {
			local147.BA((short) 127, Static297.anInterface4_5.method3794(this.anInt7197).aShort44);
			local147.I((short) 0, (short) -1);
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt7208 * 1024 / (local147.NA() - local147.HA());
		if (this.anInt7203 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.H(this.anInt7208 / 2, this.anInt7208 / 2, local84, local84);
		arg0.ea(arg0.method4467());
		@Pc(223) Class35 local223 = arg0.method4467();
		local223.j(0, 0, arg0.a() - local147.PA());
		local147.method3280(local223, null, 1024);
		@Pc(245) int local245 = this.anInt7208 * 13 / 16;
		@Pc(252) int local252 = (this.anInt7208 - local245) / 2;
		Static439.aClass17_54.s(local252, local252, local245, local245, 0, this.anInt7203 | 0xFF000000, 1);
		this.aClass17_55 = arg0.method4441(0, 0, this.anInt7208, this.anInt7208, true);
		arg0.method4477();
		arg0.O(0, 0, this.anInt7208, this.anInt7208, 0, 0);
		Static439.aClass17_56.s(0, 0, this.anInt7208, this.anInt7208, 1, 0, 0);
		this.aClass17_55.BA(0, 0, 0);
		arg0.OA(Static439.anIntArray607[0], Static439.anIntArray607[1], Static439.anIntArray607[2], Static439.anIntArray607[3]);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Lclient!ya;Lclient!we;)Z")
	private boolean method5692(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class262 arg1) {
		if (this.aClass17_55 == null) {
			if (this.anInt7207 == 0) {
				if (Static297.anInterface4_5.method3792(this.anInt7197)) {
					@Pc(23) int[] local23 = Static297.anInterface4_5.method3791(this.anInt7208, this.anInt7197, 0.7F, this.anInt7208);
					this.aClass17_55 = arg0.method4422(local23, this.anInt7208, this.anInt7208, this.anInt7208);
				}
			} else if (this.anInt7207 == 2) {
				this.method5694(arg0, arg1);
			} else if (this.anInt7207 == 1) {
				this.method5689(arg0, arg1);
			}
		}
		return this.aClass17_55 != null;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(Lclient!ya;Lclient!we;)V")
	private void method5694(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class262 arg1) {
		@Pc(6) Class146 local6 = Static152.method2537(Static357.aClass160_70, this.anInt7197);
		if (local6 == null) {
			return;
		}
		arg0.da(Static439.anIntArray607);
		arg0.OA(0, 0, this.anInt7208, this.anInt7208);
		arg0.O(0, 0, this.anInt7208, this.anInt7208, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean477) {
				local32 = -arg1.anInt7202;
				local34 = -arg1.anInt7201;
				local36 = -arg1.anInt7200;
			} else {
				local32 = this.anInt7202 - arg1.anInt7202;
				local34 = this.anInt7201 - arg1.anInt7201;
				local36 = this.anInt7200 - arg1.anInt7200;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt7199 != 0) {
			local81 = -this.anInt7199 & 0x3FFF;
			local85 = Class162.anIntArray388[local81];
			local89 = Class162.anIntArray387[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt7205 != 0) {
			local81 = -this.anInt7205 & 0x3FFF;
			local85 = Class162.anIntArray388[local81];
			local89 = Class162.anIntArray387[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.B(1.0F);
		arg0.T(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class91 local172 = arg0.method4414(local6, 2048, 0, 64, 768);
		local85 = local172.NA() - local172.HA();
		local89 = local172.WA() - local172.MA();
		local99 = local172.HA() + local85 / 2;
		@Pc(198) int local198 = local172.MA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.H(local99, local198, local205, local205);
		arg0.ea(arg0.method4467());
		@Pc(218) Class35 local218 = arg0.method4445();
		local218.j(0, 0, arg0.a() - local172.PA());
		local172.method3280(local218, null, arg0.a());
		this.aClass17_55 = arg0.method4441(0, 0, this.anInt7208, this.anInt7208, true);
		this.aClass17_55.BA(0, 0, 3);
		arg0.OA(Static439.anIntArray607[0], Static439.anIntArray607[1], Static439.anIntArray607[2], Static439.anIntArray607[3]);
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(Lclient!ya;Lclient!we;)Z")
	public boolean method5695(@OriginalArg(0) Class49 arg0, @OriginalArg(1) Class262 arg1) {
		return this.aClass17_55 != null || this.method5692(arg0, arg1);
	}
}
