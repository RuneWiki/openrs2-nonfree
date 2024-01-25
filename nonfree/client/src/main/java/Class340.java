import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class340 {

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
	public int anInt9032;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	private int anInt9033;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!cw;")
	private Class61 aClass61_31;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	private int anInt9034;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
	private int anInt9038;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	private int anInt9039;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
	private final int anInt9042;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
	private final int anInt9041;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
	private final int anInt9036;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Z")
	private final boolean aBoolean672;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	private final int anInt9037;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
	private final int anInt9040;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	private final int anInt9043;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	private final int anInt9035;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt9042 = arg2;
		this.anInt9041 = arg3;
		this.anInt9036 = arg4;
		this.aBoolean672 = arg7;
		this.anInt9037 = arg1;
		this.anInt9040 = arg6;
		this.anInt9043 = arg5;
		this.anInt9035 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ha;Lclient!tm;)Z")
	public boolean method7584(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class340 arg1) {
		return this.aClass61_31 != null || this.method7588(arg0, arg1);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lclient!ha;Lclient!tm;)V")
	private void method7586(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class340 arg1) {
		@Pc(6) Class186 local6 = Static439.method6023(Static13.aClass380_4, this.anInt9037);
		if (local6 == null) {
			return;
		}
		arg0.K(Static552.anIntArray618);
		arg0.KA(0, 0, this.anInt9039, this.anInt9039);
		arg0.aa(0, 0, this.anInt9039, this.anInt9039, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean672) {
				local32 = -arg1.anInt9042;
				local34 = -arg1.anInt9041;
				local36 = -arg1.anInt9036;
			} else {
				local32 = this.anInt9042 - arg1.anInt9042;
				local34 = this.anInt9041 - arg1.anInt9041;
				local36 = this.anInt9036 - arg1.anInt9036;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt9033 != 0) {
			local81 = -this.anInt9033 & 0x3FFF;
			local85 = Canvas_Sub1.anIntArray497[local81];
			local89 = Canvas_Sub1.anIntArray498[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt9034 != 0) {
			local81 = -this.anInt9034 & 0x3FFF;
			local85 = Canvas_Sub1.anIntArray497[local81];
			local89 = Canvas_Sub1.anIntArray498[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class182 local172 = arg0.method6938(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method6941(arg0.method7001());
		@Pc(218) Class177 local218 = arg0.method6967();
		local218.method7869(0, 0, arg0.i() - local172.HA());
		local172.method6194(local218, null, arg0.i(), 1);
		this.aClass61_31 = arg0.method6972(0, 0, this.anInt9039, this.anInt9039, true);
		this.aClass61_31.method6450(3);
		arg0.KA(Static552.anIntArray618[0], Static552.anIntArray618[1], Static552.anIntArray618[2], Static552.anIntArray618[3]);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)Z")
	public boolean method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean672) {
			this.anInt9032 = 1073741823;
			local7 = this.anInt9042;
			local12 = this.anInt9041;
			local17 = this.anInt9036;
		} else {
			local7 = this.anInt9042 - arg0;
			local12 = this.anInt9041 - arg1;
			local17 = this.anInt9036 - arg2;
			this.anInt9032 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt9032 == 0) {
				this.anInt9032 = 1;
			}
			local7 = (local7 << 8) / this.anInt9032;
			local12 = (local12 << 8) / this.anInt9032;
			local17 = (local17 << 8) / this.anInt9032;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt9038 = this.anInt9043 * arg3 / (this.aBoolean672 ? 1024 : this.anInt9032);
		} else {
			this.anInt9038 = 0;
		}
		if (this.anInt9038 < 8) {
			this.aClass61_31 = null;
			return false;
		}
		@Pc(143) int local143 = Static350.method4699(this.anInt9038);
		if (local143 > arg3) {
			local143 = Static285.method3974(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt9039) {
			this.anInt9039 = local143;
		}
		this.anInt9033 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt9034 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass61_31 = null;
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(Lclient!ha;Lclient!tm;)Z")
	private boolean method7588(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class340 arg1) {
		if (this.aClass61_31 == null) {
			if (this.anInt9035 == 0) {
				if (Static234.anInterface6_31.method1493(this.anInt9037)) {
					@Pc(23) int[] local23 = Static234.anInterface6_31.method1488(0.7F, this.anInt9039, this.anInt9037, this.anInt9039);
					this.aClass61_31 = arg0.method6953(local23, this.anInt9039, this.anInt9039, this.anInt9039);
				}
			} else if (this.anInt9035 == 2) {
				this.method7586(arg0, arg1);
			} else if (this.anInt9035 == 1) {
				this.method7591(arg0, arg1);
			}
		}
		return this.aClass61_31 != null;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "()V")
	public void method7590() {
		this.aClass61_31 = null;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(Lclient!ha;Lclient!tm;)V")
	private void method7591(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class340 arg1) {
		Static552.method7592(arg0);
		Static552.method7583(arg0);
		arg0.K(Static552.anIntArray618);
		arg0.KA(0, 0, this.anInt9039, this.anInt9039);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9039, this.anInt9039, this.anInt9040 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean672) {
				local31 = -arg1.anInt9042;
				local33 = -arg1.anInt9041;
				local35 = -arg1.anInt9036;
			} else {
				local31 = arg1.anInt9042 - this.anInt9042;
				local33 = arg1.anInt9041 - this.anInt9041;
				local35 = arg1.anInt9036 - this.anInt9036;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt9033 != 0) {
			local79 = Canvas_Sub1.anIntArray497[this.anInt9033];
			local84 = Canvas_Sub1.anIntArray498[this.anInt9033];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt9034 != 0) {
			local79 = Canvas_Sub1.anIntArray497[this.anInt9034];
			local84 = Canvas_Sub1.anIntArray498[this.anInt9034];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class182 local147 = Static552.aClass182_4.method6208((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt9037);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt9039 * 1024 / (local147.RA() - local147.V());
		if (this.anInt9040 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt9039 / 2, this.anInt9039 / 2, local84, local84);
		arg0.method6941(arg0.method7001());
		@Pc(206) Class177 local206 = arg0.method7001();
		local206.method7869(0, 0, arg0.i() - local147.HA());
		local147.method6194(local206, null, 1024, 1);
		@Pc(228) int local228 = this.anInt9039 * 13 / 16;
		@Pc(235) int local235 = (this.anInt9039 - local228) / 2;
		Static552.aClass61_32.method6440(local235, local235, local228, local228, 0, this.anInt9040 | 0xFF000000, 1);
		this.aClass61_31 = arg0.method6972(0, 0, this.anInt9039, this.anInt9039, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt9039, this.anInt9039, 0, 0);
		Static552.aClass61_30.method6440(0, 0, this.anInt9039, this.anInt9039, 1, 0, 0);
		this.aClass61_31.method6450(0);
		arg0.KA(Static552.anIntArray618[0], Static552.anIntArray618[1], Static552.anIntArray618[2], Static552.anIntArray618[3]);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method7593(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass61_31 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt9033 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt9034 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt9038) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt9038) / 2;
		if (local38 < arg4 && local38 + this.anInt9038 > 0 && local51 < arg3 && local51 + this.anInt9038 > 0) {
			this.aClass61_31.method6430(local51 + arg1, local38 + arg2, this.anInt9038, this.anInt9038);
		}
	}
}
