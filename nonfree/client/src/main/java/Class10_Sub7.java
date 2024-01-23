import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class10_Sub7 extends Class10 {

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "Lclient!em;")
	private Class47_Sub1 aClass47_Sub1_7;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	private int anInt6092;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!wg", name = "Q", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!wg", name = "cb", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
	public int anInt6113;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	private int anInt6086 = 0;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	private int anInt6093 = -1;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	private int anInt6095 = -32768;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
	private int anInt6088 = 0;

	@OriginalMember(owner = "client!wg", name = "W", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
	private int anInt6096;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	public int anInt6094;

	@OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
	public int anInt6110;

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	public int anInt6104;

	@OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
	private int anInt6111;

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
	private int anInt6107;

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
	private int anInt6099;

	@OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
	private int anInt6102;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
	private int anInt6085;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
	public int anInt6105;

	@OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
	public int anInt6108;

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "Lclient!bg;")
	private Class15 aClass15_3;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class10_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt6096 = arg3;
		this.anInt6094 = arg6;
		this.anInt6110 = arg10;
		this.anInt6104 = arg1;
		this.anInt6111 = arg0;
		this.aBoolean434 = false;
		this.anInt6107 = arg7;
		this.anInt6099 = arg2;
		this.anInt6102 = arg4;
		this.anInt6085 = arg8;
		this.anInt6105 = arg5;
		this.anInt6108 = arg9;
		@Pc(61) int local61 = Static297.method1843(this.anInt6111).anInt5489;
		if (local61 == -1) {
			this.aClass15_3 = null;
		} else {
			this.aClass15_3 = Static253.method4288(local61);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	public void method4984(@OriginalArg(1) int arg0) {
		if (this.anInt6107 == -1) {
			this.aDouble2 += this.aDouble8 * (double) arg0;
		} else {
			this.aDouble2 += (double) arg0 * this.aDouble8 + (double) arg0 * (double) arg0 * this.aDouble4 * 0.5D;
			this.aDouble8 += (double) arg0 * this.aDouble4;
		}
		this.aDouble5 += this.aDouble3 * (double) arg0;
		this.aDouble9 += (double) arg0 * this.aDouble6;
		this.aBoolean434 = true;
		this.anInt6113 = (int) (Math.atan2(this.aDouble6, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt6092 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
		if (this.aClass15_3 == null) {
			return;
		}
		this.anInt6086 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt6086 <= this.aClass15_3.anIntArray36[this.anInt6088]) {
						return;
					}
					this.anInt6086 -= this.aClass15_3.anIntArray36[this.anInt6088];
					this.anInt6088++;
					if (this.anInt6088 >= this.aClass15_3.anIntArray35.length) {
						this.anInt6088 -= this.aClass15_3.anInt424;
						if (this.anInt6088 < 0 || this.anInt6088 >= this.aClass15_3.anIntArray35.length) {
							this.anInt6088 = 0;
						}
					}
					this.anInt6093 = this.anInt6088 + 1;
				} while (this.anInt6093 < this.aClass15_3.anIntArray35.length);
				this.anInt6093 -= this.aClass15_3.anInt424;
			} while (this.anInt6093 >= 0 && this.anInt6093 < this.aClass15_3.anIntArray35.length);
			this.anInt6093 = -1;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean433) {
			@Pc(11) Class10_Sub4 local11 = this.method4986();
			if (local11 == null) {
				return;
			}
			this.method4988(local11);
		}
		if (this.aClass47_Sub1_7 != null) {
			this.aClass47_Sub1_7.method1093(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		return this.anInt6095;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)Lclient!hm;")
	private Class10_Sub4 method4986() {
		@Pc(8) Class173 local8 = Static297.method1843(this.anInt6111);
		@Pc(18) Class10_Sub4 local18 = local8.method4451(this.anInt6088, this.anInt6093, this.anInt6086);
		if (local18 == null) {
			return null;
		} else {
			local18.method1958(this.anInt6092);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZIIII)V")
	public void method4987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) double local18;
		if (!this.aBoolean434) {
			local18 = arg1 - this.anInt6099;
			@Pc(25) double local25 = (double) (arg2 - this.anInt6096);
			@Pc(34) double local34 = Math.sqrt(local25 * local25 + local18 * local18);
			this.aDouble2 = this.anInt6102;
			this.aDouble5 = (double) this.anInt6096 + (double) this.anInt6085 * local25 / local34;
			this.aDouble9 = (double) this.anInt6099 + (double) this.anInt6085 * local18 / local34;
		}
		local18 = this.anInt6094 + 1 - arg0;
		this.aDouble3 = ((double) arg2 - this.aDouble5) / local18;
		this.aDouble6 = ((double) arg1 - this.aDouble9) / local18;
		this.aDouble7 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble3 * this.aDouble3);
		if (this.anInt6107 == -1) {
			this.aDouble8 = ((double) arg3 - this.aDouble2) / local18;
		} else {
			if (!this.aBoolean434) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt6107 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg3 - this.aDouble2 - local18 * this.aDouble8) * 2.0D / (local18 * local18);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		@Pc(7) Class10_Sub4 local7 = this.method4986();
		if (local7 != null) {
			this.method4988(local7);
			local7.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_7);
			this.anInt6095 = local7.method4973();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLclient!hm;)V")
	private void method4988(@OriginalArg(1) Class10_Sub4 arg0) {
		if (Static283.aBoolean393) {
			@Pc(8) Class10_Sub4_Sub1 local8 = (Class10_Sub4_Sub1) arg0;
			if ((this.aClass47_Sub1_7 == null || this.aClass47_Sub1_7.aBoolean103) && (local8.aClass190Array2 != null || local8.aClass67Array2 != null)) {
				this.aClass47_Sub1_7 = new Class47_Sub1(Static124.anInt2371, 1, 1);
			}
			if (this.aClass47_Sub1_7 != null) {
				this.aClass47_Sub1_7.method1089(local8.aClass190Array2, local8.aClass67Array2, false, local8.anIntArray174, local8.anIntArray177, local8.anIntArray173);
			}
		} else {
			@Pc(55) Class10_Sub4_Sub2 local55 = (Class10_Sub4_Sub2) arg0;
			if ((this.aClass47_Sub1_7 == null || this.aClass47_Sub1_7.aBoolean103) && (local55.aClass190Array3 != null || local55.aClass67Array3 != null)) {
				this.aClass47_Sub1_7 = new Class47_Sub1(Static124.anInt2371, 1, 1);
			}
			if (this.aClass47_Sub1_7 != null) {
				this.aClass47_Sub1_7.method1089(local55.aClass190Array3, local55.aClass67Array3, false, local55.anIntArray239, local55.anIntArray233, local55.anIntArray245);
			}
		}
		this.aBoolean433 = true;
	}
}
