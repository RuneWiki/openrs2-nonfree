import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub2_Sub1_Sub5 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!m", name = "P", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!m", name = "V", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!m", name = "ib", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!m", name = "jb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!m", name = "lb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
	public int anInt2219;

	@OriginalMember(owner = "client!m", name = "sb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!m", name = "tb", descriptor = "I")
	private int anInt2220;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
	private int anInt2211 = 0;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
	private int anInt2212 = 0;

	@OriginalMember(owner = "client!m", name = "fb", descriptor = "Z")
	private boolean aBoolean94 = false;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "I")
	public final int anInt2201;

	@OriginalMember(owner = "client!m", name = "ob", descriptor = "I")
	private final int anInt2217;

	@OriginalMember(owner = "client!m", name = "ub", descriptor = "I")
	private final int anInt2221;

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
	public final int anInt2210;

	@OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
	private final int anInt2208;

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public final int anInt2199;

	@OriginalMember(owner = "client!m", name = "mb", descriptor = "I")
	public final int anInt2215;

	@OriginalMember(owner = "client!m", name = "X", descriptor = "I")
	private final int anInt2206;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "I")
	private final int anInt2204;

	@OriginalMember(owner = "client!m", name = "kb", descriptor = "I")
	public final int anInt2214;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
	private final int anInt2213;

	@OriginalMember(owner = "client!m", name = "qb", descriptor = "Lclient!ub;")
	private final Class1_Sub2_Sub18 aClass1_Sub2_Sub18_2;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean94 = false;
		this.anInt2201 = arg5;
		this.anInt2217 = arg3;
		this.anInt2221 = arg0;
		this.anInt2210 = arg10;
		this.anInt2208 = arg8;
		this.anInt2199 = arg6;
		this.anInt2215 = arg9;
		this.anInt2206 = arg4;
		this.anInt2204 = arg7;
		this.anInt2214 = arg1;
		this.anInt2213 = arg2;
		@Pc(52) int local52 = Static67.method1207(this.anInt2221).anInt1217;
		if (local52 == -1) {
			this.aClass1_Sub2_Sub18_2 = null;
		} else {
			this.aClass1_Sub2_Sub18_2 = Static73.method1277(local52);
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Lclient!oh;")
	@Override
	protected Class1_Sub2_Sub1_Sub4 method2785() {
		@Pc(14) Class1_Sub2_Sub7 local14 = Static67.method1207(this.anInt2221);
		@Pc(20) Class1_Sub2_Sub1_Sub4 local20 = local14.method912(this.anInt2211);
		if (local20 == null) {
			return null;
		} else {
			local20.method1447(this.anInt2220);
			return local20;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public void method1670(@OriginalArg(1) int arg0) {
		this.aBoolean94 = true;
		this.aDouble8 += (double) arg0 * this.aDouble1;
		this.aDouble6 += (double) arg0 * this.aDouble3;
		this.aDouble2 += this.aDouble4 * (double) arg0 + (double) arg0 * this.aDouble7 * 0.5D * (double) arg0;
		this.aDouble4 += this.aDouble7 * (double) arg0;
		this.anInt2219 = (int) (Math.atan2(this.aDouble3, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt2220 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub2_Sub18_2 == null) {
			return;
		}
		this.anInt2212 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2212 <= this.aClass1_Sub2_Sub18_2.anIntArray394[this.anInt2211]) {
						return;
					}
					this.anInt2212 -= this.aClass1_Sub2_Sub18_2.anIntArray394[this.anInt2211];
					this.anInt2211++;
				} while (this.aClass1_Sub2_Sub18_2.anIntArray396.length > this.anInt2211);
				this.anInt2211 -= this.aClass1_Sub2_Sub18_2.anInt3793;
			} while (this.anInt2211 >= 0 && this.aClass1_Sub2_Sub18_2.anIntArray396.length > this.anInt2211);
			this.anInt2211 = 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
	public void method1671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean94) {
			@Pc(9) double local9 = (double) (arg3 - this.anInt2217);
			local16 = arg0 - this.anInt2213;
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble8 = (double) this.anInt2217 + local9 * (double) this.anInt2208 / local25;
			this.aDouble2 = this.anInt2206;
			this.aDouble6 = local16 * (double) this.anInt2208 / local25 + (double) this.anInt2213;
		}
		local16 = this.anInt2199 + 1 - arg1;
		this.aDouble3 = ((double) arg0 - this.aDouble6) / local16;
		this.aDouble1 = ((double) arg3 - this.aDouble8) / local16;
		this.aDouble5 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble3 * this.aDouble3);
		if (!this.aBoolean94) {
			this.aDouble4 = -this.aDouble5 * Math.tan((double) this.anInt2204 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg2 - this.aDouble4 * local16 - this.aDouble2) * 2.0D / (local16 * local16);
	}
}
