import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class85 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public int anInt2294;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	private int anInt2296;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private int anInt2300;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	private int anInt2302;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Lclient!o;")
	private Class49 aClass49_9;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	private int anInt2303;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	private final int anInt2304;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	private final int anInt2295;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	private final int anInt2301;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	private final boolean aBoolean159;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	private final int anInt2293;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private final int anInt2299;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	private final int anInt2297;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private final int anInt2298;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2304 = arg2;
		this.anInt2295 = arg3;
		this.anInt2301 = arg4;
		this.aBoolean159 = arg7;
		this.anInt2293 = arg1;
		this.anInt2299 = arg6;
		this.anInt2297 = arg5;
		this.anInt2298 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!za;IIIIII)V")
	public void method1843(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass49_9 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2303 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2296 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2300) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2300) / 2;
		if (local38 < arg4 && local38 + this.anInt2300 > 0 && local51 < arg3 && local51 + this.anInt2300 > 0) {
			this.aClass49_9.method5789(local51 + arg1, local38 + arg2, this.anInt2300, this.anInt2300);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z")
	public boolean method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean159) {
			this.anInt2294 = 1073741823;
			local7 = this.anInt2304;
			local12 = this.anInt2295;
			local17 = this.anInt2301;
		} else {
			local7 = this.anInt2304 - arg0;
			local12 = this.anInt2295 - arg1;
			local17 = this.anInt2301 - arg2;
			this.anInt2294 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2294 == 0) {
				this.anInt2294 = 1;
			}
			local7 = (local7 << 8) / this.anInt2294;
			local12 = (local12 << 8) / this.anInt2294;
			local17 = (local17 << 8) / this.anInt2294;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2300 = this.anInt2297 * arg3 / (this.aBoolean159 ? 1024 : this.anInt2294);
		} else {
			this.anInt2300 = 0;
		}
		if (this.anInt2300 < 8) {
			this.aClass49_9 = null;
			return false;
		}
		@Pc(143) int local143 = Static331.method4084(this.anInt2300);
		if (local143 > arg3) {
			local143 = Static313.method4879(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2302) {
			this.anInt2302 = local143;
		}
		this.anInt2303 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt2296 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass49_9 = null;
		return true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	public void method1845() {
		this.aClass49_9 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!za;Lclient!gb;)Z")
	public boolean method1847(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class85 arg1) {
		return this.aClass49_9 != null || this.method1851(arg0, arg1);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!za;Lclient!gb;)V")
	private void method1849(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class85 arg1) {
		Static131.method1846(arg0);
		Static131.method1848(arg0);
		arg0.MA(Static131.anIntArray126);
		arg0.ba(0, 0, this.anInt2302, this.anInt2302);
		arg0.method5881();
		arg0.P(0, 0, this.anInt2302, this.anInt2302, this.anInt2299 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean159) {
				local31 = -arg1.anInt2304;
				local33 = -arg1.anInt2295;
				local35 = -arg1.anInt2301;
			} else {
				local31 = arg1.anInt2304 - this.anInt2304;
				local33 = arg1.anInt2295 - this.anInt2295;
				local35 = arg1.anInt2301 - this.anInt2301;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2303 != 0) {
			local79 = Class30.anIntArray38[this.anInt2303];
			local84 = Class30.anIntArray37[this.anInt2303];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt2296 != 0) {
			local79 = Class30.anIntArray38[this.anInt2296];
			local84 = Class30.anIntArray37[this.anInt2296];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class57 local147 = Static131.aClass57_4.method6066((byte) 0, 51200, true);
		if (arg0.method5864()) {
			local147.u((short) 0, (short) this.anInt2293);
		} else {
			local147.q((short) 127, Static48.anInterface8_21.method4125(this.anInt2293).aShort54);
			local147.u((short) 0, (short) -1);
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2302 * 1024 / (local147.MA() - local147.ta());
		if (this.anInt2299 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt2302 / 2, this.anInt2302 / 2, local84, local84);
		arg0.SA(arg0.method5880());
		@Pc(223) Class29 local223 = arg0.method5880();
		local223.U(0, 0, arg0.AA() - local147.Z());
		local147.method6072(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2302 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2302 - local245) / 2;
		Static131.aClass49_8.ya(local252, local252, local245, local245, 0, this.anInt2299 | 0xFF000000, 1);
		this.aClass49_9 = arg0.method5855(0, 0, this.anInt2302, this.anInt2302, true);
		arg0.method5881();
		arg0.P(0, 0, this.anInt2302, this.anInt2302, 0, 0);
		Static131.aClass49_7.ya(0, 0, this.anInt2302, this.anInt2302, 1, 0, 0);
		this.aClass49_9.oa(0, 0, 0);
		arg0.ba(Static131.anIntArray126[0], Static131.anIntArray126[1], Static131.anIntArray126[2], Static131.anIntArray126[3]);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Lclient!za;Lclient!gb;)Z")
	private boolean method1851(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class85 arg1) {
		if (this.aClass49_9 == null) {
			if (this.anInt2298 == 0) {
				if (Static48.anInterface8_21.method4123(this.anInt2293)) {
					@Pc(23) int[] local23 = Static48.anInterface8_21.method4124(this.anInt2293, this.anInt2302, this.anInt2302, 0.7F);
					this.aClass49_9 = arg0.method5849(local23, this.anInt2302, this.anInt2302, this.anInt2302);
				}
			} else if (this.anInt2298 == 2) {
				this.method1852(arg0, arg1);
			} else if (this.anInt2298 == 1) {
				this.method1849(arg0, arg1);
			}
		}
		return this.aClass49_9 != null;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(Lclient!za;Lclient!gb;)V")
	private void method1852(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class85 arg1) {
		@Pc(6) Class74 local6 = Static285.method3518(this.anInt2293, Static344.aClass243_195);
		if (local6 == null) {
			return;
		}
		arg0.MA(Static131.anIntArray126);
		arg0.ba(0, 0, this.anInt2302, this.anInt2302);
		arg0.P(0, 0, this.anInt2302, this.anInt2302, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean159) {
				local32 = -arg1.anInt2304;
				local34 = -arg1.anInt2295;
				local36 = -arg1.anInt2301;
			} else {
				local32 = this.anInt2304 - arg1.anInt2304;
				local34 = this.anInt2295 - arg1.anInt2295;
				local36 = this.anInt2301 - arg1.anInt2301;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2303 != 0) {
			local81 = -this.anInt2303 & 0x3FFF;
			local85 = Class30.anIntArray38[local81];
			local89 = Class30.anIntArray37[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt2296 != 0) {
			local81 = -this.anInt2296 & 0x3FFF;
			local85 = Class30.anIntArray38[local81];
			local89 = Class30.anIntArray37[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.JA(1.0F);
		arg0.B(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class57 local172 = arg0.method5882(local6, 2048, 0, 64, 768);
		local85 = local172.MA() - local172.ta();
		local89 = local172.l() - local172.B();
		local99 = local172.ta() + local85 / 2;
		@Pc(198) int local198 = local172.B() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.SA(arg0.method5880());
		@Pc(218) Class29 local218 = arg0.method5866();
		local218.U(0, 0, arg0.AA() - local172.Z());
		local172.method6072(local218, null, arg0.AA());
		this.aClass49_9 = arg0.method5855(0, 0, this.anInt2302, this.anInt2302, true);
		this.aClass49_9.oa(0, 0, 3);
		arg0.ba(Static131.anIntArray126[0], Static131.anIntArray126[1], Static131.anIntArray126[2], Static131.anIntArray126[3]);
	}
}
