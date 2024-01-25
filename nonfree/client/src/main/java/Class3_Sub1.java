import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
	protected int anInt2055;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
	protected int anInt2073;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	protected int anInt2076;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
	protected int anInt2077;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "Lclient!rh;")
	protected final Class30_Sub2 aClass30_Sub2_4;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
	protected final int anInt2075;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
	protected final int anInt2074;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!rh;II)V")
	protected Class3_Sub1(@OriginalArg(0) Class30_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass30_Sub2_4 = arg0;
		this.anInt2075 = arg1;
		this.anInt2074 = arg2;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([I[III)V")
	protected abstract void method1565(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFFFFF)V")
	private void method1566(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2076 + this.anInt2075 + this.anInt2073;
		@Pc(17) int local17 = this.anInt2077 + this.anInt2074 + this.anInt2055;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2075 || local17 != this.anInt2074) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2077;
			local65 = local53 * (float) this.anInt2077;
			local71 = local32 * (float) this.anInt2076;
			local77 = local39 * (float) this.anInt2076;
			@Pc(84) float local84 = -local32 * (float) this.anInt2073;
			@Pc(91) float local91 = -local39 * (float) this.anInt2073;
			@Pc(98) float local98 = -local46 * (float) this.anInt2055;
			@Pc(105) float local105 = -local53 * (float) this.anInt2055;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass30_Sub2_4.anInt6012) {
			local46 = this.aClass30_Sub2_4.anInt6012;
		}
		if (local53 > (float) this.aClass30_Sub2_4.lb) {
			local53 = this.aClass30_Sub2_4.lb;
		}
		if (local59 < (float) this.aClass30_Sub2_4.anInt6013) {
			local59 = this.aClass30_Sub2_4.anInt6013;
		}
		if (local65 > (float) this.aClass30_Sub2_4.anInt6019) {
			local65 = this.aClass30_Sub2_4.anInt6019;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static125.anInt2082 = this.aClass30_Sub2_4.anInt6010;
		Static125.anInt2061 = (int) ((float) ((int) local59 * Static125.anInt2082) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static125.anInt2064 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2075 / local71);
		Static125.anInt2068 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2074 / local77);
		Static125.anInt2056 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2075 / local77);
		Static125.anInt2084 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2074 / local71);
		Static125.anInt2063 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static125.anInt2071 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static125.anInt2079 = (this.anInt2075 >> 1 << 12) + (Static125.anInt2071 * Static125.anInt2056 >> 4);
		Static125.anInt2078 = (this.anInt2074 >> 1 << 12) + (Static125.anInt2071 * Static125.anInt2084 >> 4);
		Static125.anInt2060 = Static125.anInt2063 * Static125.anInt2064 >> 4;
		Static125.anInt2081 = Static125.anInt2063 * Static125.anInt2068 >> 4;
		Static125.anInt2080 = (int) local46;
		Static125.anInt2062 = (int) local53;
		Static125.anInt2072 = (int) local59;
		Static125.anInt2059 = (int) local65;
	}

	@OriginalMember(owner = "client!fv", name = "M", descriptor = "(IIIIIII)V")
	public abstract void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!fv", name = "UA", descriptor = "()I")
	@Override
	public final int UA() {
		return this.anInt2075;
	}

	@OriginalMember(owner = "client!fv", name = "YA", descriptor = "(IIIII)V")
	public abstract void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fv", name = "ja", descriptor = "()I")
	@Override
	public final int ja() {
		return this.anInt2076 + this.anInt2075 + this.anInt2073;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IILclient!ea;II)V")
	public abstract void method5878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected final void method5886(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class57 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass30_Sub2_4.method4717()) {
			throw new IllegalStateException();
		}
		this.method1566(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class57_Sub1 local18 = (Class57_Sub1) arg6;
		this.method1565(local18.anIntArray506, local18.anIntArray507, Static125.anInt2080 - arg7, -arg8 - (Static125.anInt2059 - Static125.anInt2072));
	}

	@OriginalMember(owner = "client!fv", name = "qa", descriptor = "()I")
	@Override
	public final int qa() {
		return this.anInt2074;
	}

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public final void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass30_Sub2_4.method4717()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray128 == null) {
			this.anIntArray128 = new int[4];
		}
		this.aClass30_Sub2_4.u(this.anIntArray128);
		this.aClass30_Sub2_4.Z(this.aClass30_Sub2_4.anInt6012, this.aClass30_Sub2_4.anInt6013, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.ja();
		@Pc(40) int local40 = this.JA();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.YA(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass30_Sub2_4.pa(this.anIntArray128[0], this.anIntArray128[1], this.anIntArray128[2], this.anIntArray128[3]);
	}

	@OriginalMember(owner = "client!fv", name = "ka", descriptor = "(IIII)V")
	@Override
	public final void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2076 = arg0;
		this.anInt2077 = arg1;
		this.anInt2073 = arg2;
		this.anInt2055 = arg3;
	}

	@OriginalMember(owner = "client!fv", name = "JA", descriptor = "()I")
	@Override
	public final int JA() {
		return this.anInt2077 + this.anInt2074 + this.anInt2055;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)V")
	protected abstract void method1567(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fv", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass30_Sub2_4.method4717()) {
			throw new IllegalStateException();
		}
		this.method1566(arg0, arg1, arg2, arg3, arg4, arg5);
		Static125.anInt2067 = arg7;
		if (arg6 != 1) {
			Static125.anInt2066 = arg7 >>> 24;
			Static125.anInt2083 = 256 - Static125.anInt2066;
			if (arg6 == 0) {
				Static125.anInt2069 = arg7 >> 16 & 0xFF;
				Static125.anInt2065 = arg7 >> 8 & 0xFF;
				Static125.anInt2057 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static125.anInt2085 = arg7 >>> 24;
				Static125.anInt2058 = 256 - Static125.anInt2085;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static125.anInt2058 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static125.anInt2058 & 0xFF0000;
				Static125.anInt2070 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method1567(1);
		} else if (arg6 == 0) {
			this.method1567(0);
		} else if (arg6 == 3) {
			this.method1567(3);
		} else if (arg6 == 2) {
			this.method1567(2);
		}
	}
}
