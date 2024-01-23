import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "Lclient!il;")
	private Class21_Sub1 aClass21_Sub1_2;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
	public int anInt1617;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!fh", name = "Q", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
	private int anInt1627;

	@OriginalMember(owner = "client!fh", name = "W", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!fh", name = "X", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
	private int anInt1609 = 0;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	private int anInt1607 = 0;

	@OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
	private int anInt1621 = -1;

	@OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
	private int anInt1615 = -32768;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "Z")
	private boolean aBoolean95 = false;

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
	private int anInt1623;

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
	private int anInt1618;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
	public int anInt1612;

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
	public int anInt1614;

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
	public int anInt1613;

	@OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
	private int anInt1622;

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
	public int anInt1610;

	@OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
	private int anInt1619;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "I")
	private int anInt1606;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
	private int anInt1620;

	@OriginalMember(owner = "client!fh", name = "z", descriptor = "Lclient!wi;")
	private Class186 aClass186_2;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class13_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1623 = arg4;
		this.anInt1626 = arg6;
		this.anInt1618 = arg7;
		this.anInt1612 = arg1;
		this.anInt1614 = arg9;
		this.aBoolean94 = false;
		this.anInt1613 = arg5;
		this.anInt1622 = arg2;
		this.anInt1610 = arg10;
		this.anInt1619 = arg8;
		this.anInt1606 = arg3;
		this.anInt1620 = arg0;
		@Pc(61) int local61 = Static32.method639(this.anInt1620).anInt3877;
		if (local61 == -1) {
			this.aClass186_2 = null;
		} else {
			this.aClass186_2 = Static51.method992(local61);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!gk;)V")
	private void method1335(@OriginalArg(1) Class13_Sub1 arg0) {
		if (Static251.aBoolean330) {
			@Pc(56) Class13_Sub1_Sub2 local56 = (Class13_Sub1_Sub2) arg0;
			if ((this.aClass21_Sub1_2 == null || this.aClass21_Sub1_2.aBoolean152) && (local56.aClass62Array2 != null || local56.aClass88Array2 != null)) {
				this.aClass21_Sub1_2 = new Class21_Sub1(Static50.anInt1118, 1, 1);
			}
			if (this.aClass21_Sub1_2 != null) {
				this.aClass21_Sub1_2.method1974(local56.aClass62Array2, local56.aClass88Array2, false, local56.anIntArray289, local56.anIntArray286, local56.anIntArray290);
			}
		} else {
			@Pc(12) Class13_Sub1_Sub1 local12 = (Class13_Sub1_Sub1) arg0;
			if ((this.aClass21_Sub1_2 == null || this.aClass21_Sub1_2.aBoolean152) && (local12.aClass62Array1 != null || local12.aClass88Array1 != null)) {
				this.aClass21_Sub1_2 = new Class21_Sub1(Static50.anInt1118, 1, 1);
			}
			if (this.aClass21_Sub1_2 != null) {
				this.aClass21_Sub1_2.method1974(local12.aClass62Array1, local12.aClass88Array1, false, local12.anIntArray15, local12.anIntArray22, local12.anIntArray20);
			}
		}
		this.aBoolean95 = true;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public void method1336(@OriginalArg(1) int arg0) {
		this.aBoolean94 = true;
		this.aDouble5 += (double) arg0 * this.aDouble2;
		if (this.anInt1618 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble8 += this.aDouble7 * (double) arg0 + (double) arg0 * 0.5D * this.aDouble3 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
		}
		this.aDouble1 += (double) arg0 * this.aDouble6;
		this.anInt1617 = (int) (Math.atan2(this.aDouble2, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt1627 = (int) (Math.atan2(this.aDouble7, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass186_2 == null) {
			return;
		}
		this.anInt1609 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass186_2.anIntArray470[this.anInt1607] >= this.anInt1609) {
						return;
					}
					this.anInt1609 -= this.aClass186_2.anIntArray470[this.anInt1607];
					this.anInt1607++;
					if (this.aClass186_2.anIntArray469.length <= this.anInt1607) {
						this.anInt1607 -= this.aClass186_2.anInt5823;
						if (this.anInt1607 < 0 || this.aClass186_2.anIntArray469.length <= this.anInt1607) {
							this.anInt1607 = 0;
						}
					}
					this.anInt1621 = this.anInt1607 + 1;
				} while (this.anInt1621 < this.aClass186_2.anIntArray469.length);
				this.anInt1621 -= this.aClass186_2.anInt5823;
			} while (this.anInt1621 >= 0 && this.aClass186_2.anIntArray469.length > this.anInt1621);
			this.anInt1621 = -1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		@Pc(7) Class13_Sub1 local7 = this.method1338();
		if (local7 != null) {
			this.method1335(local7);
			local7.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_2);
			this.anInt1615 = local7.method4266();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		return this.anInt1615;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean95) {
			@Pc(11) Class13_Sub1 local11 = this.method1338();
			if (local11 == null) {
				return;
			}
			this.method1335(local11);
		}
		if (this.aClass21_Sub1_2 != null) {
			this.aClass21_Sub1_2.method1976(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(IIIII)V")
	public void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!this.aBoolean94) {
			@Pc(13) double local13 = (double) (arg1 - this.anInt1622);
			@Pc(20) double local20 = (double) (arg3 - this.anInt1606);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble8 = this.anInt1623;
			this.aDouble1 = (double) this.anInt1606 + local20 * (double) this.anInt1619 / local29;
			this.aDouble5 = (double) this.anInt1619 * local13 / local29 + (double) this.anInt1622;
		}
		@Pc(77) double local77 = (double) (this.anInt1626 + 1 - arg0);
		this.aDouble2 = ((double) arg1 - this.aDouble5) / local77;
		this.aDouble6 = ((double) arg3 - this.aDouble1) / local77;
		this.aDouble4 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble2 * this.aDouble2);
		if (this.anInt1618 == -1) {
			this.aDouble7 = ((double) arg2 - this.aDouble8) / local77;
		} else {
			if (!this.aBoolean94) {
				this.aDouble7 = -this.aDouble4 * Math.tan((double) this.anInt1618 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg2 - local77 * this.aDouble7 - this.aDouble8) * 2.0D / (local77 * local77);
		}
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)Lclient!gk;")
	private Class13_Sub1 method1338() {
		@Pc(8) Class120 local8 = Static32.method639(this.anInt1620);
		@Pc(20) Class13_Sub1 local20 = local8.method3158(this.anInt1621, this.anInt1609, this.anInt1607);
		if (local20 == null) {
			return null;
		} else {
			local20.method2733(this.anInt1627);
			return local20;
		}
	}
}
