import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KJLDUSCX")
public final class Class2_Sub1_Sub2_Sub2 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!KJLDUSCX", name = "o", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!KJLDUSCX", name = "p", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!KJLDUSCX", name = "q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!KJLDUSCX", name = "r", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!KJLDUSCX", name = "s", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!KJLDUSCX", name = "t", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!KJLDUSCX", name = "u", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!KJLDUSCX", name = "v", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!KJLDUSCX", name = "G", descriptor = "I")
	public int anInt392;

	@OriginalMember(owner = "client!KJLDUSCX", name = "H", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!KJLDUSCX", name = "I", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!KJLDUSCX", name = "J", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!KJLDUSCX", name = "n", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!KJLDUSCX", name = "B", descriptor = "Z")
	private boolean aBoolean92 = false;

	@OriginalMember(owner = "client!KJLDUSCX", name = "x", descriptor = "Lclient!NGIGHQOG;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!KJLDUSCX", name = "w", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!KJLDUSCX", name = "C", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!KJLDUSCX", name = "D", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!KJLDUSCX", name = "E", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!KJLDUSCX", name = "l", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!KJLDUSCX", name = "m", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!KJLDUSCX", name = "y", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!KJLDUSCX", name = "z", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!KJLDUSCX", name = "A", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!KJLDUSCX", name = "F", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!KJLDUSCX", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class2_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass27_1 = Class27.aClass27Array1[arg10];
			this.anInt384 = arg5;
			this.anInt388 = arg8;
			this.anInt389 = arg3;
			this.anInt390 = arg9;
			this.anInt382 = arg0;
			@Pc(31) int local31 = 93 / arg11;
			this.anInt383 = arg7;
			this.anInt385 = arg6;
			this.anInt386 = arg4;
			this.anInt387 = arg2;
			this.anInt391 = arg1;
			this.aBoolean91 = false;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("17213, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJLDUSCX", name = "a", descriptor = "(ZI)V")
	public void method242(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean91 = true;
			this.aDouble5 += this.aDouble1 * (double) arg1;
			if (!arg0) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
			this.aDouble6 += this.aDouble2 * (double) arg1;
			this.aDouble7 += this.aDouble4 * (double) arg1 + this.aDouble8 * 0.5D * (double) arg1 * (double) arg1;
			this.aDouble4 += this.aDouble8 * (double) arg1;
			this.anInt392 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt393 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass27_1.aClass49_1 != null) {
				this.anInt395 += arg1;
				while (this.anInt395 > this.aClass27_1.aClass49_1.method571(this.anInt394)) {
					this.anInt395 -= this.aClass27_1.aClass49_1.method571(this.anInt394) + 1;
					this.anInt394++;
					if (this.anInt394 >= this.aClass27_1.aClass49_1.anInt767) {
						this.anInt394 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("86964, " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJLDUSCX", name = "a", descriptor = "(B)Lclient!SNMMQNPZ;")
	@Override
	protected Class2_Sub1_Sub2_Sub5 method561(@OriginalArg(0) byte arg0) {
		try {
			@Pc(14) Class2_Sub1_Sub2_Sub5 local14 = this.aClass27_1.method291();
			if (local14 == null) {
				return null;
			}
			@Pc(20) int local20 = -1;
			if (this.aClass27_1.aClass49_1 != null) {
				local20 = this.aClass27_1.aClass49_1.anIntArray206[this.anInt394];
			}
			@Pc(43) Class2_Sub1_Sub2_Sub5 local43 = new Class2_Sub1_Sub2_Sub5(local14, 707, false, true, Class29.method296(local20));
			if (local20 != -1) {
				local43.method391();
				local43.method392(local20);
				local43.anIntArrayArray13 = null;
				local43.anIntArrayArray12 = null;
			}
			if (this.aClass27_1.anInt484 != 128 || this.aClass27_1.anInt485 != 128) {
				local43.method400(this.aClass27_1.anInt484, this.aClass27_1.anInt484, this.aClass27_1.anInt485);
			}
			local43.method396(this.anInt393);
			local43.method401(this.aClass27_1.anInt487 + 64, this.aClass27_1.anInt488 + 850, -30, -50, -30, true);
			return local43;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("7007, " + 5 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KJLDUSCX", name = "a", descriptor = "(IIIII)V")
	public void method243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean91) {
				local8 = arg1 - this.anInt388;
				@Pc(14) double local14 = (double) (arg3 - this.anInt389);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble5 = (double) this.anInt388 + local8 * (double) this.anInt386 / local23;
				this.aDouble6 = (double) this.anInt389 + local14 * (double) this.anInt386 / local23;
				this.aDouble7 = this.anInt390;
			}
			local8 = this.anInt383 + 1 - arg0;
			this.aDouble1 = ((double) arg1 - this.aDouble5) / local8;
			this.aDouble2 = ((double) arg3 - this.aDouble6) / local8;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean91) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt385 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble7 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("1336, " + arg0 + ", " + -426 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}
}
