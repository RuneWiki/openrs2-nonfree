import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class4_Sub4_Sub1_Sub4 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!g", name = "V", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!g", name = "cb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!g", name = "eb", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!g", name = "fb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!g", name = "qb", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!g", name = "tb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!g", name = "xb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!g", name = "Ib", descriptor = "I")
	public int anInt1011;

	@OriginalMember(owner = "client!g", name = "sb", descriptor = "I")
	private int anInt1001 = 0;

	@OriginalMember(owner = "client!g", name = "hb", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!g", name = "Hb", descriptor = "I")
	private int anInt1010 = 0;

	@OriginalMember(owner = "client!g", name = "pb", descriptor = "I")
	private final int anInt999;

	@OriginalMember(owner = "client!g", name = "Bb", descriptor = "I")
	private final int anInt1004;

	@OriginalMember(owner = "client!g", name = "Db", descriptor = "I")
	public final int anInt1006;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "I")
	private final int anInt991;

	@OriginalMember(owner = "client!g", name = "Jb", descriptor = "I")
	private final int anInt1012;

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
	private final int anInt992;

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "I")
	public final int anInt997;

	@OriginalMember(owner = "client!g", name = "Fb", descriptor = "I")
	public final int anInt1008;

	@OriginalMember(owner = "client!g", name = "Eb", descriptor = "I")
	public final int anInt1007;

	@OriginalMember(owner = "client!g", name = "mb", descriptor = "I")
	public final int anInt996;

	@OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
	private final int anInt994;

	@OriginalMember(owner = "client!g", name = "vb", descriptor = "Lclient!t;")
	private final Class4_Sub4_Sub14 aClass4_Sub4_Sub14_3;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class4_Sub4_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt999 = arg8;
		this.anInt1004 = arg7;
		this.anInt1006 = arg10;
		this.anInt991 = arg0;
		this.anInt1012 = arg4;
		this.anInt992 = arg3;
		this.anInt997 = arg9;
		this.anInt1008 = arg5;
		this.anInt1007 = arg6;
		this.aBoolean29 = false;
		this.anInt996 = arg1;
		this.anInt994 = arg2;
		@Pc(52) int local52 = Static92.method1610(this.anInt991).anInt1231;
		if (local52 == -1) {
			this.aClass4_Sub4_Sub14_3 = null;
		} else {
			this.aClass4_Sub4_Sub14_3 = Static127.method2102(local52);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
	public void method671(@OriginalArg(0) int arg0) {
		this.aDouble5 += this.aDouble8 * (double) arg0 + (double) arg0 * 0.5D * this.aDouble7 * (double) arg0;
		this.aDouble4 += this.aDouble3 * (double) arg0;
		this.aBoolean29 = true;
		this.aDouble8 += (double) arg0 * this.aDouble7;
		this.aDouble2 += (double) arg0 * this.aDouble9;
		this.anInt1011 = (int) (Math.atan2(this.aDouble9, this.aDouble3) * 325.949D) + 1024 & 0x7FF;
		this.anInt1000 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 325.949D) & 0x7FF;
		if (this.aClass4_Sub4_Sub14_3 == null) {
			return;
		}
		this.anInt1001 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass4_Sub4_Sub14_3.anIntArray294[this.anInt1010] >= this.anInt1001) {
						return;
					}
					this.anInt1001 -= this.aClass4_Sub4_Sub14_3.anIntArray294[this.anInt1010];
					this.anInt1010++;
				} while (this.anInt1010 < this.aClass4_Sub4_Sub14_3.anIntArray295.length);
				this.anInt1010 -= this.aClass4_Sub4_Sub14_3.anInt2710;
			} while (this.anInt1010 >= 0 && this.aClass4_Sub4_Sub14_3.anIntArray295.length > this.anInt1010);
			this.anInt1010 = 0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V")
	public void method673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean29) {
			local16 = arg1 - this.anInt994;
			@Pc(23) double local23 = (double) (arg2 - this.anInt992);
			@Pc(32) double local32 = Math.sqrt(local23 * local23 + local16 * local16);
			this.aDouble4 = (double) this.anInt992 + (double) this.anInt999 * local23 / local32;
			this.aDouble2 = (double) this.anInt994 + local16 * (double) this.anInt999 / local32;
			this.aDouble5 = this.anInt1012;
		}
		local16 = this.anInt1007 + 1 - arg3;
		this.aDouble9 = ((double) arg1 - this.aDouble2) / local16;
		this.aDouble3 = ((double) arg2 - this.aDouble4) / local16;
		this.aDouble6 = Math.sqrt(this.aDouble3 * this.aDouble3 + this.aDouble9 * this.aDouble9);
		if (!this.aBoolean29) {
			this.aDouble8 = -this.aDouble6 * Math.tan((double) this.anInt1004 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg0 - this.aDouble5 - this.aDouble8 * local16) * 2.0D / (local16 * local16);
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)Lclient!rb;")
	@Override
	public Class4_Sub4_Sub1_Sub6 method1976() {
		@Pc(13) Class4_Sub4_Sub7 local13 = Static92.method1610(this.anInt991);
		@Pc(21) Class4_Sub4_Sub1_Sub6 local21 = local13.method853(this.anInt1010);
		if (local21 == null) {
			return null;
		} else {
			local21.method1796(this.anInt1000);
			return local21;
		}
	}
}
