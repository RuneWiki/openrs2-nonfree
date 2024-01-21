import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!c", name = "nb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!c", name = "ob", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!c", name = "qb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!c", name = "tb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!c", name = "ub", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!c", name = "wb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!c", name = "Db", descriptor = "I")
	private int anInt416;

	@OriginalMember(owner = "client!c", name = "Gb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!c", name = "Hb", descriptor = "I")
	public int anInt418;

	@OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
	private int anInt404 = 0;

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!c", name = "Mb", descriptor = "I")
	private int anInt421 = 0;

	@OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
	public final int anInt403;

	@OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
	private final int anInt407;

	@OriginalMember(owner = "client!c", name = "xb", descriptor = "I")
	public final int anInt411;

	@OriginalMember(owner = "client!c", name = "yb", descriptor = "I")
	private final int anInt412;

	@OriginalMember(owner = "client!c", name = "Qb", descriptor = "I")
	private final int anInt423;

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "I")
	public final int anInt410;

	@OriginalMember(owner = "client!c", name = "Lb", descriptor = "I")
	private final int anInt420;

	@OriginalMember(owner = "client!c", name = "Cb", descriptor = "I")
	private final int anInt415;

	@OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
	public final int anInt406;

	@OriginalMember(owner = "client!c", name = "Ab", descriptor = "I")
	private final int anInt413;

	@OriginalMember(owner = "client!c", name = "Bb", descriptor = "I")
	public final int anInt414;

	@OriginalMember(owner = "client!c", name = "zb", descriptor = "Lclient!h;")
	private final Class2_Sub1_Sub8 aClass2_Sub1_Sub8_2;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt403 = arg6;
		this.anInt407 = arg7;
		this.anInt411 = arg5;
		this.anInt412 = arg0;
		this.anInt423 = arg2;
		this.anInt410 = arg10;
		this.anInt420 = arg4;
		this.anInt415 = arg8;
		this.anInt406 = arg1;
		this.anInt413 = arg3;
		this.aBoolean34 = false;
		this.anInt414 = arg9;
		@Pc(52) int local52 = Static106.method1805(this.anInt412).anInt2199;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub8_2 = null;
		} else {
			this.aClass2_Sub1_Sub8_2 = Static93.method1443(local52);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)Lclient!be;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method1423() {
		@Pc(18) Class2_Sub1_Sub12 local18 = Static106.method1805(this.anInt412);
		@Pc(24) Class2_Sub1_Sub1_Sub2 local24 = local18.method1343(this.anInt421);
		if (local24 == null) {
			return null;
		} else {
			local24.method210(this.anInt416);
			return local24;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBI)V")
	public void method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean34) {
			@Pc(9) double local9 = (double) (arg1 - this.anInt413);
			local16 = arg0 - this.anInt423;
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble4 = local9 * (double) this.anInt415 / local25 + (double) this.anInt413;
			this.aDouble2 = local16 * (double) this.anInt415 / local25 + (double) this.anInt423;
			this.aDouble5 = this.anInt420;
		}
		local16 = this.anInt403 + 1 - arg3;
		this.aDouble7 = ((double) arg0 - this.aDouble2) / local16;
		this.aDouble1 = ((double) arg1 - this.aDouble4) / local16;
		this.aDouble6 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble1 * this.aDouble1);
		if (!this.aBoolean34) {
			this.aDouble8 = -this.aDouble6 * Math.tan((double) this.anInt407 * 0.02454369D);
		}
		this.aDouble3 = ((double) arg2 - this.aDouble5 - this.aDouble8 * local16) * 2.0D / (local16 * local16);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	public void method246(@OriginalArg(0) int arg0) {
		this.aDouble4 += this.aDouble1 * (double) arg0;
		this.aBoolean34 = true;
		this.aDouble2 += this.aDouble7 * (double) arg0;
		this.aDouble5 += this.aDouble3 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble8;
		this.aDouble8 += this.aDouble3 * (double) arg0;
		this.anInt418 = (int) (Math.atan2(this.aDouble7, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt416 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub8_2 == null) {
			return;
		}
		this.anInt404 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub1_Sub8_2.anIntArray174[this.anInt421] >= this.anInt404) {
						return;
					}
					this.anInt404 -= this.aClass2_Sub1_Sub8_2.anIntArray174[this.anInt421];
					this.anInt421++;
				} while (this.aClass2_Sub1_Sub8_2.anIntArray176.length > this.anInt421);
				this.anInt421 -= this.aClass2_Sub1_Sub8_2.anInt1352;
			} while (this.anInt421 >= 0 && this.anInt421 < this.aClass2_Sub1_Sub8_2.anIntArray176.length);
			this.anInt421 = 0;
		}
	}
}
