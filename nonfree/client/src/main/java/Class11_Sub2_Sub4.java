import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class11_Sub2_Sub4 extends Class11_Sub2 {

	@OriginalMember(owner = "client!or", name = "lb", descriptor = "Lclient!bn;")
	public static final Class18 lb = new Class18(67, 7);

	@OriginalMember(owner = "client!or", name = "B", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!or", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!or", name = "K", descriptor = "Lclient!dj;")
	private Class32_Sub2 aClass32_Sub2_3;

	@OriginalMember(owner = "client!or", name = "P", descriptor = "I")
	private int anInt4702;

	@OriginalMember(owner = "client!or", name = "R", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!or", name = "T", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!or", name = "V", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!or", name = "ab", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!or", name = "cb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!or", name = "gb", descriptor = "I")
	private int anInt4712;

	@OriginalMember(owner = "client!or", name = "hb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!or", name = "E", descriptor = "I")
	private int anInt4693 = 0;

	@OriginalMember(owner = "client!or", name = "D", descriptor = "I")
	private int anInt4692 = -32768;

	@OriginalMember(owner = "client!or", name = "M", descriptor = "I")
	private int anInt4699 = -1;

	@OriginalMember(owner = "client!or", name = "W", descriptor = "Z")
	private boolean aBoolean356 = false;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "I")
	private int anInt4704 = 0;

	@OriginalMember(owner = "client!or", name = "L", descriptor = "I")
	private final int anInt4698;

	@OriginalMember(owner = "client!or", name = "jb", descriptor = "I")
	private final int anInt4714;

	@OriginalMember(owner = "client!or", name = "G", descriptor = "I")
	public final int anInt4695;

	@OriginalMember(owner = "client!or", name = "db", descriptor = "I")
	public final int anInt4709;

	@OriginalMember(owner = "client!or", name = "N", descriptor = "I")
	public final int anInt4700;

	@OriginalMember(owner = "client!or", name = "X", descriptor = "I")
	private final int anInt4706;

	@OriginalMember(owner = "client!or", name = "C", descriptor = "I")
	public final int anInt4691;

	@OriginalMember(owner = "client!or", name = "bb", descriptor = "Lclient!tp;")
	private final Class199 aClass199_3;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class11_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4698 = arg7;
		this.anInt4714 = arg0;
		this.anInt4695 = arg9;
		this.anInt4709 = arg5;
		this.anInt4700 = arg6;
		this.anInt4706 = arg8;
		this.aBoolean356 = false;
		this.anInt4691 = arg10;
		@Pc(64) int local64 = Static345.method5752(this.anInt4714).anInt3267;
		if (local64 == -1) {
			this.aClass199_3 = null;
		} else {
			this.aClass199_3 = Static161.method3066(local64);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V")
	public void method4318() {
		if (this.aClass32_Sub2_3 != null) {
			this.aClass32_Sub2_3.method1404();
		}
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		@Pc(9) Class3 local9 = this.method4322(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class129 local15 = arg0.method4634();
		local15.method5788(this.anInt4702);
		local15.method5783(this.anInt4712);
		local15.method5776((int) this.aDouble2, (int) this.aDouble7, (int) this.aDouble5);
		this.anInt4692 = local9.method1245();
		this.method4321(local9, arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)V")
	public void method4319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean356) {
			local13 = arg3 - super.anInt6729;
			@Pc(20) double local20 = (double) (arg1 - super.anInt6726);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble5 = (double) this.anInt4706 * local20 / local29 + (double) super.anInt6726;
			this.aDouble2 = (double) super.anInt6729 + local13 * (double) this.anInt4706 / local29;
			this.aDouble7 = super.anInt6727;
		}
		local13 = this.anInt4700 + 1 - arg0;
		this.aDouble6 = ((double) arg1 - this.aDouble5) / local13;
		this.aDouble8 = ((double) arg3 - this.aDouble2) / local13;
		this.aDouble3 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble6 * this.aDouble6);
		if (this.anInt4698 == -1) {
			this.aDouble4 = ((double) arg2 - this.aDouble7) / local13;
		} else {
			if (!this.aBoolean356) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt4698 * 0.02454369D);
			}
			this.aDouble9 = ((double) arg2 - this.aDouble7 - local13 * this.aDouble4) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public void method4320(@OriginalArg(0) int arg0) {
		this.aDouble5 += (double) arg0 * this.aDouble6;
		this.aDouble2 += this.aDouble8 * (double) arg0;
		if (this.anInt4698 == -1) {
			this.aDouble7 += this.aDouble4 * (double) arg0;
		} else {
			this.aDouble7 += (double) arg0 * this.aDouble4 + (double) arg0 * 0.5D * this.aDouble9 * (double) arg0;
			this.aDouble4 += (double) arg0 * this.aDouble9;
		}
		this.aBoolean356 = true;
		this.anInt4712 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4702 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass199_3 == null) {
			return;
		}
		this.anInt4704 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass199_3.anIntArray466[this.anInt4693] >= this.anInt4704) {
						return;
					}
					this.anInt4704 -= this.aClass199_3.anIntArray466[this.anInt4693];
					this.anInt4693++;
					if (this.aClass199_3.anIntArray467.length <= this.anInt4693) {
						this.anInt4693 -= this.aClass199_3.anInt6009;
						if (this.anInt4693 < 0 || this.anInt4693 >= this.aClass199_3.anIntArray467.length) {
							this.anInt4693 = 0;
						}
					}
					this.anInt4699 = this.anInt4693 + 1;
				} while (this.aClass199_3.anIntArray467.length > this.anInt4699);
				this.anInt4699 -= this.aClass199_3.anInt6009;
			} while (this.anInt4699 >= 0 && this.aClass199_3.anIntArray467.length > this.anInt4699);
			this.anInt4699 = -1;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!bi;ILclient!fp;)V")
	private void method4321(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class63 arg1) {
		@Pc(6) Class6[] local6 = arg0.method1240();
		@Pc(14) Class107[] local14 = arg0.method1246();
		if ((this.aClass32_Sub2_3 == null || this.aClass32_Sub2_3.aBoolean105) && (local6 != null || local14 != null)) {
			this.aClass32_Sub2_3 = new Class32_Sub2(Static51.anInt1301);
		}
		if (this.aClass32_Sub2_3 != null) {
			this.aClass32_Sub2_3.method1399(arg1, (long) Static51.anInt1301, local6, local14);
			this.aClass32_Sub2_3.method1400(super.aByte79, super.aShort94, super.aShort92, super.aShort93, super.aShort91);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	private Class3 method4322(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class109 local20 = Static345.method5752(this.anInt4714);
		return local20.method2993(arg1, this.anInt4699, this.anInt4704, this.anInt4693, arg0);
	}

	@OriginalMember(owner = "client!or", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass32_Sub2_3 != null) {
			this.aClass32_Sub2_3.method1404();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		@Pc(9) Class3 local9 = this.method4322(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class129 local21 = arg0.method4634();
		local21.method5788(this.anInt4702);
		local21.method5783(this.anInt4712);
		local21.method5776((int) this.aDouble2, (int) this.aDouble7, (int) this.aDouble5);
		if (this.aClass32_Sub2_3 == null) {
			local9.method1242(local21, null, 0);
		} else {
			@Pc(54) Class26 local54 = this.aClass32_Sub2_3.method1403();
			arg0.method4655(local9, local54, local21, null);
		}
		this.anInt4692 = local9.method1245();
		this.method4321(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(B)V")
	@Override
	public void method5879() {
		super.aShort93 = super.aShort91 = (short) (this.aDouble5 / 128.0D);
		super.aShort94 = super.aShort92 = (short) (this.aDouble2 / 128.0D);
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(B)I")
	@Override
	public int method5877() {
		return this.anInt4692;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}
}
