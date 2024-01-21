import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QPFVLDSR")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!QPFVLDSR", name = "q", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!QPFVLDSR", name = "r", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!QPFVLDSR", name = "s", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!QPFVLDSR", name = "x", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!QPFVLDSR", name = "y", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!QPFVLDSR", name = "z", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!QPFVLDSR", name = "A", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!QPFVLDSR", name = "B", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!QPFVLDSR", name = "C", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!QPFVLDSR", name = "D", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!QPFVLDSR", name = "E", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!QPFVLDSR", name = "F", descriptor = "I")
	private int anInt679;

	@OriginalMember(owner = "client!QPFVLDSR", name = "v", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!QPFVLDSR", name = "w", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!QPFVLDSR", name = "G", descriptor = "Lclient!BRGDZOWQ;")
	private Class4 aClass4_2;

	@OriginalMember(owner = "client!QPFVLDSR", name = "H", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!QPFVLDSR", name = "I", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!QPFVLDSR", name = "J", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!QPFVLDSR", name = "K", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!QPFVLDSR", name = "t", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!QPFVLDSR", name = "u", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!QPFVLDSR", name = "n", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!QPFVLDSR", name = "o", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!QPFVLDSR", name = "p", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!QPFVLDSR", name = "L", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!QPFVLDSR", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass4_2 = Class4.aClass4Array1[arg0];
			this.anInt680 = arg8;
			this.anInt681 = arg1;
			this.anInt682 = arg3;
			this.anInt683 = arg2;
			this.anInt676 = arg11;
			this.anInt677 = arg9;
			this.anInt671 = arg7;
			this.anInt672 = arg10;
			this.anInt673 = arg5;
			this.anInt684 = arg6;
			this.aBoolean187 = false;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("88499, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPFVLDSR", name = "a", descriptor = "(I)Lclient!LFTMDGKK;")
	@Override
	protected Class1_Sub1_Sub1_Sub4 method448() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub4 local3 = this.aClass4_2.method34();
			if (local3 == null) {
				return null;
			}
			@Pc(15) int local15 = -1;
			if (this.aClass4_2.aClass21_1 != null) {
				local15 = this.aClass4_2.aClass21_1.anIntArray68[this.anInt678];
			}
			@Pc(38) Class1_Sub1_Sub1_Sub4 local38 = new Class1_Sub1_Sub1_Sub4(Class6.method44(local15), true, local3, false, false);
			if (local15 != -1) {
				local38.method309();
				local38.method310(local15);
				local38.anIntArrayArray9 = null;
				local38.anIntArrayArray8 = null;
			}
			if (this.aClass4_2.anInt118 != 128 || this.aClass4_2.anInt119 != 128) {
				local38.method318(this.aClass4_2.anInt119, this.aClass4_2.anInt118, this.aClass4_2.anInt118);
			}
			local38.method314(this.anInt675);
			local38.method319(this.aClass4_2.anInt121 + 64, this.aClass4_2.anInt122 + 850, -30, -50, -30, true);
			return local38;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("51944, " + 0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPFVLDSR", name = "a", descriptor = "(ZI)V")
	public void method449(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean187 = true;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble6 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble1 * (double) arg0;
			this.anInt674 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt675 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass4_2.aClass21_1 != null) {
				this.anInt679 += arg0;
				while (this.anInt679 > this.aClass4_2.aClass21_1.method279(this.anInt678)) {
					this.anInt679 -= this.aClass4_2.aClass21_1.method279(this.anInt678) + 1;
					this.anInt678++;
					if (this.anInt678 >= this.aClass4_2.aClass21_1.anInt390) {
						this.anInt678 = 0;
					}
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("21568, " + true + ", " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QPFVLDSR", name = "a", descriptor = "(IIIBI)V")
	public void method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean187) {
				local8 = arg1 - this.anInt681;
				@Pc(14) double local14 = (double) (arg0 - this.anInt682);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble2 = (double) this.anInt681 + local8 * (double) this.anInt672 / local23;
				this.aDouble3 = (double) this.anInt682 + local14 * (double) this.anInt672 / local23;
				this.aDouble4 = this.anInt683;
			}
			local8 = this.anInt677 + 1 - arg2;
			@Pc(67) boolean local67 = false;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble6 = ((double) arg0 - this.aDouble3) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean187) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt671 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg4 - this.aDouble4 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("2654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}
}
