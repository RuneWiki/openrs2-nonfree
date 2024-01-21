import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "D")
	public double aDouble5;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "D")
	public double aDouble6;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
	public int anInt3107;

	@OriginalMember(owner = "client!ph", name = "M", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
	private int anInt3111;

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
	private int anInt3096 = 0;

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
	private int anInt3099 = 0;

	@OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
	private int anInt3115 = -32768;

	@OriginalMember(owner = "client!ph", name = "V", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
	private final int anInt3097;

	@OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
	private final int anInt3113;

	@OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
	private final int anInt3112;

	@OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
	public final int anInt3117;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
	private final int anInt3102;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
	public final int anInt3103;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
	public final int anInt3101;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	private final int anInt3095;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	private final int anInt3104;

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
	public final int anInt3106;

	@OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
	public final int anInt3110;

	@OriginalMember(owner = "client!ph", name = "Q", descriptor = "Lclient!ta;")
	private final Class5_Sub2_Sub22 aClass5_Sub2_Sub22_2;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.aBoolean137 = false;
		this.anInt3097 = arg7;
		this.anInt3113 = arg3;
		this.anInt3112 = arg0;
		this.anInt3117 = arg1;
		this.anInt3102 = arg4;
		this.anInt3103 = arg9;
		this.anInt3101 = arg5;
		this.anInt3095 = arg2;
		this.anInt3104 = arg8;
		this.anInt3106 = arg6;
		this.anInt3110 = arg10;
		@Pc(55) int local55 = Static181.method2739(this.anInt3112).anInt3309;
		if (local55 == -1) {
			this.aClass5_Sub2_Sub22_2 = null;
		} else {
			this.aClass5_Sub2_Sub22_2 = Static14.method253(local55);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
	public void method2314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) double local16;
		if (!this.aBoolean137) {
			@Pc(9) double local9 = (double) (arg1 - this.anInt3113);
			local16 = arg2 - this.anInt3095;
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble5 = this.anInt3102;
			this.aDouble4 = (double) this.anInt3095 + local16 * (double) this.anInt3104 / local25;
			this.aDouble6 = (double) this.anInt3104 * local9 / local25 + (double) this.anInt3113;
		}
		local16 = this.anInt3106 + 1 - arg0;
		this.aDouble7 = ((double) arg2 - this.aDouble4) / local16;
		this.aDouble8 = ((double) arg1 - this.aDouble6) / local16;
		this.aDouble10 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble8 * this.aDouble8);
		if (!this.aBoolean137) {
			this.aDouble9 = -this.aDouble10 * Math.tan((double) this.anInt3097 * 0.02454369D);
		}
		this.aDouble3 = ((double) arg3 - local16 * this.aDouble9 - this.aDouble5) * 2.0D / (local16 * local16);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class1_Sub1 local3 = this.method2315();
		if (local3 != null) {
			local3.method2445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3115 = local3.method2449();
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		return this.anInt3115;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Lclient!a;")
	private Class1_Sub1 method2315() {
		@Pc(4) Class5_Sub2_Sub17 local4 = Static181.method2739(this.anInt3112);
		@Pc(14) Class1_Sub1 local14 = local4.method2506(this.anInt3099);
		if (local14 == null) {
			return null;
		} else {
			local14.method674(this.anInt3111);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	public void method2317(@OriginalArg(0) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble8;
		this.aDouble5 += this.aDouble9 * (double) arg0 + (double) arg0 * this.aDouble3 * 0.5D * (double) arg0;
		this.aBoolean137 = true;
		this.aDouble9 += this.aDouble3 * (double) arg0;
		this.aDouble4 += this.aDouble7 * (double) arg0;
		this.anInt3107 = (int) (Math.atan2(this.aDouble7, this.aDouble8) * 325.949D) + 1024 & 0x7FF;
		this.anInt3111 = (int) (Math.atan2(this.aDouble9, this.aDouble10) * 325.949D) & 0x7FF;
		if (this.aClass5_Sub2_Sub22_2 == null) {
			return;
		}
		this.anInt3096 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt3096 <= this.aClass5_Sub2_Sub22_2.anIntArray375[this.anInt3099]) {
						return;
					}
					this.anInt3096 -= this.aClass5_Sub2_Sub22_2.anIntArray375[this.anInt3099];
					this.anInt3099++;
				} while (this.aClass5_Sub2_Sub22_2.anIntArray374.length > this.anInt3099);
				this.anInt3099 -= this.aClass5_Sub2_Sub22_2.anInt3657;
			} while (this.anInt3099 >= 0 && this.aClass5_Sub2_Sub22_2.anIntArray374.length > this.anInt3099);
			this.anInt3099 = 0;
		}
	}
}
