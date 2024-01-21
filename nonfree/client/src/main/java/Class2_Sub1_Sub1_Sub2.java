import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!da", name = "O", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!da", name = "R", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!da", name = "V", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!da", name = "Y", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!da", name = "db", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!da", name = "tb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!da", name = "vb", descriptor = "I")
	public int anInt1070;

	@OriginalMember(owner = "client!da", name = "X", descriptor = "Z")
	private boolean aBoolean41 = false;

	@OriginalMember(owner = "client!da", name = "nb", descriptor = "I")
	private int anInt1064 = 0;

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
	private int anInt1061 = 0;

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
	private int anInt1060 = -32768;

	@OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
	private final int anInt1054;

	@OriginalMember(owner = "client!da", name = "Ab", descriptor = "I")
	private final int anInt1073;

	@OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
	private final int anInt1066;

	@OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
	private final int anInt1055;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
	public final int anInt1059;

	@OriginalMember(owner = "client!da", name = "S", descriptor = "I")
	public final int anInt1051;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
	public final int anInt1050;

	@OriginalMember(owner = "client!da", name = "wb", descriptor = "I")
	public final int anInt1071;

	@OriginalMember(owner = "client!da", name = "rb", descriptor = "I")
	private final int anInt1067;

	@OriginalMember(owner = "client!da", name = "W", descriptor = "I")
	private final int anInt1053;

	@OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
	public final int anInt1063;

	@OriginalMember(owner = "client!da", name = "jb", descriptor = "Lclient!ce;")
	private final Class2_Sub1_Sub5 aClass2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class2_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt1054 = arg0;
		this.aBoolean41 = false;
		this.anInt1073 = arg8;
		this.anInt1066 = arg4;
		this.anInt1055 = arg3;
		this.anInt1059 = arg5;
		this.anInt1051 = arg9;
		this.anInt1050 = arg1;
		this.anInt1071 = arg10;
		this.anInt1067 = arg7;
		this.anInt1053 = arg2;
		this.anInt1063 = arg6;
		@Pc(55) int local55 = Static101.method2313(this.anInt1054).anInt2838;
		if (local55 == -1) {
			this.aClass2_Sub1_Sub5_1 = null;
		} else {
			this.aClass2_Sub1_Sub5_1 = Static103.method2357(local55);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
	public void method820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean41) {
			local9 = arg3 - this.anInt1053;
			@Pc(16) double local16 = (double) (arg1 - this.anInt1055);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble3 = local9 * (double) this.anInt1073 / local25 + (double) this.anInt1053;
			this.aDouble4 = (double) this.anInt1055 + (double) this.anInt1073 * local16 / local25;
			this.aDouble2 = this.anInt1066;
		}
		local9 = this.anInt1063 + 1 - arg0;
		this.aDouble8 = ((double) arg3 - this.aDouble3) / local9;
		this.aDouble6 = ((double) arg1 - this.aDouble4) / local9;
		this.aDouble1 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean41) {
			this.aDouble5 = -this.aDouble1 * Math.tan((double) this.anInt1067 * 0.02454369D);
		}
		this.aDouble7 = ((double) arg2 - this.aDouble5 * local9 - this.aDouble2) * 2.0D / (local9 * local9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class2_Sub1_Sub1_Sub4 local3 = this.method824();
		if (local3 != null) {
			local3.method3173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1060 = local3.method3179();
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
	public void method823(@OriginalArg(1) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble8;
		this.aBoolean41 = true;
		this.aDouble4 += (double) arg0 * this.aDouble6;
		this.aDouble2 += this.aDouble5 * (double) arg0 + this.aDouble7 * 0.5D * (double) arg0 * (double) arg0;
		this.aDouble5 += this.aDouble7 * (double) arg0;
		this.anInt1070 = (int) (Math.atan2(this.aDouble8, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt1062 = (int) (Math.atan2(this.aDouble5, this.aDouble1) * 325.949D) & 0x7FF;
		if (this.aClass2_Sub1_Sub5_1 == null) {
			return;
		}
		this.anInt1061 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass2_Sub1_Sub5_1.anIntArray83[this.anInt1064] >= this.anInt1061) {
						return;
					}
					this.anInt1061 -= this.aClass2_Sub1_Sub5_1.anIntArray83[this.anInt1064];
					this.anInt1064++;
				} while (this.aClass2_Sub1_Sub5_1.anIntArray84.length > this.anInt1064);
				this.anInt1064 -= this.aClass2_Sub1_Sub5_1.anInt795;
			} while (this.anInt1064 >= 0 && this.aClass2_Sub1_Sub5_1.anIntArray84.length > this.anInt1064);
			this.anInt1064 = 0;
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Lclient!fe;")
	private Class2_Sub1_Sub1_Sub4 method824() {
		@Pc(6) Class2_Sub1_Sub14 local6 = Static101.method2313(this.anInt1054);
		@Pc(16) Class2_Sub1_Sub1_Sub4 local16 = local6.method2261(this.anInt1064);
		if (local16 == null) {
			return null;
		} else {
			local16.method1616(this.anInt1062);
			return local16;
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()I")
	@Override
	public int method3179() {
		return this.anInt1060;
	}
}
