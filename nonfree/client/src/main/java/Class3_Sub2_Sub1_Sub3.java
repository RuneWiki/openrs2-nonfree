import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class3_Sub2_Sub1_Sub3 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!je", name = "V", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!je", name = "X", descriptor = "I")
	private int anInt2244;

	@OriginalMember(owner = "client!je", name = "ib", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!je", name = "jb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!je", name = "ob", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!je", name = "pb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!je", name = "tb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!je", name = "ub", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!je", name = "zb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!je", name = "Cb", descriptor = "I")
	public int anInt2258;

	@OriginalMember(owner = "client!je", name = "nb", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!je", name = "qb", descriptor = "I")
	private int anInt2252 = 0;

	@OriginalMember(owner = "client!je", name = "Hb", descriptor = "I")
	private int anInt2261 = 0;

	@OriginalMember(owner = "client!je", name = "ab", descriptor = "I")
	private final int anInt2246;

	@OriginalMember(owner = "client!je", name = "yb", descriptor = "I")
	private final int anInt2256;

	@OriginalMember(owner = "client!je", name = "db", descriptor = "I")
	public final int anInt2247;

	@OriginalMember(owner = "client!je", name = "vb", descriptor = "I")
	public final int anInt2254;

	@OriginalMember(owner = "client!je", name = "U", descriptor = "I")
	private final int anInt2243;

	@OriginalMember(owner = "client!je", name = "Gb", descriptor = "I")
	private final int anInt2260;

	@OriginalMember(owner = "client!je", name = "hb", descriptor = "I")
	private final int anInt2250;

	@OriginalMember(owner = "client!je", name = "kb", descriptor = "I")
	public final int anInt2251;

	@OriginalMember(owner = "client!je", name = "xb", descriptor = "I")
	private final int anInt2255;

	@OriginalMember(owner = "client!je", name = "eb", descriptor = "I")
	public final int anInt2248;

	@OriginalMember(owner = "client!je", name = "Bb", descriptor = "I")
	public final int anInt2257;

	@OriginalMember(owner = "client!je", name = "cb", descriptor = "Lclient!ca;")
	private final Class3_Sub2_Sub4 aClass3_Sub2_Sub4_1;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub2_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2246 = arg7;
		this.anInt2256 = arg0;
		this.anInt2247 = arg9;
		this.anInt2254 = arg5;
		this.anInt2243 = arg3;
		this.anInt2260 = arg4;
		this.anInt2250 = arg2;
		this.anInt2251 = arg1;
		this.anInt2255 = arg8;
		this.anInt2248 = arg6;
		this.anInt2257 = arg10;
		this.aBoolean116 = false;
		@Pc(52) int local52 = Static1.method8(this.anInt2256).anInt507;
		if (local52 == -1) {
			this.aClass3_Sub2_Sub4_1 = null;
		} else {
			this.aClass3_Sub2_Sub4_1 = Static21.method594(local52);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	public void method1730(@OriginalArg(1) int arg0) {
		this.aDouble2 += this.aDouble8 * (double) arg0;
		this.aDouble7 += (double) arg0 * this.aDouble5 + (double) arg0 * (double) arg0 * this.aDouble6 * 0.5D;
		this.aBoolean116 = true;
		this.aDouble5 += this.aDouble6 * (double) arg0;
		this.aDouble1 += (double) arg0 * this.aDouble4;
		this.anInt2258 = (int) (Math.atan2(this.aDouble8, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt2244 = (int) (Math.atan2(this.aDouble5, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub2_Sub4_1 == null) {
			return;
		}
		this.anInt2261 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass3_Sub2_Sub4_1.anIntArray139[this.anInt2252] >= this.anInt2261) {
						return;
					}
					this.anInt2261 -= this.aClass3_Sub2_Sub4_1.anIntArray139[this.anInt2252];
					this.anInt2252++;
				} while (this.anInt2252 < this.aClass3_Sub2_Sub4_1.anIntArray142.length);
				this.anInt2252 -= this.aClass3_Sub2_Sub4_1.anInt533;
			} while (this.anInt2252 >= 0 && this.aClass3_Sub2_Sub4_1.anIntArray142.length > this.anInt2252);
			this.anInt2252 = 0;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBIII)V")
	public void method1731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) double local18;
		if (!this.aBoolean116) {
			@Pc(12) double local12 = (double) (arg1 - this.anInt2243);
			local18 = arg3 - this.anInt2250;
			@Pc(27) double local27 = Math.sqrt(local12 * local12 + local18 * local18);
			this.aDouble1 = (double) this.anInt2255 * local12 / local27 + (double) this.anInt2243;
			this.aDouble2 = local18 * (double) this.anInt2255 / local27 + (double) this.anInt2250;
			this.aDouble7 = this.anInt2260;
		}
		local18 = this.anInt2248 + 1 - arg2;
		this.aDouble4 = ((double) arg1 - this.aDouble1) / local18;
		this.aDouble8 = ((double) arg3 - this.aDouble2) / local18;
		this.aDouble3 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean116) {
			this.aDouble5 = -this.aDouble3 * Math.tan((double) this.anInt2246 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg0 - local18 * this.aDouble5 - this.aDouble7) * 2.0D / (local18 * local18);
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Lclient!d;")
	@Override
	protected Class3_Sub2_Sub1_Sub1 method2761() {
		@Pc(8) Class3_Sub2_Sub3 local8 = Static1.method8(this.anInt2256);
		@Pc(14) Class3_Sub2_Sub1_Sub1 local14 = local8.method553(this.anInt2252);
		if (local14 == null) {
			return null;
		} else {
			local14.method202(this.anInt2244);
			return local14;
		}
	}
}
