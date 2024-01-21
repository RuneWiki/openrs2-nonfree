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
	public int anInt514;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt516;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
	private int anInt517;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	private int anInt503 = -732;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "B")
	private byte aByte20 = 86;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "B")
	private byte aByte21 = 5;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Z")
	private boolean aBoolean100 = false;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!oc;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt506;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	private int anInt507;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass29_1 = Class29.aClass29Array1[arg6];
			this.anInt504 = arg2;
			this.anInt505 = arg10;
			this.anInt506 = arg3;
			this.anInt507 = arg0;
			this.anInt509 = arg11;
			this.anInt510 = arg4;
			this.anInt511 = arg7;
			@Pc(43) int local43 = 24 / arg9;
			this.anInt512 = arg1;
			this.anInt513 = arg8;
			this.anInt508 = arg5;
			this.aBoolean100 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("22577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIBI)V")
	public void method254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean100) {
				local8 = arg0 - this.anInt505;
				@Pc(14) double local14 = (double) (arg1 - this.anInt506);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt505 + local8 * (double) this.anInt512 / local23;
				this.aDouble2 = (double) this.anInt506 + local14 * (double) this.anInt512 / local23;
				this.aDouble3 = this.anInt507;
			}
			local8 = this.anInt510 + 1 - arg2;
			this.aDouble4 = ((double) arg0 - this.aDouble1) / local8;
			if (arg3 == this.aByte21) {
				@Pc(77) boolean local77 = false;
			} else {
				this.anInt503 = -20;
			}
			this.aDouble5 = ((double) arg1 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean100) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt511 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg4 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("80998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	public void method255(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean100 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt514 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt515 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass29_1.aClass27_2 != null) {
				this.anInt517 += arg0;
				while (this.anInt517 > this.aClass29_1.aClass27_2.method515(this.anInt516)) {
					this.anInt517 -= this.aClass29_1.aClass27_2.method515(this.anInt516) + 1;
					this.anInt516++;
					if (this.anInt516 >= this.aClass29_1.aClass27_2.anInt812) {
						this.anInt516 = 0;
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("93966, " + arg0 + ", " + 0 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method315() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass29_1.method520();
			if (local3 == null) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub1_Sub5 local22 = new Class1_Sub1_Sub1_Sub5(true, local3, false, true, !this.aClass29_1.aBoolean187);
			if (this.aClass29_1.aClass27_2 != null) {
				local22.method294(this.aByte20);
				local22.method295(this.aClass29_1.aClass27_2.anIntArray226[this.anInt516]);
				local22.anIntArrayArray8 = null;
				local22.anIntArrayArray7 = null;
			}
			if (this.aClass29_1.anInt843 != 128 || this.aClass29_1.anInt844 != 128) {
				local22.method303(this.aClass29_1.anInt843, this.aClass29_1.anInt843, this.aClass29_1.anInt844);
			}
			local22.method299(this.anInt515);
			local22.method304(this.aClass29_1.anInt846 + 64, this.aClass29_1.anInt847 + 850, -30, -50, -30, true);
			return local22;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("12927, " + -13634 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
