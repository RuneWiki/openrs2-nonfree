import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "B")
	private final byte aByte19;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Z")
	private final boolean aBoolean124;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "S")
	private final short aShort18;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "B")
	private final byte aByte20;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "Z")
	private boolean aBoolean122;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "Z")
	private final boolean aBoolean125;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "Z")
	private final boolean aBoolean123;

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "Lclient!i;")
	private Class2_Sub5_Sub7 aClass2_Sub5_Sub7_2;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Lclient!e;")
	public Class59 aClass59_3;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIZIIZ)V")
	public Class3_Sub2_Sub2(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static96.method1501(arg7, arg8));
		this.aByte19 = (byte) arg8;
		this.aBoolean124 = arg6;
		this.aShort18 = (short) arg1.anInt5325;
		this.aByte20 = (byte) arg7;
		super.anInt6426 = arg3;
		super.anInt6421 = arg5;
		this.aBoolean122 = arg9;
		this.aBoolean125 = arg1.anInt5357 != 0 && !arg6;
		this.aByte18 = (byte) arg2;
		this.aBoolean123 = arg0.method5544() && arg1.aBoolean392 && !this.aBoolean124 && Static2.aClass148_Sub1_1.method3036(Static288.anInt4743) != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean122) {
			local68 |= 0x10000;
		}
		@Pc(83) Class247 local83 = this.method1464(this.aBoolean123, local68, arg0);
		if (local83 != null) {
			this.aClass2_Sub5_Sub7_2 = local83.aClass2_Sub5_Sub7_5;
			this.aClass59_3 = local83.aClass59_6;
			if (this.aBoolean122) {
				this.aClass59_3 = this.aClass59_3.method5737((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return this.aBoolean122;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		@Pc(14) Class2_Sub5_Sub7 local14;
		if (this.aClass2_Sub5_Sub7_2 == null && this.aBoolean123) {
			@Pc(25) Class247 local25 = this.method1464(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub5_Sub7_5;
		} else {
			local14 = this.aClass2_Sub5_Sub7_2;
			this.aClass2_Sub5_Sub7_2 = null;
		}
		if (local14 != null) {
			Static357.method4497(local14, this.aByte18, super.anInt6426, super.anInt6421, null);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.method1467(arg0, arg1);
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		if (this.aClass59_3 == null) {
			return null;
		}
		@Pc(11) Class31 local11 = arg0.method5539();
		local11.U(super.anInt6426, super.anInt6424, super.anInt6421);
		@Pc(21) Class21_Sub6 local21 = null;
		if (this.aBoolean125) {
			local21 = Static209.method2805(1);
		}
		this.aClass59_3.method5736(local11, local21 == null ? null : local21.aClass21_Sub7Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		if (arg0 instanceof Class3_Sub2_Sub2) {
			@Pc(14) Class3_Sub2_Sub2 local14 = (Class3_Sub2_Sub2) arg0;
			if (this.aClass59_3 != null && local14.aClass59_3 != null) {
				this.aClass59_3.method5743(local14.aClass59_3, arg1, arg4, arg3, arg2);
			}
		} else if (arg0 instanceof Class3_Sub4_Sub6) {
			@Pc(36) Class3_Sub4_Sub6 local36 = (Class3_Sub4_Sub6) arg0;
			if (this.aClass59_3 != null && local36.aClass59_7 != null) {
				this.aClass59_3.method5743(local36.aClass59_7, arg1, arg4, arg3, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
		if (this.aClass59_3 != null) {
			this.aClass59_3.method5745();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aShort18 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BZILclient!za;)Lclient!uo;")
	private Class247 method1464(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(20) Class192 local20 = Static50.aClass190_1.method4218(this.aShort18 & 0xFFFF);
		@Pc(28) Class162 local28;
		@Pc(32) Class162 local32;
		if (this.aBoolean124) {
			local28 = Static109.aClass162Array1[this.aByte18];
			local32 = Static314.aClass162Array2[0];
		} else {
			if (this.aByte18 >= 3) {
				local32 = null;
			} else {
				local32 = Static314.aClass162Array2[this.aByte18 + 1];
			}
			local28 = Static314.aClass162Array2[this.aByte18];
		}
		return local20.method4234(this.aByte20, arg1, super.anInt6426, super.anInt6424, local32, arg2, local28, super.anInt6421, this.aByte19, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aBoolean123;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		this.aBoolean122 = false;
		if (this.aClass59_3 != null) {
			this.aClass59_3.D(this.aClass59_3.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(19) Class59 local19 = this.method1467(131072, arg2);
		if (local19 == null) {
			return false;
		} else {
			@Pc(24) Class31 local24 = arg2.method5539();
			local24.U(super.anInt6426, super.anInt6424, super.anInt6421);
			return local19.method5748(arg1, arg0, local24, false);
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(ILclient!za;B)Lclient!e;")
	private Class59 method1467(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		if (this.aClass59_3 != null && arg1.method5502(this.aClass59_3.RA(), arg0) == 0) {
			return this.aClass59_3;
		} else {
			@Pc(34) Class247 local34 = this.method1464(false, arg0, arg1);
			return local34 == null ? null : local34.aClass59_6;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		@Pc(21) Class2_Sub5_Sub7 local21;
		if (this.aClass2_Sub5_Sub7_2 == null && this.aBoolean123) {
			@Pc(32) Class247 local32 = this.method1464(true, 262144, arg0);
			local21 = local32 == null ? null : local32.aClass2_Sub5_Sub7_5;
		} else {
			local21 = this.aClass2_Sub5_Sub7_2;
			this.aClass2_Sub5_Sub7_2 = null;
		}
		if (local21 != null) {
			Static92.method1462(local21, this.aByte18, super.anInt6426, super.anInt6421, null);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return this.aByte20;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aByte19;
	}
}
