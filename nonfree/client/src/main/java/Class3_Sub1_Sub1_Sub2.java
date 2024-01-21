import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!g", name = "eb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!g", name = "gb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!g", name = "qb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!g", name = "tb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!g", name = "Hb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!g", name = "Kb", descriptor = "I")
	private int anInt977;

	@OriginalMember(owner = "client!g", name = "Ob", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!g", name = "Tb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!g", name = "Wb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!g", name = "ib", descriptor = "I")
	private int anInt962 = 0;

	@OriginalMember(owner = "client!g", name = "wb", descriptor = "I")
	private int anInt969 = 0;

	@OriginalMember(owner = "client!g", name = "Ib", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!g", name = "ub", descriptor = "I")
	public final int anInt968;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
	private final int anInt965;

	@OriginalMember(owner = "client!g", name = "ob", descriptor = "I")
	private final int anInt967;

	@OriginalMember(owner = "client!g", name = "Ab", descriptor = "I")
	public final int anInt972;

	@OriginalMember(owner = "client!g", name = "db", descriptor = "I")
	private final int anInt960;

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "I")
	private final int anInt964;

	@OriginalMember(owner = "client!g", name = "jb", descriptor = "I")
	private final int anInt963;

	@OriginalMember(owner = "client!g", name = "hb", descriptor = "I")
	private final int anInt961;

	@OriginalMember(owner = "client!g", name = "Mb", descriptor = "I")
	public final int anInt979;

	@OriginalMember(owner = "client!g", name = "Cb", descriptor = "I")
	public final int anInt973;

	@OriginalMember(owner = "client!g", name = "Jb", descriptor = "I")
	public final int anInt976;

	@OriginalMember(owner = "client!g", name = "Fb", descriptor = "Lclient!ne;")
	private final Class3_Sub1_Sub11 aClass3_Sub1_Sub11_1;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt968 = arg1;
		this.anInt965 = arg3;
		this.anInt967 = arg4;
		this.anInt972 = arg9;
		this.anInt960 = arg0;
		this.anInt964 = arg7;
		this.anInt963 = arg8;
		this.anInt961 = arg2;
		this.aBoolean50 = false;
		this.anInt979 = arg6;
		this.anInt973 = arg10;
		this.anInt976 = arg5;
		@Pc(52) int local52 = Static61.method1063(this.anInt960).anInt2934;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub11_1 = null;
		} else {
			this.aClass3_Sub1_Sub11_1 = Static31.method778(local52);
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(Z)Lclient!v;")
	@Override
	public Class3_Sub1_Sub1_Sub6 method1792() {
		@Pc(8) Class3_Sub1_Sub18 local8 = Static61.method1063(this.anInt960);
		@Pc(14) Class3_Sub1_Sub1_Sub6 local14 = local8.method1935(this.anInt962);
		if (local14 == null) {
			return null;
		} else {
			local14.method1823(this.anInt977);
			return local14;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public void method674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean50) {
			local12 = arg3 - this.anInt961;
			@Pc(18) double local18 = (double) (arg1 - this.anInt965);
			@Pc(27) double local27 = Math.sqrt(local12 * local12 + local18 * local18);
			this.aDouble4 = local18 * (double) this.anInt963 / local27 + (double) this.anInt965;
			this.aDouble5 = this.anInt967;
			this.aDouble3 = (double) this.anInt963 * local12 / local27 + (double) this.anInt961;
		}
		local12 = this.anInt979 + 1 - arg2;
		this.aDouble2 = ((double) arg1 - this.aDouble4) / local12;
		this.aDouble6 = ((double) arg3 - this.aDouble3) / local12;
		this.aDouble1 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean50) {
			this.aDouble7 = -this.aDouble1 * Math.tan((double) this.anInt964 * 0.02454369D);
		}
		this.aDouble8 = ((double) arg0 - this.aDouble5 - local12 * this.aDouble7) * 2.0D / (local12 * local12);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(II)V")
	public void method675(@OriginalArg(1) int arg0) {
		this.aBoolean50 = true;
		this.aDouble4 += this.aDouble2 * (double) arg0;
		this.aDouble5 += (double) arg0 * this.aDouble7 + (double) arg0 * (double) arg0 * 0.5D * this.aDouble8;
		this.aDouble3 += this.aDouble6 * (double) arg0;
		this.aDouble7 += (double) arg0 * this.aDouble8;
		this.anInt980 = (int) (Math.atan2(this.aDouble6, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt977 = (int) (Math.atan2(this.aDouble7, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub11_1 == null) {
			return;
		}
		this.anInt969 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt969 <= this.aClass3_Sub1_Sub11_1.anIntArray219[this.anInt962]) {
						return;
					}
					this.anInt969 -= this.aClass3_Sub1_Sub11_1.anIntArray219[this.anInt962];
					this.anInt962++;
				} while (this.anInt962 < this.aClass3_Sub1_Sub11_1.anIntArray221.length);
				this.anInt962 -= this.aClass3_Sub1_Sub11_1.anInt1932;
			} while (this.anInt962 >= 0 && this.anInt962 < this.aClass3_Sub1_Sub11_1.anIntArray221.length);
			this.anInt962 = 0;
		}
	}
}
