import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HMUVVYST")
public final class Class8_Sub1_Sub1_Sub4 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!HMUVVYST", name = "r", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!HMUVVYST", name = "s", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!HMUVVYST", name = "t", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!HMUVVYST", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!HMUVVYST", name = "A", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!HMUVVYST", name = "B", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!HMUVVYST", name = "C", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!HMUVVYST", name = "D", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!HMUVVYST", name = "E", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!HMUVVYST", name = "F", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!HMUVVYST", name = "I", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!HMUVVYST", name = "J", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!HMUVVYST", name = "u", descriptor = "I")
	private int anInt211 = -140;

	@OriginalMember(owner = "client!HMUVVYST", name = "w", descriptor = "Z")
	private boolean aBoolean49 = false;

	@OriginalMember(owner = "client!HMUVVYST", name = "L", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!HMUVVYST", name = "q", descriptor = "Lclient!EBBSHPSJ;")
	private Class12 aClass12_2;

	@OriginalMember(owner = "client!HMUVVYST", name = "K", descriptor = "I")
	public int anInt221;

	@OriginalMember(owner = "client!HMUVVYST", name = "m", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!HMUVVYST", name = "n", descriptor = "I")
	private int anInt208;

	@OriginalMember(owner = "client!HMUVVYST", name = "o", descriptor = "I")
	private int anInt209;

	@OriginalMember(owner = "client!HMUVVYST", name = "G", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!HMUVVYST", name = "H", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!HMUVVYST", name = "x", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!HMUVVYST", name = "y", descriptor = "I")
	private int anInt213;

	@OriginalMember(owner = "client!HMUVVYST", name = "z", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!HMUVVYST", name = "p", descriptor = "I")
	public int anInt210;

	@OriginalMember(owner = "client!HMUVVYST", name = "<init>", descriptor = "(IIIIBIIIIIII)V")
	public Class8_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass12_2 = Class12.aClass12Array1[arg10];
			this.anInt221 = arg8;
			this.anInt207 = arg11;
			this.anInt208 = arg9;
			this.anInt209 = arg1;
			@Pc(32) boolean local32 = false;
			this.anInt217 = arg0;
			this.anInt218 = arg2;
			this.anInt212 = arg3;
			this.anInt213 = arg6;
			this.anInt214 = arg5;
			this.anInt210 = arg7;
			this.aBoolean50 = false;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("68635, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HMUVVYST", name = "a", descriptor = "(IIZII)V")
	public void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(8) double local8;
			if (!this.aBoolean50) {
				local8 = arg0 - this.anInt207;
				@Pc(14) double local14 = (double) (arg3 - this.anInt208);
				@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
				this.aDouble1 = (double) this.anInt207 + local8 * (double) this.anInt213 / local23;
				this.aDouble2 = (double) this.anInt208 + local14 * (double) this.anInt213 / local23;
				this.aDouble3 = this.anInt209;
			}
			local8 = this.anInt218 + 1 - arg2;
			this.aDouble5 = ((double) arg0 - this.aDouble1) / local8;
			this.aDouble6 = ((double) arg3 - this.aDouble2) / local8;
			this.aDouble7 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
			if (!this.aBoolean50) {
				this.aDouble8 = -this.aDouble7 * Math.tan((double) this.anInt212 * 0.02454369D);
			}
			this.aDouble4 = ((double) arg1 - this.aDouble3 - this.aDouble8 * local8) * 2.0D / (local8 * local8);
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("8225, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HMUVVYST", name = "a", descriptor = "(B)Lclient!JJMVUSJJ;")
	@Override
	protected Class8_Sub1_Sub1_Sub5 method533(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class8_Sub1_Sub1_Sub5 local3 = this.aClass12_2.method75();
			if (local3 == null) {
				return null;
			}
			@Pc(16) int local16 = -1;
			if (this.aClass12_2.aClass46_1 != null) {
				local16 = this.aClass12_2.aClass46_1.anIntArray194[this.anInt215];
			}
			@Pc(39) Class8_Sub1_Sub1_Sub5 local39 = new Class8_Sub1_Sub1_Sub5(true, Class29.method309(local16), false, 9, local3);
			if (local16 != -1) {
				local39.method217(979);
				local39.method218(local16);
				local39.anIntArrayArray8 = null;
				local39.anIntArrayArray7 = null;
			}
			if (this.aClass12_2.anInt104 != 128 || this.aClass12_2.anInt105 != 128) {
				local39.method226(this.aClass12_2.anInt105, this.aClass12_2.anInt104, this.aClass12_2.anInt104);
			}
			local39.method222(this.anInt220);
			local39.method227(this.aClass12_2.anInt107 + 64, this.aClass12_2.anInt108 + 850, -30, -50, -30, true);
			return local39;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("59263, " + 7 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HMUVVYST", name = "a", descriptor = "(ZI)V")
	public void method134(@OriginalArg(1) int arg0) {
		try {
			this.aBoolean50 = true;
			this.aDouble1 += this.aDouble5 * (double) arg0;
			this.aDouble2 += this.aDouble6 * (double) arg0;
			this.aDouble3 += this.aDouble8 * (double) arg0 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble8 += this.aDouble4 * (double) arg0;
			this.anInt219 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
			this.anInt220 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) & 0x7FF;
			if (this.aClass12_2.aClass46_1 != null) {
				this.anInt216 += arg0;
				while (this.anInt216 > this.aClass12_2.aClass46_1.method486(this.anInt215, (byte) 6)) {
					this.anInt216 -= this.aClass12_2.aClass46_1.method486(this.anInt215, (byte) 6);
					this.anInt215++;
					if (this.anInt215 >= this.aClass12_2.aClass46_1.anInt759) {
						this.anInt215 = 0;
					}
				}
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("43373, " + false + ", " + arg0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
