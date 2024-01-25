import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class181 {

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	private int anInt4833;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	private int anInt4834;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	public int anInt4836;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	private int anInt4838;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	private int anInt4839;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "Lclient!f;")
	private Class49 aClass49_16;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	private final int anInt4831;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	private final int anInt4832;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	private final int anInt4835;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "Z")
	private final boolean aBoolean386;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	private final int anInt4837;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	private final int anInt4840;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	private final int anInt4830;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	private final int anInt4841;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4831 = arg2;
		this.anInt4832 = arg3;
		this.anInt4835 = arg4;
		this.aBoolean386 = arg7;
		this.anInt4837 = arg1;
		this.anInt4840 = arg6;
		this.anInt4830 = arg5;
		this.anInt4841 = arg0;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!qa;Lclient!oo;)V")
	private void method3823(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class181 arg1) {
		@Pc(6) Class199 local6 = Static443.method4784(Static281.aClass113_86, this.anInt4837);
		if (local6 == null) {
			return;
		}
		arg0.u(Static293.anIntArray256);
		arg0.pa(0, 0, this.anInt4838, this.anInt4838);
		arg0.NA(0, 0, this.anInt4838, this.anInt4838, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean386) {
				local32 = -arg1.anInt4831;
				local34 = -arg1.anInt4832;
				local36 = -arg1.anInt4835;
			} else {
				local32 = this.anInt4831 - arg1.anInt4831;
				local34 = this.anInt4832 - arg1.anInt4832;
				local36 = this.anInt4835 - arg1.anInt4835;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt4839 != 0) {
			local81 = -this.anInt4839 & 0x3FFF;
			local85 = Class1_Sub1_Sub25.anIntArray249[local81];
			local89 = Class1_Sub1_Sub25.anIntArray248[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt4833 != 0) {
			local81 = -this.anInt4833 & 0x3FFF;
			local85 = Class1_Sub1_Sub25.anIntArray249[local81];
			local89 = Class1_Sub1_Sub25.anIntArray248[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class33 local172 = arg0.method3602(local6, 2048, 0, 64, 768);
		local85 = local172.VA() - local172.la();
		local89 = local172.E() - local172.b();
		local99 = local172.la() + local85 / 2;
		@Pc(198) int local198 = local172.b() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.m(arg0.method3609());
		@Pc(218) Class40 local218 = arg0.method3600();
		local218.R(0, 0, arg0.d() - local172.X());
		local172.method5386(local218, null, arg0.d());
		this.aClass49_16 = arg0.method3564(0, 0, this.anInt4838, this.anInt4838, true);
		this.aClass49_16.V(0, 0, 3);
		arg0.pa(Static293.anIntArray256[0], Static293.anIntArray256[1], Static293.anIntArray256[2], Static293.anIntArray256[3]);
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(Lclient!qa;Lclient!oo;)Z")
	private boolean method3825(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class181 arg1) {
		if (this.aClass49_16 == null) {
			if (this.anInt4841 == 0) {
				if (Static234.anInterface8_7.method1376(this.anInt4837)) {
					@Pc(23) int[] local23 = Static234.anInterface8_7.method1373(this.anInt4838, this.anInt4838, this.anInt4837, 0.7F);
					this.aClass49_16 = arg0.method3572(local23, this.anInt4838, this.anInt4838, this.anInt4838);
				}
			} else if (this.anInt4841 == 2) {
				this.method3823(arg0, arg1);
			} else if (this.anInt4841 == 1) {
				this.method3831(arg0, arg1);
			}
		}
		return this.aClass49_16 != null;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "()V")
	public void method3827() {
		this.aClass49_16 = null;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method3828(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass49_16 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt4839 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt4833 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt4834) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt4834) / 2;
		if (local38 < arg4 && local38 + this.anInt4834 > 0 && local51 < arg3 && local51 + this.anInt4834 > 0) {
			this.aClass49_16.method5640(local51 + arg1, local38 + arg2, this.anInt4834, this.anInt4834);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIII)Z")
	public boolean method3830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean386) {
			this.anInt4836 = 1073741823;
			local7 = this.anInt4831;
			local12 = this.anInt4832;
			local17 = this.anInt4835;
		} else {
			local7 = this.anInt4831 - arg0;
			local12 = this.anInt4832 - arg1;
			local17 = this.anInt4835 - arg2;
			this.anInt4836 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4836 == 0) {
				this.anInt4836 = 1;
			}
			local7 = (local7 << 8) / this.anInt4836;
			local12 = (local12 << 8) / this.anInt4836;
			local17 = (local17 << 8) / this.anInt4836;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4834 = this.anInt4830 * arg3 / (this.aBoolean386 ? 1024 : this.anInt4836);
		} else {
			this.anInt4834 = 0;
		}
		if (this.anInt4834 < 8) {
			this.aClass49_16 = null;
			return false;
		}
		@Pc(143) int local143 = Static88.method1286(this.anInt4834);
		if (local143 > arg3) {
			local143 = Static320.method4122(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt4838) {
			this.anInt4838 = local143;
		}
		this.anInt4839 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt4833 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass49_16 = null;
		return true;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(Lclient!qa;Lclient!oo;)V")
	private void method3831(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class181 arg1) {
		Static293.method3829(arg0);
		Static293.method3826(arg0);
		arg0.u(Static293.anIntArray256);
		arg0.pa(0, 0, this.anInt4838, this.anInt4838);
		arg0.method3582();
		arg0.NA(0, 0, this.anInt4838, this.anInt4838, this.anInt4840 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean386) {
				local31 = -arg1.anInt4831;
				local33 = -arg1.anInt4832;
				local35 = -arg1.anInt4835;
			} else {
				local31 = arg1.anInt4831 - this.anInt4831;
				local33 = arg1.anInt4832 - this.anInt4832;
				local35 = arg1.anInt4835 - this.anInt4835;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt4839 != 0) {
			local79 = Class1_Sub1_Sub25.anIntArray249[this.anInt4839];
			local84 = Class1_Sub1_Sub25.anIntArray248[this.anInt4839];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt4833 != 0) {
			local79 = Class1_Sub1_Sub25.anIntArray249[this.anInt4833];
			local84 = Class1_Sub1_Sub25.anIntArray248[this.anInt4833];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class33 local147 = Static293.aClass33_6.method5383((byte) 0, 51200, true);
		if (arg0.method3545()) {
			local147.YA((short) 0, (short) this.anInt4837);
		} else {
			local147.N((short) 127, Static234.anInterface8_7.method1375(this.anInt4837).aShort61);
			local147.YA((short) 0, (short) -1);
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt4838 * 1024 / (local147.VA() - local147.la());
		if (this.anInt4840 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt4838 / 2, this.anInt4838 / 2, local84, local84);
		arg0.m(arg0.method3609());
		@Pc(223) Class40 local223 = arg0.method3609();
		local223.R(0, 0, arg0.d() - local147.X());
		local147.method5386(local223, null, 1024);
		@Pc(245) int local245 = this.anInt4838 * 13 / 16;
		@Pc(252) int local252 = (this.anInt4838 - local245) / 2;
		Static293.aClass49_15.M(local252, local252, local245, local245, 0, this.anInt4840 | 0xFF000000, 1);
		this.aClass49_16 = arg0.method3564(0, 0, this.anInt4838, this.anInt4838, true);
		arg0.method3582();
		arg0.NA(0, 0, this.anInt4838, this.anInt4838, 0, 0);
		Static293.aClass49_14.M(0, 0, this.anInt4838, this.anInt4838, 1, 0, 0);
		this.aClass49_16.V(0, 0, 0);
		arg0.pa(Static293.anIntArray256[0], Static293.anIntArray256[1], Static293.anIntArray256[2], Static293.anIntArray256[3]);
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(Lclient!qa;Lclient!oo;)Z")
	public boolean method3832(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class181 arg1) {
		return this.aClass49_16 != null || this.method3825(arg0, arg1);
	}
}
