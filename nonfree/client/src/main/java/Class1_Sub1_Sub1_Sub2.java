import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GVHVJOWK")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!GVHVJOWK", name = "p", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!GVHVJOWK", name = "r", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!GVHVJOWK", name = "s", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!GVHVJOWK", name = "t", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!GVHVJOWK", name = "u", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!GVHVJOWK", name = "v", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!GVHVJOWK", name = "w", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!GVHVJOWK", name = "x", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!GVHVJOWK", name = "F", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!GVHVJOWK", name = "G", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!GVHVJOWK", name = "J", descriptor = "I")
	private int anInt168;

	@OriginalMember(owner = "client!GVHVJOWK", name = "K", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!GVHVJOWK", name = "q", descriptor = "I")
	private int anInt159 = 5;

	@OriginalMember(owner = "client!GVHVJOWK", name = "E", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!GVHVJOWK", name = "H", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!GVHVJOWK", name = "I", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!GVHVJOWK", name = "L", descriptor = "Lclient!MKJLFPRH;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!GVHVJOWK", name = "M", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!GVHVJOWK", name = "A", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!GVHVJOWK", name = "B", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!GVHVJOWK", name = "C", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!GVHVJOWK", name = "y", descriptor = "I")
	public int anInt160;

	@OriginalMember(owner = "client!GVHVJOWK", name = "z", descriptor = "I")
	public int anInt161;

	@OriginalMember(owner = "client!GVHVJOWK", name = "m", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!GVHVJOWK", name = "n", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!GVHVJOWK", name = "o", descriptor = "I")
	public int anInt158;

	@OriginalMember(owner = "client!GVHVJOWK", name = "D", descriptor = "I")
	public int anInt165;

	@OriginalMember(owner = "client!GVHVJOWK", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass25_2 = Class25.aClass25Array1[arg4];
			this.anInt170 = arg5;
			this.anInt162 = arg11;
			this.anInt163 = arg0;
			this.anInt164 = arg10;
			this.anInt160 = arg6;
			this.anInt161 = arg3;
			this.anInt156 = arg9;
			this.anInt157 = arg2;
			this.anInt158 = arg8;
			this.anInt165 = arg1;
			this.aBoolean47 = false;
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("14007, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GVHVJOWK", name = "a", descriptor = "(I)Lclient!JLNSJQDR;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method509(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.aClass25_2.method334();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass25_2.aClass29_1 != null) {
				local9 = this.aClass25_2.aClass29_1.anIntArray140[this.anInt168];
			}
			@Pc(32) Class1_Sub1_Sub1_Sub4 local32 = new Class1_Sub1_Sub1_Sub4(Class42.method479(local9), false, true, true, local3);
			if (local9 != -1) {
				local32.method246();
				local32.method247(local9);
				local32.anIntArrayArray11 = null;
				local32.anIntArrayArray10 = null;
			}
			if (this.aClass25_2.anInt475 != 128 || this.aClass25_2.anInt476 != 128) {
				local32.method255(this.aClass25_2.anInt475, this.aClass25_2.anInt476, this.aClass25_2.anInt475);
			}
			local32.method251(983, this.anInt167);
			if (arg0 < this.anInt159 || arg0 > this.anInt159) {
				for (@Pc(85) int local85 = 1; local85 > 0; local85++) {
				}
			}
			local32.method256(this.aClass25_2.anInt478 + 64, this.aClass25_2.anInt479 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("17687, " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GVHVJOWK", name = "a", descriptor = "(IIIII)V")
	public void method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(11) double local11;
			if (!this.aBoolean47) {
				local11 = arg0 - this.anInt162;
				@Pc(17) double local17 = (double) (arg3 - this.anInt163);
				@Pc(26) double local26 = Math.sqrt(local11 * local11 + local17 * local17);
				this.aDouble6 = (double) this.anInt162 + local11 * (double) this.anInt157 / local26;
				this.aDouble7 = (double) this.anInt163 + local17 * (double) this.anInt157 / local26;
				this.aDouble8 = this.anInt164;
			}
			local11 = this.anInt161 + 1 - arg2;
			this.aDouble2 = ((double) arg0 - this.aDouble6) / local11;
			this.aDouble3 = ((double) arg3 - this.aDouble7) / local11;
			this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
			if (!this.aBoolean47) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt156 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg1 - this.aDouble8 - this.aDouble5 * local11) * 2.0D / (local11 * local11);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("16376, " + arg0 + ", " + arg1 + ", " + 464 + ", " + arg2 + ", " + arg3 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GVHVJOWK", name = "a", descriptor = "(II)V")
	public void method133(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean47 = true;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
			this.aDouble8 += this.aDouble5 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.anInt166 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
			this.anInt167 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 325.949D) & 0x7FF;
			if (this.aClass25_2.aClass29_1 != null) {
				this.anInt169 += arg0;
				while (this.anInt169 > this.aClass25_2.aClass29_1.method377(this.anInt168, this.aBoolean46)) {
					this.anInt169 -= this.aClass25_2.aClass29_1.method377(this.anInt168, this.aBoolean46) + 1;
					this.anInt168++;
					if (this.anInt168 >= this.aClass25_2.aClass29_1.anInt502) {
						this.anInt168 = 0;
					}
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("50627, " + 28508 + ", " + arg0 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}
}
