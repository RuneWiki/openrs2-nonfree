import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KTKZBCIU")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!KTKZBCIU", name = "o", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!KTKZBCIU", name = "u", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!KTKZBCIU", name = "v", descriptor = "I")
	private int anInt393;

	@OriginalMember(owner = "client!KTKZBCIU", name = "w", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!KTKZBCIU", name = "x", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!KTKZBCIU", name = "y", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!KTKZBCIU", name = "z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!KTKZBCIU", name = "A", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!KTKZBCIU", name = "B", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!KTKZBCIU", name = "C", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!KTKZBCIU", name = "I", descriptor = "I")
	public int anInt397;

	@OriginalMember(owner = "client!KTKZBCIU", name = "J", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!KTKZBCIU", name = "G", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!KTKZBCIU", name = "H", descriptor = "Z")
	private boolean aBoolean94 = true;

	@OriginalMember(owner = "client!KTKZBCIU", name = "l", descriptor = "Lclient!HTOEUNMD;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!KTKZBCIU", name = "p", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!KTKZBCIU", name = "q", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!KTKZBCIU", name = "r", descriptor = "I")
	private int anInt389;

	@OriginalMember(owner = "client!KTKZBCIU", name = "s", descriptor = "I")
	private int anInt390;

	@OriginalMember(owner = "client!KTKZBCIU", name = "m", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!KTKZBCIU", name = "n", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!KTKZBCIU", name = "D", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!KTKZBCIU", name = "E", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!KTKZBCIU", name = "F", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!KTKZBCIU", name = "t", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!KTKZBCIU", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass16_2 = Class16.aClass16Array1[arg1];
			this.anInt387 = arg9;
			this.anInt388 = arg7;
			this.anInt389 = arg11;
			this.anInt390 = arg0;
			this.anInt385 = arg8;
			this.anInt386 = arg3;
			this.anInt394 = arg6;
			this.anInt395 = arg4;
			this.anInt396 = arg10;
			this.anInt391 = arg5;
			this.aBoolean93 = false;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("31026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTKZBCIU", name = "a", descriptor = "(I)Lclient!OGORHYVW;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method565() {
		try {
			@Pc(3) Class2_Sub1_Sub1_Sub6 local3 = this.aClass16_2.method151();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass16_2.aClass22_2 != null) {
				local9 = this.aClass16_2.aClass22_2.anIntArray92[this.anInt392];
			}
			@Pc(32) Class2_Sub1_Sub1_Sub6 local32 = new Class2_Sub1_Sub1_Sub6(-18434, true, local3, Class29.method419(local9), false);
			if (local9 != -1) {
				local32.method392();
				local32.method393((byte) 9, local9);
				local32.anIntArrayArray16 = null;
				local32.anIntArrayArray15 = null;
			}
			if (this.aClass16_2.anInt241 != 128 || this.aClass16_2.anInt242 != 128) {
				local32.method401(this.aClass16_2.anInt241, this.aClass16_2.anInt241, this.aClass16_2.anInt242);
			}
			local32.method397(this.anInt398);
			local32.method402(this.aClass16_2.anInt244 + 64, this.aClass16_2.anInt245 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("13405, " + 0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTKZBCIU", name = "a", descriptor = "(IIIII)V")
	public void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean93) {
				local8 = arg2 - this.anInt388;
				@Pc(14) double local14 = (double) (arg0 - this.anInt389);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble6 = (double) this.anInt388 + local8 * (double) this.anInt395 / local23;
				this.aDouble7 = (double) this.anInt389 + local14 * (double) this.anInt395 / local23;
				this.aDouble8 = this.anInt390;
			}
			local8 = this.anInt386 + 1 - arg3;
			this.aDouble2 = ((double) arg2 - this.aDouble6) / local8;
			this.aDouble3 = ((double) arg0 - this.aDouble7) / local8;
			this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
			if (!this.aBoolean93) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt394 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg1 - this.aDouble8 - this.aDouble5 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("11761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -477 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTKZBCIU", name = "a", descriptor = "(IZ)V")
	public void method284(@OriginalArg(0) int arg0) {
		try {
			this.aBoolean93 = true;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
			this.aDouble8 += this.aDouble5 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.anInt397 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
			this.anInt398 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 325.949D) & 0x7FF;
			if (this.aClass16_2.aClass22_2 != null) {
				this.anInt393 += arg0;
				while (this.anInt393 > this.aClass16_2.aClass22_2.method277(this.anInt392)) {
					this.anInt393 -= this.aClass16_2.aClass22_2.method277(this.anInt392) + 1;
					this.anInt392++;
					if (this.anInt392 >= this.aClass16_2.aClass22_2.anInt372) {
						this.anInt392 = 0;
					}
				}
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("76295, " + arg0 + ", " + true + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
