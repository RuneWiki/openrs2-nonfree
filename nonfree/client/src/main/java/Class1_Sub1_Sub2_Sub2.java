import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ka", name = "Ub", descriptor = "[I")
	public static int[] anIntArray186 = new int[32];

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ka", name = "ub", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!ka", name = "Cb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ka", name = "Eb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!ka", name = "Gb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ka", name = "Ib", descriptor = "I")
	private int anInt1287;

	@OriginalMember(owner = "client!ka", name = "Lb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ka", name = "Nb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ka", name = "Ob", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!ka", name = "Sb", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!ka", name = "Hb", descriptor = "I")
	private int anInt1286 = 0;

	@OriginalMember(owner = "client!ka", name = "Yb", descriptor = "I")
	private int anInt1296 = 0;

	@OriginalMember(owner = "client!ka", name = "ac", descriptor = "I")
	private final int anInt1297;

	@OriginalMember(owner = "client!ka", name = "Mb", descriptor = "I")
	public final int anInt1290;

	@OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
	public final int anInt1279;

	@OriginalMember(owner = "client!ka", name = "zb", descriptor = "I")
	private final int anInt1282;

	@OriginalMember(owner = "client!ka", name = "Jb", descriptor = "I")
	private final int anInt1288;

	@OriginalMember(owner = "client!ka", name = "Db", descriptor = "I")
	private final int anInt1285;

	@OriginalMember(owner = "client!ka", name = "Ab", descriptor = "I")
	private final int anInt1283;

	@OriginalMember(owner = "client!ka", name = "Bb", descriptor = "I")
	public final int anInt1284;

	@OriginalMember(owner = "client!ka", name = "hc", descriptor = "I")
	public final int anInt1301;

	@OriginalMember(owner = "client!ka", name = "Wb", descriptor = "I")
	public final int anInt1294;

	@OriginalMember(owner = "client!ka", name = "Xb", descriptor = "I")
	private final int anInt1295;

	@OriginalMember(owner = "client!ka", name = "ic", descriptor = "Lclient!e;")
	private final Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray186[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1297 = arg8;
		this.anInt1290 = arg9;
		this.anInt1279 = arg5;
		this.anInt1282 = arg2;
		this.anInt1288 = arg7;
		this.anInt1285 = arg0;
		this.anInt1283 = arg4;
		this.aBoolean72 = false;
		this.anInt1284 = arg10;
		this.anInt1301 = arg6;
		this.anInt1294 = arg1;
		this.anInt1295 = arg3;
		@Pc(52) int local52 = Static62.method1091(this.anInt1285).anInt1200;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub4_1 = null;
		} else {
			this.aClass1_Sub1_Sub4_1 = Static10.method254(local52);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public void method963(@OriginalArg(1) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble5;
		this.aDouble8 += (double) arg0 * this.aDouble1;
		this.aBoolean72 = true;
		this.aDouble4 += (double) arg0 * this.aDouble7 * 0.5D * (double) arg0 + this.aDouble3 * (double) arg0;
		this.aDouble3 += this.aDouble7 * (double) arg0;
		this.anInt1278 = (int) (Math.atan2(this.aDouble5, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt1287 = (int) (Math.atan2(this.aDouble3, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub4_1 == null) {
			return;
		}
		this.anInt1286 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt1286 <= this.aClass1_Sub1_Sub4_1.anIntArray96[this.anInt1296]) {
						return;
					}
					this.anInt1286 -= this.aClass1_Sub1_Sub4_1.anIntArray96[this.anInt1296];
					this.anInt1296++;
				} while (this.anInt1296 < this.aClass1_Sub1_Sub4_1.anIntArray97.length);
				this.anInt1296 -= this.aClass1_Sub1_Sub4_1.anInt707;
			} while (this.anInt1296 >= 0 && this.aClass1_Sub1_Sub4_1.anIntArray97.length > this.anInt1296);
			this.anInt1296 = 0;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIBI)V")
	public void method966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean72) {
			local13 = arg2 - this.anInt1282;
			@Pc(20) double local20 = (double) (arg1 - this.anInt1295);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble8 = (double) this.anInt1297 * local20 / local29 + (double) this.anInt1295;
			this.aDouble4 = this.anInt1283;
			this.aDouble2 = local13 * (double) this.anInt1297 / local29 + (double) this.anInt1282;
		}
		local13 = this.anInt1301 + 1 - arg3;
		this.aDouble5 = ((double) arg2 - this.aDouble2) / local13;
		this.aDouble1 = ((double) arg1 - this.aDouble8) / local13;
		this.aDouble6 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble1 * this.aDouble1);
		if (!this.aBoolean72) {
			this.aDouble3 = -this.aDouble6 * Math.tan((double) this.anInt1288 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg0 - this.aDouble4 - local13 * this.aDouble3) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Lclient!ue;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1910() {
		@Pc(8) Class1_Sub1_Sub8 local8 = Static62.method1091(this.anInt1285);
		@Pc(24) Class1_Sub1_Sub2_Sub7 local24 = local8.method915(this.anInt1296);
		if (local24 == null) {
			return null;
		} else {
			local24.method1916(this.anInt1287);
			return local24;
		}
	}
}
