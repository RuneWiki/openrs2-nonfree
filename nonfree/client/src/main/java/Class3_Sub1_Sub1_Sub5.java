import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SCWHDOGN")
public final class Class3_Sub1_Sub1_Sub5 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!SCWHDOGN", name = "l", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!SCWHDOGN", name = "m", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!SCWHDOGN", name = "n", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!SCWHDOGN", name = "o", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!SCWHDOGN", name = "s", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!SCWHDOGN", name = "t", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!SCWHDOGN", name = "B", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!SCWHDOGN", name = "C", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!SCWHDOGN", name = "D", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!SCWHDOGN", name = "E", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!SCWHDOGN", name = "F", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!SCWHDOGN", name = "I", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!SCWHDOGN", name = "p", descriptor = "B")
	private byte aByte26 = 2;

	@OriginalMember(owner = "client!SCWHDOGN", name = "r", descriptor = "Z")
	private boolean aBoolean156 = false;

	@OriginalMember(owner = "client!SCWHDOGN", name = "G", descriptor = "I")
	private int anInt654 = -23378;

	@OriginalMember(owner = "client!SCWHDOGN", name = "H", descriptor = "I")
	private int anInt655 = -36281;

	@OriginalMember(owner = "client!SCWHDOGN", name = "J", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!SCWHDOGN", name = "A", descriptor = "Lclient!BYUDODIR;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!SCWHDOGN", name = "q", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!SCWHDOGN", name = "u", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!SCWHDOGN", name = "v", descriptor = "I")
	private int anInt647;

	@OriginalMember(owner = "client!SCWHDOGN", name = "w", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!SCWHDOGN", name = "y", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!SCWHDOGN", name = "z", descriptor = "I")
	public int anInt651;

	@OriginalMember(owner = "client!SCWHDOGN", name = "K", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!SCWHDOGN", name = "L", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!SCWHDOGN", name = "M", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!SCWHDOGN", name = "x", descriptor = "I")
	public int anInt649;

	@OriginalMember(owner = "client!SCWHDOGN", name = "<init>", descriptor = "(IIIIIIBIIIII)V")
	public Class3_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass2_2 = Class2.aClass2Array1[arg3];
			this.anInt643 = arg0;
			this.anInt646 = arg4;
			this.anInt647 = arg10;
			this.anInt648 = arg9;
			this.anInt650 = arg7;
			this.anInt651 = arg2;
			this.anInt656 = arg11;
			this.anInt657 = arg8;
			this.anInt658 = arg1;
			this.anInt649 = arg5;
			this.aBoolean156 = false;
			if (arg6 == this.aByte26) {
				@Pc(60) boolean local60 = false;
			} else {
				this.aBoolean157 = !this.aBoolean157;
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("72877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SCWHDOGN", name = "a", descriptor = "(BI)V")
	public void method423(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean156 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt652 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt653 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass2_2.aClass39_1 != null) {
				this.anInt645 += arg0;
				while (this.anInt645 > this.aClass2_2.aClass39_1.method492(this.anInt644)) {
					this.anInt645 -= this.aClass2_2.aClass39_1.method492(this.anInt644) + 1;
					this.anInt644++;
					if (this.anInt644 >= this.aClass2_2.aClass39_1.anInt723) {
						this.anInt644 = 0;
					}
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("70083, " + -41 + ", " + arg0 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SCWHDOGN", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	@Override
	protected Class3_Sub1_Sub1_Sub3 method506() {
		try {
			@Pc(3) Class3_Sub1_Sub1_Sub3 local3 = this.aClass2_2.method18();
			if (local3 == null) {
				return null;
			}
			@Pc(14) int local14 = -1;
			if (this.aClass2_2.aClass39_1 != null) {
				local14 = this.aClass2_2.aClass39_1.anIntArray183[this.anInt644];
			}
			@Pc(37) Class3_Sub1_Sub1_Sub3 local37 = new Class3_Sub1_Sub1_Sub3(Class47.method554(local14), local3, -575, false, true);
			if (local14 != -1) {
				local37.method328();
				local37.method329(local14);
				local37.anIntArrayArray9 = null;
				local37.anIntArrayArray8 = null;
			}
			if (this.aClass2_2.anInt29 != 128 || this.aClass2_2.anInt30 != 128) {
				local37.method337(this.aClass2_2.anInt30, this.aClass2_2.anInt29, this.aClass2_2.anInt29);
			}
			local37.method333(this.anInt653);
			local37.method338(this.aClass2_2.anInt32 + 64, this.aClass2_2.anInt33 + 850, -30, -50, -30, true);
			return local37;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("56710, " + false + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SCWHDOGN", name = "a", descriptor = "(IIIII)V")
	public void method424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean156) {
				local8 = arg3 - this.anInt646;
				@Pc(14) double local14 = (double) (arg2 - this.anInt647);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble5 = (double) this.anInt646 + local8 * (double) this.anInt657 / local23;
				this.aDouble6 = (double) this.anInt647 + local14 * (double) this.anInt657 / local23;
				this.aDouble7 = this.anInt648;
			}
			local8 = this.anInt651 + 1 - arg1;
			this.aDouble1 = ((double) arg3 - this.aDouble5) / local8;
			this.aDouble2 = ((double) arg2 - this.aDouble6) / local8;
			if (this.anInt655 != -36281) {
				for (@Pc(86) int local86 = 1; local86 > 0; local86++) {
				}
			}
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean156) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt656 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble7 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("56012, " + arg0 + ", " + arg1 + ", " + -36281 + ", " + arg2 + ", " + arg3 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
