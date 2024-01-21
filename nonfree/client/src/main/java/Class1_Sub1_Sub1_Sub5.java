import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TCHKSJJL")
public final class Class1_Sub1_Sub1_Sub5 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!TCHKSJJL", name = "q", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!TCHKSJJL", name = "r", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!TCHKSJJL", name = "s", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!TCHKSJJL", name = "t", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!TCHKSJJL", name = "u", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!TCHKSJJL", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!TCHKSJJL", name = "x", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!TCHKSJJL", name = "y", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!TCHKSJJL", name = "z", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!TCHKSJJL", name = "A", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!TCHKSJJL", name = "B", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!TCHKSJJL", name = "J", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!TCHKSJJL", name = "w", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!TCHKSJJL", name = "D", descriptor = "I")
	private int anInt641 = 17935;

	@OriginalMember(owner = "client!TCHKSJJL", name = "I", descriptor = "Z")
	private boolean aBoolean140 = true;

	@OriginalMember(owner = "client!TCHKSJJL", name = "C", descriptor = "Lclient!JEPDVFCL;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!TCHKSJJL", name = "p", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!TCHKSJJL", name = "E", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!TCHKSJJL", name = "F", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!TCHKSJJL", name = "G", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!TCHKSJJL", name = "K", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!TCHKSJJL", name = "L", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!TCHKSJJL", name = "m", descriptor = "I")
	private int anInt633;

	@OriginalMember(owner = "client!TCHKSJJL", name = "n", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!TCHKSJJL", name = "o", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!TCHKSJJL", name = "H", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!TCHKSJJL", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass18_1 = Class18.aClass18Array1[arg3];
			this.anInt636 = arg1;
			this.anInt642 = arg6;
			this.anInt643 = arg4;
			this.anInt644 = arg0;
			this.anInt646 = arg11;
			this.anInt647 = arg2;
			this.anInt633 = arg8;
			this.anInt634 = arg5;
			this.anInt635 = arg10;
			this.anInt645 = arg9;
			this.aBoolean139 = false;
			if (arg7 != 0) {
				throw new NullPointerException();
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("88789, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TCHKSJJL", name = "a", descriptor = "(IIIII)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(17) double local17;
			if (!this.aBoolean139) {
				local17 = arg0 - this.anInt642;
				@Pc(23) double local23 = (double) (arg1 - this.anInt643);
				@Pc(32) double local32 = Math.sqrt(local17 * local17 + local23 * local23);
				this.aDouble5 = (double) this.anInt642 + local17 * (double) this.anInt634 / local32;
				this.aDouble6 = (double) this.anInt643 + local23 * (double) this.anInt634 / local32;
				this.aDouble7 = this.anInt644;
			}
			local17 = this.anInt647 + 1 - arg3;
			this.aDouble1 = ((double) arg0 - this.aDouble5) / local17;
			this.aDouble2 = ((double) arg1 - this.aDouble6) / local17;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean139) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt633 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble7 - this.aDouble4 * local17) * 2.0D / (local17 * local17);
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("2529, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TCHKSJJL", name = "a", descriptor = "(IB)V")
	public void method452(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean139 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt639 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt640 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass18_1.aClass46_2 != null) {
				this.anInt638 += arg0;
				while (this.anInt638 > this.aClass18_1.aClass46_2.method550(this.anInt637)) {
					this.anInt638 -= this.aClass18_1.aClass46_2.method550(this.anInt637) + 1;
					this.anInt637++;
					if (this.anInt637 >= this.aClass18_1.aClass46_2.anInt771) {
						this.anInt637 = 0;
					}
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("88790, " + arg0 + ", " + 9 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TCHKSJJL", name = "a", descriptor = "(Z)Lclient!GCSAWSJV;")
	@Override
	protected Class1_Sub1_Sub1_Sub2 method555() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub2 local3 = this.aClass18_1.method234();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass18_1.aClass46_2 != null) {
				local9 = this.aClass18_1.aClass46_2.anIntArray198[this.anInt637];
			}
			@Pc(33) Class1_Sub1_Sub1_Sub2 local33 = new Class1_Sub1_Sub1_Sub2(0, local3, true, Class31.method388(this.aBoolean140, local9), false);
			if (local9 != -1) {
				local33.method150();
				local33.method151(local9);
				local33.anIntArrayArray5 = null;
				local33.anIntArrayArray4 = null;
			}
			if (this.aClass18_1.anInt317 != 128 || this.aClass18_1.anInt318 != 128) {
				local33.method159(this.aClass18_1.anInt317, this.aClass18_1.anInt317, this.aClass18_1.anInt318);
			}
			local33.method155(this.anInt640);
			local33.method160(this.aClass18_1.anInt320 + 64, this.aClass18_1.anInt321 + 850, -30, -50, -30, true);
			return local33;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("37457, " + false + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}
