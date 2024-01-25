import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public abstract class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
	protected int anInt4216;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
	private int[] anIntArray215;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
	protected int anInt4230;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
	protected int anInt4231;

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
	protected int anInt4232;

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "Lclient!pga;")
	protected final Class133_Sub2 aClass133_Sub2_7;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
	public final int anInt4215;

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
	public final int anInt4228;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!pga;II)V")
	public Class28_Sub1(@OriginalArg(0) Class133_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass133_Sub2_7 = arg0;
		this.anInt4215 = arg1;
		this.anInt4228 = arg2;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method4038(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass133_Sub2_7.method6521()) {
			throw new IllegalStateException();
		} else if (this.method3845(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method3847(local20.anIntArray380, local20.anIntArray381, Static49.anInt4212 - arg7, -arg8 - (Static49.anInt4223 - Static49.anInt4237));
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method3845(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4231 + this.anInt4215 + this.anInt4216;
		@Pc(17) int local17 = this.anInt4232 + this.anInt4228 + this.anInt4230;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4215 || local17 != this.anInt4228) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4232;
			local65 = local53 * (float) this.anInt4232;
			local71 = local32 * (float) this.anInt4231;
			local77 = local39 * (float) this.anInt4231;
			@Pc(84) float local84 = -local32 * (float) this.anInt4216;
			@Pc(91) float local91 = -local39 * (float) this.anInt4216;
			@Pc(98) float local98 = -local46 * (float) this.anInt4230;
			@Pc(105) float local105 = -local53 * (float) this.anInt4230;
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
		if (local46 < (float) this.aClass133_Sub2_7.anInt7350) {
			local46 = this.aClass133_Sub2_7.anInt7350;
		}
		if (local53 > (float) this.aClass133_Sub2_7.anInt7325) {
			local53 = this.aClass133_Sub2_7.anInt7325;
		}
		if (local59 < (float) this.aClass133_Sub2_7.anInt7345) {
			local59 = this.aClass133_Sub2_7.anInt7345;
		}
		if (local65 > (float) this.aClass133_Sub2_7.anInt7332) {
			local65 = this.aClass133_Sub2_7.anInt7332;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static49.anInt4227 = this.aClass133_Sub2_7.anInt7347;
		Static49.anInt4236 = (int) ((float) ((int) local59 * Static49.anInt4227) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static49.anInt4229 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4215 / local71);
		Static49.anInt4217 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4228 / local77);
		Static49.anInt4225 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4215 / local77);
		Static49.anInt4234 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4228 / local71);
		Static49.anInt4210 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static49.anInt4213 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static49.anInt4222 = (this.anInt4215 >> 1 << 12) + (Static49.anInt4213 * Static49.anInt4225 >> 4);
		Static49.anInt4226 = (this.anInt4228 >> 1 << 12) + (Static49.anInt4213 * Static49.anInt4234 >> 4);
		Static49.anInt4235 = Static49.anInt4210 * Static49.anInt4229 >> 4;
		Static49.anInt4219 = Static49.anInt4210 * Static49.anInt4217 >> 4;
		Static49.anInt4212 = (int) local46;
		Static49.anInt4221 = (int) local53;
		Static49.anInt4237 = (int) local59;
		Static49.anInt4223 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method4030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass133_Sub2_7.method6521()) {
			throw new IllegalStateException();
		} else if (this.method3845(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static49.anInt4211 = arg7;
			if (arg6 != 1) {
				Static49.anInt4208 = arg7 >>> 24;
				Static49.anInt4209 = 256 - Static49.anInt4208;
				if (arg6 == 0) {
					Static49.anInt4220 = arg7 >> 16 & 0xFF;
					Static49.anInt4233 = arg7 >> 8 & 0xFF;
					Static49.anInt4218 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static49.anInt4214 = arg7 >>> 24;
					Static49.anInt4224 = 256 - Static49.anInt4214;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static49.anInt4224 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static49.anInt4224 & 0xFF0000;
					Static49.anInt4207 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method3848(1);
			} else if (arg6 == 0) {
				this.method3848(0);
			} else if (arg6 == 3) {
				this.method3848(3);
			} else if (arg6 == 2) {
				this.method3848(2);
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()I")
	@Override
	public final int method4037() {
		return this.anInt4228;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method4053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method4043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4231 = arg0;
		this.anInt4232 = arg1;
		this.anInt4216 = arg2;
		this.anInt4230 = arg3;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([I[III)V")
	protected abstract void method3847(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()I")
	@Override
	public final int method4042() {
		return this.anInt4232 + this.anInt4228 + this.anInt4230;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()I")
	@Override
	public final int method4035() {
		return this.anInt4231 + this.anInt4215 + this.anInt4216;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
	public abstract void method4034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([I)V")
	@Override
	public final void method4044(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt4231;
		arg0[1] = this.anInt4232;
		arg0[2] = this.anInt4216;
		arg0[3] = this.anInt4230;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)V")
	protected abstract void method3848(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()I")
	@Override
	public final int method4032() {
		return this.anInt4215;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass133_Sub2_7.method6521()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray215 == null) {
			this.anIntArray215 = new int[4];
		}
		this.aClass133_Sub2_7.K(this.anIntArray215);
		this.aClass133_Sub2_7.T(this.aClass133_Sub2_7.anInt7350, this.aClass133_Sub2_7.anInt7345, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method4035();
		@Pc(40) int local40 = this.method4042();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method4034(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass133_Sub2_7.KA(this.anIntArray215[0], this.anIntArray215[1], this.anIntArray215[2], this.anIntArray215[3]);
	}
}
