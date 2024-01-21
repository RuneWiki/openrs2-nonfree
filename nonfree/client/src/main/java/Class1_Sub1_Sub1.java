import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	private int anInt30;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
	private int anInt32;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	private int anInt18 = -403;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Z")
	private boolean aBoolean8 = true;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!hc;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt19;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	private int anInt20;

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	private int anInt21;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	private int anInt22;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public int anInt24;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	public int anInt25;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	private int anInt26;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	public int anInt28;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass15_1 = Class15.aClass15Array1[arg4];
			this.anInt19 = arg6;
			this.anInt20 = arg0;
			this.anInt21 = arg10;
			this.anInt22 = arg5;
			this.anInt24 = arg8;
			this.anInt25 = arg2;
			this.anInt26 = arg9;
			this.anInt27 = arg3;
			this.anInt28 = arg7;
			this.anInt23 = arg11;
			this.aBoolean10 = false;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("67704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZ)V")
	public void method19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean10) {
				local8 = arg3 - this.anInt20;
				@Pc(14) double local14 = (double) (arg1 - this.anInt21);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt20 + local8 * (double) this.anInt27 / local23;
				this.aDouble2 = (double) this.anInt21 + local14 * (double) this.anInt27 / local23;
				this.aDouble3 = this.anInt22;
			}
			local8 = this.anInt25 + 1 - arg2;
			this.aDouble4 = ((double) arg3 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local8;
			if (!arg4) {
				this.aBoolean9 = !this.aBoolean9;
			}
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean10) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt26 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("8578, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	public void method20(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean10 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt29 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt30 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass15_1.aClass13_1 != null) {
				this.anInt32 += arg0;
				while (this.anInt32 > this.aClass15_1.aClass13_1.anIntArray132[this.anInt31]) {
					this.anInt32 -= this.aClass15_1.aClass13_1.anIntArray132[this.anInt31] + 1;
					this.anInt31++;
					if (this.anInt31 >= this.aClass15_1.aClass13_1.anInt332) {
						this.anInt31 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("37072, " + -877 + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub1 method513() {
		try {
			@Pc(13) Class1_Sub3_Sub1 local13 = this.aClass15_1.method292();
			@Pc(29) Class1_Sub3_Sub1 local29 = new Class1_Sub3_Sub1(-428, true, local13, true, false, !this.aClass15_1.aBoolean102);
			if (this.aClass15_1.aClass13_1 != null) {
				local29.method206();
				local29.method207(this.aClass15_1.aClass13_1.anIntArray130[this.anInt31]);
				local29.anIntArrayArray8 = null;
				local29.anIntArrayArray7 = null;
			}
			local29.method211(this.anInt30);
			local29.method216(64, 850, -30, -50, -30, true);
			return local29;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("78331, " + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
