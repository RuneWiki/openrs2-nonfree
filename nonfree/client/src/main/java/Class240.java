import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class240 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
	private int anInt6116;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!dp;")
	private Class51 aClass51_19;

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	private int anInt6118;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
	private int anInt6120;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
	private int anInt6124;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
	public int anInt6126;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
	private final int anInt6122;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	private final int anInt6125;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
	private final int anInt6117;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
	private final boolean aBoolean564;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	private final int anInt6121;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	private final int anInt6119;

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
	private final int anInt6127;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
	private final int anInt6123;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6122 = arg2;
		this.anInt6125 = arg3;
		this.anInt6117 = arg4;
		this.aBoolean564 = arg7;
		this.anInt6121 = arg1;
		this.anInt6119 = arg6;
		this.anInt6127 = arg5;
		this.anInt6123 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!tq;Lclient!vr;)V")
	private void method5282(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class240 arg1) {
		Static377.method5290(arg0);
		Static377.method5284(arg0);
		arg0.method5353(Static377.anIntArray727);
		arg0.method5313(0, 0, this.anInt6118, this.anInt6118);
		arg0.method5376();
		arg0.method5321(0, 0, this.anInt6118, this.anInt6118, this.anInt6119 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean564) {
				local31 = -arg1.anInt6122;
				local33 = -arg1.anInt6125;
				local35 = -arg1.anInt6117;
			} else {
				local31 = arg1.anInt6122 - this.anInt6122;
				local33 = arg1.anInt6125 - this.anInt6125;
				local35 = arg1.anInt6117 - this.anInt6117;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6116 != 0) {
			local79 = Class13.anIntArray20[this.anInt6116];
			local84 = Class13.anIntArray21[this.anInt6116];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt6120 != 0) {
			local79 = Class13.anIntArray20[this.anInt6120];
			local84 = Class13.anIntArray21[this.anInt6120];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class22 local147 = Static377.aClass22_7.method1598((byte) 0, 25600, true);
		if (arg0.method5384()) {
			local147.method1576((short) 0, (short) this.anInt6121);
		} else {
			local147.method1581((short) 127, Static134.anInterface2_2.method4741(this.anInt6121).aShort49);
			local147.method1576((short) 0, (short) -1);
		}
		arg0.method5398(1.0F);
		arg0.method5388(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6118 * 1024 / (local147.method1586() - local147.method1574());
		if (this.anInt6119 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method5329(this.anInt6118 / 2, this.anInt6118 / 2, local84, local84);
		arg0.method5357(arg0.method5393());
		@Pc(223) Class127 local223 = arg0.method5393();
		local223.method5265(0, 0, arg0.method5347() - local147.method1592());
		local147.method1566(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6118 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6118 - local245) / 2;
		Static377.aClass51_21.method4677(local252, local252, local245, local245, 1, this.anInt6119 | 0xFF000000, 1);
		this.aClass51_19 = arg0.method5387(0, 0, this.anInt6118, this.anInt6118, true);
		arg0.method5376();
		arg0.method5321(0, 0, this.anInt6118, this.anInt6118, 0, 0);
		Static377.aClass51_20.method4677(0, 0, this.anInt6118, this.anInt6118, 0, 0, 0);
		this.aClass51_19.method4668(0);
		arg0.method5313(Static377.anIntArray727[0], Static377.anIntArray727[1], Static377.anIntArray727[2], Static377.anIntArray727[3]);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!tq;IIIIII)V")
	public void method5283(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass51_19 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6116 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6120 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6124) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6124) / 2;
		if (local38 < arg4 && local38 + this.anInt6124 > 0 && local51 < arg3 && local51 + this.anInt6124 > 0) {
			this.aClass51_19.method4679(local51 + arg1, local38 + arg2, this.anInt6124, this.anInt6124);
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "()V")
	public void method5285() {
		this.aClass51_19 = null;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lclient!tq;Lclient!vr;)Z")
	public boolean method5287(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class240 arg1) {
		return this.aClass51_19 != null || this.method5288(arg0, arg1);
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(Lclient!tq;Lclient!vr;)Z")
	private boolean method5288(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class240 arg1) {
		if (this.aClass51_19 == null) {
			if (this.anInt6123 == 0) {
				if (Static134.anInterface2_2.method4740(this.anInt6121)) {
					@Pc(23) int[] local23 = Static134.anInterface2_2.method4743(0.7F, this.anInt6118, this.anInt6118, this.anInt6121);
					this.aClass51_19 = arg0.method5349(local23, this.anInt6118, this.anInt6118, this.anInt6118);
				}
			} else if (this.anInt6123 == 2) {
				this.method5289(arg0, arg1);
			} else if (this.anInt6123 == 1) {
				this.method5282(arg0, arg1);
			}
		}
		return this.aClass51_19 != null;
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(Lclient!tq;Lclient!vr;)V")
	private void method5289(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class240 arg1) {
		@Pc(6) Class238 local6 = Static180.method2595(this.anInt6121, Static234.aClass230_60);
		if (local6 == null) {
			return;
		}
		arg0.method5353(Static377.anIntArray727);
		arg0.method5313(0, 0, this.anInt6118, this.anInt6118);
		arg0.method5321(0, 0, this.anInt6118, this.anInt6118, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean564) {
				local32 = -arg1.anInt6122;
				local34 = -arg1.anInt6125;
				local36 = -arg1.anInt6117;
			} else {
				local32 = this.anInt6122 - arg1.anInt6122;
				local34 = this.anInt6125 - arg1.anInt6125;
				local36 = this.anInt6117 - arg1.anInt6117;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6116 != 0) {
			local81 = -this.anInt6116 & 0x3FFF;
			local85 = Class13.anIntArray20[local81];
			local89 = Class13.anIntArray21[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt6120 != 0) {
			local81 = -this.anInt6120 & 0x3FFF;
			local85 = Class13.anIntArray20[local81];
			local89 = Class13.anIntArray21[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method5398(1.0F);
		arg0.method5388(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class22 local172 = arg0.method5368(local6, 1024, 0, 64, 768);
		local85 = local172.method1586() - local172.method1574();
		local89 = local172.method1577() - local172.method1561();
		local99 = local172.method1574() + local85 / 2;
		@Pc(198) int local198 = local172.method1561() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method5329(local99, local198, local205, local205);
		arg0.method5357(arg0.method5393());
		@Pc(218) Class127 local218 = arg0.method5378();
		local218.method5265(0, 0, arg0.method5347() - local172.method1592());
		local172.method1566(local218, null, arg0.method5347());
		this.aClass51_19 = arg0.method5387(0, 0, this.anInt6118, this.anInt6118, true);
		this.aClass51_19.method4668(3);
		arg0.method5313(Static377.anIntArray727[0], Static377.anIntArray727[1], Static377.anIntArray727[2], Static377.anIntArray727[3]);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIII)Z")
	public boolean method5292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean564) {
			this.anInt6126 = 1073741823;
			local7 = this.anInt6122;
			local12 = this.anInt6125;
			local17 = this.anInt6117;
		} else {
			local7 = this.anInt6122 - arg0;
			local12 = this.anInt6125 - arg1;
			local17 = this.anInt6117 - arg2;
			this.anInt6126 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6126 == 0) {
				this.anInt6126 = 1;
			}
			local7 = (local7 << 8) / this.anInt6126;
			local12 = (local12 << 8) / this.anInt6126;
			local17 = (local17 << 8) / this.anInt6126;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6124 = this.anInt6127 * arg3 / (this.aBoolean564 ? 1024 : this.anInt6126);
		} else {
			this.anInt6124 = 0;
		}
		if (this.anInt6124 < 8) {
			this.aClass51_19 = null;
			return false;
		}
		@Pc(143) int local143 = Static183.method1325(this.anInt6124);
		if (local143 > arg3) {
			local143 = Static257.method3933(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6118) {
			this.anInt6118 = local143;
		}
		this.anInt6116 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt6120 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass51_19 = null;
		return true;
	}
}
