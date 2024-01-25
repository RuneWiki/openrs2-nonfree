import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class161 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private int anInt4454;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	private int anInt4455;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Lclient!o;")
	private Class80 aClass80_12;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	private int anInt4459;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public int anInt4460;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	private int anInt4465;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	private final int anInt4457;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	private final int anInt4462;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
	private final int anInt4463;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "Z")
	private final boolean aBoolean300;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	private final int anInt4458;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	private final int anInt4456;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	private final int anInt4461;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	private final int anInt4464;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4457 = arg2;
		this.anInt4462 = arg3;
		this.anInt4463 = arg4;
		this.aBoolean300 = arg7;
		this.anInt4458 = arg1;
		this.anInt4456 = arg6;
		this.anInt4461 = arg5;
		this.anInt4464 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!za;Lclient!mc;)Z")
	public boolean method3587(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class161 arg1) {
		return this.aClass80_12 != null || this.method3588(arg0, arg1);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Lclient!za;Lclient!mc;)Z")
	private boolean method3588(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class161 arg1) {
		if (this.aClass80_12 == null) {
			if (this.anInt4464 == 0) {
				if (Static147.anInterface7_3.method4450(this.anInt4458)) {
					@Pc(23) int[] local23 = Static147.anInterface7_3.method4451(this.anInt4465, this.anInt4458, 0.7F, this.anInt4465);
					this.aClass80_12 = arg0.method5823(local23, this.anInt4465, this.anInt4465, this.anInt4465);
				}
			} else if (this.anInt4464 == 2) {
				this.method3595(arg0, arg1);
			} else if (this.anInt4464 == 1) {
				this.method3593(arg0, arg1);
			}
		}
		return this.aClass80_12 != null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
	public void method3590() {
		this.aClass80_12 = null;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lclient!za;Lclient!mc;)V")
	private void method3593(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class161 arg1) {
		Static246.method3596(arg0);
		Static246.method3589(arg0);
		arg0.MA(Static246.anIntArray445);
		arg0.ba(0, 0, this.anInt4465, this.anInt4465);
		arg0.method5848();
		arg0.P(0, 0, this.anInt4465, this.anInt4465, this.anInt4456 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean300) {
				local31 = -arg1.anInt4457;
				local33 = -arg1.anInt4462;
				local35 = -arg1.anInt4463;
			} else {
				local31 = arg1.anInt4457 - this.anInt4457;
				local33 = arg1.anInt4462 - this.anInt4462;
				local35 = arg1.anInt4463 - this.anInt4463;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4459 != 0) {
			local79 = Class250.anIntArray675[this.anInt4459];
			local84 = Class250.anIntArray674[this.anInt4459];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4455 != 0) {
			local79 = Class250.anIntArray675[this.anInt4455];
			local84 = Class250.anIntArray674[this.anInt4455];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class63 local147 = Static246.aClass63_3.method6093((byte) 0, 51200, true);
		if (arg0.method5843()) {
			local147.u((short) 0, (short) this.anInt4458);
		} else {
			local147.q((short) 127, Static147.anInterface7_3.method4447(this.anInt4458).aShort108);
			local147.u((short) 0, (short) -1);
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4465 * 1024 / (local147.MA() - local147.ta());
		if (this.anInt4456 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt4465 / 2, this.anInt4465 / 2, local84, local84);
		arg0.SA(arg0.method5829());
		@Pc(223) Class34 local223 = arg0.method5829();
		local223.U(0, 0, arg0.AA() - local147.Z());
		local147.method6097(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4465 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4465 - local245) / 2;
		Static246.aClass80_13.ya(local252, local252, local245, local245, 0, this.anInt4456 | 0xFF000000, 1);
		this.aClass80_12 = arg0.method5838(0, 0, this.anInt4465, this.anInt4465, true);
		arg0.method5848();
		arg0.P(0, 0, this.anInt4465, this.anInt4465, 0, 0);
		Static246.aClass80_11.ya(0, 0, this.anInt4465, this.anInt4465, 1, 0, 0);
		this.aClass80_12.oa(0, 0, 0);
		arg0.ba(Static246.anIntArray445[0], Static246.anIntArray445[1], Static246.anIntArray445[2], Static246.anIntArray445[3]);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)Z")
	public boolean method3594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean300) {
			this.anInt4460 = 1073741823;
			local7 = this.anInt4457;
			local12 = this.anInt4462;
			local17 = this.anInt4463;
		} else {
			local7 = this.anInt4457 - arg0;
			local12 = this.anInt4462 - arg1;
			local17 = this.anInt4463 - arg2;
			this.anInt4460 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4460 == 0) {
				this.anInt4460 = 1;
			}
			local7 = (local7 << 8) / this.anInt4460;
			local12 = (local12 << 8) / this.anInt4460;
			local17 = (local17 << 8) / this.anInt4460;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4454 = this.anInt4461 * arg3 / (this.aBoolean300 ? 1024 : this.anInt4460);
		} else {
			this.anInt4454 = 0;
		}
		if (this.anInt4454 < 8) {
			this.aClass80_12 = null;
			return false;
		}
		@Pc(143) int local143 = Static186.method3002(this.anInt4454);
		if (local143 > arg3) {
			local143 = Static68.method1346(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4465) {
			this.anInt4465 = local143;
		}
		this.anInt4459 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4455 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass80_12 = null;
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lclient!za;Lclient!mc;)V")
	private void method3595(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class161 arg1) {
		@Pc(6) Class192 local6 = Static378.method5099(Static97.aClass187_23, this.anInt4458);
		if (local6 == null) {
			return;
		}
		arg0.MA(Static246.anIntArray445);
		arg0.ba(0, 0, this.anInt4465, this.anInt4465);
		arg0.P(0, 0, this.anInt4465, this.anInt4465, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean300) {
				local32 = -arg1.anInt4457;
				local34 = -arg1.anInt4462;
				local36 = -arg1.anInt4463;
			} else {
				local32 = this.anInt4457 - arg1.anInt4457;
				local34 = this.anInt4462 - arg1.anInt4462;
				local36 = this.anInt4463 - arg1.anInt4463;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4459 != 0) {
			local81 = -this.anInt4459 & 0x3FFF;
			local85 = Class250.anIntArray675[local81];
			local89 = Class250.anIntArray674[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4455 != 0) {
			local81 = -this.anInt4455 & 0x3FFF;
			local85 = Class250.anIntArray675[local81];
			local89 = Class250.anIntArray674[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class63 local172 = arg0.method5864(local6, 2048, 0, 64, 768);
		local85 = local172.MA() - local172.ta();
		local89 = local172.l() - local172.B();
		local99 = local172.ta() + local85 / 2;
		@Pc(198) int local198 = local172.B() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.SA(arg0.method5829());
		@Pc(218) Class34 local218 = arg0.method5819();
		local218.U(0, 0, arg0.AA() - local172.Z());
		local172.method6097(local218, null, arg0.AA());
		this.aClass80_12 = arg0.method5838(0, 0, this.anInt4465, this.anInt4465, true);
		this.aClass80_12.oa(0, 0, 3);
		arg0.ba(Static246.anIntArray445[0], Static246.anIntArray445[1], Static246.anIntArray445[2], Static246.anIntArray445[3]);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	public void method3597(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass80_12 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4459 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4455 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4454) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4454) / 2;
		if (local38 < arg4 && local38 + this.anInt4454 > 0 && local51 < arg3 && local51 + this.anInt4454 > 0) {
			this.aClass80_12.method5554(local51 + arg1, local38 + arg2, this.anInt4454, this.anInt4454);
		}
	}
}
