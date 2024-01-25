import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public abstract class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
	protected int anInt8518;

	@OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
	protected int anInt8532;

	@OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
	protected int anInt8542;

	@OriginalMember(owner = "client!bca", name = "B", descriptor = "[I")
	private int[] anIntArray663;

	@OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
	protected int anInt8547;

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "Lclient!vda;")
	protected final Class62_Sub2 aClass62_Sub2_15;

	@OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
	protected final int anInt8523;

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
	protected final int anInt8524;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!vda;II)V")
	protected Class25_Sub1(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass62_Sub2_15 = arg0;
		this.anInt8523 = arg1;
		this.anInt8524 = arg2;
	}

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public final void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass62_Sub2_15.method7077()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray663 == null) {
			this.anIntArray663 = new int[4];
		}
		this.aClass62_Sub2_15.d(this.anIntArray663);
		this.aClass62_Sub2_15.F(this.aClass62_Sub2_15.anInt8673, this.aClass62_Sub2_15.anInt8695, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.EA();
		@Pc(40) int local40 = this.ma();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.DA(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass62_Sub2_15.N(this.anIntArray663[0], this.anIntArray663[1], this.anIntArray663[2], this.anIntArray663[3]);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method6895(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt8547 + this.anInt8523 + this.anInt8532;
		@Pc(17) int local17 = this.anInt8518 + this.anInt8524 + this.anInt8542;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt8523 || local17 != this.anInt8524) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt8518;
			local65 = local53 * (float) this.anInt8518;
			local71 = local32 * (float) this.anInt8547;
			local77 = local39 * (float) this.anInt8547;
			@Pc(84) float local84 = -local32 * (float) this.anInt8532;
			@Pc(91) float local91 = -local39 * (float) this.anInt8532;
			@Pc(98) float local98 = -local46 * (float) this.anInt8542;
			@Pc(105) float local105 = -local53 * (float) this.anInt8542;
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
		if (local46 < (float) this.aClass62_Sub2_15.anInt8673) {
			local46 = this.aClass62_Sub2_15.anInt8673;
		}
		if (local53 > (float) this.aClass62_Sub2_15.anInt8685) {
			local53 = this.aClass62_Sub2_15.anInt8685;
		}
		if (local59 < (float) this.aClass62_Sub2_15.anInt8695) {
			local59 = this.aClass62_Sub2_15.anInt8695;
		}
		if (local65 > (float) this.aClass62_Sub2_15.anInt8672) {
			local65 = this.aClass62_Sub2_15.anInt8672;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static31.anInt8539 = this.aClass62_Sub2_15.anInt8670;
		Static31.anInt8536 = (int) ((float) ((int) local59 * Static31.anInt8539) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static31.anInt8543 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt8523 / local71);
		Static31.anInt8541 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt8524 / local77);
		Static31.anInt8546 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt8523 / local77);
		Static31.anInt8528 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt8524 / local71);
		Static31.anInt8535 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static31.anInt8529 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static31.anInt8519 = (this.anInt8523 >> 1 << 12) + (Static31.anInt8529 * Static31.anInt8546 >> 4);
		Static31.anInt8540 = (this.anInt8524 >> 1 << 12) + (Static31.anInt8529 * Static31.anInt8528 >> 4);
		Static31.anInt8531 = Static31.anInt8535 * Static31.anInt8543 >> 4;
		Static31.anInt8537 = Static31.anInt8535 * Static31.anInt8541 >> 4;
		Static31.anInt8544 = (int) local46;
		Static31.anInt8533 = (int) local53;
		Static31.anInt8538 = (int) local59;
		Static31.anInt8525 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt8523;
	}

	@OriginalMember(owner = "client!bca", name = "EA", descriptor = "()I")
	@Override
	public final int EA() {
		return this.anInt8547 + this.anInt8523 + this.anInt8532;
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(II)V")
	protected abstract void method6896(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bca", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass62_Sub2_15.method7077()) {
			throw new IllegalStateException();
		} else if (this.method6895(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static31.anInt8545 = arg7;
			if (arg6 != 1) {
				Static31.anInt8521 = arg7 >>> 24;
				Static31.anInt8534 = 256 - Static31.anInt8521;
				if (arg6 == 0) {
					Static31.anInt8522 = arg7 >> 16 & 0xFF;
					Static31.anInt8530 = arg7 >> 8 & 0xFF;
					Static31.anInt8527 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static31.anInt8520 = arg7 >>> 24;
					Static31.anInt8548 = 256 - Static31.anInt8520;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static31.anInt8548 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static31.anInt8548 & 0xFF0000;
					Static31.anInt8526 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method6896(1);
			} else if (arg6 == 0) {
				this.method6896(0);
			} else if (arg6 == 3) {
				this.method6896(3);
			} else if (arg6 == 2) {
				this.method6896(2);
			}
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected final void method6963(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class87 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass62_Sub2_15.method7077()) {
			throw new IllegalStateException();
		} else if (this.method6895(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class87_Sub3 local20 = (Class87_Sub3) arg6;
			this.method6897(local20.anIntArray509, local20.anIntArray508, Static31.anInt8544 - arg7, -arg8 - (Static31.anInt8525 - Static31.anInt8538));
		}
	}

	@OriginalMember(owner = "client!bca", name = "ra", descriptor = "(IIIIIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bca", name = "DA", descriptor = "(IIIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bca", name = "la", descriptor = "()I")
	@Override
	public final int la() {
		return this.anInt8524;
	}

	@OriginalMember(owner = "client!bca", name = "KA", descriptor = "(IIII)V")
	@Override
	public final void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8547 = arg0;
		this.anInt8518 = arg1;
		this.anInt8532 = arg2;
		this.anInt8542 = arg3;
	}

	@OriginalMember(owner = "client!bca", name = "ma", descriptor = "()I")
	@Override
	public final int ma() {
		return this.anInt8518 + this.anInt8524 + this.anInt8542;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILclient!pa;II)V")
	public abstract void method6965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class87 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([I[III)V")
	protected abstract void method6897(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
