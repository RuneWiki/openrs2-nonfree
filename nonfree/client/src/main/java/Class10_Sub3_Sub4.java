import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class10_Sub3_Sub4 extends Class10_Sub3 {

	@OriginalMember(owner = "client!le", name = "D", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!le", name = "P", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!le", name = "U", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!le", name = "V", descriptor = "Lclient!pj;")
	private Class1_Sub7 aClass1_Sub7_3;

	@OriginalMember(owner = "client!le", name = "cb", descriptor = "I")
	private int anInt3640;

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!le", name = "mb", descriptor = "I")
	private int anInt3645;

	@OriginalMember(owner = "client!le", name = "ob", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!le", name = "rb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!le", name = "tb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!le", name = "J", descriptor = "I")
	private int anInt3625 = -32768;

	@OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
	private int anInt3636 = -1;

	@OriginalMember(owner = "client!le", name = "gb", descriptor = "I")
	private int anInt3643 = 0;

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!le", name = "C", descriptor = "I")
	private int anInt3619 = 0;

	@OriginalMember(owner = "client!le", name = "I", descriptor = "I")
	private final int anInt3624;

	@OriginalMember(owner = "client!le", name = "W", descriptor = "I")
	public final int anInt3634;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "I")
	private final int anInt3623;

	@OriginalMember(owner = "client!le", name = "T", descriptor = "I")
	public final int anInt3633;

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
	private final int anInt3639;

	@OriginalMember(owner = "client!le", name = "S", descriptor = "I")
	public final int anInt3632;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	public final int anInt3621;

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "Lclient!gn;")
	private final Class79 aClass79_1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class10_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean235 = false;
		this.anInt3624 = arg0;
		this.anInt3634 = arg6;
		this.anInt3623 = arg8;
		this.anInt3633 = arg5;
		this.anInt3639 = arg7;
		this.anInt3632 = arg10;
		this.anInt3621 = arg9;
		@Pc(64) int local64 = Static76.method1908(this.anInt3624).anInt2302;
		if (local64 == -1) {
			this.aClass79_1 = null;
		} else {
			this.aClass79_1 = Static233.method4080(local64);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		@Pc(9) Class45 local9 = this.method3431(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class51 local16 = arg0.method5145();
		local16.method3558(this.anInt3645);
		local16.method3554(this.anInt3640);
		local16.method3561((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble2);
		if (this.aClass1_Sub7_3 == null) {
			local9.method1794(local16, null, 0);
		} else {
			@Pc(47) Class109 local47 = this.aClass1_Sub7_3.method4320();
			arg0.method5116(local9, local47, local16, null);
		}
		this.anInt3625 = local9.method1781();
		this.method3438(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return false;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(I)I")
	@Override
	public int method5345() {
		return this.anInt3625;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BILclient!e;)Lclient!id;")
	private Class45 method3431(@OriginalArg(1) int arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(8) Class78 local8 = Static76.method1908(this.anInt3624);
		return local8.method2266(this.anInt3636, this.anInt3619, arg0, arg1, this.anInt3643);
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V")
	@Override
	public void method5347() {
		super.aShort82 = super.aShort81 = (short) (this.aDouble2 / 128.0D);
		super.aShort83 = super.aShort80 = (short) (this.aDouble7 / 128.0D);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
		@Pc(9) Class45 local9 = this.method3431(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class51 local15 = arg0.method5145();
		local15.method3558(this.anInt3645);
		local15.method3554(this.anInt3640);
		local15.method3561((int) this.aDouble7, (int) this.aDouble8, (int) this.aDouble2);
		this.anInt3625 = local9.method1781();
		this.method3438(arg0, local9);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public void method3434() {
		if (this.aClass1_Sub7_3 != null) {
			this.aClass1_Sub7_3.method4328();
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	public void method3435(@OriginalArg(1) int arg0) {
		if (this.anInt3639 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble5;
		} else {
			this.aDouble8 += (double) arg0 * (double) arg0 * this.aDouble4 * 0.5D + this.aDouble5 * (double) arg0;
			this.aDouble5 += this.aDouble4 * (double) arg0;
		}
		this.aBoolean235 = true;
		this.aDouble7 += this.aDouble3 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble9;
		this.anInt3640 = (int) (Math.atan2(this.aDouble3, this.aDouble9) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt3645 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass79_1 == null) {
			return;
		}
		this.anInt3643 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3643 <= this.aClass79_1.anIntArray215[this.anInt3619]) {
						return;
					}
					this.anInt3643 -= this.aClass79_1.anIntArray215[this.anInt3619];
					this.anInt3619++;
					if (this.anInt3619 >= this.aClass79_1.anIntArray217.length) {
						this.anInt3619 -= this.aClass79_1.anInt2353;
						if (this.anInt3619 < 0 || this.anInt3619 >= this.aClass79_1.anIntArray217.length) {
							this.anInt3619 = 0;
						}
					}
					this.anInt3636 = this.anInt3619 + 1;
				} while (this.aClass79_1.anIntArray217.length > this.anInt3636);
				this.anInt3636 -= this.aClass79_1.anInt2353;
			} while (this.anInt3636 >= 0 && this.aClass79_1.anIntArray217.length > this.anInt3636);
			this.anInt3636 = -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public void method3436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean235) {
			local13 = arg0 - super.anInt5910;
			@Pc(19) double local19 = (double) (arg2 - super.anInt5908);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble7 = (double) this.anInt3623 * local13 / local28 + (double) super.anInt5910;
			this.aDouble8 = super.anInt5907;
			this.aDouble2 = local19 * (double) this.anInt3623 / local28 + (double) super.anInt5908;
		}
		local13 = this.anInt3634 + 1 - arg1;
		this.aDouble3 = ((double) arg0 - this.aDouble7) / local13;
		this.aDouble9 = ((double) arg2 - this.aDouble2) / local13;
		this.aDouble6 = Math.sqrt(this.aDouble9 * this.aDouble9 + this.aDouble3 * this.aDouble3);
		if (this.anInt3639 == -1) {
			this.aDouble5 = ((double) arg3 - this.aDouble8) / local13;
		} else {
			if (!this.aBoolean235) {
				this.aDouble5 = -this.aDouble6 * Math.tan((double) this.anInt3639 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg3 - local13 * this.aDouble5 - this.aDouble8) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!e;ILclient!id;)V")
	private void method3438(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class45 arg1) {
		@Pc(6) Class115[] local6 = arg1.method1787();
		@Pc(9) Class101[] local9 = arg1.method1776();
		if ((this.aClass1_Sub7_3 == null || this.aClass1_Sub7_3.aBoolean319) && (local6 != null || local9 != null)) {
			this.aClass1_Sub7_3 = new Class1_Sub7(Static153.anInt3257);
		}
		if (this.aClass1_Sub7_3 != null) {
			this.aClass1_Sub7_3.method4319(arg0, (long) Static153.anInt3257, local6, local9);
			this.aClass1_Sub7_3.method4323(super.aByte64, super.aShort83, super.aShort80, super.aShort82, super.aShort81);
		}
	}

	@OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass1_Sub7_3 != null) {
			this.aClass1_Sub7_3.method4328();
		}
	}
}
