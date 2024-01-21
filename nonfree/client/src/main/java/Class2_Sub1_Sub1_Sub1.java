import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!aa", name = "sb", descriptor = "I")
	private int anInt103;

	@OriginalMember(owner = "client!aa", name = "Ab", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!aa", name = "Cb", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!aa", name = "Fb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!aa", name = "Jb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!aa", name = "Pb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!aa", name = "Yb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!aa", name = "ac", descriptor = "I")
	public int anInt121;

	@OriginalMember(owner = "client!aa", name = "bc", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!aa", name = "cc", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!aa", name = "Qb", descriptor = "I")
	private int anInt115 = 0;

	@OriginalMember(owner = "client!aa", name = "Nb", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!aa", name = "Sb", descriptor = "I")
	private int anInt116 = 0;

	@OriginalMember(owner = "client!aa", name = "Db", descriptor = "I")
	public final int anInt108;

	@OriginalMember(owner = "client!aa", name = "Bb", descriptor = "I")
	private final int anInt107;

	@OriginalMember(owner = "client!aa", name = "Ub", descriptor = "I")
	private final int anInt118;

	@OriginalMember(owner = "client!aa", name = "Wb", descriptor = "I")
	private final int anInt119;

	@OriginalMember(owner = "client!aa", name = "hc", descriptor = "I")
	public final int anInt124;

	@OriginalMember(owner = "client!aa", name = "Hb", descriptor = "I")
	public final int anInt110;

	@OriginalMember(owner = "client!aa", name = "lc", descriptor = "I")
	public final int anInt127;

	@OriginalMember(owner = "client!aa", name = "dc", descriptor = "I")
	private final int anInt122;

	@OriginalMember(owner = "client!aa", name = "kc", descriptor = "I")
	public final int anInt126;

	@OriginalMember(owner = "client!aa", name = "Ob", descriptor = "I")
	private final int anInt114;

	@OriginalMember(owner = "client!aa", name = "yb", descriptor = "I")
	private final int anInt106;

	@OriginalMember(owner = "client!aa", name = "Kb", descriptor = "Lclient!gd;")
	private final Class2_Sub1_Sub6 aClass2_Sub1_Sub6_1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt108 = arg10;
		this.anInt107 = arg4;
		this.anInt118 = arg3;
		this.anInt119 = arg8;
		this.anInt124 = arg5;
		this.anInt110 = arg6;
		this.anInt127 = arg1;
		this.aBoolean6 = false;
		this.anInt122 = arg0;
		this.anInt126 = arg9;
		this.anInt114 = arg7;
		this.anInt106 = arg2;
		@Pc(52) int local52 = Static20.method402(this.anInt122).anInt2681;
		if (local52 == -1) {
			this.aClass2_Sub1_Sub6_1 = null;
		} else {
			this.aClass2_Sub1_Sub6_1 = Static71.method1291(local52);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
	public void method58(@OriginalArg(1) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble6 + (double) arg0 * this.aDouble5 * 0.5D * (double) arg0;
		this.aDouble3 += this.aDouble4 * (double) arg0;
		this.aBoolean6 = true;
		this.aDouble8 += this.aDouble1 * (double) arg0;
		this.aDouble6 += this.aDouble5 * (double) arg0;
		this.anInt121 = (int) (Math.atan2(this.aDouble1, this.aDouble4) * 325.949D) + 1024 & 0x7FF;
		this.anInt103 = (int) (Math.atan2(this.aDouble6, this.aDouble7) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub6_1 == null) {
			return;
		}
		this.anInt116 += arg0;
		while (this.aClass2_Sub1_Sub6_1.anIntArray157[this.anInt115] < this.anInt116) {
			this.anInt116 -= this.aClass2_Sub1_Sub6_1.anIntArray157[this.anInt115];
			this.anInt115++;
			if (this.aClass2_Sub1_Sub6_1.anIntArray155.length <= this.anInt115) {
				this.anInt115 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIB)V")
	public void method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean6) {
			local13 = arg0 - this.anInt106;
			@Pc(19) double local19 = (double) (arg2 - this.anInt118);
			@Pc(28) double local28 = Math.sqrt(local19 * local19 + local13 * local13);
			this.aDouble8 = (double) this.anInt119 * local13 / local28 + (double) this.anInt106;
			this.aDouble3 = (double) this.anInt118 + (double) this.anInt119 * local19 / local28;
			this.aDouble2 = this.anInt107;
		}
		local13 = this.anInt110 + 1 - arg3;
		this.aDouble4 = ((double) arg2 - this.aDouble3) / local13;
		this.aDouble1 = ((double) arg0 - this.aDouble8) / local13;
		this.aDouble7 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean6) {
			this.aDouble6 = -this.aDouble7 * Math.tan((double) this.anInt114 * 0.02454369D);
		}
		this.aDouble5 = ((double) arg1 - this.aDouble2 - this.aDouble6 * local13) * 2.0D / (local13 * local13);
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(B)Lclient!r;")
	@Override
	public Class2_Sub1_Sub1_Sub6 method1512() {
		@Pc(15) Class2_Sub1_Sub15 local15 = Static20.method402(this.anInt122);
		@Pc(21) Class2_Sub1_Sub1_Sub6 local21 = local15.method1654(this.anInt115);
		if (local21 == null) {
			return null;
		} else {
			local21.method1514(this.anInt103);
			return local21;
		}
	}
}
