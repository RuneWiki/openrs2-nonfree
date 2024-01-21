import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RGPDRBLW")
public final class Class2_Sub1_Sub3_Sub3 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!RGPDRBLW", name = "n", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!RGPDRBLW", name = "o", descriptor = "I")
	private int anInt558;

	@OriginalMember(owner = "client!RGPDRBLW", name = "r", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!RGPDRBLW", name = "s", descriptor = "I")
	private int anInt562;

	@OriginalMember(owner = "client!RGPDRBLW", name = "u", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!RGPDRBLW", name = "v", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!RGPDRBLW", name = "w", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!RGPDRBLW", name = "x", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!RGPDRBLW", name = "z", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!RGPDRBLW", name = "J", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!RGPDRBLW", name = "K", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!RGPDRBLW", name = "L", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!RGPDRBLW", name = "M", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!RGPDRBLW", name = "t", descriptor = "I")
	private int anInt563 = 8;

	@OriginalMember(owner = "client!RGPDRBLW", name = "y", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!RGPDRBLW", name = "A", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!RGPDRBLW", name = "N", descriptor = "Lclient!MHWTJCHJ;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!RGPDRBLW", name = "E", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!RGPDRBLW", name = "F", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!RGPDRBLW", name = "G", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!RGPDRBLW", name = "H", descriptor = "I")
	private int anInt571;

	@OriginalMember(owner = "client!RGPDRBLW", name = "p", descriptor = "I")
	public int anInt559;

	@OriginalMember(owner = "client!RGPDRBLW", name = "q", descriptor = "I")
	public int anInt560;

	@OriginalMember(owner = "client!RGPDRBLW", name = "B", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!RGPDRBLW", name = "C", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!RGPDRBLW", name = "D", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!RGPDRBLW", name = "I", descriptor = "I")
	public int anInt572;

	@OriginalMember(owner = "client!RGPDRBLW", name = "<init>", descriptor = "(IIIIIIIIIIBI)V")
	public Class2_Sub1_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass27_1 = Class27.aClass27Array1[arg1];
			if (arg10 != 42) {
				this.aBoolean161 = !this.aBoolean161;
			}
			this.anInt568 = arg4;
			this.anInt569 = arg5;
			this.anInt570 = arg11;
			this.anInt571 = arg7;
			this.anInt559 = arg0;
			this.anInt560 = arg8;
			this.anInt565 = arg2;
			this.anInt566 = arg3;
			this.anInt567 = arg9;
			this.anInt572 = arg6;
			this.aBoolean160 = false;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("37831, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGPDRBLW", name = "a", descriptor = "(B)Lclient!RMLAXPMV;")
	@Override
	protected Class2_Sub1_Sub3_Sub4 method489(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			@Pc(13) Class2_Sub1_Sub3_Sub4 local13 = this.aClass27_1.method316();
			if (local13 == null) {
				return null;
			}
			@Pc(19) int local19 = -1;
			if (this.aClass27_1.aClass22_1 != null) {
				local19 = this.aClass27_1.aClass22_1.anIntArray64[this.anInt561];
			}
			@Pc(42) Class2_Sub1_Sub3_Sub4 local42 = new Class2_Sub1_Sub3_Sub4(local13, Class45.method557(local19), true, false, true);
			if (local19 != -1) {
				local42.method438();
				local42.method439(local19);
				local42.anIntArrayArray16 = null;
				local42.anIntArrayArray15 = null;
			}
			if (this.aClass27_1.anInt400 != 128 || this.aClass27_1.anInt401 != 128) {
				local42.method447(this.aClass27_1.anInt401, this.aClass27_1.anInt400, this.aClass27_1.anInt400, this.anInt564);
			}
			local42.method443(this.anInt558);
			local42.method448(this.aClass27_1.anInt403 + 64, this.aClass27_1.anInt404 + 850, -30, -50, -30, true);
			return local42;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("58271, " + arg0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGPDRBLW", name = "a", descriptor = "(IIIIB)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean160) {
				local8 = arg1 - this.anInt569;
				@Pc(14) double local14 = (double) (arg2 - this.anInt570);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble6 = (double) this.anInt569 + local8 * (double) this.anInt566 / local23;
				this.aDouble7 = (double) this.anInt570 + local14 * (double) this.anInt566 / local23;
				this.aDouble8 = this.anInt571;
			}
			local8 = this.anInt560 + 1 - arg3;
			this.aDouble1 = ((double) arg1 - this.aDouble6) / local8;
			this.aDouble2 = ((double) arg2 - this.aDouble7) / local8;
			this.aDouble3 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
			if (!this.aBoolean160) {
				this.aDouble4 = -this.aDouble3 * Math.tan((double) this.anInt565 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg0 - this.aDouble8 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("27983, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 48 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGPDRBLW", name = "a", descriptor = "(IB)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aBoolean160 = true;
			this.aDouble6 += this.aDouble1 * (double) arg0;
			this.aDouble7 += this.aDouble2 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble5 * (double) arg0;
			this.anInt557 = (int) (Math.atan2(this.aDouble1, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
			@Pc(74) boolean local74 = false;
			this.anInt558 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) & 0x7FF;
			if (this.aClass27_1.aClass22_1 != null) {
				this.anInt562 += arg0;
				while (this.anInt562 > this.aClass27_1.aClass22_1.method265(this.anInt561, this.anInt563)) {
					this.anInt562 -= this.aClass27_1.aClass22_1.method265(this.anInt561, this.anInt563);
					this.anInt561++;
					if (this.anInt561 >= this.aClass27_1.aClass22_1.anInt262) {
						this.anInt561 = 0;
					}
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("62338, " + arg0 + ", " + arg1 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}
}
