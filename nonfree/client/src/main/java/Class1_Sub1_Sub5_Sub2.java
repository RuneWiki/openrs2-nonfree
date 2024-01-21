import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class1_Sub1_Sub5_Sub2 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "D")
	public double aDouble1;

	@OriginalMember(owner = "client!de", name = "lb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!de", name = "zb", descriptor = "I")
	private int anInt990;

	@OriginalMember(owner = "client!de", name = "Ab", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!de", name = "Db", descriptor = "I")
	public int anInt993;

	@OriginalMember(owner = "client!de", name = "Eb", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!de", name = "Fb", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!de", name = "db", descriptor = "I")
	private int anInt978 = 0;

	@OriginalMember(owner = "client!de", name = "tb", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!de", name = "Gb", descriptor = "I")
	private int anInt994 = 0;

	@OriginalMember(owner = "client!de", name = "Bb", descriptor = "I")
	public final int anInt991;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
	public final int anInt988;

	@OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
	private final int anInt976;

	@OriginalMember(owner = "client!de", name = "Cb", descriptor = "I")
	private final int anInt992;

	@OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
	private final int anInt986;

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "I")
	private final int anInt982;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
	private final int anInt977;

	@OriginalMember(owner = "client!de", name = "kb", descriptor = "I")
	public final int anInt983;

	@OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
	private final int anInt989;

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "I")
	public final int anInt987;

	@OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
	public final int anInt981;

	@OriginalMember(owner = "client!de", name = "rb", descriptor = "Lclient!pf;")
	private final Class1_Sub1_Sub12 aClass1_Sub1_Sub12_1;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub1_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt991 = arg6;
		this.aBoolean29 = false;
		this.anInt988 = arg10;
		this.anInt976 = arg4;
		this.anInt992 = arg2;
		this.anInt986 = arg7;
		this.anInt982 = arg3;
		this.anInt977 = arg8;
		this.anInt983 = arg5;
		this.anInt989 = arg0;
		this.anInt987 = arg1;
		this.anInt981 = arg9;
		@Pc(52) int local52 = Static155.method2902(this.anInt989).anInt4678;
		if (local52 == -1) {
			this.aClass1_Sub1_Sub12_1 = null;
		} else {
			this.aClass1_Sub1_Sub12_1 = Static121.method2378(local52);
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)V")
	public void method643(@OriginalArg(0) int arg0) {
		this.aDouble8 += (double) arg0 * this.aDouble3;
		this.aDouble7 += (double) arg0 * this.aDouble5;
		this.aDouble1 += this.aDouble2 * (double) arg0 + (double) arg0 * (double) arg0 * this.aDouble6 * 0.5D;
		this.aBoolean29 = true;
		this.aDouble2 += this.aDouble6 * (double) arg0;
		this.anInt993 = (int) (Math.atan2(this.aDouble3, this.aDouble5) * 325.949D) + 1024 & 0x7FF;
		this.anInt990 = (int) (Math.atan2(this.aDouble2, this.aDouble4) * 325.949D) & 0x7FF;
		if (this.aClass1_Sub1_Sub12_1 == null) {
			return;
		}
		this.anInt994 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass1_Sub1_Sub12_1.anIntArray309[this.anInt978] >= this.anInt994) {
						return;
					}
					this.anInt994 -= this.aClass1_Sub1_Sub12_1.anIntArray309[this.anInt978];
					this.anInt978++;
				} while (this.aClass1_Sub1_Sub12_1.anIntArray307.length > this.anInt978);
				this.anInt978 -= this.aClass1_Sub1_Sub12_1.anInt3462;
			} while (this.anInt978 >= 0 && this.anInt978 < this.aClass1_Sub1_Sub12_1.anIntArray307.length);
			this.anInt978 = 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method2896() {
		@Pc(14) Class1_Sub1_Sub18 local14 = Static155.method2902(this.anInt989);
		@Pc(20) Class1_Sub1_Sub5_Sub4 local20 = local14.method3152(this.anInt978);
		if (local20 == null) {
			return null;
		} else {
			local20.method999(this.anInt990);
			return local20;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIZII)V")
	public void method646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean29) {
			local13 = arg0 - this.anInt992;
			@Pc(20) double local20 = (double) (arg2 - this.anInt982);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble7 = (double) this.anInt982 + (double) this.anInt977 * local20 / local29;
			this.aDouble1 = this.anInt976;
			this.aDouble8 = (double) this.anInt992 + local13 * (double) this.anInt977 / local29;
		}
		local13 = this.anInt991 + 1 - arg1;
		this.aDouble3 = ((double) arg0 - this.aDouble8) / local13;
		this.aDouble5 = ((double) arg2 - this.aDouble7) / local13;
		this.aDouble4 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble5 * this.aDouble5);
		if (!this.aBoolean29) {
			this.aDouble2 = -this.aDouble4 * Math.tan((double) this.anInt986 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg3 - this.aDouble1 - this.aDouble2 * local13) * 2.0D / (local13 * local13);
	}
}
