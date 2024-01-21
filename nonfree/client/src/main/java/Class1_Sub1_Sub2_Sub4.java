import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HEJSGXMA")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!HEJSGXMA", name = "n", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!HEJSGXMA", name = "o", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!HEJSGXMA", name = "p", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!HEJSGXMA", name = "q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!HEJSGXMA", name = "u", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!HEJSGXMA", name = "v", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!HEJSGXMA", name = "w", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!HEJSGXMA", name = "J", descriptor = "I")
	public int anInt315;

	@OriginalMember(owner = "client!HEJSGXMA", name = "K", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!HEJSGXMA", name = "M", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!HEJSGXMA", name = "N", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!HEJSGXMA", name = "O", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!HEJSGXMA", name = "l", descriptor = "I")
	private int anInt302 = 6;

	@OriginalMember(owner = "client!HEJSGXMA", name = "m", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!HEJSGXMA", name = "x", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!HEJSGXMA", name = "y", descriptor = "I")
	private int anInt305 = -508;

	@OriginalMember(owner = "client!HEJSGXMA", name = "E", descriptor = "B")
	private byte aByte19 = 1;

	@OriginalMember(owner = "client!HEJSGXMA", name = "I", descriptor = "I")
	private int anInt314 = -374;

	@OriginalMember(owner = "client!HEJSGXMA", name = "L", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!HEJSGXMA", name = "P", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!HEJSGXMA", name = "t", descriptor = "Lclient!UAVNMKVJ;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!HEJSGXMA", name = "z", descriptor = "I")
	public int anInt306;

	@OriginalMember(owner = "client!HEJSGXMA", name = "A", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!HEJSGXMA", name = "B", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!HEJSGXMA", name = "C", descriptor = "I")
	private int anInt309;

	@OriginalMember(owner = "client!HEJSGXMA", name = "r", descriptor = "I")
	public int anInt303;

	@OriginalMember(owner = "client!HEJSGXMA", name = "s", descriptor = "I")
	public int anInt304;

	@OriginalMember(owner = "client!HEJSGXMA", name = "F", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!HEJSGXMA", name = "G", descriptor = "I")
	private int anInt312;

	@OriginalMember(owner = "client!HEJSGXMA", name = "H", descriptor = "I")
	public int anInt313;

	@OriginalMember(owner = "client!HEJSGXMA", name = "D", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!HEJSGXMA", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass44_1 = Class44.aClass44Array1[arg0];
			this.anInt306 = arg11;
			this.anInt307 = arg2;
			this.anInt308 = arg7;
			this.anInt309 = arg6;
			this.anInt303 = arg1;
			this.anInt304 = arg8;
			this.anInt311 = arg10;
			this.anInt312 = arg4;
			this.anInt313 = arg3;
			this.anInt310 = arg9;
			this.aBoolean73 = false;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("26766, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HEJSGXMA", name = "a", descriptor = "(II)V")
	public void method217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean73 = true;
			if (arg0 > 0) {
				this.aDouble5 += this.aDouble1 * (double) arg1;
				this.aDouble6 += this.aDouble2 * (double) arg1;
				this.aDouble7 += this.aDouble4 * (double) arg1 + this.aDouble8 * 0.5D * (double) arg1 * (double) arg1;
				this.aDouble4 += this.aDouble8 * (double) arg1;
				this.anInt315 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
				this.anInt316 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
				if (this.aClass44_1.aClass23_2 != null) {
					this.anInt318 += arg1;
					while (this.anInt318 > this.aClass44_1.aClass23_2.method293(this.anInt302, this.anInt317)) {
						this.anInt318 -= this.aClass44_1.aClass23_2.method293(this.anInt302, this.anInt317) + 1;
						this.anInt317++;
						if (this.anInt317 >= this.aClass44_1.aClass23_2.anInt387) {
							this.anInt317 = 0;
						}
					}
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("94690, " + arg0 + ", " + arg1 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HEJSGXMA", name = "a", descriptor = "(IIIIZ)V")
	public void method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean73) {
				local8 = arg1 - this.anInt307;
				@Pc(14) double local14 = (double) (arg2 - this.anInt308);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble5 = (double) this.anInt307 + local8 * (double) this.anInt312 / local23;
				this.aDouble6 = (double) this.anInt308 + local14 * (double) this.anInt312 / local23;
				this.aDouble7 = this.anInt309;
			}
			local8 = this.anInt304 + 1 - arg3;
			this.aDouble1 = ((double) arg1 - this.aDouble5) / local8;
			this.aDouble2 = ((double) arg2 - this.aDouble6) / local8;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean73) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt311 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble7 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("6876, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HEJSGXMA", name = "a", descriptor = "(I)Lclient!RTQSBWRH;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method410() {
		try {
			@Pc(3) Class1_Sub1_Sub2_Sub6 local3 = this.aClass44_1.method463();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass44_1.aClass23_2 != null) {
				local9 = this.aClass44_1.aClass23_2.anIntArray76[this.anInt317];
			}
			@Pc(32) Class1_Sub1_Sub2_Sub6 local32 = new Class1_Sub1_Sub2_Sub6(true, -28456, Class13.method147(local9), local3, false);
			if (local9 != -1) {
				local32.method422(this.anInt314);
				local32.method423(local9, this.aByte19);
				local32.anIntArrayArray11 = null;
				local32.anIntArrayArray10 = null;
			}
			if (this.aClass44_1.anInt726 != 128 || this.aClass44_1.anInt727 != 128) {
				local32.method431(this.aClass44_1.anInt727, this.aClass44_1.anInt726, this.aClass44_1.anInt726);
			}
			local32.method427(this.anInt316);
			local32.method432(this.aClass44_1.anInt729 + 64, this.aClass44_1.anInt730 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("18148, " + -704 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}
}
