import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
	public int anInt2187;

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!qd", name = "nb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!qd", name = "xb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!qd", name = "Ab", descriptor = "I")
	private int anInt2203;

	@OriginalMember(owner = "client!qd", name = "Bb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!qd", name = "Db", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!qd", name = "Fb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!qd", name = "Jb", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!qd", name = "sb", descriptor = "I")
	private int anInt2197 = 0;

	@OriginalMember(owner = "client!qd", name = "vb", descriptor = "I")
	private int anInt2199 = 0;

	@OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
	public final int anInt2195;

	@OriginalMember(owner = "client!qd", name = "Lb", descriptor = "I")
	public final int anInt2209;

	@OriginalMember(owner = "client!qd", name = "Kb", descriptor = "I")
	public final int anInt2208;

	@OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
	private final int anInt2188;

	@OriginalMember(owner = "client!qd", name = "ob", descriptor = "I")
	private final int anInt2193;

	@OriginalMember(owner = "client!qd", name = "Gb", descriptor = "I")
	public final int anInt2206;

	@OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
	private final int anInt2200;

	@OriginalMember(owner = "client!qd", name = "pb", descriptor = "I")
	private final int anInt2194;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
	private final int anInt2186;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "I")
	private final int anInt2191;

	@OriginalMember(owner = "client!qd", name = "ub", descriptor = "I")
	public final int anInt2198;

	@OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lclient!ae;")
	private final Class2_Sub1_Sub2 aClass2_Sub1_Sub2_3;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2195 = arg9;
		this.anInt2209 = arg1;
		this.anInt2208 = arg5;
		this.anInt2188 = arg8;
		this.anInt2193 = arg0;
		this.anInt2206 = arg6;
		this.anInt2200 = arg7;
		this.anInt2194 = arg2;
		this.anInt2186 = arg4;
		this.anInt2191 = arg3;
		this.aBoolean87 = false;
		this.anInt2198 = arg10;
		@Pc(52) int local52 = Static69.method1228(this.anInt2193).anInt1625;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub2_3 = null;
		} else {
			this.aClass2_Sub1_Sub2_3 = Static23.method1313(local52);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
	public void method1591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean87) {
			local13 = arg3 - this.anInt2194;
			@Pc(20) double local20 = (double) (arg1 - this.anInt2191);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble7 = (double) this.anInt2194 + local13 * (double) this.anInt2188 / local29;
			this.aDouble9 = (double) this.anInt2191 + local20 * (double) this.anInt2188 / local29;
			this.aDouble6 = this.anInt2186;
		}
		local13 = this.anInt2206 + 1 - arg0;
		this.aDouble4 = ((double) arg1 - this.aDouble9) / local13;
		this.aDouble8 = ((double) arg3 - this.aDouble7) / local13;
		this.aDouble3 = Math.sqrt(this.aDouble8 * this.aDouble8 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean87) {
			this.aDouble2 = -this.aDouble3 * Math.tan((double) this.anInt2200 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg2 - local13 * this.aDouble2 - this.aDouble6) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)Lclient!wb;")
	@Override
	public Class2_Sub1_Sub1_Sub7 method1996() {
		@Pc(14) Class2_Sub1_Sub9 local14 = Static69.method1228(this.anInt2193);
		@Pc(20) Class2_Sub1_Sub1_Sub7 local20 = local14.method1224(this.anInt2199);
		if (local20 == null) {
			return null;
		} else {
			local20.method2014(this.anInt2203);
			return local20;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
	public void method1592(@OriginalArg(0) int arg0) {
		this.aBoolean87 = true;
		this.aDouble6 += (double) arg0 * this.aDouble2 + this.aDouble5 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble9 += this.aDouble4 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble5;
		this.aDouble7 += this.aDouble8 * (double) arg0;
		this.anInt2187 = (int) (Math.atan2(this.aDouble8, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt2203 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub2_3 == null) {
			return;
		}
		this.anInt2197 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2197 <= this.aClass2_Sub1_Sub2_3.anIntArray21[this.anInt2199]) {
						return;
					}
					this.anInt2197 -= this.aClass2_Sub1_Sub2_3.anIntArray21[this.anInt2199];
					this.anInt2199++;
				} while (this.aClass2_Sub1_Sub2_3.anIntArray19.length > this.anInt2199);
				this.anInt2199 -= this.aClass2_Sub1_Sub2_3.anInt160;
			} while (this.anInt2199 >= 0 && this.aClass2_Sub1_Sub2_3.anIntArray19.length > this.anInt2199);
			this.anInt2199 = 0;
		}
	}
}
