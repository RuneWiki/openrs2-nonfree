import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class2_Sub2_Sub12_Sub2 extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!kd", name = "Hb", descriptor = "Lclient!o;")
	public static Class40 aClass40_408 = Static12.method257("To start a subscripton:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WStart a new subscription(W");

	@OriginalMember(owner = "client!kd", name = "jb", descriptor = "[I")
	public static int[] anIntArray298 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!kd", name = "qb", descriptor = "Lclient!o;")
	public static Class40 aClass40_405 = Static12.method257(" million @whi@(X");

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "I")
	public static int anInt1430 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!kd", name = "Lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_409 = Static12.method257(")2");

	@OriginalMember(owner = "client!kd", name = "Bb", descriptor = "Lclient!o;")
	public static Class40 aClass40_407 = Static12.method257("@gr1@");

	@OriginalMember(owner = "client!kd", name = "Qb", descriptor = "Lclient!o;")
	public static Class40 aClass40_410 = Static12.method257("Unable to connect)3");

	@OriginalMember(owner = "client!kd", name = "Ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_406 = Static12.method257("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!qc;")
	public static Class47 aClass47_13 = new Class47(64);

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!kd", name = "ob", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!kd", name = "xb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!kd", name = "Cb", descriptor = "I")
	private int anInt1429;

	@OriginalMember(owner = "client!kd", name = "Gb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!kd", name = "Ib", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!kd", name = "Nb", descriptor = "I")
	public int anInt1436;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!kd", name = "Sb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!kd", name = "vb", descriptor = "I")
	private int anInt1426 = 0;

	@OriginalMember(owner = "client!kd", name = "Mb", descriptor = "I")
	private int anInt1435 = 0;

	@OriginalMember(owner = "client!kd", name = "sb", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!kd", name = "Kb", descriptor = "I")
	public final int anInt1434;

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
	private final int anInt1420;

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
	public final int anInt1419;

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "I")
	private final int anInt1422;

	@OriginalMember(owner = "client!kd", name = "yb", descriptor = "I")
	public final int anInt1427;

	@OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
	public final int anInt1416;

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "I")
	private final int anInt1431;

	@OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
	private final int anInt1421;

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
	public final int anInt1417;

	@OriginalMember(owner = "client!kd", name = "Fb", descriptor = "I")
	private final int anInt1432;

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "I")
	private final int anInt1423;

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "Lclient!f;")
	private final Class2_Sub2_Sub6 aClass2_Sub2_Sub6_1;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)V", line = 14)
	public void method939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean107) {
			local9 = arg0 - this.anInt1431;
			@Pc(15) double local15 = (double) (arg3 - this.anInt1423);
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble7 = (double) this.anInt1421 * local9 / local24 + (double) this.anInt1431;
			this.aDouble5 = (double) this.anInt1423 + local15 * (double) this.anInt1421 / local24;
			this.aDouble2 = this.anInt1432;
		}
		local9 = this.anInt1427 + 1 - arg2;
		this.aDouble4 = ((double) arg3 - this.aDouble5) / local9;
		this.aDouble3 = ((double) arg0 - this.aDouble7) / local9;
		this.aDouble8 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean107) {
			this.aDouble9 = -this.aDouble8 * Math.tan((double) this.anInt1420 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg1 - this.aDouble9 * local9 - this.aDouble2) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V", line = 154)
	public void method942(@OriginalArg(1) int arg0) {
		this.aBoolean107 = true;
		this.aDouble7 += (double) arg0 * this.aDouble3;
		this.aDouble5 += this.aDouble4 * (double) arg0;
		this.aDouble2 += this.aDouble9 * (double) arg0 + this.aDouble6 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble9 += (double) arg0 * this.aDouble6;
		this.anInt1436 = (int) (Math.atan2(this.aDouble3, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt1429 = (int) (Math.atan2(this.aDouble9, this.aDouble8) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub2_Sub6_1 == null) {
			return;
		}
		this.anInt1435 += arg0;
		while (this.anInt1435 > this.aClass2_Sub2_Sub6_1.anIntArray128[this.anInt1426]) {
			this.anInt1435 -= this.aClass2_Sub2_Sub6_1.anIntArray128[this.anInt1426];
			this.anInt1426++;
			if (this.anInt1426 >= this.aClass2_Sub2_Sub6_1.anIntArray124.length) {
				this.anInt1426 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)Lclient!ne;", line = 195)
	@Override
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		@Pc(8) Class2_Sub2_Sub5 local8 = Static5.method116(this.anInt1422);
		@Pc(21) Class2_Sub2_Sub12_Sub4 local21 = local8.method501(this.anInt1426);
		if (local21 == null) {
			return null;
		} else {
			local21.method1144(this.anInt1429);
			return local21;
		}
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 222)
	public Class2_Sub2_Sub12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1434 = arg9;
		this.anInt1420 = arg7;
		this.aBoolean107 = false;
		this.anInt1419 = arg5;
		this.anInt1422 = arg0;
		this.anInt1427 = arg6;
		this.anInt1416 = arg10;
		this.anInt1431 = arg2;
		this.anInt1421 = arg8;
		this.anInt1417 = arg1;
		this.anInt1432 = arg4;
		this.anInt1423 = arg3;
		@Pc(52) int local52 = Static5.method116(this.anInt1422).anInt640;
		if (local52 == -1) {
			this.aClass2_Sub2_Sub6_1 = null;
		} else {
			this.aClass2_Sub2_Sub6_1 = Static57.method1042(local52);
		}
	}
}
