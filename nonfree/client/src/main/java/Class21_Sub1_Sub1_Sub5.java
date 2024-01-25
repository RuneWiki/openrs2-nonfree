import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class21_Sub1_Sub1_Sub5 extends Class21_Sub1_Sub1 {

	@OriginalMember(owner = "client!up", name = "G", descriptor = "I")
	private int anInt9831;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
	private int anInt9838;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!up", name = "X", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!up", name = "fb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!up", name = "ib", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!up", name = "nb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!up", name = "rb", descriptor = "Lclient!hda;")
	private Class21_Sub5 aClass21_Sub5_8;

	@OriginalMember(owner = "client!up", name = "sb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!up", name = "vb", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!up", name = "H", descriptor = "I")
	private int anInt9832 = -1;

	@OriginalMember(owner = "client!up", name = "I", descriptor = "Z")
	private boolean aBoolean663 = false;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "I")
	private int anInt9834 = 0;

	@OriginalMember(owner = "client!up", name = "U", descriptor = "I")
	private int anInt9841 = 0;

	@OriginalMember(owner = "client!up", name = "cb", descriptor = "Z")
	private boolean aBoolean664 = false;

	@OriginalMember(owner = "client!up", name = "xb", descriptor = "I")
	private int anInt9860 = 0;

	@OriginalMember(owner = "client!up", name = "pb", descriptor = "I")
	private int anInt9855 = 0;

	@OriginalMember(owner = "client!up", name = "yb", descriptor = "Z")
	private final boolean aBoolean665;

	@OriginalMember(owner = "client!up", name = "db", descriptor = "I")
	public final int anInt9848;

	@OriginalMember(owner = "client!up", name = "V", descriptor = "I")
	private final int anInt9842;

	@OriginalMember(owner = "client!up", name = "hb", descriptor = "I")
	public final int anInt9851;

	@OriginalMember(owner = "client!up", name = "O", descriptor = "I")
	public final int anInt9836;

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
	public final int anInt9844;

	@OriginalMember(owner = "client!up", name = "ub", descriptor = "I")
	private final int anInt9858;

	@OriginalMember(owner = "client!up", name = "qb", descriptor = "I")
	private final int anInt9856;

	@OriginalMember(owner = "client!up", name = "tb", descriptor = "I")
	private final int anInt9857;

	@OriginalMember(owner = "client!up", name = "M", descriptor = "Lclient!fo;")
	private final Class111 aClass111_3;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(IIIIIIIIIIIIZ)V")
	public Class21_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		super(arg1, arg2, arg3, Static461.method6782(arg4, arg1, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean665 = arg12;
		this.anInt9848 = arg7;
		this.anInt9842 = arg5;
		this.anInt9851 = arg10;
		this.anInt9836 = arg6;
		this.anInt9844 = arg11;
		this.anInt9858 = arg9;
		this.anInt9856 = arg8;
		this.aBoolean664 = false;
		this.anInt9857 = arg0;
		@Pc(85) int local85 = Static342.aClass132_2.method2958(this.anInt9857).anInt1459;
		if (local85 == -1) {
			this.aClass111_3 = null;
		} else {
			this.aClass111_3 = Static17.aClass254_1.method5936(local85);
		}
	}

	@OriginalMember(owner = "client!up", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub5_8 != null) {
			this.aClass21_Sub5_8.method3051();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		@Pc(11) Class65 local11 = this.method7570(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(25) Class81 local25 = arg0.method7812();
		local25.oa(this.anInt9831);
		local25.ZA(this.anInt9838);
		local25.U((int) this.aDouble6, (int) this.aDouble11, (int) this.aDouble7);
		this.method7569(local25, local11, arg0);
		if (Static263.aBoolean371) {
			local11.method7686(local25, null, Static18.anInt941, 0);
		} else {
			local11.method7679(local25, null, 0);
		}
		if (this.aClass21_Sub5_8 != null) {
			@Pc(72) Class276 local72 = this.aClass21_Sub5_8.method3048();
			if (Static263.aBoolean371) {
				arg0.method7832(local72, Static18.anInt941);
			} else {
				arg0.method7777(local72);
			}
		}
		this.aBoolean663 = local11.LA();
		this.anInt9855 = local11.J();
		this.anInt9860 = local11.RA();
		return null;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V")
	public void method7568(@OriginalArg(1) int arg0) {
		this.aBoolean664 = true;
		this.aDouble7 += (double) arg0 * this.aDouble8;
		this.aDouble6 += this.aDouble9 * (double) arg0;
		if (this.aBoolean665) {
			this.aDouble11 = Static461.method6782((int) this.aDouble7, super.aByte127, (int) this.aDouble6) - this.anInt9842;
		} else if (this.anInt9856 == -1) {
			this.aDouble11 += (double) arg0 * this.aDouble10;
		} else {
			this.aDouble11 += (double) arg0 * this.aDouble10 + (double) arg0 * 0.5D * this.aDouble4 * (double) arg0;
			this.aDouble10 += (double) arg0 * this.aDouble4;
		}
		this.anInt9838 = (int) (Math.atan2(this.aDouble9, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt9831 = (int) (Math.atan2(this.aDouble10, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass111_3 == null) {
			return;
		}
		this.anInt9834 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt9834 <= this.aClass111_3.anIntArray150[this.anInt9841]) {
						return;
					}
					this.anInt9834 -= this.aClass111_3.anIntArray150[this.anInt9841];
					this.anInt9841++;
					if (this.anInt9841 >= this.aClass111_3.anIntArray153.length) {
						this.anInt9841 -= this.aClass111_3.anInt3155;
						if (this.anInt9841 < 0 || this.anInt9841 >= this.aClass111_3.anIntArray153.length) {
							this.anInt9841 = 0;
						}
					}
					this.anInt9832 = this.anInt9841 + 1;
				} while (this.anInt9832 < this.aClass111_3.anIntArray153.length);
				this.anInt9832 -= this.aClass111_3.anInt3155;
			} while (this.anInt9832 >= 0 && this.aClass111_3.anIntArray153.length > this.anInt9832);
			this.anInt9832 = -1;
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!up", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!up", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aBoolean663;
	}

	@OriginalMember(owner = "client!up", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.anInt9855;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!q;ILclient!da;Lclient!r;)V")
	private void method7569(@OriginalArg(0) Class81 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class7 arg2) {
		arg1.method7665(arg0);
		@Pc(9) Class190[] local9 = arg1.method7675();
		@Pc(15) Class52[] local15 = arg1.method7688();
		if ((this.aClass21_Sub5_8 == null || this.aClass21_Sub5_8.aBoolean281) && (local9 != null || local15 != null)) {
			this.aClass21_Sub5_8 = Static185.method3047(Static306.anInt6122, true);
		}
		if (this.aClass21_Sub5_8 != null) {
			this.aClass21_Sub5_8.method3046(arg2, (long) Static306.anInt6122, local9, local15);
			this.aClass21_Sub5_8.method3054(super.aByte127, super.aShort119, super.aShort120, super.aShort121, super.aShort122);
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
		@Pc(9) Class65 local9 = this.method7570(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class81 local15 = arg0.method7812();
		local15.oa(this.anInt9831);
		local15.ZA(this.anInt9838);
		local15.U((int) this.aDouble6, (int) this.aDouble11, (int) this.aDouble7);
		this.anInt9855 = local9.J();
		this.anInt9860 = local9.RA();
		this.method7569(local15, local9, arg0);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 >= -102) {
			this.method7571(48, -124, 64, 46);
		}
		return this.anInt9860;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BLclient!r;I)Lclient!da;")
	private Class65 method7570(@OriginalArg(1) Class7 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class49 local9 = Static342.aClass132_2.method2958(this.anInt9857);
		return local9.method1282(this.anInt9841, arg1, Static17.aClass254_1, this.anInt9834, arg0, this.anInt9832);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBIII)V")
	public void method7571(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) double local15;
		if (!this.aBoolean664) {
			local15 = arg2 - super.anInt10551;
			@Pc(21) double local21 = (double) (arg1 - super.anInt10550);
			@Pc(30) double local30 = Math.sqrt(local15 * local15 + local21 * local21);
			this.aDouble7 = (double) super.anInt10550 + (double) this.anInt9858 * local21 / local30;
			this.aDouble6 = (double) this.anInt9858 * local15 / local30 + (double) super.anInt10551;
			if (this.aBoolean665) {
				this.aDouble11 = Static461.method6782((int) this.aDouble7, super.aByte127, (int) this.aDouble6) - this.anInt9842;
			} else {
				this.aDouble11 = super.anInt10554;
			}
		}
		local15 = this.anInt9848 + 1 - arg0;
		this.aDouble9 = ((double) arg2 - this.aDouble6) / local15;
		this.aDouble8 = ((double) arg1 - this.aDouble7) / local15;
		this.aDouble5 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble9 * this.aDouble9);
		if (this.anInt9856 == -1) {
			this.aDouble10 = ((double) arg3 - this.aDouble11) / local15;
		} else {
			if (!this.aBoolean664) {
				this.aDouble10 = -this.aDouble5 * Math.tan((double) this.anInt9856 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg3 - this.aDouble11 - local15 * this.aDouble10) * 2.0D / (local15 * local15);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!up", name = "k", descriptor = "(I)V")
	@Override
	public void method7567() {
		super.aShort119 = super.aShort120 = (short) (this.aDouble6 / 512.0D);
		super.aShort121 = super.aShort122 = (short) (this.aDouble7 / 512.0D);
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return false;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
	public void method7572() {
		if (this.aClass21_Sub5_8 != null) {
			this.aClass21_Sub5_8.method3051();
		}
	}
}
