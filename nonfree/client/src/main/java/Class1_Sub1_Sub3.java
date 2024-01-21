import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!z")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!z", name = "s", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!z", name = "t", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!z", name = "u", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!z", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!z", name = "w", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!z", name = "x", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!z", name = "y", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!z", name = "z", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!z", name = "A", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!z", name = "B", descriptor = "I")
	private int anInt797;

	@OriginalMember(owner = "client!z", name = "C", descriptor = "I")
	private int anInt798;

	@OriginalMember(owner = "client!z", name = "D", descriptor = "I")
	private int anInt799;

	@OriginalMember(owner = "client!z", name = "f", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!z", name = "r", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!z", name = "g", descriptor = "Lclient!gc;")
	private Class13 aClass13_2;

	@OriginalMember(owner = "client!z", name = "h", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!z", name = "i", descriptor = "I")
	private int anInt787;

	@OriginalMember(owner = "client!z", name = "j", descriptor = "I")
	private int anInt788;

	@OriginalMember(owner = "client!z", name = "k", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!z", name = "m", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!z", name = "n", descriptor = "I")
	public int anInt792;

	@OriginalMember(owner = "client!z", name = "o", descriptor = "I")
	private int anInt793;

	@OriginalMember(owner = "client!z", name = "p", descriptor = "I")
	private int anInt794;

	@OriginalMember(owner = "client!z", name = "q", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!z", name = "l", descriptor = "I")
	public int anInt790;

	@OriginalMember(owner = "client!z", name = "<init>", descriptor = "(IIIZIIIIIIII)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		this.aClass13_2 = Class13.aClass13Array1[arg6];
		this.anInt786 = arg0;
		this.anInt787 = arg2;
		if (!arg3) {
			for (@Pc(22) int local22 = 1; local22 > 0; local22++) {
			}
		}
		this.anInt788 = arg9;
		this.anInt789 = arg5;
		this.anInt791 = arg7;
		this.anInt792 = arg10;
		this.anInt793 = arg4;
		this.anInt794 = arg1;
		this.anInt795 = arg11;
		this.anInt790 = arg8;
		this.aBoolean138 = false;
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(IIIII)V")
	public void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 <= 0) {
			return;
		}
		@Pc(11) double local11;
		if (!this.aBoolean138) {
			local11 = arg2 - this.anInt787;
			@Pc(17) double local17 = (double) (arg0 - this.anInt788);
			@Pc(26) double local26 = Math.sqrt(local11 * local11 + local17 * local17);
			this.aDouble1 = (double) this.anInt787 + local11 * (double) this.anInt794 / local26;
			this.aDouble2 = (double) this.anInt788 + local17 * (double) this.anInt794 / local26;
			this.aDouble3 = this.anInt789;
		}
		local11 = this.anInt792 + 1 - arg4;
		this.aDouble4 = ((double) arg2 - this.aDouble1) / local11;
		this.aDouble5 = ((double) arg0 - this.aDouble2) / local11;
		this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
		if (!this.aBoolean138) {
			this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt793 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local11) * 2.0D / (local11 * local11);
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(II)V")
	public void method481(@OriginalArg(1) int arg0) {
		this.aBoolean138 = true;
		this.aDouble1 += this.aDouble4 * (double) arg0;
		this.aDouble2 += this.aDouble5 * (double) arg0;
		this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble7 += this.aDouble8 * (double) arg0;
		this.anInt796 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt797 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass13_2.aClass11_1 == null) {
			return;
		}
		this.anInt799 += arg0;
		while (this.anInt799 > this.aClass13_2.aClass11_1.anIntArray126[this.anInt798]) {
			this.anInt799 -= this.aClass13_2.aClass11_1.anIntArray126[this.anInt798] + 1;
			this.anInt798++;
			if (this.anInt798 >= this.aClass13_2.aClass11_1.anInt294) {
				this.anInt798 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!z", name = "a", descriptor = "(I)Lclient!db;")
	@Override
	public Class1_Sub3_Sub1 method479() {
		@Pc(3) Class1_Sub3_Sub1 local3 = this.aClass13_2.method245();
		@Pc(19) Class1_Sub3_Sub1 local19 = new Class1_Sub3_Sub1(true, !this.aClass13_2.aBoolean83, local3, 440, true, false);
		if (this.aClass13_2.aClass11_1 != null) {
			local19.method159();
			local19.method160(this.aClass13_2.aClass11_1.anIntArray124[this.anInt798]);
			local19.anIntArrayArray8 = null;
			local19.anIntArrayArray7 = null;
		}
		local19.method164(this.anInt797);
		local19.method169(64, 850, -30, -50, -30, true);
		return local19;
	}
}
