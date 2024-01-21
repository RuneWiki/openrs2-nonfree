import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private int anInt37;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private int anInt38;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	private int anInt39;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!kc;")
	private Class21 aClass21_1;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	private int anInt28;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt34;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public int anInt30;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass21_1 = Class21.aClass21Array1[arg7];
			this.anInt26 = arg0;
			this.anInt27 = arg1;
			this.anInt28 = arg11;
			this.anInt29 = arg4;
			if (arg8 != 0) {
				throw new NullPointerException();
			}
			this.anInt31 = arg10;
			this.anInt32 = arg2;
			this.anInt33 = arg5;
			this.anInt34 = arg3;
			this.anInt35 = arg9;
			this.anInt30 = arg6;
			this.aBoolean5 = false;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("64021, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public void method19(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean5) {
				local8 = arg3 - this.anInt27;
				@Pc(14) double local14 = (double) (arg0 - this.anInt28);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt27 + local8 * (double) this.anInt34 / local23;
				this.aDouble2 = (double) this.anInt28 + local14 * (double) this.anInt34 / local23;
				this.aDouble3 = this.anInt29;
			}
			local8 = this.anInt32 + 1 - arg2;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg0 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean5) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt33 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("69057, " + arg0 + ", " + -822 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public void method20(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean5 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt36 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt37 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass21_1.aClass19_1 != null) {
				this.anInt39 += arg0;
				while (this.anInt39 > this.aClass21_1.aClass19_1.anIntArray188[this.anInt38]) {
					this.anInt39 -= this.aClass21_1.aClass19_1.anIntArray188[this.anInt38] + 1;
					this.anInt38++;
					if (this.anInt38 >= this.aClass21_1.aClass19_1.anInt521) {
						this.anInt38 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("18099, " + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method548() {
		try {
			@Pc(3) Class1_Sub3_Sub1 local3 = this.aClass21_1.method390();
			@Pc(18) Class1_Sub3_Sub1 local18 = new Class1_Sub3_Sub1(false, (byte) 8, true, !this.aClass21_1.aBoolean148, local3);
			if (this.aClass21_1.aClass19_1 != null) {
				local18.method218();
				local18.method219(this.aClass21_1.aClass19_1.anIntArray186[this.anInt38]);
				local18.anIntArrayArray7 = null;
				local18.anIntArrayArray6 = null;
			}
			local18.method223(this.anInt37);
			local18.method228(this.aClass21_1.anInt551 + 64, this.aClass21_1.anInt552 + 850, -30, -50, -30, true);
			return local18;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("69251, " + 7 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
