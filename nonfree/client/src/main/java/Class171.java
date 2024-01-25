import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class171 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	private int anInt4664;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Lclient!f;")
	private Class14 aClass14_13;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	private int anInt4669;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	public int anInt4670;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
	private int anInt4671;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	private int anInt4675;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	private final int anInt4674;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	private final int anInt4673;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	private final int anInt4668;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Z")
	private final boolean aBoolean338;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	private final int anInt4667;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	private final int anInt4666;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	private final int anInt4672;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	private final int anInt4665;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4674 = arg2;
		this.anInt4673 = arg3;
		this.anInt4668 = arg4;
		this.aBoolean338 = arg7;
		this.anInt4667 = arg1;
		this.anInt4666 = arg6;
		this.anInt4672 = arg5;
		this.anInt4665 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public void method4046() {
		this.aClass14_13 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!r;Lclient!ka;)Z")
	private boolean method4047(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class171 arg1) {
		if (this.aClass14_13 == null) {
			if (this.anInt4665 == 0) {
				if (Static395.anInterface3_11.method4774(this.anInt4667)) {
					@Pc(23) int[] local23 = Static395.anInterface3_11.method4777(this.anInt4667, this.anInt4664, 0.7F, this.anInt4664);
					this.aClass14_13 = arg0.method7395(local23, this.anInt4664, this.anInt4664, this.anInt4664);
				}
			} else if (this.anInt4665 == 2) {
				this.method4050(arg0, arg1);
			} else if (this.anInt4665 == 1) {
				this.method4048(arg0, arg1);
			}
		}
		return this.aClass14_13 != null;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!r;Lclient!ka;)V")
	private void method4048(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class171 arg1) {
		Static266.method4049(arg0);
		Static266.method4051(arg0);
		arg0.oa(Static266.anIntArray253);
		arg0.da(0, 0, this.anInt4664, this.anInt4664);
		arg0.ya();
		arg0.J(0, 0, this.anInt4664, this.anInt4664, this.anInt4666 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean338) {
				local31 = -arg1.anInt4674;
				local33 = -arg1.anInt4673;
				local35 = -arg1.anInt4668;
			} else {
				local31 = arg1.anInt4674 - this.anInt4674;
				local33 = arg1.anInt4673 - this.anInt4673;
				local35 = arg1.anInt4668 - this.anInt4668;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4671 != 0) {
			local79 = Class356.anIntArray597[this.anInt4671];
			local84 = Class356.anIntArray598[this.anInt4671];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt4675 != 0) {
			local79 = Class356.anIntArray597[this.anInt4675];
			local84 = Class356.anIntArray598[this.anInt4675];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class60 local147 = Static266.aClass60_5.method7229((byte) 0, 51200, true);
		if (arg0.method7429()) {
			local147.DA((short) 0, (short) this.anInt4667);
		} else {
			local147.d((short) 127, Static395.anInterface3_11.method4776(this.anInt4667).aShort21);
			local147.DA((short) 0, (short) -1);
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4664 * 1024 / (local147.l() - local147.KA());
		if (this.anInt4666 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.la(this.anInt4664 / 2, this.anInt4664 / 2, local84, local84);
		arg0.method7367(arg0.method7422());
		@Pc(223) Class11 local223 = arg0.method7422();
		local223.NA(0, 0, arg0.BA() - local147.OA());
		local147.method7224(local223, null, 1024, 1);
		@Pc(245) int local245 = this.anInt4664 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4664 - local245) / 2;
		Static266.aClass14_15.method7676(local252, local252, local245, local245, 0, this.anInt4666 | 0xFF000000, 1);
		this.aClass14_13 = arg0.method7362(0, 0, this.anInt4664, this.anInt4664, true);
		arg0.ya();
		arg0.J(0, 0, this.anInt4664, this.anInt4664, 0, 0);
		Static266.aClass14_14.method7676(0, 0, this.anInt4664, this.anInt4664, 1, 0, 0);
		this.aClass14_13.xa(0, 0, 0);
		arg0.da(Static266.anIntArray253[0], Static266.anIntArray253[1], Static266.anIntArray253[2], Static266.anIntArray253[3]);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lclient!r;Lclient!ka;)V")
	private void method4050(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class171 arg1) {
		@Pc(6) Class84 local6 = Static416.method5935(Static323.aClass322_99, this.anInt4667);
		if (local6 == null) {
			return;
		}
		arg0.oa(Static266.anIntArray253);
		arg0.da(0, 0, this.anInt4664, this.anInt4664);
		arg0.J(0, 0, this.anInt4664, this.anInt4664, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean338) {
				local32 = -arg1.anInt4674;
				local34 = -arg1.anInt4673;
				local36 = -arg1.anInt4668;
			} else {
				local32 = this.anInt4674 - arg1.anInt4674;
				local34 = this.anInt4673 - arg1.anInt4673;
				local36 = this.anInt4668 - arg1.anInt4668;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4671 != 0) {
			local81 = -this.anInt4671 & 0x3FFF;
			local85 = Class356.anIntArray597[local81];
			local89 = Class356.anIntArray598[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt4675 != 0) {
			local81 = -this.anInt4675 & 0x3FFF;
			local85 = Class356.anIntArray597[local81];
			local89 = Class356.anIntArray598[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.ra(1.0F);
		arg0.VA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class60 local172 = arg0.method7419(local6, 2048, 0, 64, 768);
		local85 = local172.l() - local172.KA();
		local89 = local172.H() - local172.J();
		local99 = local172.KA() + local85 / 2;
		@Pc(198) int local198 = local172.J() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.la(local99, local198, local205, local205);
		arg0.method7367(arg0.method7422());
		@Pc(218) Class11 local218 = arg0.method7397();
		local218.NA(0, 0, arg0.BA() - local172.OA());
		local172.method7224(local218, null, arg0.BA(), 1);
		this.aClass14_13 = arg0.method7362(0, 0, this.anInt4664, this.anInt4664, true);
		this.aClass14_13.xa(0, 0, 3);
		arg0.da(Static266.anIntArray253[0], Static266.anIntArray253[1], Static266.anIntArray253[2], Static266.anIntArray253[3]);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)Z")
	public boolean method4052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean338) {
			this.anInt4670 = 1073741823;
			local7 = this.anInt4674;
			local12 = this.anInt4673;
			local17 = this.anInt4668;
		} else {
			local7 = this.anInt4674 - arg0;
			local12 = this.anInt4673 - arg1;
			local17 = this.anInt4668 - arg2;
			this.anInt4670 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4670 == 0) {
				this.anInt4670 = 1;
			}
			local7 = (local7 << 8) / this.anInt4670;
			local12 = (local12 << 8) / this.anInt4670;
			local17 = (local17 << 8) / this.anInt4670;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4669 = this.anInt4672 * arg3 / (this.aBoolean338 ? 1024 : this.anInt4670);
		} else {
			this.anInt4669 = 0;
		}
		if (this.anInt4669 < 8) {
			this.aClass14_13 = null;
			return false;
		}
		@Pc(143) int local143 = Static371.method5424(this.anInt4669);
		if (local143 > arg3) {
			local143 = Static489.method6617(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4664) {
			this.anInt4664 = local143;
		}
		this.anInt4671 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt4675 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass14_13 = null;
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(Lclient!r;Lclient!ka;)Z")
	public boolean method4053(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class171 arg1) {
		return this.aClass14_13 != null || this.method4047(arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!r;IIIIII)V")
	public void method4054(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass14_13 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4671 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4675 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4669) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4669) / 2;
		if (local38 < arg4 && local38 + this.anInt4669 > 0 && local51 < arg3 && local51 + this.anInt4669 > 0) {
			this.aClass14_13.method7681(local51 + arg1, local38 + arg2, this.anInt4669, this.anInt4669);
		}
	}
}
