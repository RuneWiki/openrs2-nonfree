import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub3_Sub4_Sub6 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!hd", name = "tb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!hd", name = "wb", descriptor = "I")
	private int anInt1234;

	@OriginalMember(owner = "client!hd", name = "yb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!hd", name = "Eb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!hd", name = "Ib", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!hd", name = "Wb", descriptor = "I")
	public int anInt1249;

	@OriginalMember(owner = "client!hd", name = "Xb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!hd", name = "Yb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!hd", name = "ac", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!hd", name = "Sb", descriptor = "I")
	private int anInt1248 = 0;

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "I")
	private int anInt1237 = 0;

	@OriginalMember(owner = "client!hd", name = "gc", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!hd", name = "cc", descriptor = "I")
	public final int anInt1251;

	@OriginalMember(owner = "client!hd", name = "pb", descriptor = "I")
	private final int anInt1231;

	@OriginalMember(owner = "client!hd", name = "Db", descriptor = "I")
	public final int anInt1239;

	@OriginalMember(owner = "client!hd", name = "Jb", descriptor = "I")
	private final int anInt1241;

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "I")
	public final int anInt1232;

	@OriginalMember(owner = "client!hd", name = "Ab", descriptor = "I")
	private final int anInt1236;

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "I")
	private final int anInt1233;

	@OriginalMember(owner = "client!hd", name = "Ob", descriptor = "I")
	private final int anInt1245;

	@OriginalMember(owner = "client!hd", name = "Cb", descriptor = "I")
	public final int anInt1238;

	@OriginalMember(owner = "client!hd", name = "ec", descriptor = "I")
	public final int anInt1252;

	@OriginalMember(owner = "client!hd", name = "Nb", descriptor = "I")
	private final int anInt1244;

	@OriginalMember(owner = "client!hd", name = "Qb", descriptor = "Lclient!nc;")
	private final Class1_Sub3_Sub11 aClass1_Sub3_Sub11_2;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub3_Sub4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1251 = arg6;
		this.anInt1231 = arg3;
		this.anInt1239 = arg1;
		this.anInt1241 = arg0;
		this.anInt1232 = arg9;
		this.anInt1236 = arg8;
		this.anInt1233 = arg2;
		this.anInt1245 = arg4;
		this.aBoolean37 = false;
		this.anInt1238 = arg10;
		this.anInt1252 = arg5;
		this.anInt1244 = arg7;
		@Pc(52) int local52 = Static82.method1448(this.anInt1241).anInt834;
		if (local52 == -1) {
			this.aClass1_Sub3_Sub11_2 = null;
		} else {
			this.aClass1_Sub3_Sub11_2 = Static77.method1316(local52);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIII)V")
	public void method894(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean37) {
			local8 = arg1 - this.anInt1233;
			@Pc(14) double local14 = (double) (arg0 - this.anInt1231);
			@Pc(23) double local23 = Math.sqrt(local14 * local14 + local8 * local8);
			this.aDouble1 = (double) this.anInt1233 + (double) this.anInt1236 * local8 / local23;
			this.aDouble2 = (double) this.anInt1231 + (double) this.anInt1236 * local14 / local23;
			this.aDouble8 = this.anInt1245;
		}
		local8 = this.anInt1251 + 1 - arg2;
		this.aDouble7 = ((double) arg1 - this.aDouble1) / local8;
		this.aDouble3 = ((double) arg0 - this.aDouble2) / local8;
		this.aDouble5 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble3 * this.aDouble3);
		if (!this.aBoolean37) {
			this.aDouble4 = -this.aDouble5 * Math.tan((double) this.anInt1244 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg3 - this.aDouble8 - this.aDouble4 * local8) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
	public void method895(@OriginalArg(1) int arg0) {
		this.aDouble2 += this.aDouble3 * (double) arg0;
		this.aDouble8 += this.aDouble6 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble4 * (double) arg0;
		this.aDouble4 += (double) arg0 * this.aDouble6;
		this.aBoolean37 = true;
		this.aDouble1 += this.aDouble7 * (double) arg0;
		this.anInt1249 = (int) (Math.atan2(this.aDouble7, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt1234 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub3_Sub11_2 == null) {
			return;
		}
		this.anInt1237 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub3_Sub11_2.anIntArray318[this.anInt1248] >= this.anInt1237) {
						return;
					}
					this.anInt1237 -= this.aClass1_Sub3_Sub11_2.anIntArray318[this.anInt1248];
					this.anInt1248++;
				} while (this.aClass1_Sub3_Sub11_2.anIntArray315.length > this.anInt1248);
				this.anInt1248 -= this.aClass1_Sub3_Sub11_2.anInt2051;
			} while (this.anInt1248 >= 0 && this.aClass1_Sub3_Sub11_2.anIntArray315.length > this.anInt1248);
			this.anInt1248 = 0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub4_Sub4 method2148() {
		@Pc(8) Class1_Sub3_Sub7 local8 = Static82.method1448(this.anInt1241);
		@Pc(14) Class1_Sub3_Sub4_Sub4 local14 = local8.method584(this.anInt1248);
		if (local14 == null) {
			return null;
		} else {
			local14.method645(this.anInt1234);
			return local14;
		}
	}
}
