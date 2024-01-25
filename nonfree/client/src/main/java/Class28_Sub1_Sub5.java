import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class28_Sub1_Sub5 extends Class28_Sub1 {

	@OriginalMember(owner = "client!th", name = "y", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "I")
	private int anInt5618;

	@OriginalMember(owner = "client!th", name = "O", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!th", name = "X", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!th", name = "bb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!th", name = "fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!th", name = "ib", descriptor = "Lclient!g;")
	private Class12_Sub4 aClass12_Sub4_7;

	@OriginalMember(owner = "client!th", name = "kb", descriptor = "I")
	private int anInt5638;

	@OriginalMember(owner = "client!th", name = "ob", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	private int anInt5622 = -32768;

	@OriginalMember(owner = "client!th", name = "L", descriptor = "I")
	private int anInt5621 = -1;

	@OriginalMember(owner = "client!th", name = "Y", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "client!th", name = "U", descriptor = "I")
	private int anInt5628 = 0;

	@OriginalMember(owner = "client!th", name = "mb", descriptor = "I")
	private int anInt5639 = 0;

	@OriginalMember(owner = "client!th", name = "qb", descriptor = "I")
	private final int anInt5641;

	@OriginalMember(owner = "client!th", name = "hb", descriptor = "I")
	public final int anInt5636;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	public final int anInt5617;

	@OriginalMember(owner = "client!th", name = "W", descriptor = "I")
	public final int anInt5629;

	@OriginalMember(owner = "client!th", name = "T", descriptor = "I")
	private final int anInt5627;

	@OriginalMember(owner = "client!th", name = "J", descriptor = "I")
	private final int anInt5619;

	@OriginalMember(owner = "client!th", name = "P", descriptor = "I")
	public final int anInt5623;

	@OriginalMember(owner = "client!th", name = "N", descriptor = "Lclient!ok;")
	private final Class177 aClass177_3;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class28_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt5641 = arg8;
		this.anInt5636 = arg5;
		this.anInt5617 = arg10;
		this.anInt5629 = arg9;
		this.anInt5627 = arg7;
		this.anInt5619 = arg0;
		this.aBoolean436 = false;
		this.anInt5623 = arg6;
		@Pc(65) int local65 = Static224.aClass203_2.method4559(this.anInt5619).anInt3050;
		if (local65 == -1) {
			this.aClass177_3 = null;
		} else {
			this.aClass177_3 = Static176.aClass43_2.method930(local65);
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		@Pc(9) Class75 local9 = this.method5069(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class118 local16 = arg0.method4908();
		local16.method2660(this.anInt5618);
		local16.method2670(this.anInt5638);
		local16.method2658((int) this.aDouble5, (int) this.aDouble3, (int) this.aDouble6);
		if (this.aClass12_Sub4_7 == null) {
			local9.method5469(local16, null, 0);
		} else {
			@Pc(42) Class47 local42 = this.aClass12_Sub4_7.method1797();
			arg0.method4905(local9, local42, local16, null);
		}
		this.anInt5622 = local9.method5476();
		this.method5072(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		@Pc(13) Class75 local13 = this.method5069(arg0, 0);
		if (local13 == null) {
			return;
		}
		@Pc(19) Class118 local19 = arg0.method4908();
		local19.method2660(this.anInt5618);
		local19.method2670(this.anInt5638);
		local19.method2658((int) this.aDouble5, (int) this.aDouble3, (int) this.aDouble6);
		this.anInt5622 = local13.method5476();
		this.method5072(local13, arg0);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
	public void method5068() {
		if (this.aClass12_Sub4_7 != null) {
			this.aClass12_Sub4_7.method1799();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!np;II)Lclient!f;")
	private Class75 method5069(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class125 local9 = Static224.aClass203_2.method4559(this.anInt5619);
		return local9.method2695(Static176.aClass43_2, this.anInt5639, arg0, this.anInt5621, this.anInt5628, arg1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	public void method5070(@OriginalArg(0) int arg0) {
		if (this.anInt5627 == -1) {
			this.aDouble3 += (double) arg0 * this.aDouble9;
		} else {
			this.aDouble3 += (double) arg0 * this.aDouble9 + this.aDouble2 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble9 += (double) arg0 * this.aDouble2;
		}
		this.aDouble5 += this.aDouble4 * (double) arg0;
		this.aDouble6 += this.aDouble8 * (double) arg0;
		this.aBoolean436 = true;
		this.anInt5638 = (int) (Math.atan2(this.aDouble4, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5618 = (int) (Math.atan2(this.aDouble9, this.aDouble7) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass177_3 == null) {
			return;
		}
		this.anInt5639 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt5639 <= this.aClass177_3.anIntArray501[this.anInt5628]) {
						return;
					}
					this.anInt5639 -= this.aClass177_3.anIntArray501[this.anInt5628];
					this.anInt5628++;
					if (this.aClass177_3.anIntArray499.length <= this.anInt5628) {
						this.anInt5628 -= this.aClass177_3.anInt4497;
						if (this.anInt5628 < 0 || this.aClass177_3.anIntArray499.length <= this.anInt5628) {
							this.anInt5628 = 0;
						}
					}
					this.anInt5621 = this.anInt5628 + 1;
				} while (this.aClass177_3.anIntArray499.length > this.anInt5621);
				this.anInt5621 -= this.aClass177_3.anInt4497;
			} while (this.anInt5621 >= 0 && this.anInt5621 < this.aClass177_3.anIntArray499.length);
			this.anInt5621 = -1;
		}
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V")
	@Override
	public void method5188() {
		super.aShort89 = super.aShort88 = (short) (this.aDouble5 / 128.0D);
		super.aShort87 = super.aShort90 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!th", name = "j", descriptor = "(I)I")
	@Override
	public int method5191() {
		return this.anInt5622;
	}

	@OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_7 != null) {
			this.aClass12_Sub4_7.method1799();
		}
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!f;ILclient!np;)V")
	private void method5072(@OriginalArg(0) Class75 arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(9) Class241[] local9 = arg0.method5480();
		@Pc(12) Class158[] local12 = arg0.method5488();
		if ((this.aClass12_Sub4_7 == null || this.aClass12_Sub4_7.aBoolean160) && (local9 != null || local12 != null)) {
			this.aClass12_Sub4_7 = new Class12_Sub4(Static76.anInt1617);
		}
		if (this.aClass12_Sub4_7 != null) {
			this.aClass12_Sub4_7.method1803(arg1, (long) Static76.anInt1617, local9, local12);
			this.aClass12_Sub4_7.method1793(super.aByte73, super.aShort89, super.aShort88, super.aShort87, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIBI)V")
	public void method5074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean436) {
			local13 = arg0 - super.anInt5774;
			@Pc(20) double local20 = (double) (arg1 - super.anInt5766);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble3 = super.anInt5769;
			this.aDouble6 = local20 * (double) this.anInt5641 / local29 + (double) super.anInt5766;
			this.aDouble5 = (double) super.anInt5774 + local13 * (double) this.anInt5641 / local29;
		}
		local13 = this.anInt5623 + 1 - arg2;
		this.aDouble4 = ((double) arg0 - this.aDouble5) / local13;
		this.aDouble8 = ((double) arg1 - this.aDouble6) / local13;
		this.aDouble7 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble4 * this.aDouble4);
		if (this.anInt5627 == -1) {
			this.aDouble9 = ((double) arg3 - this.aDouble3) / local13;
		} else {
			if (!this.aBoolean436) {
				this.aDouble9 = -this.aDouble7 * Math.tan((double) this.anInt5627 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg3 - this.aDouble3 - local13 * this.aDouble9) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
