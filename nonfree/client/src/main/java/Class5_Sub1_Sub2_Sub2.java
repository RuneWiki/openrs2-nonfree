import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IJDLXEFP")
public final class Class5_Sub1_Sub2_Sub2 extends Class5_Sub1_Sub2 {

	@OriginalMember(owner = "client!IJDLXEFP", name = "q", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!IJDLXEFP", name = "r", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!IJDLXEFP", name = "s", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!IJDLXEFP", name = "t", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!IJDLXEFP", name = "u", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!IJDLXEFP", name = "v", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!IJDLXEFP", name = "w", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!IJDLXEFP", name = "x", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!IJDLXEFP", name = "z", descriptor = "I")
	public int anInt227;

	@OriginalMember(owner = "client!IJDLXEFP", name = "A", descriptor = "I")
	private int anInt228;

	@OriginalMember(owner = "client!IJDLXEFP", name = "B", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!IJDLXEFP", name = "C", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!IJDLXEFP", name = "p", descriptor = "I")
	private int anInt226 = -551;

	@OriginalMember(owner = "client!IJDLXEFP", name = "y", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!IJDLXEFP", name = "J", descriptor = "Lclient!HTWOTIWO;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!IJDLXEFP", name = "I", descriptor = "I")
	public int anInt236;

	@OriginalMember(owner = "client!IJDLXEFP", name = "l", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!IJDLXEFP", name = "m", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!IJDLXEFP", name = "n", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!IJDLXEFP", name = "D", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!IJDLXEFP", name = "E", descriptor = "I")
	public int anInt232;

	@OriginalMember(owner = "client!IJDLXEFP", name = "F", descriptor = "I")
	private int anInt233;

	@OriginalMember(owner = "client!IJDLXEFP", name = "G", descriptor = "I")
	private int anInt234;

	@OriginalMember(owner = "client!IJDLXEFP", name = "H", descriptor = "I")
	public int anInt235;

	@OriginalMember(owner = "client!IJDLXEFP", name = "o", descriptor = "I")
	public int anInt225;

	@OriginalMember(owner = "client!IJDLXEFP", name = "<init>", descriptor = "(IIIIIIIIZIII)V")
	public Class5_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		try {
			this.aClass20_2 = Class20.aClass20Array1[arg7];
			this.anInt236 = arg9;
			this.anInt222 = arg4;
			this.anInt223 = arg0;
			this.anInt224 = arg3;
			this.anInt231 = arg6;
			this.anInt232 = arg11;
			this.anInt233 = arg1;
			this.anInt234 = arg5;
			this.anInt235 = arg10;
			this.anInt225 = arg2;
			this.aBoolean69 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("12081, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJDLXEFP", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	@Override
	protected Class5_Sub1_Sub2_Sub5 method422() {
		try {
			@Pc(3) Class5_Sub1_Sub2_Sub5 local3 = this.aClass20_2.method132();
			if (local3 == null) {
				return null;
			}
			@Pc(9) int local9 = -1;
			if (this.aClass20_2.aClass11_1 != null) {
				local9 = this.aClass20_2.aClass11_1.anIntArray25[this.anInt229];
			}
			@Pc(32) Class5_Sub1_Sub2_Sub5 local32 = new Class5_Sub1_Sub2_Sub5(local3, -42752, Class3.method5(local9), true, false);
			if (local9 != -1) {
				local32.method331();
				local32.method332(local9);
				local32.anIntArrayArray11 = null;
				local32.anIntArrayArray10 = null;
			}
			if (this.aClass20_2.anInt209 != 128 || this.aClass20_2.anInt210 != 128) {
				local32.method340(this.aClass20_2.anInt210, this.aClass20_2.anInt209, this.aClass20_2.anInt209);
			}
			local32.method336(this.anInt228);
			local32.method341(this.aClass20_2.anInt212 + 64, this.aClass20_2.anInt213 + 850, -30, -50, -30, true);
			return local32;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("61788, " + 27243 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJDLXEFP", name = "a", descriptor = "(II)V")
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aBoolean69 = true;
			this.aDouble6 += this.aDouble2 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
			this.aDouble8 += this.aDouble5 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble5 += this.aDouble1 * (double) arg0;
			this.anInt227 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
			this.anInt228 = (int) (Math.atan2(this.aDouble5, this.aDouble4) * 325.949D) & 0x7FF;
			while (arg1 >= 0) {
				this.anInt226 = 158;
			}
			if (this.aClass20_2.aClass11_1 != null) {
				this.anInt230 += arg0;
				while (this.anInt230 > this.aClass20_2.aClass11_1.method96(this.anInt229)) {
					this.anInt230 -= this.aClass20_2.aClass11_1.method96(this.anInt229) + 1;
					this.anInt229++;
					if (this.anInt229 >= this.aClass20_2.aClass11_1.anInt103) {
						this.anInt229 = 0;
					}
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("85069, " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IJDLXEFP", name = "a", descriptor = "(IBIII)V")
	public void method138(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(12) double local12;
			if (!this.aBoolean69) {
				local12 = arg0 - this.anInt222;
				@Pc(18) double local18 = (double) (arg1 - this.anInt223);
				@Pc(27) double local27 = Math.sqrt(local12 * local12 + local18 * local18);
				this.aDouble6 = (double) this.anInt222 + local12 * (double) this.anInt234 / local27;
				this.aDouble7 = (double) this.anInt223 + local18 * (double) this.anInt234 / local27;
				this.aDouble8 = this.anInt224;
			}
			local12 = this.anInt232 + 1 - arg2;
			this.aDouble2 = ((double) arg0 - this.aDouble6) / local12;
			this.aDouble3 = ((double) arg1 - this.aDouble7) / local12;
			this.aDouble4 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
			if (!this.aBoolean69) {
				this.aDouble5 = -this.aDouble4 * Math.tan((double) this.anInt233 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg3 - this.aDouble8 - this.aDouble5 * local12) * 2.0D / (local12 * local12);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("21548, " + arg0 + ", " + -51 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}
}
