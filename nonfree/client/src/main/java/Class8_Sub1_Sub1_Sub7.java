import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class8_Sub1_Sub1_Sub7 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
	public int anInt2965;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "I")
	private int anInt2967;

	@OriginalMember(owner = "client!vb", name = "ob", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!vb", name = "sb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!vb", name = "ub", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!vb", name = "yb", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!vb", name = "Ab", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!vb", name = "Eb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!vb", name = "Kb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
	private int anInt2970 = 0;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!vb", name = "qb", descriptor = "I")
	private int anInt2969 = 0;

	@OriginalMember(owner = "client!vb", name = "Cb", descriptor = "I")
	private final int anInt2975;

	@OriginalMember(owner = "client!vb", name = "Rb", descriptor = "I")
	public final int anInt2981;

	@OriginalMember(owner = "client!vb", name = "Vb", descriptor = "I")
	private final int anInt2985;

	@OriginalMember(owner = "client!vb", name = "Gb", descriptor = "I")
	private final int anInt2977;

	@OriginalMember(owner = "client!vb", name = "Tb", descriptor = "I")
	private final int anInt2983;

	@OriginalMember(owner = "client!vb", name = "hb", descriptor = "I")
	public final int anInt2961;

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "I")
	public final int anInt2968;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
	public final int anInt2962;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
	public final int anInt2972;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "I")
	private final int anInt2964;

	@OriginalMember(owner = "client!vb", name = "Qb", descriptor = "I")
	private final int anInt2980;

	@OriginalMember(owner = "client!vb", name = "Ib", descriptor = "Lclient!dc;")
	private final Class8_Sub1_Sub6 aClass8_Sub1_Sub6_3;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class8_Sub1_Sub1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2975 = arg0;
		this.anInt2981 = arg9;
		this.anInt2985 = arg7;
		this.anInt2977 = arg4;
		this.anInt2983 = arg2;
		this.anInt2961 = arg5;
		this.aBoolean108 = false;
		this.anInt2968 = arg6;
		this.anInt2962 = arg1;
		this.anInt2972 = arg10;
		this.anInt2964 = arg8;
		this.anInt2980 = arg3;
		@Pc(52) int local52 = Static14.method235(this.anInt2975).anInt638;
		if (local52 == -1) {
			this.aClass8_Sub1_Sub6_3 = null;
		} else {
			this.aClass8_Sub1_Sub6_3 = Static47.method733(local52);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public void method1962(@OriginalArg(0) int arg0) {
		this.aBoolean108 = true;
		this.aDouble8 += this.aDouble3 * (double) arg0;
		this.aDouble5 += this.aDouble9 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble2;
		this.aDouble2 += this.aDouble9 * (double) arg0;
		this.aDouble6 += this.aDouble4 * (double) arg0;
		this.anInt2965 = (int) (Math.atan2(this.aDouble4, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt2967 = (int) (Math.atan2(this.aDouble2, this.aDouble7) * 325.949D) & 0x7FF;
		if (this.aClass8_Sub1_Sub6_3 == null) {
			return;
		}
		this.anInt2969 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass8_Sub1_Sub6_3.anIntArray76[this.anInt2970] >= this.anInt2969) {
						return;
					}
					this.anInt2969 -= this.aClass8_Sub1_Sub6_3.anIntArray76[this.anInt2970];
					this.anInt2970++;
				} while (this.aClass8_Sub1_Sub6_3.anIntArray79.length > this.anInt2970);
				this.anInt2970 -= this.aClass8_Sub1_Sub6_3.anInt724;
			} while (this.anInt2970 >= 0 && this.anInt2970 < this.aClass8_Sub1_Sub6_3.anIntArray79.length);
			this.anInt2970 = 0;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Lclient!nb;")
	@Override
	public Class8_Sub1_Sub1_Sub6 method1955() {
		@Pc(13) Class8_Sub1_Sub5 local13 = Static14.method235(this.anInt2975);
		@Pc(19) Class8_Sub1_Sub1_Sub6 local19 = local13.method381(this.anInt2970);
		if (local19 == null) {
			return null;
		} else {
			local19.method1271(this.anInt2967);
			return local19;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIII)V")
	public void method1968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean108) {
			@Pc(9) double local9 = (double) (arg2 - this.anInt2980);
			local16 = arg0 - this.anInt2983;
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble6 = (double) this.anInt2983 + local16 * (double) this.anInt2964 / local25;
			this.aDouble5 = this.anInt2977;
			this.aDouble8 = local9 * (double) this.anInt2964 / local25 + (double) this.anInt2980;
		}
		local16 = this.anInt2968 + 1 - arg3;
		this.aDouble3 = ((double) arg2 - this.aDouble8) / local16;
		this.aDouble4 = ((double) arg0 - this.aDouble6) / local16;
		this.aDouble7 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble4 * this.aDouble4);
		if (!this.aBoolean108) {
			this.aDouble2 = -this.aDouble7 * Math.tan((double) this.anInt2985 * 0.02454369D);
		}
		this.aDouble9 = ((double) arg1 - this.aDouble5 - this.aDouble2 * local16) * 2.0D / (local16 * local16);
	}
}
