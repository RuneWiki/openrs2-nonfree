import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class2_Sub2_Sub1_Sub1 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!af", name = "rb", descriptor = "I")
	private int anInt210;

	@OriginalMember(owner = "client!af", name = "Ab", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!af", name = "Cb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!af", name = "Db", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!af", name = "Eb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!af", name = "Pb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!af", name = "Yb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!af", name = "dc", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!af", name = "rc", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!af", name = "qb", descriptor = "I")
	private int anInt209 = 0;

	@OriginalMember(owner = "client!af", name = "tc", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!af", name = "Ib", descriptor = "I")
	private int anInt216 = 0;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
	public final int anInt206;

	@OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
	public final int anInt207;

	@OriginalMember(owner = "client!af", name = "Kb", descriptor = "I")
	public final int anInt217;

	@OriginalMember(owner = "client!af", name = "kc", descriptor = "I")
	private final int anInt223;

	@OriginalMember(owner = "client!af", name = "oc", descriptor = "I")
	private final int anInt224;

	@OriginalMember(owner = "client!af", name = "Vb", descriptor = "I")
	public final int anInt219;

	@OriginalMember(owner = "client!af", name = "tb", descriptor = "I")
	private final int anInt211;

	@OriginalMember(owner = "client!af", name = "fc", descriptor = "I")
	public final int anInt221;

	@OriginalMember(owner = "client!af", name = "wb", descriptor = "I")
	private final int anInt213;

	@OriginalMember(owner = "client!af", name = "Ac", descriptor = "I")
	private final int anInt226;

	@OriginalMember(owner = "client!af", name = "jc", descriptor = "I")
	private final int anInt222;

	@OriginalMember(owner = "client!af", name = "mc", descriptor = "Lclient!tc;")
	private final Class2_Sub2_Sub15 aClass2_Sub2_Sub15_1;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean9 = false;
		this.anInt206 = arg6;
		this.anInt207 = arg9;
		this.anInt217 = arg1;
		this.anInt223 = arg3;
		this.anInt224 = arg0;
		this.anInt219 = arg10;
		this.anInt211 = arg2;
		this.anInt221 = arg5;
		this.anInt213 = arg4;
		this.anInt226 = arg7;
		this.anInt222 = arg8;
		@Pc(52) int local52 = Static41.method808(this.anInt224).anInt1862;
		if (local52 == -1) {
			this.aClass2_Sub2_Sub15_1 = null;
		} else {
			this.aClass2_Sub2_Sub15_1 = Static140.method2333(local52);
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)Lclient!cd;")
	@Override
	protected Class2_Sub2_Sub1_Sub2 method2908() {
		@Pc(16) Class2_Sub2_Sub11 local16 = Static41.method808(this.anInt224);
		@Pc(22) Class2_Sub2_Sub1_Sub2 local22 = local16.method1342(this.anInt216);
		if (local22 == null) {
			return null;
		} else {
			local22.method584(this.anInt210);
			return local22;
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)V")
	public void method122(@OriginalArg(1) int arg0) {
		this.aDouble6 += this.aDouble8 * (double) arg0;
		this.aDouble3 += this.aDouble7 * (double) arg0;
		this.aDouble1 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble4 + (double) arg0 * this.aDouble5;
		this.aBoolean9 = true;
		this.aDouble5 += this.aDouble4 * (double) arg0;
		this.anInt208 = (int) (Math.atan2(this.aDouble8, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt210 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub2_Sub15_1 == null) {
			return;
		}
		this.anInt209 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt209 <= this.aClass2_Sub2_Sub15_1.anIntArray549[this.anInt216]) {
						return;
					}
					this.anInt209 -= this.aClass2_Sub2_Sub15_1.anIntArray549[this.anInt216];
					this.anInt216++;
				} while (this.anInt216 < this.aClass2_Sub2_Sub15_1.anIntArray548.length);
				this.anInt216 -= this.aClass2_Sub2_Sub15_1.anInt3736;
			} while (this.anInt216 >= 0 && this.anInt216 < this.aClass2_Sub2_Sub15_1.anIntArray548.length);
			this.anInt216 = 0;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
	public void method124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) double local14;
		if (!this.aBoolean9) {
			@Pc(8) double local8 = (double) (arg1 - this.anInt223);
			local14 = arg0 - this.anInt211;
			@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
			this.aDouble1 = this.anInt213;
			this.aDouble6 = local14 * (double) this.anInt222 / local23 + (double) this.anInt211;
			this.aDouble3 = local8 * (double) this.anInt222 / local23 + (double) this.anInt223;
		}
		local14 = this.anInt206 + 1 - arg3;
		this.aDouble7 = ((double) arg1 - this.aDouble3) / local14;
		this.aDouble8 = ((double) arg0 - this.aDouble6) / local14;
		this.aDouble2 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble7 * this.aDouble7);
		if (!this.aBoolean9) {
			this.aDouble5 = -this.aDouble2 * Math.tan((double) this.anInt226 * 0.02454369D);
		}
		this.aDouble4 = ((double) arg2 - local14 * this.aDouble5 - this.aDouble1) * 2.0D / (local14 * local14);
	}
}
