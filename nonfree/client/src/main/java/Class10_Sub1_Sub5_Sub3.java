import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class10_Sub1_Sub5_Sub3 extends Class10_Sub1_Sub5 {

	@OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
	public int anInt1274;

	@OriginalMember(owner = "client!jb", name = "fb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!jb", name = "lb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!jb", name = "ob", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!jb", name = "qb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!jb", name = "ub", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!jb", name = "yb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!jb", name = "Kb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!jb", name = "Mb", descriptor = "D")
	public double aDouble9;

	@OriginalMember(owner = "client!jb", name = "Rb", descriptor = "I")
	private int anInt1297;

	@OriginalMember(owner = "client!jb", name = "wb", descriptor = "I")
	private int anInt1285 = 0;

	@OriginalMember(owner = "client!jb", name = "zb", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!jb", name = "nb", descriptor = "I")
	private int anInt1280 = 0;

	@OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
	private final int anInt1275;

	@OriginalMember(owner = "client!jb", name = "Cb", descriptor = "I")
	private final int anInt1289;

	@OriginalMember(owner = "client!jb", name = "xb", descriptor = "I")
	public final int anInt1286;

	@OriginalMember(owner = "client!jb", name = "kb", descriptor = "I")
	private final int anInt1279;

	@OriginalMember(owner = "client!jb", name = "Pb", descriptor = "I")
	public final int anInt1296;

	@OriginalMember(owner = "client!jb", name = "Gb", descriptor = "I")
	public final int anInt1292;

	@OriginalMember(owner = "client!jb", name = "sb", descriptor = "I")
	private final int anInt1282;

	@OriginalMember(owner = "client!jb", name = "Jb", descriptor = "I")
	private final int anInt1294;

	@OriginalMember(owner = "client!jb", name = "pb", descriptor = "I")
	private final int anInt1281;

	@OriginalMember(owner = "client!jb", name = "Fb", descriptor = "I")
	public final int anInt1291;

	@OriginalMember(owner = "client!jb", name = "Hb", descriptor = "I")
	public final int anInt1293;

	@OriginalMember(owner = "client!jb", name = "Db", descriptor = "Lclient!ge;")
	private final Class10_Sub1_Sub6 aClass10_Sub1_Sub6_1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class10_Sub1_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1275 = arg4;
		this.anInt1289 = arg7;
		this.anInt1286 = arg6;
		this.anInt1279 = arg0;
		this.anInt1296 = arg9;
		this.anInt1292 = arg10;
		this.anInt1282 = arg2;
		this.aBoolean54 = false;
		this.anInt1294 = arg3;
		this.anInt1281 = arg8;
		this.anInt1291 = arg1;
		this.anInt1293 = arg5;
		@Pc(52) int local52 = Static51.method789(this.anInt1279).anInt2185;
		if (local52 == -1) {
			this.aClass10_Sub1_Sub6_1 = null;
		} else {
			this.aClass10_Sub1_Sub6_1 = Static5.method33(local52);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public void method734(@OriginalArg(1) int arg0) {
		this.aDouble9 += (double) arg0 * this.aDouble7;
		this.aDouble2 += this.aDouble3 * (double) arg0 + (double) arg0 * (double) arg0 * this.aDouble5 * 0.5D;
		this.aDouble8 += this.aDouble4 * (double) arg0;
		this.aDouble3 += (double) arg0 * this.aDouble5;
		this.aBoolean54 = true;
		this.anInt1274 = (int) (Math.atan2(this.aDouble4, this.aDouble7) * 325.949D) + 1024 & 0x7FF;
		this.anInt1297 = (int) (Math.atan2(this.aDouble3, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass10_Sub1_Sub6_1 == null) {
			return;
		}
		this.anInt1285 += arg0;
		while (this.anInt1285 > this.aClass10_Sub1_Sub6_1.anIntArray109[this.anInt1280]) {
			this.anInt1285 -= this.aClass10_Sub1_Sub6_1.anIntArray109[this.anInt1280];
			this.anInt1280++;
			if (this.anInt1280 >= this.aClass10_Sub1_Sub6_1.anIntArray106.length) {
				this.anInt1280 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public void method737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean54) {
			local8 = arg2 - this.anInt1282;
			@Pc(15) double local15 = (double) (arg1 - this.anInt1294);
			@Pc(24) double local24 = Math.sqrt(local15 * local15 + local8 * local8);
			this.aDouble9 = (double) this.anInt1294 + (double) this.anInt1281 * local15 / local24;
			this.aDouble8 = (double) this.anInt1282 + (double) this.anInt1281 * local8 / local24;
			this.aDouble2 = this.anInt1275;
		}
		local8 = this.anInt1286 + 1 - arg3;
		this.aDouble4 = ((double) arg2 - this.aDouble8) / local8;
		this.aDouble7 = ((double) arg1 - this.aDouble9) / local8;
		this.aDouble6 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean54) {
			this.aDouble3 = -this.aDouble6 * Math.tan((double) this.anInt1289 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg0 - local8 * this.aDouble3 - this.aDouble2) * 2.0D / (local8 * local8);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Lclient!rb;")
	@Override
	protected Class10_Sub1_Sub5_Sub4 method1663() {
		@Pc(4) Class10_Sub1_Sub14 local4 = Static51.method789(this.anInt1279);
		@Pc(14) Class10_Sub1_Sub5_Sub4 local14 = local4.method1273(this.anInt1280);
		if (local14 == null) {
			return null;
		} else {
			local14.method1340(this.anInt1297);
			return local14;
		}
	}
}
