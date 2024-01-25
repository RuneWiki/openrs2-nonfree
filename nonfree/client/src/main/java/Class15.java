import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class15 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	private int anInt239;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	private int anInt240;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!ha;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	public int anInt245;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "I")
	private final int anInt246;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "I")
	private final int anInt248;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	private final int anInt244;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	private final int anInt247;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	private final int anInt249;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	private final int anInt241;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	private final int anInt238;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt246 = arg2;
		this.anInt248 = arg3;
		this.anInt244 = arg4;
		this.aBoolean10 = arg7;
		this.anInt247 = arg1;
		this.anInt249 = arg6;
		this.anInt241 = arg5;
		this.anInt238 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;Lclient!al;)Z")
	public boolean method361(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class15 arg1) {
		return this.aClass84_1 != null || this.method371(arg0, arg1);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "()V")
	public void method364() {
		this.aClass84_1 = null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)Z")
	public boolean method365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean10) {
			this.anInt245 = 1073741823;
			local7 = this.anInt246;
			local12 = this.anInt248;
			local17 = this.anInt244;
		} else {
			local7 = this.anInt246 - arg0;
			local12 = this.anInt248 - arg1;
			local17 = this.anInt244 - arg2;
			this.anInt245 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt245 == 0) {
				this.anInt245 = 1;
			}
			local7 = (local7 << 8) / this.anInt245;
			local12 = (local12 << 8) / this.anInt245;
			local17 = (local17 << 8) / this.anInt245;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt243 = this.anInt241 * arg3 / (this.aBoolean10 ? 1024 : this.anInt245);
		} else {
			this.anInt243 = 0;
		}
		if (this.anInt243 < 8) {
			this.aClass84_1 = null;
			return false;
		}
		@Pc(143) int local143 = Static37.method6277(this.anInt243);
		if (local143 > arg3) {
			local143 = Static472.method7121(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt239) {
			this.anInt239 = local143;
		}
		this.anInt240 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt242 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass84_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method366(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass84_1 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt240 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt242 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt243) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt243) / 2;
		if (local38 < arg4 && local38 + this.anInt243 > 0 && local51 < arg3 && local51 + this.anInt243 > 0) {
			this.aClass84_1.method7489(local51 + arg1, local38 + arg2, this.anInt243, this.anInt243);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(Lclient!qa;Lclient!al;)V")
	private void method367(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class15 arg1) {
		Static15.method369(arg0);
		Static15.method362(arg0);
		arg0.d(Static15.anIntArray20);
		arg0.N(0, 0, this.anInt239, this.anInt239);
		arg0.method5792();
		arg0.f(0, 0, this.anInt239, this.anInt239, this.anInt249 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean10) {
				local31 = -arg1.anInt246;
				local33 = -arg1.anInt248;
				local35 = -arg1.anInt244;
			} else {
				local31 = arg1.anInt246 - this.anInt246;
				local33 = arg1.anInt248 - this.anInt248;
				local35 = arg1.anInt244 - this.anInt244;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt240 != 0) {
			local79 = Class12_Sub1_Sub36.anIntArray667[this.anInt240];
			local84 = Class12_Sub1_Sub36.anIntArray668[this.anInt240];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt242 != 0) {
			local79 = Class12_Sub1_Sub36.anIntArray667[this.anInt242];
			local84 = Class12_Sub1_Sub36.anIntArray668[this.anInt242];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class26 local147 = Static15.aClass26_1.method7992((byte) 0, 51200, true);
		if (arg0.method5819()) {
			local147.L((short) 0, (short) this.anInt247);
		} else {
			local147.pa((short) 127, Static530.anInterface11_14.method6215(this.anInt247).aShort96);
			local147.L((short) 0, (short) -1);
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt239 * 1024 / (local147.va() - local147.wa());
		if (this.anInt249 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.b(this.anInt239 / 2, this.anInt239 / 2, local84, local84);
		arg0.method5855(arg0.method5829());
		@Pc(223) Class91 local223 = arg0.method5829();
		local223.oa(0, 0, arg0.c() - local147.Q());
		local147.method7994(local223, null, 1024);
		@Pc(245) int local245 = this.anInt239 * 13 / 16;
		@Pc(252) int local252 = (this.anInt239 - local245) / 2;
		Static15.aClass84_3.ra(local252, local252, local245, local245, 0, this.anInt249 | 0xFF000000, 1);
		this.aClass84_1 = arg0.method5817(0, 0, this.anInt239, this.anInt239, true);
		arg0.method5792();
		arg0.f(0, 0, this.anInt239, this.anInt239, 0, 0);
		Static15.aClass84_2.ra(0, 0, this.anInt239, this.anInt239, 1, 0, 0);
		this.aClass84_1.BA(0, 0, 0);
		arg0.N(Static15.anIntArray20[0], Static15.anIntArray20[1], Static15.anIntArray20[2], Static15.anIntArray20[3]);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(Lclient!qa;Lclient!al;)V")
	private void method370(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class15 arg1) {
		@Pc(6) Class192 local6 = Static510.method7591(this.anInt247, Static195.aClass16_50);
		if (local6 == null) {
			return;
		}
		arg0.d(Static15.anIntArray20);
		arg0.N(0, 0, this.anInt239, this.anInt239);
		arg0.f(0, 0, this.anInt239, this.anInt239, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean10) {
				local32 = -arg1.anInt246;
				local34 = -arg1.anInt248;
				local36 = -arg1.anInt244;
			} else {
				local32 = this.anInt246 - arg1.anInt246;
				local34 = this.anInt248 - arg1.anInt248;
				local36 = this.anInt244 - arg1.anInt244;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt240 != 0) {
			local81 = -this.anInt240 & 0x3FFF;
			local85 = Class12_Sub1_Sub36.anIntArray667[local81];
			local89 = Class12_Sub1_Sub36.anIntArray668[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt242 != 0) {
			local81 = -this.anInt242 & 0x3FFF;
			local85 = Class12_Sub1_Sub36.anIntArray667[local81];
			local89 = Class12_Sub1_Sub36.anIntArray668[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.M(1.0F);
		arg0.m(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class26 local172 = arg0.method5812(local6, 2048, 0, 64, 768);
		local85 = local172.va() - local172.wa();
		local89 = local172.n() - local172.TA();
		local99 = local172.wa() + local85 / 2;
		@Pc(198) int local198 = local172.TA() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.b(local99, local198, local205, local205);
		arg0.method5855(arg0.method5829());
		@Pc(218) Class91 local218 = arg0.method5847();
		local218.oa(0, 0, arg0.c() - local172.Q());
		local172.method7994(local218, null, arg0.c());
		this.aClass84_1 = arg0.method5817(0, 0, this.anInt239, this.anInt239, true);
		this.aClass84_1.BA(0, 0, 3);
		arg0.N(Static15.anIntArray20[0], Static15.anIntArray20[1], Static15.anIntArray20[2], Static15.anIntArray20[3]);
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(Lclient!qa;Lclient!al;)Z")
	private boolean method371(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class15 arg1) {
		if (this.aClass84_1 == null) {
			if (this.anInt238 == 0) {
				if (Static530.anInterface11_14.method6213(this.anInt247)) {
					@Pc(23) int[] local23 = Static530.anInterface11_14.method6210(0.7F, this.anInt239, this.anInt247, this.anInt239);
					this.aClass84_1 = arg0.method5862(local23, this.anInt239, this.anInt239, this.anInt239);
				}
			} else if (this.anInt238 == 2) {
				this.method370(arg0, arg1);
			} else if (this.anInt238 == 1) {
				this.method367(arg0, arg1);
			}
		}
		return this.aClass84_1 != null;
	}
}
