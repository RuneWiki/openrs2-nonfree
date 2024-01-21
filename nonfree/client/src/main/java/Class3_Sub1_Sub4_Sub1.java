import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class3_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!bg", name = "bb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!bg", name = "db", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!bg", name = "hb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!bg", name = "tb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!bg", name = "xb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!bg", name = "Bb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!bg", name = "Fb", descriptor = "I")
	public int anInt431;

	@OriginalMember(owner = "client!bg", name = "Hb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!bg", name = "Mb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!bg", name = "Ob", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!bg", name = "yb", descriptor = "I")
	private int anInt428 = 0;

	@OriginalMember(owner = "client!bg", name = "Kb", descriptor = "I")
	private int anInt435 = 0;

	@OriginalMember(owner = "client!bg", name = "Lb", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bg", name = "zb", descriptor = "I")
	public final int anInt429;

	@OriginalMember(owner = "client!bg", name = "Gb", descriptor = "I")
	public final int anInt432;

	@OriginalMember(owner = "client!bg", name = "Nb", descriptor = "I")
	private final int anInt436;

	@OriginalMember(owner = "client!bg", name = "jb", descriptor = "I")
	public final int anInt419;

	@OriginalMember(owner = "client!bg", name = "ob", descriptor = "I")
	private final int anInt422;

	@OriginalMember(owner = "client!bg", name = "pb", descriptor = "I")
	private final int anInt423;

	@OriginalMember(owner = "client!bg", name = "kb", descriptor = "I")
	private final int anInt420;

	@OriginalMember(owner = "client!bg", name = "Ib", descriptor = "I")
	private final int anInt433;

	@OriginalMember(owner = "client!bg", name = "nb", descriptor = "I")
	private final int anInt421;

	@OriginalMember(owner = "client!bg", name = "fb", descriptor = "I")
	public final int anInt416;

	@OriginalMember(owner = "client!bg", name = "Db", descriptor = "I")
	public final int anInt430;

	@OriginalMember(owner = "client!bg", name = "Ab", descriptor = "Lclient!gg;")
	private final Class3_Sub1_Sub8 aClass3_Sub1_Sub8_1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt429 = arg6;
		this.anInt432 = arg1;
		this.anInt436 = arg7;
		this.anInt419 = arg5;
		this.anInt422 = arg2;
		this.anInt423 = arg4;
		this.anInt420 = arg3;
		this.anInt433 = arg0;
		this.anInt421 = arg8;
		this.anInt416 = arg9;
		this.aBoolean29 = false;
		this.anInt430 = arg10;
		@Pc(52) int local52 = Static12.method196(this.anInt433).anInt2378;
		if (local52 == -1) {
			this.aClass3_Sub1_Sub8_1 = null;
		} else {
			this.aClass3_Sub1_Sub8_1 = Static98.method1697(local52);
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
	public void method294(@OriginalArg(0) int arg0) {
		this.aBoolean29 = true;
		this.aDouble3 += this.aDouble2 * (double) arg0;
		this.aDouble8 += (double) arg0 * 0.5D * this.aDouble7 * (double) arg0 + (double) arg0 * this.aDouble1;
		this.aDouble1 += this.aDouble7 * (double) arg0;
		this.aDouble4 += (double) arg0 * this.aDouble6;
		this.anInt431 = (int) (Math.atan2(this.aDouble6, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt414 = (int) (Math.atan2(this.aDouble1, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub1_Sub8_1 == null) {
			return;
		}
		this.anInt435 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass3_Sub1_Sub8_1.anIntArray136[this.anInt428] >= this.anInt435) {
						return;
					}
					this.anInt435 -= this.aClass3_Sub1_Sub8_1.anIntArray136[this.anInt428];
					this.anInt428++;
				} while (this.aClass3_Sub1_Sub8_1.anIntArray138.length > this.anInt428);
				this.anInt428 -= this.aClass3_Sub1_Sub8_1.anInt1316;
			} while (this.anInt428 >= 0 && this.anInt428 < this.aClass3_Sub1_Sub8_1.anIntArray138.length);
			this.anInt428 = 0;
		}
	}

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "(I)Lclient!o;")
	@Override
	protected Class3_Sub1_Sub4_Sub5 method2261() {
		@Pc(8) Class3_Sub1_Sub13 local8 = Static12.method196(this.anInt433);
		@Pc(14) Class3_Sub1_Sub4_Sub5 local14 = local8.method1831(this.anInt428);
		if (local14 == null) {
			return null;
		} else {
			local14.method1887(this.anInt414);
			return local14;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIBII)V")
	public void method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) double local19;
		if (!this.aBoolean29) {
			@Pc(12) double local12 = (double) (arg0 - this.anInt420);
			local19 = arg1 - this.anInt422;
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local12 * local12);
			this.aDouble3 = (double) this.anInt420 + (double) this.anInt421 * local12 / local28;
			this.aDouble4 = local19 * (double) this.anInt421 / local28 + (double) this.anInt422;
			this.aDouble8 = this.anInt423;
		}
		local19 = this.anInt429 + 1 - arg3;
		this.aDouble2 = ((double) arg0 - this.aDouble3) / local19;
		this.aDouble6 = ((double) arg1 - this.aDouble4) / local19;
		this.aDouble5 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean29) {
			this.aDouble1 = -this.aDouble5 * Math.tan((double) this.anInt436 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg2 - this.aDouble8 - local19 * this.aDouble1) * 2.0D / (local19 * local19);
	}
}
