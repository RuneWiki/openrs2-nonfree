import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!eb")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	private int anInt500;

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

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Z")
	private boolean aBoolean84 = false;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private int anInt501 = 668;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

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

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass27_1 = Class27.aClass27Array1[arg9];
			this.anInt502 = arg8;
			this.anInt503 = arg6;
			this.anInt504 = arg5;
			this.anInt505 = arg10;
			this.anInt507 = arg2;
			this.anInt508 = arg7;
			this.anInt509 = arg4;
			this.anInt510 = arg1;
			this.anInt511 = arg0;
			this.anInt506 = arg11;
			this.aBoolean85 = false;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("63758, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
	public void method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) double local12;
			if (!this.aBoolean85) {
				local12 = arg1 - this.anInt503;
				@Pc(18) double local18 = (double) (arg4 - this.anInt504);
				@Pc(27) double local27 = Math.sqrt(local12 * local12 + local18 * local18);
				this.aDouble1 = (double) this.anInt503 + local12 * (double) this.anInt510 / local27;
				this.aDouble2 = (double) this.anInt504 + local18 * (double) this.anInt510 / local27;
				this.aDouble3 = this.anInt505;
			}
			local12 = this.anInt508 + 1 - arg2;
			this.aDouble4 = ((double) arg1 - this.aDouble1) / local12;
			this.aDouble5 = ((double) arg4 - this.aDouble2) / local12;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean85) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt509 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg3 - this.aDouble3 - this.aDouble7 * local12) * 2.0D / (local12 * local12);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("915, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public void method246(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean85 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt512 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt513 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass27_1.aClass25_2 != null) {
				this.anInt515 += arg0;
				while (this.anInt515 > this.aClass27_1.aClass25_2.method484(this.anInt514)) {
					this.anInt515 -= this.aClass27_1.aClass25_2.method484(this.anInt514) + 1;
					this.anInt514++;
					if (this.anInt514 >= this.aClass27_1.aClass25_2.anInt778) {
						this.anInt514 = 0;
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("18010, " + arg0 + ", " + 6 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lclient!fb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method312(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass27_1.method490();
			if (local3 == null) {
				return null;
			}
			@Pc(22) Class1_Sub1_Sub1_Sub5 local22 = new Class1_Sub1_Sub1_Sub5(8, true, !this.aClass27_1.aBoolean166, false, local3);
			if (this.aClass27_1.aClass25_2 != null) {
				local22.method285();
				local22.method286(this.aClass27_1.aClass25_2.anIntArray215[this.anInt514]);
				local22.anIntArrayArray8 = null;
				local22.anIntArrayArray7 = null;
			}
			if (this.aClass27_1.anInt812 != 128 || this.aClass27_1.anInt813 != 128) {
				local22.method294(this.aClass27_1.anInt812, this.aClass27_1.anInt812, this.aClass27_1.anInt813);
			}
			local22.method290(1, this.anInt513);
			if (arg0 != 0) {
				this.aBoolean84 = !this.aBoolean84;
			}
			local22.method295(this.aClass27_1.anInt815 + 64, this.aClass27_1.anInt816 + 850, -30, -50, -30, true);
			return local22;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("31424, " + arg0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}
