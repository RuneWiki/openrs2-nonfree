import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1_Sub4 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "I")
	private int anInt454;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!db", name = "C", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	private int anInt469;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private int anInt455 = 9;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "Z")
	private boolean aBoolean97 = true;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "Lclient!qc;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt457;

	@OriginalMember(owner = "client!db", name = "s", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	private int anInt459;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIIIIZI)V")
	public Class1_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass35_1 = Class35.aClass35Array1[arg0];
			this.anInt456 = arg5;
			this.anInt457 = arg9;
			this.anInt458 = arg3;
			this.anInt459 = arg4;
			this.anInt461 = arg1;
			this.anInt462 = arg8;
			this.anInt463 = arg6;
			this.anInt464 = arg11;
			this.anInt465 = arg2;
			this.anInt460 = arg7;
			this.aBoolean98 = false;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("7494, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	public void method234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean98) {
				local8 = arg0 - this.anInt457;
				@Pc(14) double local14 = (double) (arg2 - this.anInt458);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt457 + local8 * (double) this.anInt464 / local23;
				this.aDouble2 = (double) this.anInt458 + local14 * (double) this.anInt464 / local23;
				this.aDouble3 = this.anInt459;
			}
			local8 = this.anInt462 + 1 - arg3;
			this.aDouble4 = ((double) arg0 - this.aDouble1) / local8;
			this.aDouble5 = ((double) arg2 - this.aDouble2) / local8;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean98) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt463 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg1 - this.aDouble3 - this.aDouble7 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("42194, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
	public void method235(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean98 = true;
			this.aDouble1 += this.aDouble4 * (double) arg0;
			this.aDouble2 += this.aDouble5 * (double) arg0;
			this.aDouble3 += this.aDouble7 * (double) arg0 + this.aDouble8 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble7 += this.aDouble8 * (double) arg0;
			this.anInt466 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
			this.anInt467 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 0x7FF;
			if (this.aClass35_1.aClass29_2 != null) {
				this.anInt469 += arg0;
				while (this.anInt469 > this.aClass35_1.aClass29_2.method529(this.anInt468)) {
					this.anInt469 -= this.aClass35_1.aClass29_2.method529(this.anInt468) + 1;
					this.anInt468++;
					if (this.anInt468 >= this.aClass35_1.aClass29_2.anInt807) {
						this.anInt468 = 0;
					}
				}
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("88785, " + true + ", " + arg0 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method693() {
		try {
			@Pc(3) Class1_Sub1_Sub1_Sub5 local3 = this.aClass35_1.method546();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass35_1.aClass29_2 != null) {
				local9 = this.aClass35_1.aClass29_2.anIntArray237[this.anInt468];
			}
			@Pc(39) Class1_Sub1_Sub1_Sub5 local39 = new Class1_Sub1_Sub1_Sub5(false, -164, local3, true, Class12.method304(local9));
			if (local9 != -1) {
				local39.method263(this.anInt454);
				local39.method264(local9);
				local39.anIntArrayArray9 = null;
				local39.anIntArrayArray8 = null;
			}
			if (this.aClass35_1.anInt845 != 128 || this.aClass35_1.anInt846 != 128) {
				local39.method272(this.aClass35_1.anInt845, this.aClass35_1.anInt845, this.aClass35_1.anInt846);
			}
			local39.method268(this.anInt467);
			local39.method273(this.aClass35_1.anInt848 + 64, this.aClass35_1.anInt849 + 850, -30, -50, -30, true);
			return local39;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("977, " + -21173 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}
}
