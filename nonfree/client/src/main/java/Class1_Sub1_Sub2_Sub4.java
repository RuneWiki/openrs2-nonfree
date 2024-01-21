import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SWTXAYDT")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!SWTXAYDT", name = "p", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!SWTXAYDT", name = "q", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!SWTXAYDT", name = "r", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!SWTXAYDT", name = "s", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!SWTXAYDT", name = "t", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!SWTXAYDT", name = "z", descriptor = "I")
	private int anInt666;

	@OriginalMember(owner = "client!SWTXAYDT", name = "A", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!SWTXAYDT", name = "B", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!SWTXAYDT", name = "C", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!SWTXAYDT", name = "I", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!SWTXAYDT", name = "J", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!SWTXAYDT", name = "K", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!SWTXAYDT", name = "L", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!SWTXAYDT", name = "o", descriptor = "I")
	private int anInt661 = 9;

	@OriginalMember(owner = "client!SWTXAYDT", name = "u", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!SWTXAYDT", name = "G", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!SWTXAYDT", name = "H", descriptor = "Lclient!MUDLUUBC;")
	private Class25 aClass25_2;

	@OriginalMember(owner = "client!SWTXAYDT", name = "M", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!SWTXAYDT", name = "v", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!SWTXAYDT", name = "w", descriptor = "I")
	private int anInt663;

	@OriginalMember(owner = "client!SWTXAYDT", name = "x", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!SWTXAYDT", name = "m", descriptor = "I")
	public int anInt659;

	@OriginalMember(owner = "client!SWTXAYDT", name = "n", descriptor = "I")
	public int anInt660;

	@OriginalMember(owner = "client!SWTXAYDT", name = "D", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!SWTXAYDT", name = "E", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!SWTXAYDT", name = "F", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!SWTXAYDT", name = "y", descriptor = "I")
	public int anInt665;

	@OriginalMember(owner = "client!SWTXAYDT", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass25_2 = Class25.aClass25Array1[arg11];
			this.anInt674 = arg6;
			this.anInt662 = arg9;
			this.anInt663 = arg8;
			this.anInt664 = arg7;
			this.anInt659 = arg3;
			this.anInt660 = arg4;
			this.anInt667 = arg0;
			this.anInt668 = arg5;
			this.anInt669 = arg10;
			this.anInt665 = arg1;
			this.aBoolean169 = false;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("59291, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWTXAYDT", name = "a", descriptor = "(IIIIB)V")
	public void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean169) {
				local8 = arg3 - this.anInt662;
				@Pc(14) double local14 = (double) (arg1 - this.anInt663);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble6 = (double) this.anInt662 + local8 * (double) this.anInt668 / local23;
				this.aDouble7 = (double) this.anInt663 + local14 * (double) this.anInt668 / local23;
				this.aDouble8 = this.anInt664;
			}
			local8 = this.anInt660 + 1 - arg0;
			this.aDouble1 = ((double) arg3 - this.aDouble6) / local8;
			this.aDouble2 = ((double) arg1 - this.aDouble7) / local8;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean169) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt667 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg2 - this.aDouble8 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("48918, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -83 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWTXAYDT", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method529() {
		try {
			@Pc(3) Class1_Sub1_Sub2_Sub6 local3 = this.aClass25_2.method309();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass25_2.aClass22_1 != null) {
				local9 = this.aClass25_2.aClass22_1.anIntArray76[this.anInt670];
			}
			@Pc(32) Class1_Sub1_Sub2_Sub6 local32 = new Class1_Sub1_Sub2_Sub6(9, true, Class37.method456(local9), false, local3);
			if (local9 != -1) {
				local32.method541();
				local32.method542(local9);
				local32.anIntArrayArray19 = null;
				local32.anIntArrayArray18 = null;
			}
			if (this.aClass25_2.anInt488 != 128 || this.aClass25_2.anInt489 != 128) {
				local32.method550(this.aClass25_2.anInt488, this.aClass25_2.anInt488, this.anInt661, this.aClass25_2.anInt489);
			}
			local32.method546(this.anInt673);
			local32.method551(this.aClass25_2.anInt491 + 64, this.aClass25_2.anInt492 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("73693, " + 4016 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWTXAYDT", name = "a", descriptor = "(II)V")
	public void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean169 = true;
			this.aDouble6 += this.aDouble1 * (double) arg0;
			this.aDouble7 += this.aDouble2 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble5 * (double) arg0;
			if (arg1 != 0) {
				this.anInt666 = 16;
			}
			this.anInt672 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt673 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass25_2.aClass22_1 != null) {
				this.anInt671 += arg0;
				while (this.anInt671 > this.aClass25_2.aClass22_1.method252(this.anInt670)) {
					this.anInt671 -= this.aClass25_2.aClass22_1.method252(this.anInt670) + 1;
					this.anInt670++;
					if (this.anInt670 >= this.aClass25_2.aClass22_1.anInt433) {
						this.anInt670 = 0;
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("76529, " + arg0 + ", " + arg1 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}
}
