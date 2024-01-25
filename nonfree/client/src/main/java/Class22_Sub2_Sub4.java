import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class22_Sub2_Sub4 extends Class22_Sub2 {

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
	private int anInt5595;

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "Lclient!ha;")
	private Class36_Sub3 aClass36_Sub3_7;

	@OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
	private int anInt5603;

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!sf", name = "ob", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!sf", name = "sb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "Z")
	private boolean aBoolean413 = false;

	@OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
	private int anInt5590 = 0;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
	private int anInt5592 = -32768;

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	private int anInt5596 = 0;

	@OriginalMember(owner = "client!sf", name = "J", descriptor = "I")
	private int anInt5588 = -1;

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
	public final int anInt5600;

	@OriginalMember(owner = "client!sf", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!sf", name = "pb", descriptor = "I")
	private final int anInt5609;

	@OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
	public final int anInt5602;

	@OriginalMember(owner = "client!sf", name = "nb", descriptor = "I")
	public final int anInt5608;

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
	public final int anInt5593;

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
	private final int anInt5587;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "Lclient!qi;")
	private final Class170 aClass170_3;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class22_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt5600 = arg5;
		this.lb = arg8;
		this.anInt5609 = arg0;
		this.aBoolean413 = false;
		this.anInt5602 = arg6;
		this.anInt5608 = arg9;
		this.anInt5593 = arg10;
		this.anInt5587 = arg7;
		@Pc(64) int local64 = Static10.method162(this.anInt5609).anInt6076;
		if (local64 == -1) {
			this.aClass170_3 = null;
		} else {
			this.aClass170_3 = Static261.method4379(local64);
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
	@Override
	public void method5058() {
		super.aShort81 = super.aShort84 = (short) (this.aDouble7 / 128.0D);
		super.aShort83 = super.aShort82 = (short) (this.aDouble6 / 128.0D);
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)I")
	@Override
	public int method5057() {
		return this.anInt5592;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sj;ILclient!pe;)V")
	private void method4717(@OriginalArg(0) Class31 arg0, @OriginalArg(2) Class89 arg1) {
		@Pc(12) Class57[] local12 = arg0.method1942();
		@Pc(15) Class6[] local15 = arg0.method1952();
		if ((this.aClass36_Sub3_7 == null || this.aClass36_Sub3_7.aBoolean178) && (local12 != null || local15 != null)) {
			this.aClass36_Sub3_7 = new Class36_Sub3(Static212.anInt4234);
		}
		if (this.aClass36_Sub3_7 != null) {
			this.aClass36_Sub3_7.method2169(arg1, (long) Static212.anInt4234, local12, local15);
			this.aClass36_Sub3_7.method2180(super.aByte69, super.aShort83, super.aShort82, super.aShort81, super.aShort84);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
		@Pc(9) Class31 local9 = this.method4722(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class70 local15 = arg0.method5427();
		local15.method3715(this.anInt5595);
		local15.method3712(this.anInt5603);
		local15.method3706((int) this.aDouble6, (int) this.aDouble5, (int) this.aDouble7);
		this.anInt5592 = local9.method1920();
		this.method4717(local9, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		@Pc(9) Class31 local9 = this.method4722(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(22) Class70 local22 = arg0.method5427();
		local22.method3715(this.anInt5595);
		local22.method3712(this.anInt5603);
		local22.method3706((int) this.aDouble6, (int) this.aDouble5, (int) this.aDouble7);
		if (this.aClass36_Sub3_7 == null) {
			local9.method1928(local22, null, 0);
		} else {
			@Pc(48) Class24 local48 = this.aClass36_Sub3_7.method2176();
			arg0.method5390(local9, local48, local22, null);
		}
		this.anInt5592 = local9.method1920();
		this.method4717(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
	public void method4719(@OriginalArg(0) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble1;
		if (this.anInt5587 == -1) {
			this.aDouble5 += (double) arg0 * this.aDouble4;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble2 * 0.5D * (double) arg0 + this.aDouble4 * (double) arg0;
			this.aDouble4 += this.aDouble2 * (double) arg0;
		}
		this.aBoolean413 = true;
		this.aDouble7 += this.aDouble8 * (double) arg0;
		this.anInt5603 = (int) (Math.atan2(this.aDouble1, this.aDouble8) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5595 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass170_3 == null) {
			return;
		}
		this.anInt5590 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass170_3.anIntArray650[this.anInt5596] >= this.anInt5590) {
						return;
					}
					this.anInt5590 -= this.aClass170_3.anIntArray650[this.anInt5596];
					this.anInt5596++;
					if (this.aClass170_3.anIntArray652.length <= this.anInt5596) {
						this.anInt5596 -= this.aClass170_3.anInt4956;
						if (this.anInt5596 < 0 || this.aClass170_3.anIntArray652.length <= this.anInt5596) {
							this.anInt5596 = 0;
						}
					}
					this.anInt5588 = this.anInt5596 + 1;
				} while (this.aClass170_3.anIntArray652.length > this.anInt5588);
				this.anInt5588 -= this.aClass170_3.anInt4956;
			} while (this.anInt5588 >= 0 && this.aClass170_3.anIntArray652.length > this.anInt5588);
			this.anInt5588 = -1;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
	public void method4720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean413) {
			local9 = arg3 - super.anInt5973;
			@Pc(16) double local16 = (double) (arg2 - super.anInt5967);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble7 = (double) this.lb * local16 / local25 + (double) super.anInt5967;
			this.aDouble5 = super.anInt5968;
			this.aDouble6 = (double) super.anInt5973 + local9 * (double) this.lb / local25;
		}
		local9 = this.anInt5602 + 1 - arg1;
		this.aDouble8 = ((double) arg2 - this.aDouble7) / local9;
		this.aDouble1 = ((double) arg3 - this.aDouble6) / local9;
		this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble8 * this.aDouble8);
		if (this.anInt5587 == -1) {
			this.aDouble4 = ((double) arg0 - this.aDouble5) / local9;
		} else {
			if (!this.aBoolean413) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt5587 * 0.02454369D);
			}
			this.aDouble2 = ((double) arg0 - local9 * this.aDouble4 - this.aDouble5) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!sf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass36_Sub3_7 != null) {
			this.aClass36_Sub3_7.method2173();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
	public void method4721() {
		if (this.aClass36_Sub3_7 != null) {
			this.aClass36_Sub3_7.method2173();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!pe;)Lclient!sj;")
	private Class31 method4722(@OriginalArg(0) int arg0, @OriginalArg(2) Class89 arg1) {
		@Pc(8) Class197 local8 = Static10.method162(this.anInt5609);
		return local8.method5136(this.anInt5596, this.anInt5588, arg1, this.anInt5590, arg0);
	}
}
