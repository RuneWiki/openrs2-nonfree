import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
	private int anInt226;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!aj", name = "w", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
	public int anInt234;

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "D")
	public double aDouble10;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "D")
	public double aDouble11;

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "D")
	private double aDouble12;

	@OriginalMember(owner = "client!aj", name = "T", descriptor = "D")
	private double aDouble13;

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "D")
	private double aDouble14;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
	private int anInt230 = 0;

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
	private int anInt233 = -32768;

	@OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
	private int anInt247 = 0;

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "I")
	private final int anInt229;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
	private final int anInt241;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
	public final int anInt240;

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
	public final int anInt242;

	@OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
	public final int anInt246;

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
	private final int anInt236;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
	private final int anInt228;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
	private final int anInt231;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
	public final int anInt237;

	@OriginalMember(owner = "client!aj", name = "bb", descriptor = "I")
	private final int anInt248;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	public final int anInt243;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "Lclient!wb;")
	private final Class2_Sub1_Sub25 aClass2_Sub1_Sub25_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt229 = arg7;
		this.anInt241 = arg0;
		this.anInt240 = arg9;
		this.anInt242 = arg10;
		this.anInt246 = arg5;
		this.anInt236 = arg3;
		this.anInt228 = arg2;
		this.anInt231 = arg8;
		this.anInt237 = arg1;
		this.aBoolean13 = false;
		this.anInt248 = arg4;
		this.anInt243 = arg6;
		@Pc(55) int local55 = Static99.method1597(this.anInt241).anInt4000;
		if (local55 == -1) {
			this.aClass2_Sub1_Sub25_1 = null;
		} else {
			this.aClass2_Sub1_Sub25_1 = Static90.method27(local55);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class7_Sub7 local3 = this.method170();
		if (local3 != null) {
			local3.method3143(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt233 = local3.method3148();
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)Lclient!ug;")
	private Class7_Sub7 method170() {
		@Pc(8) Class2_Sub1_Sub23 local8 = Static99.method1597(this.anInt241);
		@Pc(14) Class7_Sub7 local14 = local8.method2759(this.anInt247);
		if (local14 == null) {
			return null;
		} else {
			local14.method3167(this.anInt226);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
	public void method171(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean13) {
			local12 = arg0 - this.anInt228;
			@Pc(19) double local19 = (double) (arg3 - this.anInt236);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble11 = local12 * (double) this.anInt231 / local28 + (double) this.anInt228;
			this.aDouble8 = this.anInt248;
			this.aDouble10 = (double) this.anInt231 * local19 / local28 + (double) this.anInt236;
		}
		local12 = this.anInt243 + 1 - arg1;
		this.aDouble7 = ((double) arg3 - this.aDouble10) / local12;
		this.aDouble12 = ((double) arg0 - this.aDouble11) / local12;
		this.aDouble9 = Math.sqrt(this.aDouble12 * this.aDouble12 + this.aDouble7 * this.aDouble7);
		if (!this.aBoolean13) {
			this.aDouble13 = -this.aDouble9 * Math.tan((double) this.anInt229 * 0.02454369D);
		}
		this.aDouble14 = ((double) arg2 - this.aDouble8 - this.aDouble13 * local12) * 2.0D / (local12 * local12);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		return this.anInt233;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZI)V")
	public void method172(@OriginalArg(1) int arg0) {
		this.aDouble10 += (double) arg0 * this.aDouble7;
		this.aDouble11 += (double) arg0 * this.aDouble12;
		this.aBoolean13 = true;
		this.aDouble8 += (double) arg0 * this.aDouble14 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble13;
		this.aDouble13 += this.aDouble14 * (double) arg0;
		this.anInt234 = (int) (Math.atan2(this.aDouble12, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt226 = (int) (Math.atan2(this.aDouble13, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub25_1 == null) {
			return;
		}
		this.anInt230 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub1_Sub25_1.anIntArray389[this.anInt247] >= this.anInt230) {
						return;
					}
					this.anInt230 -= this.aClass2_Sub1_Sub25_1.anIntArray389[this.anInt247];
					this.anInt247++;
				} while (this.aClass2_Sub1_Sub25_1.anIntArray392.length > this.anInt247);
				this.anInt247 -= this.aClass2_Sub1_Sub25_1.anInt4368;
			} while (this.anInt247 >= 0 && this.anInt247 < this.aClass2_Sub1_Sub25_1.anIntArray392.length);
			this.anInt247 = 0;
		}
	}
}
