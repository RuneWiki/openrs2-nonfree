import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
	protected int anInt6175;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	protected int anInt6177;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	protected int anInt6200;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	protected int anInt6202;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!cg;")
	protected final Class33_Sub2 aClass33_Sub2_10;

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
	public final int anInt6185;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	public final int anInt6196;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!cg;II)V")
	public Class5_Sub1(@OriginalArg(0) Class33_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub2_10 = arg0;
		this.anInt6185 = arg1;
		this.anInt6196 = arg2;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII)V")
	public abstract void method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method7583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method5249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method7581(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass33_Sub2_10.method1436()) {
			throw new IllegalStateException();
		} else if (this.method5252(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static225.anInt6188 = arg7;
			if (arg6 != 1) {
				Static225.anInt6189 = arg7 >>> 24;
				Static225.anInt6182 = 256 - Static225.anInt6189;
				if (arg6 == 0) {
					Static225.anInt6186 = arg7 >> 16 & 0xFF;
					Static225.anInt6191 = arg7 >> 8 & 0xFF;
					Static225.anInt6203 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static225.anInt6199 = arg7 >>> 24;
					Static225.anInt6179 = 256 - Static225.anInt6199;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static225.anInt6179 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static225.anInt6179 & 0xFF0000;
					Static225.anInt6178 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5251(1);
			} else if (arg6 == 0) {
				this.method5251(0);
			} else if (arg6 == 3) {
				this.method5251(3);
			} else if (arg6 == 2) {
				this.method5251(2);
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()I")
	@Override
	public final int method7585() {
		return this.anInt6175 + this.anInt6196 + this.anInt6202;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[III)V")
	protected abstract void method5250(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I)V")
	@Override
	public final void method7597(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6177;
		arg0[1] = this.anInt6175;
		arg0[2] = this.anInt6200;
		arg0[3] = this.anInt6202;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method7576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass33_Sub2_10.method1436()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray365 == null) {
			this.anIntArray365 = new int[4];
		}
		this.aClass33_Sub2_10.K(this.anIntArray365);
		this.aClass33_Sub2_10.T(this.aClass33_Sub2_10.anInt1358, this.aClass33_Sub2_10.anInt1359, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method7589();
		@Pc(40) int local40 = this.method7585();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method7595(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass33_Sub2_10.KA(this.anIntArray365[0], this.anIntArray365[1], this.anIntArray365[2], this.anIntArray365[3]);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
	@Override
	public final int method7580() {
		return this.anInt6196;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()I")
	@Override
	public final int method7589() {
		return this.anInt6177 + this.anInt6185 + this.anInt6200;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)V")
	protected abstract void method5251(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()I")
	@Override
	public final int method7588() {
		return this.anInt6185;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6177 = arg0;
		this.anInt6175 = arg1;
		this.anInt6200 = arg2;
		this.anInt6202 = arg3;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5252(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6177 + this.anInt6185 + this.anInt6200;
		@Pc(17) int local17 = this.anInt6175 + this.anInt6196 + this.anInt6202;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6185 || local17 != this.anInt6196) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6175;
			local65 = local53 * (float) this.anInt6175;
			local71 = local32 * (float) this.anInt6177;
			local77 = local39 * (float) this.anInt6177;
			@Pc(84) float local84 = -local32 * (float) this.anInt6200;
			@Pc(91) float local91 = -local39 * (float) this.anInt6200;
			@Pc(98) float local98 = -local46 * (float) this.anInt6202;
			@Pc(105) float local105 = -local53 * (float) this.anInt6202;
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
		if (local46 < (float) this.aClass33_Sub2_10.anInt1358) {
			local46 = this.aClass33_Sub2_10.anInt1358;
		}
		if (local53 > (float) this.aClass33_Sub2_10.anInt1332) {
			local53 = this.aClass33_Sub2_10.anInt1332;
		}
		if (local59 < (float) this.aClass33_Sub2_10.anInt1359) {
			local59 = this.aClass33_Sub2_10.anInt1359;
		}
		if (local65 > (float) this.aClass33_Sub2_10.anInt1350) {
			local65 = this.aClass33_Sub2_10.anInt1350;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static225.anInt6181 = this.aClass33_Sub2_10.anInt1343;
		Static225.anInt6180 = (int) ((float) ((int) local59 * Static225.anInt6181) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static225.anInt6184 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6185 / local71);
		Static225.anInt6193 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6196 / local77);
		Static225.anInt6195 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6185 / local77);
		Static225.anInt6197 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6196 / local71);
		Static225.anInt6187 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static225.anInt6194 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static225.anInt6190 = (this.anInt6185 >> 1 << 12) + (Static225.anInt6194 * Static225.anInt6195 >> 4);
		Static225.anInt6192 = (this.anInt6196 >> 1 << 12) + (Static225.anInt6194 * Static225.anInt6197 >> 4);
		Static225.anInt6174 = Static225.anInt6187 * Static225.anInt6184 >> 4;
		Static225.anInt6176 = Static225.anInt6187 * Static225.anInt6193 >> 4;
		Static225.anInt6183 = (int) local46;
		Static225.anInt6173 = (int) local53;
		Static225.anInt6201 = (int) local59;
		Static225.anInt6198 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method7575(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass33_Sub2_10.method1436()) {
			throw new IllegalStateException();
		} else if (this.method5252(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub1 local20 = (Class1_Sub1) arg6;
			this.method5250(local20.anIntArray34, local20.anIntArray35, Static225.anInt6183 - arg7, -arg8 - (Static225.anInt6198 - Static225.anInt6201));
		}
	}
}
