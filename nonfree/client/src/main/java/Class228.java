import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class228 {

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!f;")
	private Class3 aClass3_22;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	private int anInt6610;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "I")
	public int anInt6611;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	private int anInt6613;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	private int anInt6614;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	private int anInt6615;

	@OriginalMember(owner = "client!te", name = "g", descriptor = "I")
	private final int anInt6609;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	private final int anInt6605;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	private final int anInt6612;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "Z")
	private final boolean aBoolean440;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	private final int anInt6607;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	private final int anInt6606;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	private final int anInt6604;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "I")
	private final int anInt6608;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt6609 = arg2;
		this.anInt6605 = arg3;
		this.anInt6612 = arg4;
		this.aBoolean440 = arg7;
		this.anInt6607 = arg1;
		this.anInt6606 = arg6;
		this.anInt6604 = arg5;
		this.anInt6608 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qa;Lclient!te;)Z")
	private boolean method5130(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class228 arg1) {
		if (this.aClass3_22 == null) {
			if (this.anInt6608 == 0) {
				if (Static376.anInterface10_8.method4242(this.anInt6607)) {
					@Pc(23) int[] local23 = Static376.anInterface10_8.method4239(this.anInt6607, this.anInt6610, this.anInt6610, 0.7F);
					this.aClass3_22 = arg0.method4672(local23, this.anInt6610, this.anInt6610, this.anInt6610);
				}
			} else if (this.anInt6608 == 2) {
				this.method5133(arg0, arg1);
			} else if (this.anInt6608 == 1) {
				this.method5134(arg0, arg1);
			}
		}
		return this.aClass3_22 != null;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()V")
	public void method5132() {
		this.aClass3_22 = null;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Lclient!qa;Lclient!te;)V")
	private void method5133(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class228 arg1) {
		@Pc(6) Class208 local6 = Static219.method3103(this.anInt6607, Static227.aClass166_163);
		if (local6 == null) {
			return;
		}
		arg0.u(Static378.anIntArray576);
		arg0.pa(0, 0, this.anInt6610, this.anInt6610);
		arg0.NA(0, 0, this.anInt6610, this.anInt6610, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean440) {
				local32 = -arg1.anInt6609;
				local34 = -arg1.anInt6605;
				local36 = -arg1.anInt6612;
			} else {
				local32 = this.anInt6609 - arg1.anInt6609;
				local34 = this.anInt6605 - arg1.anInt6605;
				local36 = this.anInt6612 - arg1.anInt6612;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt6614 != 0) {
			local81 = -this.anInt6614 & 0x3FFF;
			local85 = Class56.anIntArray119[local81];
			local89 = Class56.anIntArray120[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt6615 != 0) {
			local81 = -this.anInt6615 & 0x3FFF;
			local85 = Class56.anIntArray119[local81];
			local89 = Class56.anIntArray120[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class7 local172 = arg0.method4655(local6, 2048, 0, 64, 768);
		local85 = local172.VA() - local172.la();
		local89 = local172.E() - local172.b();
		local99 = local172.la() + local85 / 2;
		@Pc(198) int local198 = local172.b() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.m(arg0.method4632());
		@Pc(218) Class116 local218 = arg0.method4678();
		local218.R(0, 0, arg0.d() - local172.X());
		local172.method4086(local218, null, arg0.d());
		this.aClass3_22 = arg0.method4633(0, 0, this.anInt6610, this.anInt6610, true);
		this.aClass3_22.V(0, 0, 3);
		arg0.pa(Static378.anIntArray576[0], Static378.anIntArray576[1], Static378.anIntArray576[2], Static378.anIntArray576[3]);
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Lclient!qa;Lclient!te;)V")
	private void method5134(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class228 arg1) {
		Static378.method5135(arg0);
		Static378.method5140(arg0);
		arg0.u(Static378.anIntArray576);
		arg0.pa(0, 0, this.anInt6610, this.anInt6610);
		arg0.method4700();
		arg0.NA(0, 0, this.anInt6610, this.anInt6610, this.anInt6606 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean440) {
				local31 = -arg1.anInt6609;
				local33 = -arg1.anInt6605;
				local35 = -arg1.anInt6612;
			} else {
				local31 = arg1.anInt6609 - this.anInt6609;
				local33 = arg1.anInt6605 - this.anInt6605;
				local35 = arg1.anInt6612 - this.anInt6612;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt6614 != 0) {
			local79 = Class56.anIntArray119[this.anInt6614];
			local84 = Class56.anIntArray120[this.anInt6614];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt6615 != 0) {
			local79 = Class56.anIntArray119[this.anInt6615];
			local84 = Class56.anIntArray120[this.anInt6615];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class7 local147 = Static378.aClass7_7.method4077((byte) 0, 51200, true);
		if (arg0.method4660()) {
			local147.YA((short) 0, (short) this.anInt6607);
		} else {
			local147.N((short) 127, Static376.anInterface10_8.method4241(this.anInt6607).aShort57);
			local147.YA((short) 0, (short) -1);
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt6610 * 1024 / (local147.VA() - local147.la());
		if (this.anInt6606 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt6610 / 2, this.anInt6610 / 2, local84, local84);
		arg0.m(arg0.method4632());
		@Pc(223) Class116 local223 = arg0.method4632();
		local223.R(0, 0, arg0.d() - local147.X());
		local147.method4086(local223, null, 1024);
		@Pc(245) int local245 = this.anInt6610 * 13 / 16;
		@Pc(252) int local252 = (this.anInt6610 - local245) / 2;
		Static378.aClass3_21.M(local252, local252, local245, local245, 0, this.anInt6606 | 0xFF000000, 1);
		this.aClass3_22 = arg0.method4633(0, 0, this.anInt6610, this.anInt6610, true);
		arg0.method4700();
		arg0.NA(0, 0, this.anInt6610, this.anInt6610, 0, 0);
		Static378.aClass3_23.M(0, 0, this.anInt6610, this.anInt6610, 1, 0, 0);
		this.aClass3_22.V(0, 0, 0);
		arg0.pa(Static378.anIntArray576[0], Static378.anIntArray576[1], Static378.anIntArray576[2], Static378.anIntArray576[3]);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method5137(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass3_22 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt6614 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt6615 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt6613) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt6613) / 2;
		if (local38 < arg4 && local38 + this.anInt6613 > 0 && local51 < arg3 && local51 + this.anInt6613 > 0) {
			this.aClass3_22.method5885(local51 + arg1, local38 + arg2, this.anInt6613, this.anInt6613);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)Z")
	public boolean method5138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean440) {
			this.anInt6611 = 1073741823;
			local7 = this.anInt6609;
			local12 = this.anInt6605;
			local17 = this.anInt6612;
		} else {
			local7 = this.anInt6609 - arg0;
			local12 = this.anInt6605 - arg1;
			local17 = this.anInt6612 - arg2;
			this.anInt6611 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt6611 == 0) {
				this.anInt6611 = 1;
			}
			local7 = (local7 << 8) / this.anInt6611;
			local12 = (local12 << 8) / this.anInt6611;
			local17 = (local17 << 8) / this.anInt6611;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt6613 = this.anInt6604 * arg3 / (this.aBoolean440 ? 1024 : this.anInt6611);
		} else {
			this.anInt6613 = 0;
		}
		if (this.anInt6613 < 8) {
			this.aClass3_22 = null;
			return false;
		}
		@Pc(143) int local143 = Static183.method2711(this.anInt6613);
		if (local143 > arg3) {
			local143 = Static79.method1390(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt6610) {
			this.anInt6610 = local143;
		}
		this.anInt6614 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt6615 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass3_22 = null;
		return true;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(Lclient!qa;Lclient!te;)Z")
	public boolean method5139(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class228 arg1) {
		return this.aClass3_22 != null || this.method5130(arg0, arg1);
	}
}
