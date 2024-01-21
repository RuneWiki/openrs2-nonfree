import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IRBOJPFQ")
public final class Class8_Sub1_Sub2_Sub2 extends Class8_Sub1_Sub2 {

	@OriginalMember(owner = "client!IRBOJPFQ", name = "l", descriptor = "I")
	private int anInt319;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "n", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "o", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "p", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "q", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "r", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "s", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "t", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "y", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "F", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "G", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "H", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "I", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "v", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "z", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "A", descriptor = "B")
	private byte aByte17 = 1;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "M", descriptor = "I")
	private int anInt334 = -17838;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "N", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "u", descriptor = "Lclient!XHDTVZNY;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "m", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "B", descriptor = "I")
	private int anInt327;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "C", descriptor = "I")
	private int anInt328;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "D", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "w", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "x", descriptor = "I")
	public int anInt326;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "J", descriptor = "I")
	private int anInt331;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "K", descriptor = "I")
	private int anInt332;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "L", descriptor = "I")
	public int anInt333;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "E", descriptor = "I")
	public int anInt330;

	@OriginalMember(owner = "client!IRBOJPFQ", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class8_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			if (arg4 != this.anInt334) {
				this.anInt334 = -401;
			}
			this.aClass44_2 = Class44.aClass44Array1[arg10];
			this.anInt320 = arg9;
			this.anInt327 = arg7;
			this.anInt328 = arg6;
			this.anInt329 = arg0;
			this.anInt325 = arg1;
			this.anInt326 = arg2;
			this.anInt331 = arg3;
			this.anInt332 = arg5;
			this.anInt333 = arg8;
			this.anInt330 = arg11;
			this.aBoolean87 = false;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("83887, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IRBOJPFQ", name = "a", descriptor = "(IIZII)V")
	public void method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean87) {
				local8 = arg1 - this.anInt327;
				@Pc(14) double local14 = (double) (arg0 - this.anInt328);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt327 + local8 * (double) this.anInt332 / local23;
				this.aDouble2 = (double) this.anInt328 + local14 * (double) this.anInt332 / local23;
				this.aDouble3 = this.anInt329;
			}
			local8 = this.anInt326 + 1 - arg3;
			this.aDouble5 = ((double) arg1 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg0 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean87) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt331 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg2 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("8218, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IRBOJPFQ", name = "a", descriptor = "(I)Lclient!VHYCWIPJ;")
	@Override
	protected Class8_Sub1_Sub2_Sub5 method557() {
		try {
			@Pc(3) Class8_Sub1_Sub2_Sub5 local3 = this.aClass44_2.method551();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass44_2.aClass40_1 != null) {
				local9 = this.aClass44_2.aClass40_1.anIntArray159[this.anInt323];
			}
			@Pc(41) Class8_Sub1_Sub2_Sub5 local41 = new Class8_Sub1_Sub2_Sub5((byte) 9, Class35.method448(local9, this.aByte17), true, false, local3);
			if (local9 != -1) {
				local41.method470();
				local41.method471(local9);
				local41.anIntArrayArray16 = null;
				local41.anIntArrayArray15 = null;
			}
			if (this.aClass44_2.anInt780 != 128 || this.aClass44_2.anInt781 != 128) {
				local41.method479(this.aBoolean89, this.aClass44_2.anInt780, this.aClass44_2.anInt780, this.aClass44_2.anInt781);
			}
			local41.method475(this.anInt319, this.anInt322);
			local41.method480(this.aClass44_2.anInt783 + 64, this.aClass44_2.anInt784 + 850, -30, -50, -30, true);
			return local41;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("26452, " + -650 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IRBOJPFQ", name = "a", descriptor = "(ZI)V")
	public void method280(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean87 = true;
			this.aDouble1 += this.aDouble5 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
			this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
			this.anInt321 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt322 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass44_2.aClass40_1 != null) {
				this.anInt324 += arg0;
				while (this.anInt324 > this.aClass44_2.aClass40_1.method522(this.anInt323)) {
					this.anInt324 -= this.aClass44_2.aClass40_1.method522(this.anInt323) + 1;
					this.anInt323++;
					if (this.anInt323 >= this.aClass44_2.aClass40_1.anInt753) {
						this.anInt323 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("37801, " + true + ", " + arg0 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
