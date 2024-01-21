import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class2_Sub4_Sub1_Sub7 extends Class2_Sub4_Sub1 {

	@OriginalMember(owner = "client!we", name = "Eb", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!we", name = "Lb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!we", name = "Mb", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!we", name = "Nb", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!we", name = "Qb", descriptor = "I")
	public int anInt4016;

	@OriginalMember(owner = "client!we", name = "Sb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!we", name = "Yb", descriptor = "I")
	private int anInt4023;

	@OriginalMember(owner = "client!we", name = "dc", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!we", name = "fc", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!we", name = "mc", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!we", name = "jc", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!we", name = "Gb", descriptor = "I")
	private int anInt4012 = 0;

	@OriginalMember(owner = "client!we", name = "Xb", descriptor = "I")
	private int anInt4022 = 0;

	@OriginalMember(owner = "client!we", name = "Ub", descriptor = "I")
	public final int anInt4019;

	@OriginalMember(owner = "client!we", name = "tc", descriptor = "I")
	private final int anInt4034;

	@OriginalMember(owner = "client!we", name = "Fb", descriptor = "I")
	private final int anInt4011;

	@OriginalMember(owner = "client!we", name = "Hb", descriptor = "I")
	private final int anInt4013;

	@OriginalMember(owner = "client!we", name = "uc", descriptor = "I")
	private final int anInt4035;

	@OriginalMember(owner = "client!we", name = "qc", descriptor = "I")
	private final int anInt4032;

	@OriginalMember(owner = "client!we", name = "Vb", descriptor = "I")
	private final int anInt4020;

	@OriginalMember(owner = "client!we", name = "Rb", descriptor = "I")
	public final int anInt4017;

	@OriginalMember(owner = "client!we", name = "lc", descriptor = "I")
	public final int anInt4030;

	@OriginalMember(owner = "client!we", name = "oc", descriptor = "I")
	public final int anInt4031;

	@OriginalMember(owner = "client!we", name = "cc", descriptor = "I")
	public final int anInt4025;

	@OriginalMember(owner = "client!we", name = "pc", descriptor = "Lclient!ah;")
	private final Class2_Sub4_Sub2 aClass2_Sub4_Sub2_3;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub4_Sub1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean172 = false;
		this.anInt4019 = arg10;
		this.anInt4034 = arg0;
		this.anInt4011 = arg8;
		this.anInt4013 = arg2;
		this.anInt4035 = arg4;
		this.anInt4032 = arg3;
		this.anInt4020 = arg7;
		this.anInt4017 = arg5;
		this.anInt4030 = arg9;
		this.anInt4031 = arg6;
		this.anInt4025 = arg1;
		@Pc(52) int local52 = Static19.method611(this.anInt4034).anInt1224;
		if (local52 == -1) {
			this.aClass2_Sub4_Sub2_3 = null;
		} else {
			this.aClass2_Sub4_Sub2_3 = Static49.method926(local52);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V")
	public void method2865(@OriginalArg(1) int arg0) {
		this.aDouble4 += this.aDouble2 * (double) arg0;
		this.aDouble3 += (double) arg0 * 0.5D * this.aDouble6 * (double) arg0 + this.aDouble7 * (double) arg0;
		this.aDouble8 += this.aDouble5 * (double) arg0;
		this.aDouble7 += (double) arg0 * this.aDouble6;
		this.aBoolean172 = true;
		this.anInt4016 = (int) (Math.atan2(this.aDouble5, this.aDouble2) * 325.949D) + 1024 & 0x7FF;
		this.anInt4023 = (int) (Math.atan2(this.aDouble7, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub4_Sub2_3 == null) {
			return;
		}
		this.anInt4022 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub4_Sub2_3.anIntArray36[this.anInt4012] >= this.anInt4022) {
						return;
					}
					this.anInt4022 -= this.aClass2_Sub4_Sub2_3.anIntArray36[this.anInt4012];
					this.anInt4012++;
				} while (this.anInt4012 < this.aClass2_Sub4_Sub2_3.anIntArray37.length);
				this.anInt4012 -= this.aClass2_Sub4_Sub2_3.anInt486;
			} while (this.anInt4012 >= 0 && this.aClass2_Sub4_Sub2_3.anIntArray37.length > this.anInt4012);
			this.anInt4012 = 0;
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)Lclient!df;")
	@Override
	protected Class2_Sub4_Sub1_Sub3 method2858() {
		@Pc(14) Class2_Sub4_Sub7 local14 = Static19.method611(this.anInt4034);
		@Pc(22) Class2_Sub4_Sub1_Sub3 local22 = local14.method892(this.anInt4012);
		if (local22 == null) {
			return null;
		} else {
			local22.method1191(this.anInt4023);
			return local22;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIBI)V")
	public void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean172) {
			local13 = arg2 - this.anInt4013;
			@Pc(20) double local20 = (double) (arg1 - this.anInt4032);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble4 = (double) this.anInt4032 + local20 * (double) this.anInt4011 / local29;
			this.aDouble8 = (double) this.anInt4013 + (double) this.anInt4011 * local13 / local29;
			this.aDouble3 = this.anInt4035;
		}
		local13 = this.anInt4031 + 1 - arg3;
		this.aDouble2 = ((double) arg1 - this.aDouble4) / local13;
		this.aDouble5 = ((double) arg2 - this.aDouble8) / local13;
		this.aDouble1 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble5 * this.aDouble5);
		if (!this.aBoolean172) {
			this.aDouble7 = -this.aDouble1 * Math.tan((double) this.anInt4020 * 0.02454369D);
		}
		this.aDouble6 = ((double) arg0 - this.aDouble7 * local13 - this.aDouble3) * 2.0D / (local13 * local13);
	}
}
