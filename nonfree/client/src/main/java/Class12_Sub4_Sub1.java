import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class12_Sub4_Sub1 extends Class12_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "B")
	private final byte aByte23;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "B")
	private final byte aByte21;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "S")
	private final short aShort21;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "Z")
	private final boolean aBoolean193;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "B")
	private final byte aByte22;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "Z")
	private final boolean aBoolean191;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "Z")
	private final boolean aBoolean192;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "Lclient!mr;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_2;

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "Lclient!ab;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIZIIIII)V")
	public Class12_Sub4_Sub1(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static292.method4438(arg10, arg11));
		this.aByte23 = (byte) arg10;
		this.aByte21 = (byte) arg11;
		this.aShort21 = (short) arg1.anInt802;
		this.aBoolean193 = arg6;
		super.anInt5727 = (short) arg3;
		super.anInt5721 = (short) arg5;
		this.aByte22 = (byte) arg2;
		this.aBoolean191 = arg1.anInt788 != 0 && !arg6;
		this.aBoolean192 = arg0.method4527() && arg1.aBoolean65 && !this.aBoolean193 && Static193.anInt6663 != 0;
		@Pc(73) Class146 local73 = this.method2371(this.aBoolean192, 1024, arg0);
		if (local73 != null) {
			this.aClass2_Sub1_Sub6_2 = local73.aClass2_Sub1_Sub6_5;
			this.aClass3_2 = local73.aClass3_5;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
		if (this.aClass3_2 != null) {
			this.aClass3_2.method3435();
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aBoolean192;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZILclient!km;I)Lclient!lt;")
	private Class146 method2371(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2) {
		@Pc(13) Class34 local13 = Static11.aClass123_5.method2703(this.aShort21 & 0xFFFF);
		@Pc(45) Class33 local45;
		@Pc(36) Class33 local36;
		if (this.aBoolean193) {
			local36 = Static39.aClass33Array2[0];
			local45 = Static345.aClass33Array3[this.aByte22];
		} else {
			if (this.aByte22 < 3) {
				local36 = Static39.aClass33Array2[this.aByte22 + 1];
			} else {
				local36 = null;
			}
			local45 = Static39.aClass33Array2[this.aByte22];
		}
		return local13.method827(local36, super.anInt5727, this.aByte23, local45, this.aByte21, arg2, arg1, arg0, super.anInt5721, super.anInt5724);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aShort21 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.method2374(arg0, arg1);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class2_Sub1_Sub6 local25;
		if (this.aClass2_Sub1_Sub6_2 == null && this.aBoolean192) {
			@Pc(18) Class146 local18 = this.method2371(true, 131072, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub6_5;
		} else {
			local25 = this.aClass2_Sub1_Sub6_2;
			this.aClass2_Sub1_Sub6_2 = null;
		}
		if (local25 != null) {
			Static64.method1166(local25, this.aByte22, super.anInt5727, super.anInt5721, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		if (this.aClass3_2 == null) {
			return null;
		}
		@Pc(11) Class54 local11 = arg0.method4556();
		local11.method4789(super.anInt5727 + super.anInt5725, super.anInt5724, super.anInt5721 + super.anInt5726);
		@Pc(29) Class22_Sub8 local29 = null;
		if (this.aBoolean191) {
			local29 = Static128.method2279(1);
		}
		this.aClass3_2.method3443(local11, local29 == null ? null : local29.aClass22_Sub1Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lclient!km;II)Lclient!ab;")
	private Class3 method2374(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_2 != null && arg0.method4499(this.aClass3_2.method3474(), arg1) == 0) {
			return this.aClass3_2;
		} else {
			@Pc(34) Class146 local34 = this.method2371(false, arg1, arg0);
			return local34 == null ? null : local34.aClass3_5;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class2_Sub1_Sub6 local25;
		if (this.aClass2_Sub1_Sub6_2 == null && this.aBoolean192) {
			@Pc(18) Class146 local18 = this.method2371(true, 131072, arg0);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub6_5;
		} else {
			local25 = this.aClass2_Sub1_Sub6_2;
			this.aClass2_Sub1_Sub6_2 = null;
		}
		if (local25 != null) {
			Static197.method3302(local25, this.aByte22, super.anInt5727, super.anInt5721, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aByte21;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3 local9 = this.method2374(arg0, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(21) Class54 local21 = arg0.method4556();
			local21.method4789(super.anInt5727, super.anInt5724, super.anInt5721);
			return local9.method3444(arg2, arg1, local21, false);
		}
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)I")
	@Override
	public int method5019() {
		return this.aClass3_2 == null ? 0 : this.aClass3_2.method3459();
	}
}
