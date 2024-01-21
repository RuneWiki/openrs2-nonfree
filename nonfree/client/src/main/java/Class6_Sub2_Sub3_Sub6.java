import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class6_Sub2_Sub3_Sub6 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!wb", name = "pb", descriptor = "I")
	private int anInt3216;

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!wb", name = "Cb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!wb", name = "Eb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!wb", name = "Fb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!wb", name = "Hb", descriptor = "I")
	public int anInt3222;

	@OriginalMember(owner = "client!wb", name = "Sb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!wb", name = "Xb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!wb", name = "kc", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!wb", name = "mc", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!wb", name = "Yb", descriptor = "I")
	private int anInt3234 = 0;

	@OriginalMember(owner = "client!wb", name = "vb", descriptor = "I")
	private int anInt3219 = 0;

	@OriginalMember(owner = "client!wb", name = "Gb", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!wb", name = "gc", descriptor = "I")
	public final int anInt3238;

	@OriginalMember(owner = "client!wb", name = "ac", descriptor = "I")
	private final int anInt3235;

	@OriginalMember(owner = "client!wb", name = "rb", descriptor = "I")
	private final int anInt3217;

	@OriginalMember(owner = "client!wb", name = "Lb", descriptor = "I")
	public final int anInt3225;

	@OriginalMember(owner = "client!wb", name = "hc", descriptor = "I")
	private final int anInt3239;

	@OriginalMember(owner = "client!wb", name = "Mb", descriptor = "I")
	private final int anInt3226;

	@OriginalMember(owner = "client!wb", name = "Ib", descriptor = "I")
	private final int anInt3223;

	@OriginalMember(owner = "client!wb", name = "Vb", descriptor = "I")
	public final int anInt3232;

	@OriginalMember(owner = "client!wb", name = "cc", descriptor = "I")
	public final int anInt3236;

	@OriginalMember(owner = "client!wb", name = "Bb", descriptor = "I")
	private final int anInt3221;

	@OriginalMember(owner = "client!wb", name = "ec", descriptor = "I")
	public final int anInt3237;

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "Lclient!tb;")
	private final Class6_Sub2_Sub13 aClass6_Sub2_Sub13_3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class6_Sub2_Sub3_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt3238 = arg5;
		this.anInt3235 = arg0;
		this.anInt3217 = arg3;
		this.anInt3225 = arg9;
		this.anInt3239 = arg8;
		this.anInt3226 = arg2;
		this.aBoolean165 = false;
		this.anInt3223 = arg4;
		this.anInt3232 = arg1;
		this.anInt3236 = arg6;
		this.anInt3221 = arg7;
		this.anInt3237 = arg10;
		@Pc(52) int local52 = Static98.method1873(this.anInt3235).anInt2066;
		if (local52 == -1) {
			this.aClass6_Sub2_Sub13_3 = null;
		} else {
			this.aClass6_Sub2_Sub13_3 = Static4.method1608(local52);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIZ)V")
	public void method2070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean165) {
			local12 = arg1 - this.anInt3226;
			@Pc(19) double local19 = (double) (arg3 - this.anInt3217);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble9 = this.anInt3223;
			this.aDouble6 = local19 * (double) this.anInt3239 / local28 + (double) this.anInt3217;
			this.aDouble8 = (double) this.anInt3226 + (double) this.anInt3239 * local12 / local28;
		}
		local12 = this.anInt3236 + 1 - arg0;
		this.aDouble3 = ((double) arg3 - this.aDouble6) / local12;
		this.aDouble4 = ((double) arg1 - this.aDouble8) / local12;
		this.aDouble5 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean165) {
			this.aDouble2 = -this.aDouble5 * Math.tan((double) this.anInt3221 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg2 - this.aDouble9 - local12 * this.aDouble2) * 2.0D / (local12 * local12);
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)Lclient!jb;")
	@Override
	public Class6_Sub2_Sub3_Sub3 method2063() {
		@Pc(4) Class6_Sub2_Sub8 local4 = Static98.method1873(this.anInt3235);
		@Pc(20) Class6_Sub2_Sub3_Sub3 local20 = local4.method1404(this.anInt3234);
		if (local20 == null) {
			return null;
		} else {
			local20.method955(this.anInt3216);
			return local20;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	public void method2072(@OriginalArg(0) int arg0) {
		this.aDouble9 += (double) arg0 * this.aDouble7 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble2;
		this.aDouble8 += (double) arg0 * this.aDouble4;
		this.aBoolean165 = true;
		this.aDouble6 += this.aDouble3 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble7;
		this.anInt3222 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt3216 = (int) (Math.atan2(this.aDouble2, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass6_Sub2_Sub13_3 == null) {
			return;
		}
		this.anInt3219 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3219 <= this.aClass6_Sub2_Sub13_3.anIntArray261[this.anInt3234]) {
						return;
					}
					this.anInt3219 -= this.aClass6_Sub2_Sub13_3.anIntArray261[this.anInt3234];
					this.anInt3234++;
				} while (this.aClass6_Sub2_Sub13_3.anIntArray264.length > this.anInt3234);
				this.anInt3234 -= this.aClass6_Sub2_Sub13_3.anInt2804;
			} while (this.anInt3234 >= 0 && this.aClass6_Sub2_Sub13_3.anIntArray264.length > this.anInt3234);
			this.anInt3234 = 0;
		}
	}
}
