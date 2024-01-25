import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class6_Sub1_Sub1_Sub2 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
	private int anInt984;

	@OriginalMember(owner = "client!bi", name = "cb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!bi", name = "ib", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!bi", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!bi", name = "sb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!bi", name = "wb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!bi", name = "xb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!bi", name = "zb", descriptor = "I")
	private int anInt1007;

	@OriginalMember(owner = "client!bi", name = "Cb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!bi", name = "Db", descriptor = "Lclient!tq;")
	private Class6_Sub8 aClass6_Sub8_3;

	@OriginalMember(owner = "client!bi", name = "Fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!bi", name = "ab", descriptor = "I")
	private int anInt990 = 0;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
	private int anInt989 = 0;

	@OriginalMember(owner = "client!bi", name = "Ab", descriptor = "I")
	private int anInt1008 = 0;

	@OriginalMember(owner = "client!bi", name = "yb", descriptor = "I")
	private int anInt1006 = 0;

	@OriginalMember(owner = "client!bi", name = "Q", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bi", name = "db", descriptor = "I")
	private int anInt992 = -1;

	@OriginalMember(owner = "client!bi", name = "mb", descriptor = "I")
	public final int anInt999;

	@OriginalMember(owner = "client!bi", name = "tb", descriptor = "I")
	public final int anInt1003;

	@OriginalMember(owner = "client!bi", name = "qb", descriptor = "I")
	private final int anInt1001;

	@OriginalMember(owner = "client!bi", name = "ub", descriptor = "I")
	public final int anInt1004;

	@OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
	private final int anInt991;

	@OriginalMember(owner = "client!bi", name = "O", descriptor = "I")
	private final int anInt982;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
	private final int anInt978;

	@OriginalMember(owner = "client!bi", name = "jb", descriptor = "I")
	public final int anInt997;

	@OriginalMember(owner = "client!bi", name = "pb", descriptor = "Z")
	private final boolean aBoolean77;

	@OriginalMember(owner = "client!bi", name = "Hb", descriptor = "Lclient!dr;")
	private final Class84 aClass84_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class6_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static524.method7217(arg3, arg1, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt999 = arg7;
		this.aBoolean75 = false;
		this.anInt1003 = arg6;
		this.anInt1001 = arg8;
		this.anInt1004 = arg10;
		this.anInt991 = arg5;
		this.anInt982 = arg0;
		this.anInt978 = arg9;
		this.anInt997 = arg11;
		this.aBoolean77 = arg12;
		@Pc(84) int local84 = Static215.aClass33_1.method587(this.anInt982).anInt4374;
		if (local84 == -1) {
			this.aClass84_1 = null;
		} else {
			this.aClass84_1 = Static116.aClass140_2.method3287(local84);
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		@Pc(16) Class66 local16 = this.method689(2048, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class68 local23 = arg0.method6222();
		local23.oa(this.anInt1007);
		local23.ZA(this.anInt984);
		local23.U((int) this.lb, (int) this.aDouble8, (int) this.aDouble4);
		this.method691(arg0, local23, local16);
		if (Static338.aBoolean493) {
			local16.method7556(local23, null, Static401.anInt6991, 0);
		} else {
			local16.method7558(local23, null, 0);
		}
		if (this.aClass6_Sub8_3 != null) {
			@Pc(70) Class164 local70 = this.aClass6_Sub8_3.method7161();
			if (Static338.aBoolean493) {
				arg0.method6257(local70, Static401.anInt6991);
			} else {
				arg0.method6193(local70);
			}
		}
		this.aBoolean76 = local16.LA();
		this.anInt989 = local16.J();
		this.anInt1008 = local16.RA();
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILclient!r;)Lclient!da;")
	private Class66 method689(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(15) Class167 local15 = Static215.aClass33_1.method587(this.anInt982);
		return local15.method3642(this.anInt992, arg1, Static116.aClass140_2, this.anInt1006, arg0, this.anInt990);
	}

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aBoolean76;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public void method690() {
		if (this.aClass6_Sub8_3 != null) {
			this.aClass6_Sub8_3.method7159();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!r;Lclient!q;Lclient!da;)V")
	private void method691(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) Class66 arg2) {
		arg2.method7552(arg1);
		@Pc(9) Class139[] local9 = arg2.method7550();
		@Pc(16) Class270[] local16 = arg2.method7561();
		if ((this.aClass6_Sub8_3 == null || this.aClass6_Sub8_3.aBoolean660) && (local9 != null || local16 != null)) {
			this.aClass6_Sub8_3 = Static518.method7156(Static412.anInt575, true);
		}
		if (this.aClass6_Sub8_3 != null) {
			this.aClass6_Sub8_3.method7149(arg0, (long) Static412.anInt575, local9, local16);
			this.aClass6_Sub8_3.method7160(super.aByte112, super.aShort85, super.aShort86, super.aShort83, super.aShort84);
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
		@Pc(15) Class66 local15 = this.method689(0, arg0);
		if (local15 == null) {
			return;
		}
		@Pc(21) Class68 local21 = arg0.method6222();
		local21.oa(this.anInt1007);
		local21.ZA(this.anInt984);
		local21.U((int) this.lb, (int) this.aDouble8, (int) this.aDouble4);
		this.anInt989 = local15.J();
		this.anInt1008 = local15.RA();
		this.method691(arg0, local21, local15);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	public void method692(@OriginalArg(0) int arg0) {
		this.aDouble4 += (double) arg0 * this.aDouble6;
		this.aBoolean75 = true;
		this.lb += this.aDouble5 * (double) arg0;
		if (this.aBoolean77) {
			this.aDouble8 = Static524.method7217((int) this.lb, super.aByte112, (int) this.aDouble4) - this.anInt991;
		} else if (this.anInt1001 == -1) {
			this.aDouble8 += this.aDouble7 * (double) arg0;
		} else {
			this.aDouble8 += this.aDouble2 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble7 * (double) arg0;
			this.aDouble7 += (double) arg0 * this.aDouble2;
		}
		this.anInt984 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt1007 = (int) (Math.atan2(this.aDouble7, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass84_1 == null) {
			return;
		}
		this.anInt990 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass84_1.anIntArray110[this.anInt1006] >= this.anInt990) {
						return;
					}
					this.anInt990 -= this.aClass84_1.anIntArray110[this.anInt1006];
					this.anInt1006++;
					if (this.aClass84_1.anIntArray108.length <= this.anInt1006) {
						this.anInt1006 -= this.aClass84_1.anInt2068;
						if (this.anInt1006 < 0 || this.aClass84_1.anIntArray108.length <= this.anInt1006) {
							this.anInt1006 = 0;
						}
					}
					this.anInt992 = this.anInt1006 + 1;
				} while (this.aClass84_1.anIntArray108.length > this.anInt992);
				this.anInt992 -= this.aClass84_1.anInt2068;
			} while (this.anInt992 >= 0 && this.anInt992 < this.aClass84_1.anIntArray108.length);
			this.anInt992 = -1;
		}
	}

	@OriginalMember(owner = "client!bi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub8_3 != null) {
			this.aClass6_Sub8_3.method7159();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V")
	public void method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean75) {
			local9 = arg1 - super.anInt8761;
			@Pc(16) double local16 = (double) (arg0 - super.anInt8764);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.lb = (double) super.anInt8761 + (double) this.anInt978 * local9 / local25;
			this.aDouble4 = local16 * (double) this.anInt978 / local25 + (double) super.anInt8764;
			if (this.aBoolean77) {
				this.aDouble8 = Static524.method7217((int) this.lb, super.aByte112, (int) this.aDouble4) - this.anInt991;
			} else {
				this.aDouble8 = super.anInt8759;
			}
		}
		local9 = this.anInt999 + 1 - arg2;
		this.aDouble6 = ((double) arg0 - this.aDouble4) / local9;
		this.aDouble5 = ((double) arg1 - this.lb) / local9;
		this.aDouble3 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble5 * this.aDouble5);
		if (this.anInt1001 == -1) {
			this.aDouble7 = ((double) arg3 - this.aDouble8) / local9;
		} else {
			if (!this.aBoolean75) {
				this.aDouble7 = -this.aDouble3 * Math.tan((double) this.anInt1001 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg3 - this.aDouble8 - this.aDouble7 * local9) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V")
	@Override
	public void method6152() {
		super.aShort85 = super.aShort86 = (short) (this.lb / 512.0D);
		super.aShort83 = super.aShort84 = (short) (this.aDouble4 / 512.0D);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.method7330();
		}
		return this.anInt1008;
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.anInt989;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		throw new IllegalStateException();
	}
}
