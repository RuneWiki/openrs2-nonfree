import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class3_Sub2_Sub1_Sub4 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!oa", name = "O", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!oa", name = "jb", descriptor = "I")
	private int anInt2666;

	@OriginalMember(owner = "client!oa", name = "kb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!oa", name = "yb", descriptor = "I")
	public int anInt2674;

	@OriginalMember(owner = "client!oa", name = "Ab", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!oa", name = "Cb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!oa", name = "Q", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
	private int anInt2657 = 0;

	@OriginalMember(owner = "client!oa", name = "wb", descriptor = "I")
	private int anInt2672 = 0;

	@OriginalMember(owner = "client!oa", name = "ab", descriptor = "I")
	public final int anInt2659;

	@OriginalMember(owner = "client!oa", name = "fb", descriptor = "I")
	public final int anInt2664;

	@OriginalMember(owner = "client!oa", name = "rb", descriptor = "I")
	private final int anInt2670;

	@OriginalMember(owner = "client!oa", name = "mb", descriptor = "I")
	public final int anInt2667;

	@OriginalMember(owner = "client!oa", name = "pb", descriptor = "I")
	private final int anInt2669;

	@OriginalMember(owner = "client!oa", name = "xb", descriptor = "I")
	public final int anInt2673;

	@OriginalMember(owner = "client!oa", name = "Bb", descriptor = "I")
	private final int anInt2676;

	@OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
	private final int anInt2661;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	private final int anInt2656;

	@OriginalMember(owner = "client!oa", name = "db", descriptor = "I")
	public final int anInt2662;

	@OriginalMember(owner = "client!oa", name = "nb", descriptor = "I")
	private final int anInt2668;

	@OriginalMember(owner = "client!oa", name = "Eb", descriptor = "Lclient!dg;")
	private final Class3_Sub2_Sub2 aClass3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class3_Sub2_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2659 = arg5;
		this.anInt2664 = arg9;
		this.anInt2670 = arg3;
		this.anInt2667 = arg1;
		this.aBoolean112 = false;
		this.anInt2669 = arg8;
		this.anInt2673 = arg6;
		this.anInt2676 = arg4;
		this.anInt2661 = arg2;
		this.anInt2656 = arg0;
		this.anInt2662 = arg10;
		this.anInt2668 = arg7;
		@Pc(52) int local52 = Static155.method2522(this.anInt2656).anInt1284;
		if (local52 == -1) {
			this.aClass3_Sub2_Sub2_2 = null;
		} else {
			this.aClass3_Sub2_Sub2_2 = Static35.method628(local52);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)Lclient!fd;")
	@Override
	protected Class3_Sub2_Sub1_Sub2 method2683() {
		@Pc(8) Class3_Sub2_Sub5 local8 = Static155.method2522(this.anInt2656);
		@Pc(14) Class3_Sub2_Sub1_Sub2 local14 = local8.method933(this.anInt2657);
		if (local14 == null) {
			return null;
		} else {
			local14.method1792(this.anInt2666);
			return local14;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
	public void method1841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean112) {
			local13 = arg3 - this.anInt2661;
			@Pc(19) double local19 = (double) (arg2 - this.anInt2670);
			@Pc(28) double local28 = Math.sqrt(local13 * local13 + local19 * local19);
			this.aDouble6 = (double) this.anInt2661 + local13 * (double) this.anInt2669 / local28;
			this.aDouble7 = this.anInt2676;
			this.aDouble5 = local19 * (double) this.anInt2669 / local28 + (double) this.anInt2670;
		}
		local13 = this.anInt2673 + 1 - arg1;
		this.aDouble2 = ((double) arg3 - this.aDouble6) / local13;
		this.aDouble1 = ((double) arg2 - this.aDouble5) / local13;
		this.aDouble4 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble2 * this.aDouble2);
		if (!this.aBoolean112) {
			this.aDouble8 = -this.aDouble4 * Math.tan((double) this.anInt2668 * 0.02454369D);
		}
		this.aDouble3 = ((double) arg0 - this.aDouble8 * local13 - this.aDouble7) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
	public void method1844(@OriginalArg(1) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble2;
		this.aBoolean112 = true;
		this.aDouble5 += (double) arg0 * this.aDouble1;
		this.aDouble7 += (double) arg0 * (double) arg0 * this.aDouble3 * 0.5D + this.aDouble8 * (double) arg0;
		this.aDouble8 += this.aDouble3 * (double) arg0;
		this.anInt2674 = (int) (Math.atan2(this.aDouble2, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt2666 = (int) (Math.atan2(this.aDouble8, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass3_Sub2_Sub2_2 == null) {
			return;
		}
		this.anInt2672 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt2672 <= this.aClass3_Sub2_Sub2_2.anIntArray73[this.anInt2657]) {
						return;
					}
					this.anInt2672 -= this.aClass3_Sub2_Sub2_2.anIntArray73[this.anInt2657];
					this.anInt2657++;
				} while (this.aClass3_Sub2_Sub2_2.anIntArray74.length > this.anInt2657);
				this.anInt2657 -= this.aClass3_Sub2_Sub2_2.anInt945;
			} while (this.anInt2657 >= 0 && this.aClass3_Sub2_Sub2_2.anIntArray74.length > this.anInt2657);
			this.anInt2657 = 0;
		}
	}
}
