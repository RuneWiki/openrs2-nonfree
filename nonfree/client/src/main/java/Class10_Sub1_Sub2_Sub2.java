import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KFJRVZCI")
public final class Class10_Sub1_Sub2_Sub2 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!KFJRVZCI", name = "o", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!KFJRVZCI", name = "p", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!KFJRVZCI", name = "q", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!KFJRVZCI", name = "v", descriptor = "I")
	public int anInt268;

	@OriginalMember(owner = "client!KFJRVZCI", name = "w", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!KFJRVZCI", name = "A", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!KFJRVZCI", name = "B", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!KFJRVZCI", name = "C", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!KFJRVZCI", name = "D", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!KFJRVZCI", name = "E", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!KFJRVZCI", name = "F", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!KFJRVZCI", name = "H", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!KFJRVZCI", name = "u", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!KFJRVZCI", name = "x", descriptor = "B")
	private byte aByte19 = -41;

	@OriginalMember(owner = "client!KFJRVZCI", name = "G", descriptor = "Z")
	private boolean aBoolean85 = true;

	@OriginalMember(owner = "client!KFJRVZCI", name = "I", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!KFJRVZCI", name = "m", descriptor = "Lclient!MNZYLKNY;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!KFJRVZCI", name = "n", descriptor = "I")
	public int anInt264;

	@OriginalMember(owner = "client!KFJRVZCI", name = "J", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!KFJRVZCI", name = "K", descriptor = "I")
	private int anInt275;

	@OriginalMember(owner = "client!KFJRVZCI", name = "L", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!KFJRVZCI", name = "y", descriptor = "I")
	public int anInt270;

	@OriginalMember(owner = "client!KFJRVZCI", name = "z", descriptor = "I")
	public int anInt271;

	@OriginalMember(owner = "client!KFJRVZCI", name = "r", descriptor = "I")
	private int anInt265;

	@OriginalMember(owner = "client!KFJRVZCI", name = "s", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!KFJRVZCI", name = "t", descriptor = "I")
	public int anInt267;

	@OriginalMember(owner = "client!KFJRVZCI", name = "M", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!KFJRVZCI", name = "<init>", descriptor = "(IIIIIIIIBIII)V")
	public Class10_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass28_1 = Class28.aClass28Array1[arg4];
			this.anInt264 = arg0;
			this.anInt274 = arg10;
			this.anInt275 = arg3;
			this.anInt276 = arg9;
			this.anInt270 = arg11;
			this.anInt271 = arg5;
			if (arg8 != this.aByte19) {
				throw new NullPointerException();
			}
			this.anInt265 = arg6;
			this.anInt266 = arg2;
			this.anInt267 = arg7;
			this.anInt277 = arg1;
			this.aBoolean86 = false;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("57913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(IIIII)V")
	public void method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean86) {
				local8 = arg0 - this.anInt274;
				@Pc(14) double local14 = (double) (arg1 - this.anInt275);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt274 + local8 * (double) this.anInt266 / local23;
				this.aDouble2 = (double) this.anInt275 + local14 * (double) this.anInt266 / local23;
				this.aDouble3 = this.anInt276;
			}
			local8 = this.anInt271 + 1 - arg3;
			this.aDouble4 = ((double) arg0 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean86) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt265 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("90121, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(IZ)V")
	public void method188(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean86 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt268 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt269 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass28_1.aClass15_1 != null) {
				this.anInt273 += arg0;
				while (this.anInt273 > this.aClass28_1.aClass15_1.method97(this.anInt272)) {
					this.anInt273 -= this.aClass28_1.aClass15_1.method97(this.anInt272);
					this.anInt272++;
					if (this.anInt272 >= this.aClass28_1.aClass15_1.anInt152) {
						this.anInt272 = 0;
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("73896, " + arg0 + ", " + false + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KFJRVZCI", name = "a", descriptor = "(B)Lclient!LZYQDKJV;")
	@Override
	protected Class10_Sub1_Sub2_Sub4 method537(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class10_Sub1_Sub2_Sub4 local3 = this.aClass28_1.method352();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass28_1.aClass15_1 != null) {
				local9 = this.aClass28_1.aClass15_1.anIntArray47[this.anInt272];
			}
			@Pc(33) Class10_Sub1_Sub2_Sub4 local33 = new Class10_Sub1_Sub2_Sub4(false, false, true, local3, Class22.method169(this.aBoolean85, local9));
			if (local9 != -1) {
				local33.method278();
				local33.method279(local9, (byte) 6);
				local33.anIntArrayArray11 = null;
				local33.anIntArrayArray10 = null;
			}
			if (this.aClass28_1.anInt438 != 128 || this.aClass28_1.anInt439 != 128) {
				local33.method287(this.aClass28_1.anInt439, this.aClass28_1.anInt438, this.aClass28_1.anInt438);
			}
			local33.method283(this.anInt269, 341);
			local33.method288(this.aClass28_1.anInt441 + 64, this.aClass28_1.anInt442 + 850, -30, -50, -30, true);
			if (arg0 == 3) {
				@Pc(97) boolean local97 = false;
			} else {
				this.aBoolean84 = !this.aBoolean84;
			}
			return local33;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("37750, " + arg0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}
}
