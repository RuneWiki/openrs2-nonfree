import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LDXKRJQR")
public final class Class2_Sub1_Sub1_Sub4 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!LDXKRJQR", name = "l", descriptor = "I")
	private int anInt432;

	@OriginalMember(owner = "client!LDXKRJQR", name = "m", descriptor = "I")
	private int anInt433;

	@OriginalMember(owner = "client!LDXKRJQR", name = "t", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!LDXKRJQR", name = "u", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!LDXKRJQR", name = "v", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!LDXKRJQR", name = "w", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!LDXKRJQR", name = "C", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!LDXKRJQR", name = "D", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!LDXKRJQR", name = "F", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!LDXKRJQR", name = "G", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!LDXKRJQR", name = "H", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!LDXKRJQR", name = "J", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!LDXKRJQR", name = "x", descriptor = "B")
	private byte aByte22 = 7;

	@OriginalMember(owner = "client!LDXKRJQR", name = "I", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!LDXKRJQR", name = "K", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!LDXKRJQR", name = "B", descriptor = "Lclient!CRSWMDQF;")
	private Class6 aClass6_2;

	@OriginalMember(owner = "client!LDXKRJQR", name = "E", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!LDXKRJQR", name = "p", descriptor = "I")
	private int anInt436;

	@OriginalMember(owner = "client!LDXKRJQR", name = "q", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!LDXKRJQR", name = "r", descriptor = "I")
	private int anInt438;

	@OriginalMember(owner = "client!LDXKRJQR", name = "n", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!LDXKRJQR", name = "o", descriptor = "I")
	public int anInt435;

	@OriginalMember(owner = "client!LDXKRJQR", name = "y", descriptor = "I")
	private int anInt440;

	@OriginalMember(owner = "client!LDXKRJQR", name = "z", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!LDXKRJQR", name = "A", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!LDXKRJQR", name = "s", descriptor = "I")
	public int anInt439;

	@OriginalMember(owner = "client!LDXKRJQR", name = "<init>", descriptor = "(IIIIIIIIIIZI)V")
	public Class2_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass6_2 = Class6.aClass6Array1[arg8];
			this.anInt445 = arg0;
			this.anInt436 = arg9;
			this.anInt437 = arg7;
			this.anInt438 = arg6;
			this.anInt434 = arg11;
			this.anInt435 = arg1;
			this.anInt440 = arg5;
			this.anInt441 = arg2;
			this.anInt442 = arg3;
			this.anInt439 = arg4;
			this.aBoolean97 = false;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("96664, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDXKRJQR", name = "a", descriptor = "(II)V")
	public void method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean97 = true;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble4 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			@Pc(47) boolean local47 = false;
			this.aDouble4 += this.aDouble8 * (double) arg0;
			this.anInt443 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			this.anInt444 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass6_2.aClass33_1 != null) {
				this.anInt433 += arg0;
				while (this.anInt433 > this.aClass6_2.aClass33_1.method461(this.anInt432)) {
					this.anInt433 -= this.aClass6_2.aClass33_1.method461(this.anInt432) + 1;
					this.anInt432++;
					if (this.anInt432 >= this.aClass6_2.aClass33_1.anInt648) {
						this.anInt432 = 0;
					}
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("31996, " + arg0 + ", " + arg1 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDXKRJQR", name = "a", descriptor = "(IIIBI)V")
	public void method247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean97) {
				local8 = arg1 - this.anInt436;
				@Pc(14) double local14 = (double) (arg2 - this.anInt437);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble5 = (double) this.anInt436 + local8 * (double) this.anInt441 / local23;
				this.aDouble6 = (double) this.anInt437 + local14 * (double) this.anInt441 / local23;
				this.aDouble7 = this.anInt438;
			}
			local8 = this.anInt435 + 1 - arg0;
			this.aDouble1 = ((double) arg1 - this.aDouble5) / local8;
			this.aDouble2 = ((double) arg2 - this.aDouble6) / local8;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean97) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt440 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg3 - this.aDouble7 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("70635, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -127 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDXKRJQR", name = "a", descriptor = "(B)Lclient!XBVYIDUH;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method507(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class2_Sub1_Sub1_Sub6 local3 = this.aClass6_2.method194();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			@Pc(14) boolean local14 = false;
			if (this.aClass6_2.aClass33_1 != null) {
				local9 = this.aClass6_2.aClass33_1.anIntArray115[this.anInt432];
			}
			@Pc(44) Class2_Sub1_Sub1_Sub6 local44 = new Class2_Sub1_Sub1_Sub6(Class4.method168(this.aByte22, local9), (byte) 9, true, false, local3);
			if (local9 != -1) {
				local44.method519();
				local44.method520(local9);
				local44.anIntArrayArray17 = null;
				local44.anIntArrayArray16 = null;
			}
			if (this.aClass6_2.anInt189 != 128 || this.aClass6_2.anInt190 != 128) {
				local44.method528(this.aClass6_2.anInt190, this.aClass6_2.anInt189, this.aClass6_2.anInt189);
			}
			local44.method524(this.anInt444, 933);
			local44.method529(this.aClass6_2.anInt192 + 64, this.aClass6_2.anInt193 + 850, -30, -50, -30, true);
			return local44;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("27950, " + arg0 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}
}
