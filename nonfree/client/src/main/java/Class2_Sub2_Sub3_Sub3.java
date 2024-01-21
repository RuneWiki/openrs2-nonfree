import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class2_Sub2_Sub3_Sub3 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!gb", name = "eb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
	public int anInt1238;

	@OriginalMember(owner = "client!gb", name = "mb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!gb", name = "tb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!gb", name = "wb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!gb", name = "Db", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!gb", name = "Fb", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!gb", name = "kb", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!gb", name = "zb", descriptor = "I")
	private int anInt1246 = 0;

	@OriginalMember(owner = "client!gb", name = "yb", descriptor = "I")
	private int anInt1245 = 0;

	@OriginalMember(owner = "client!gb", name = "Bb", descriptor = "I")
	private final int anInt1248;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "I")
	public final int anInt1232;

	@OriginalMember(owner = "client!gb", name = "Eb", descriptor = "I")
	public final int anInt1250;

	@OriginalMember(owner = "client!gb", name = "Cb", descriptor = "I")
	public final int anInt1249;

	@OriginalMember(owner = "client!gb", name = "vb", descriptor = "I")
	private final int anInt1243;

	@OriginalMember(owner = "client!gb", name = "db", descriptor = "I")
	private final int anInt1233;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "I")
	public final int anInt1239;

	@OriginalMember(owner = "client!gb", name = "Ab", descriptor = "I")
	public final int anInt1247;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
	private final int anInt1230;

	@OriginalMember(owner = "client!gb", name = "ub", descriptor = "I")
	private final int anInt1242;

	@OriginalMember(owner = "client!gb", name = "Gb", descriptor = "I")
	private final int anInt1252;

	@OriginalMember(owner = "client!gb", name = "sb", descriptor = "Lclient!bi;")
	private final Class2_Sub2_Sub4 aClass2_Sub2_Sub4_3;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub2_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1248 = arg4;
		this.anInt1232 = arg10;
		this.anInt1250 = arg6;
		this.anInt1249 = arg9;
		this.anInt1243 = arg8;
		this.anInt1233 = arg2;
		this.anInt1239 = arg1;
		this.anInt1247 = arg5;
		this.anInt1230 = arg7;
		this.aBoolean48 = false;
		this.anInt1242 = arg0;
		this.anInt1252 = arg3;
		@Pc(52) int local52 = Static170.method2831(this.anInt1242).anInt2089;
		if (local52 == -1) {
			this.aClass2_Sub2_Sub4_3 = null;
		} else {
			this.aClass2_Sub2_Sub4_3 = Static29.method543(local52);
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public void method982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean48) {
			local13 = arg3 - this.anInt1233;
			@Pc(20) double local20 = (double) (arg1 - this.anInt1252);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble6 = (double) this.anInt1243 * local20 / local29 + (double) this.anInt1252;
			this.aDouble7 = (double) this.anInt1243 * local13 / local29 + (double) this.anInt1233;
			this.aDouble5 = this.anInt1248;
		}
		local13 = this.anInt1250 + 1 - arg0;
		this.aDouble3 = ((double) arg1 - this.aDouble6) / local13;
		this.aDouble2 = ((double) arg3 - this.aDouble7) / local13;
		this.aDouble8 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble3 * this.aDouble3);
		if (!this.aBoolean48) {
			this.aDouble1 = -this.aDouble8 * Math.tan((double) this.anInt1230 * 0.02454369D);
		}
		this.aDouble4 = ((double) arg2 - this.aDouble5 - local13 * this.aDouble1) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public void method983(@OriginalArg(0) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble3;
		this.aBoolean48 = true;
		this.aDouble7 += (double) arg0 * this.aDouble2;
		this.aDouble5 += (double) arg0 * this.aDouble1 + this.aDouble4 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble1 += this.aDouble4 * (double) arg0;
		this.anInt1238 = (int) (Math.atan2(this.aDouble2, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt1251 = (int) (Math.atan2(this.aDouble1, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub2_Sub4_3 == null) {
			return;
		}
		this.anInt1245 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub2_Sub4_3.anIntArray36[this.anInt1246] >= this.anInt1245) {
						return;
					}
					this.anInt1245 -= this.aClass2_Sub2_Sub4_3.anIntArray36[this.anInt1246];
					this.anInt1246++;
				} while (this.aClass2_Sub2_Sub4_3.anIntArray35.length > this.anInt1246);
				this.anInt1246 -= this.aClass2_Sub2_Sub4_3.anInt407;
			} while (this.anInt1246 >= 0 && this.aClass2_Sub2_Sub4_3.anIntArray35.length > this.anInt1246);
			this.anInt1246 = 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lclient!ue;")
	@Override
	protected Class2_Sub2_Sub3_Sub4 method2725() {
		@Pc(16) Class2_Sub2_Sub11 local16 = Static170.method2831(this.anInt1242);
		@Pc(22) Class2_Sub2_Sub3_Sub4 local22 = local16.method1698(this.anInt1246);
		if (local22 == null) {
			return null;
		} else {
			local22.method1043(this.anInt1251);
			return local22;
		}
	}
}
