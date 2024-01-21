import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!eb")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	private int anInt508;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
	private int anInt509;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt510;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Z")
	private boolean aBoolean90 = true;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
	private boolean aBoolean91 = false;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	private int anInt499;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt500;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public int anInt501;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass27_1 = Class27.aClass27Array1[arg3];
			this.anInt497 = arg9;
			this.anInt498 = arg2;
			this.anInt499 = arg6;
			this.anInt500 = arg5;
			this.anInt502 = arg7;
			this.anInt503 = arg0;
			this.anInt504 = arg8;
			this.anInt505 = arg4;
			this.anInt506 = arg10;
			this.anInt501 = arg1;
			this.aBoolean91 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("79430, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBIII)V")
	public void method246(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(16) double local16;
			if (!this.aBoolean91) {
				local16 = arg4 - this.anInt498;
				@Pc(22) double local22 = (double) (arg2 - this.anInt499);
				@Pc(31) double local31 = Math.sqrt(local16 * local16 + local22 * local22);
				this.aDouble1 = (double) this.anInt498 + local16 * (double) this.anInt505 / local31;
				this.aDouble2 = (double) this.anInt499 + local22 * (double) this.anInt505 / local31;
				this.aDouble3 = this.anInt500;
			}
			local16 = this.anInt503 + 1 - arg3;
			this.aDouble4 = ((double) arg4 - this.aDouble1) / local16;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local16;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean91) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt504 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble3 - this.aDouble7 * local16) * 2.0D / (local16 * local16);
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("62412, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI)V")
	public void method247(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean91 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt507 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt508 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass27_1.aClass25_2 != null) {
				this.anInt510 += arg0;
				while (this.anInt510 > this.aClass27_1.aClass25_2.method485(this.anInt509)) {
					this.anInt510 -= this.aClass27_1.aClass25_2.method485(this.anInt509) + 1;
					this.anInt509++;
					if (this.anInt509 >= this.aClass27_1.aClass25_2.anInt785) {
						this.anInt509 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("87412, " + true + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method313() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass27_1.method491();
			if (local3 == null) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub1_Sub5 local22 = new Class1_Sub1_Sub1_Sub5(-435, true, false, local3, !this.aClass27_1.aBoolean168);
			if (this.aClass27_1.aClass25_2 != null) {
				local22.method286();
				local22.method287(this.aClass27_1.aClass25_2.anIntArray215[this.anInt509]);
				local22.anIntArrayArray8 = null;
				local22.anIntArrayArray7 = null;
			}
			if (this.aClass27_1.anInt819 != 128 || this.aClass27_1.anInt820 != 128) {
				local22.method295(this.aClass27_1.anInt820, this.aClass27_1.anInt819, this.aClass27_1.anInt819);
			}
			local22.method291(this.anInt508);
			local22.method296(this.aClass27_1.anInt822 + 64, this.aClass27_1.anInt823 + 850, -30, -50, -30, true);
			return local22;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("26676, " + false + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
