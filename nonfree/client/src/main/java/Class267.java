import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class267 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	private int anInt7876;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
	private int anInt7879;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "Lclient!o;")
	private Class137 aClass137_21;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
	private int anInt7880;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt7881;

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
	private int anInt7885;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	private final int anInt7882;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	private final int anInt7875;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	private final int anInt7884;

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "Z")
	private final boolean aBoolean514;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	private final int anInt7878;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	private final int anInt7877;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	private final int anInt7883;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
	private final int anInt7874;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7882 = arg2;
		this.anInt7875 = arg3;
		this.anInt7884 = arg4;
		this.aBoolean514 = arg7;
		this.anInt7878 = arg1;
		this.anInt7877 = arg6;
		this.anInt7883 = arg5;
		this.anInt7874 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()V")
	public void method6104() {
		this.aClass137_21 = null;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!za;Lclient!wl;)V")
	private void method6105(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class267 arg1) {
		Static449.method6107(arg0);
		Static449.method6112(arg0);
		arg0.MA(Static449.anIntArray745);
		arg0.ba(0, 0, this.anInt7876, this.anInt7876);
		arg0.method5926();
		arg0.P(0, 0, this.anInt7876, this.anInt7876, this.anInt7877 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean514) {
				local31 = -arg1.anInt7882;
				local33 = -arg1.anInt7875;
				local35 = -arg1.anInt7884;
			} else {
				local31 = arg1.anInt7882 - this.anInt7882;
				local33 = arg1.anInt7875 - this.anInt7875;
				local35 = arg1.anInt7884 - this.anInt7884;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt7885 != 0) {
			local79 = Class90_Sub1.anIntArray304[this.anInt7885];
			local84 = Class90_Sub1.anIntArray303[this.anInt7885];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt7880 != 0) {
			local79 = Class90_Sub1.anIntArray304[this.anInt7880];
			local84 = Class90_Sub1.anIntArray303[this.anInt7880];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class17 local147 = Static449.aClass17_7.method6202((byte) 0, 51200, true);
		if (arg0.method5910()) {
			local147.u((short) 0, (short) this.anInt7878);
		} else {
			local147.q((short) 127, Static260.anInterface7_9.method78(this.anInt7878).aShort59);
			local147.u((short) 0, (short) -1);
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt7876 * 1024 / (local147.MA() - local147.ta());
		if (this.anInt7877 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt7876 / 2, this.anInt7876 / 2, local84, local84);
		arg0.SA(arg0.method5944());
		@Pc(223) Class40 local223 = arg0.method5944();
		local223.U(0, 0, arg0.AA() - local147.Z());
		local147.method6195(local223, null, 1024);
		@Pc(245) int local245 = this.anInt7876 * 13 / 16;
		@Pc(252) int local252 = (this.anInt7876 - local245) / 2;
		Static449.aClass137_22.ya(local252, local252, local245, local245, 0, this.anInt7877 | 0xFF000000, 1);
		this.aClass137_21 = arg0.method5931(0, 0, this.anInt7876, this.anInt7876, true);
		arg0.method5926();
		arg0.P(0, 0, this.anInt7876, this.anInt7876, 0, 0);
		Static449.aClass137_20.ya(0, 0, this.anInt7876, this.anInt7876, 1, 0, 0);
		this.aClass137_21.oa(0, 0, 0);
		arg0.ba(Static449.anIntArray745[0], Static449.anIntArray745[1], Static449.anIntArray745[2], Static449.anIntArray745[3]);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII)Z")
	public boolean method6108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean514) {
			this.anInt7881 = 1073741823;
			local7 = this.anInt7882;
			local12 = this.anInt7875;
			local17 = this.anInt7884;
		} else {
			local7 = this.anInt7882 - arg0;
			local12 = this.anInt7875 - arg1;
			local17 = this.anInt7884 - arg2;
			this.anInt7881 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt7881 == 0) {
				this.anInt7881 = 1;
			}
			local7 = (local7 << 8) / this.anInt7881;
			local12 = (local12 << 8) / this.anInt7881;
			local17 = (local17 << 8) / this.anInt7881;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt7879 = this.anInt7883 * arg3 / (this.aBoolean514 ? 1024 : this.anInt7881);
		} else {
			this.anInt7879 = 0;
		}
		if (this.anInt7879 < 8) {
			this.aClass137_21 = null;
			return false;
		}
		@Pc(143) int local143 = Static427.method5762(this.anInt7879);
		if (local143 > arg3) {
			local143 = Static417.method5678(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt7876) {
			this.anInt7876 = local143;
		}
		this.anInt7885 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt7880 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass137_21 = null;
		return true;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	public void method6109(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass137_21 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt7885 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt7880 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt7879) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt7879) / 2;
		if (local38 < arg4 && local38 + this.anInt7879 > 0 && local51 < arg3 && local51 + this.anInt7879 > 0) {
			this.aClass137_21.method5700(local51 + arg1, local38 + arg2, this.anInt7879, this.anInt7879);
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Lclient!za;Lclient!wl;)Z")
	public boolean method6110(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class267 arg1) {
		return this.aClass137_21 != null || this.method6113(arg0, arg1);
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(Lclient!za;Lclient!wl;)V")
	private void method6111(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class267 arg1) {
		@Pc(6) Class147 local6 = Static354.method5036(Static56.aClass211_17, this.anInt7878);
		if (local6 == null) {
			return;
		}
		arg0.MA(Static449.anIntArray745);
		arg0.ba(0, 0, this.anInt7876, this.anInt7876);
		arg0.P(0, 0, this.anInt7876, this.anInt7876, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean514) {
				local32 = -arg1.anInt7882;
				local34 = -arg1.anInt7875;
				local36 = -arg1.anInt7884;
			} else {
				local32 = this.anInt7882 - arg1.anInt7882;
				local34 = this.anInt7875 - arg1.anInt7875;
				local36 = this.anInt7884 - arg1.anInt7884;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt7885 != 0) {
			local81 = -this.anInt7885 & 0x3FFF;
			local85 = Class90_Sub1.anIntArray304[local81];
			local89 = Class90_Sub1.anIntArray303[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt7880 != 0) {
			local81 = -this.anInt7880 & 0x3FFF;
			local85 = Class90_Sub1.anIntArray304[local81];
			local89 = Class90_Sub1.anIntArray303[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class17 local172 = arg0.method5922(local6, 2048, 0, 64, 768);
		local85 = local172.MA() - local172.ta();
		local89 = local172.l() - local172.B();
		local99 = local172.ta() + local85 / 2;
		@Pc(198) int local198 = local172.B() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.SA(arg0.method5944());
		@Pc(218) Class40 local218 = arg0.method5918();
		local218.U(0, 0, arg0.AA() - local172.Z());
		local172.method6195(local218, null, arg0.AA());
		this.aClass137_21 = arg0.method5931(0, 0, this.anInt7876, this.anInt7876, true);
		this.aClass137_21.oa(0, 0, 3);
		arg0.ba(Static449.anIntArray745[0], Static449.anIntArray745[1], Static449.anIntArray745[2], Static449.anIntArray745[3]);
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(Lclient!za;Lclient!wl;)Z")
	private boolean method6113(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class267 arg1) {
		if (this.aClass137_21 == null) {
			if (this.anInt7874 == 0) {
				if (Static260.anInterface7_9.method77(this.anInt7878)) {
					@Pc(23) int[] local23 = Static260.anInterface7_9.method79(this.anInt7876, this.anInt7878, this.anInt7876, 0.7F);
					this.aClass137_21 = arg0.method5969(local23, this.anInt7876, this.anInt7876, this.anInt7876);
				}
			} else if (this.anInt7874 == 2) {
				this.method6111(arg0, arg1);
			} else if (this.anInt7874 == 1) {
				this.method6105(arg0, arg1);
			}
		}
		return this.aClass137_21 != null;
	}
}
