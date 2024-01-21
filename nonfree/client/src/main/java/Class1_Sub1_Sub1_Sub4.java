import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!eb")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
	public int anInt524;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	private int anInt513 = -911;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "B")
	private byte aByte29 = 0;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!pc;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private int anInt521;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public int anInt518;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass32_1 = Class32.aClass32Array1[arg10];
			this.anInt514 = arg1;
			this.anInt515 = arg5;
			this.anInt516 = arg8;
			this.anInt517 = arg11;
			this.anInt519 = arg0;
			this.anInt520 = arg3;
			this.anInt521 = arg6;
			this.anInt522 = arg2;
			this.anInt523 = arg9;
			this.anInt518 = arg4;
			this.aBoolean112 = false;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("39154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBII)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean112) {
				local8 = arg1 - this.anInt515;
				@Pc(14) double local14 = (double) (arg2 - this.anInt516);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt515 + local8 * (double) this.anInt522 / local23;
				this.aDouble2 = (double) this.anInt516 + local14 * (double) this.anInt522 / local23;
				this.aDouble3 = this.anInt517;
			}
			local8 = this.anInt520 + 1 - arg0;
			this.aDouble4 = ((double) arg1 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean112) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt521 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg3 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("43196, " + arg0 + ", " + arg1 + ", " + 67 + ", " + arg2 + ", " + arg3 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V")
	public void method255(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean112 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt524 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt525 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass32_1.aClass27_2 != null) {
				this.anInt527 += arg0;
				while (this.anInt527 > this.aClass32_1.aClass27_2.method517(this.anInt526)) {
					this.anInt527 -= this.aClass32_1.aClass27_2.method517(this.anInt526) + 1;
					this.anInt526++;
					if (this.anInt526 >= this.aClass32_1.aClass27_2.anInt830) {
						this.anInt526 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("76199, " + -26 + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(19) Class1_Sub1_Sub1_Sub5 local19 = this.aClass32_1.method530();
			if (local19 == null) {
				return null;
			}
			@Pc(25) int local25 = -1;
			if (this.aClass32_1.aClass27_2 != null) {
				local25 = this.aClass32_1.aClass27_2.anIntArray227[this.anInt526];
			}
			@Pc(48) Class1_Sub1_Sub1_Sub5 local48 = new Class1_Sub1_Sub1_Sub5(Class14.method328((byte) 7, local25), false, true, true, local19);
			if (local25 != -1) {
				local48.method295();
				local48.method296(this.aByte29, local25);
				local48.anIntArrayArray8 = null;
				local48.anIntArrayArray7 = null;
			}
			if (this.aClass32_1.anInt869 != 128 || this.aClass32_1.anInt870 != 128) {
				local48.method304(this.aClass32_1.anInt869, this.aClass32_1.anInt870, this.aClass32_1.anInt869);
			}
			local48.method300(this.anInt525);
			local48.method305(this.aClass32_1.anInt872 + 64, this.aClass32_1.anInt873 + 850, -30, -50, -30, true);
			return local48;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("11609, " + arg0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}
}
