import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YFDAHBXI")
public final class Class6_Sub2_Sub1_Sub6 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!YFDAHBXI", name = "o", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!YFDAHBXI", name = "p", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!YFDAHBXI", name = "q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!YFDAHBXI", name = "r", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!YFDAHBXI", name = "s", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!YFDAHBXI", name = "t", descriptor = "I")
	private int anInt779;

	@OriginalMember(owner = "client!YFDAHBXI", name = "C", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!YFDAHBXI", name = "D", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!YFDAHBXI", name = "E", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!YFDAHBXI", name = "J", descriptor = "I")
	private int anInt790;

	@OriginalMember(owner = "client!YFDAHBXI", name = "K", descriptor = "I")
	private int anInt791;

	@OriginalMember(owner = "client!YFDAHBXI", name = "M", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!YFDAHBXI", name = "n", descriptor = "I")
	private int anInt777 = -479;

	@OriginalMember(owner = "client!YFDAHBXI", name = "H", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!YFDAHBXI", name = "L", descriptor = "Z")
	private boolean aBoolean219 = false;

	@OriginalMember(owner = "client!YFDAHBXI", name = "B", descriptor = "Lclient!PHXJLMVH;")
	private Class31 aClass31_2;

	@OriginalMember(owner = "client!YFDAHBXI", name = "I", descriptor = "I")
	public int anInt789;

	@OriginalMember(owner = "client!YFDAHBXI", name = "u", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!YFDAHBXI", name = "v", descriptor = "I")
	private int anInt781;

	@OriginalMember(owner = "client!YFDAHBXI", name = "w", descriptor = "I")
	private int anInt782;

	@OriginalMember(owner = "client!YFDAHBXI", name = "F", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!YFDAHBXI", name = "G", descriptor = "I")
	public int anInt788;

	@OriginalMember(owner = "client!YFDAHBXI", name = "y", descriptor = "I")
	private int anInt784;

	@OriginalMember(owner = "client!YFDAHBXI", name = "z", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!YFDAHBXI", name = "A", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!YFDAHBXI", name = "x", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!YFDAHBXI", name = "<init>", descriptor = "(IIIIIIIBIIII)V")
	public Class6_Sub2_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass31_2 = Class31.aClass31Array1[arg9];
			this.anInt789 = arg10;
			this.anInt780 = arg6;
			this.anInt781 = arg1;
			this.anInt782 = arg2;
			this.anInt787 = arg11;
			this.anInt788 = arg8;
			this.anInt784 = arg4;
			this.anInt785 = arg0;
			this.anInt786 = arg5;
			this.anInt783 = arg3;
			this.aBoolean219 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("53537, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFDAHBXI", name = "a", descriptor = "(II)V")
	public void method530(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean219 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt778 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt779 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass31_2.aClass21_2 != null) {
				this.anInt791 += arg0;
				while (this.anInt791 > this.aClass31_2.aClass21_2.method176(this.anInt790, 642)) {
					this.anInt791 -= this.aClass31_2.aClass21_2.method176(this.anInt790, 642) + 1;
					this.anInt790++;
					if (this.anInt790 >= this.aClass31_2.aClass21_2.anInt344) {
						this.anInt790 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("22493, " + -66 + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFDAHBXI", name = "a", descriptor = "(I)Lclient!JUQSYEMB;")
	@Override
	protected Class6_Sub2_Sub1_Sub3 method529(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class6_Sub2_Sub1_Sub3 local3 = this.aClass31_2.method337();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass31_2.aClass21_2 != null) {
				local9 = this.aClass31_2.aClass21_2.anIntArray108[this.anInt790];
			}
			@Pc(32) Class6_Sub2_Sub1_Sub3 local32 = new Class6_Sub2_Sub1_Sub3(false, true, (byte) 119, local3, Class48.method536(local9));
			if (local9 != -1) {
				local32.method140();
				local32.method141(local9);
				local32.anIntArrayArray5 = null;
				local32.anIntArrayArray4 = null;
			}
			if (this.aClass31_2.anInt430 != 128 || this.aClass31_2.anInt431 != 128) {
				local32.method149(this.aClass31_2.anInt430, this.aClass31_2.anInt431, this.aClass31_2.anInt430, this.anInt777);
			}
			local32.method145(this.anInt779);
			local32.method150(this.aClass31_2.anInt433 + 64, this.aClass31_2.anInt434 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("94259, " + 697 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YFDAHBXI", name = "a", descriptor = "(BIIII)V")
	public void method531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(19) double local19;
			if (!this.aBoolean219) {
				local19 = arg2 - this.anInt780;
				@Pc(25) double local25 = (double) (arg3 - this.anInt781);
				@Pc(34) double local34 = Math.sqrt(local19 * local19 + local25 * local25);
				this.aDouble5 = (double) this.anInt780 + local19 * (double) this.anInt785 / local34;
				this.aDouble6 = (double) this.anInt781 + local25 * (double) this.anInt785 / local34;
				this.aDouble7 = this.anInt782;
			}
			local19 = this.anInt788 + 1 - arg1;
			this.aDouble1 = ((double) arg2 - this.aDouble5) / local19;
			this.aDouble2 = ((double) arg3 - this.aDouble6) / local19;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean219) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt784 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble7 - this.aDouble4 * local19) * 2.0D / (local19 * local19);
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("94777, " + -53 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
