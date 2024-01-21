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
	public int anInt512;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	private int anInt500 = 422;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private int anInt501 = -39218;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!pc;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		try {
			this.aClass32_1 = Class32.aClass32Array1[arg8];
			this.anInt502 = arg9;
			this.anInt503 = arg2;
			this.anInt504 = arg1;
			this.anInt505 = arg6;
			this.anInt507 = arg4;
			this.anInt508 = arg10;
			this.anInt509 = arg3;
			this.anInt510 = arg7;
			this.anInt511 = arg0;
			this.anInt506 = arg5;
			this.aBoolean116 = false;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("15547, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIB)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(12) double local12;
			if (!this.aBoolean116) {
				local12 = arg0 - this.anInt503;
				@Pc(18) double local18 = (double) (arg3 - this.anInt504);
				@Pc(27) double local27 = Math.sqrt(local12 * local12 + local18 * local18);
				this.aDouble1 = (double) this.anInt503 + local12 * (double) this.anInt510 / local27;
				this.aDouble2 = (double) this.anInt504 + local18 * (double) this.anInt510 / local27;
				this.aDouble3 = this.anInt505;
			}
			local12 = this.anInt508 + 1 - arg1;
			this.aDouble4 = ((double) arg0 - this.aDouble1) / local12;
			this.aDouble5 = ((double) arg3 - this.aDouble2) / local12;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean116) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt509 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg2 - this.aDouble3 - this.aDouble7 * local12) * 2.0D / (local12 * local12);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("52803, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	public void method255(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aBoolean116 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			@Pc(19) boolean local19 = false;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt512 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt513 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass32_1.aClass27_2 != null) {
				this.anInt515 += arg0;
				while (this.anInt515 > this.aClass32_1.aClass27_2.method517(this.anInt514, (byte) 2)) {
					this.anInt515 -= this.aClass32_1.aClass27_2.method517(this.anInt514, (byte) 2) + 1;
					this.anInt514++;
					if (this.anInt514 >= this.aClass32_1.aClass27_2.anInt808) {
						this.anInt514 = 0;
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("44898, " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method316() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass32_1.method530();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass32_1.aClass27_2 != null) {
				local9 = this.aClass32_1.aClass27_2.anIntArray227[this.anInt514];
			}
			@Pc(32) Class1_Sub1_Sub1_Sub5 local32 = new Class1_Sub1_Sub1_Sub5(Class14.method328(local9), local3, true, 0, false);
			if (local9 != -1) {
				local32.method295();
				local32.method296(local9);
				local32.anIntArrayArray8 = null;
				local32.anIntArrayArray7 = null;
			}
			if (this.aClass32_1.anInt844 != 128 || this.aClass32_1.anInt845 != 128) {
				local32.method304(this.aClass32_1.anInt844, (byte) 9, this.aClass32_1.anInt844, this.aClass32_1.anInt845);
			}
			local32.method300(this.anInt513);
			local32.method305(this.aClass32_1.anInt847 + 64, this.aClass32_1.anInt848 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("43771, " + -28205 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}
}
