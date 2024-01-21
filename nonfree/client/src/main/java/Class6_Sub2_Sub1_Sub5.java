import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TIUPWCPE")
public final class Class6_Sub2_Sub1_Sub5 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!TIUPWCPE", name = "l", descriptor = "I")
	public int anInt583;

	@OriginalMember(owner = "client!TIUPWCPE", name = "m", descriptor = "I")
	private int anInt584;

	@OriginalMember(owner = "client!TIUPWCPE", name = "o", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!TIUPWCPE", name = "p", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!TIUPWCPE", name = "q", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!TIUPWCPE", name = "x", descriptor = "I")
	private int anInt590;

	@OriginalMember(owner = "client!TIUPWCPE", name = "y", descriptor = "I")
	private int anInt591;

	@OriginalMember(owner = "client!TIUPWCPE", name = "G", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!TIUPWCPE", name = "H", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!TIUPWCPE", name = "I", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!TIUPWCPE", name = "J", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!TIUPWCPE", name = "K", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!TIUPWCPE", name = "n", descriptor = "B")
	private byte aByte23 = 3;

	@OriginalMember(owner = "client!TIUPWCPE", name = "r", descriptor = "I")
	private int anInt585 = 3;

	@OriginalMember(owner = "client!TIUPWCPE", name = "v", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!TIUPWCPE", name = "F", descriptor = "Lclient!PMDEXOWJ;")
	private Class29 aClass29_2;

	@OriginalMember(owner = "client!TIUPWCPE", name = "w", descriptor = "I")
	public int anInt589;

	@OriginalMember(owner = "client!TIUPWCPE", name = "z", descriptor = "I")
	private int anInt592;

	@OriginalMember(owner = "client!TIUPWCPE", name = "A", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!TIUPWCPE", name = "B", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!TIUPWCPE", name = "D", descriptor = "I")
	public int anInt596;

	@OriginalMember(owner = "client!TIUPWCPE", name = "E", descriptor = "I")
	public int anInt597;

	@OriginalMember(owner = "client!TIUPWCPE", name = "s", descriptor = "I")
	private int anInt586;

	@OriginalMember(owner = "client!TIUPWCPE", name = "t", descriptor = "I")
	private int anInt587;

	@OriginalMember(owner = "client!TIUPWCPE", name = "u", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!TIUPWCPE", name = "C", descriptor = "I")
	public int anInt595;

	@OriginalMember(owner = "client!TIUPWCPE", name = "<init>", descriptor = "(IIIIIBIIIIII)V")
	public Class6_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass29_2 = Class29.aClass29Array1[arg7];
			this.anInt589 = arg4;
			if (arg5 != this.aByte23) {
				throw new NullPointerException();
			}
			this.anInt592 = arg3;
			this.anInt593 = arg1;
			this.anInt594 = arg10;
			this.anInt596 = arg0;
			this.anInt597 = arg11;
			this.anInt586 = arg8;
			this.anInt587 = arg9;
			this.anInt588 = arg2;
			this.anInt595 = arg6;
			this.aBoolean159 = false;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("21908, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIUPWCPE", name = "a", descriptor = "(IIIII)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean159) {
				local8 = arg1 - this.anInt592;
				@Pc(14) double local14 = (double) (arg2 - this.anInt593);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt592 + local8 * (double) this.anInt587 / local23;
				this.aDouble2 = (double) this.anInt593 + local14 * (double) this.anInt587 / local23;
				this.aDouble3 = this.anInt594;
			}
			local8 = this.anInt597 + 1 - arg3;
			this.aDouble5 = ((double) arg1 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean159) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt586 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg0 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("61871, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIUPWCPE", name = "a", descriptor = "(Z)Lclient!WEVRTBOZ;")
	@Override
	protected Class6_Sub2_Sub1_Sub6 method482() {
		try {
			@Pc(3) Class6_Sub2_Sub1_Sub6 local3 = this.aClass29_2.method361();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass29_2.aClass33_2 != null) {
				local9 = this.aClass29_2.aClass33_2.anIntArray129[this.anInt590];
			}
			@Pc(32) Class6_Sub2_Sub1_Sub6 local32 = new Class6_Sub2_Sub1_Sub6(107, local3, Class12.method88(local9), false, true);
			if (local9 != -1) {
				local32.method494((byte) 2);
				local32.method495(local9, 803);
				local32.anIntArrayArray19 = null;
				local32.anIntArrayArray18 = null;
			}
			if (this.aClass29_2.anInt545 != 128 || this.aClass29_2.anInt546 != 128) {
				local32.method503(this.aClass29_2.anInt545, this.aClass29_2.anInt545, this.aClass29_2.anInt546);
			}
			local32.method499(this.anInt584);
			local32.method504(this.aClass29_2.anInt548 + 64, this.aClass29_2.anInt549 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("79952, " + true + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIUPWCPE", name = "a", descriptor = "(II)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean159 = true;
			this.aDouble1 += this.aDouble5 * (double) arg1;
			this.aDouble2 += this.aDouble6 * (double) arg1;
			this.aDouble3 += this.aDouble8 * (double) arg1 + this.aDouble4 * 0.5D * (double) arg1 * (double) arg1;
			this.aDouble8 += this.aDouble4 * (double) arg1;
			this.anInt583 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			if (arg0 != 0) {
				for (@Pc(73) int local73 = 1; local73 > 0; local73++) {
				}
			}
			this.anInt584 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass29_2.aClass33_2 != null) {
				this.anInt591 += arg1;
				while (this.anInt591 > this.aClass29_2.aClass33_2.method371(this.anInt590, this.anInt585)) {
					this.anInt591 -= this.aClass29_2.aClass33_2.method371(this.anInt590, this.anInt585) + 1;
					this.anInt590++;
					if (this.anInt590 >= this.aClass29_2.aClass33_2.anInt558) {
						this.anInt590 = 0;
					}
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("45377, " + arg0 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}
}
