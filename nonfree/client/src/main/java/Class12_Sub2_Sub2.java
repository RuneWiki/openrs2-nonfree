import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "Z")
	private final boolean aBoolean43;

	@OriginalMember(owner = "client!bq", name = "D", descriptor = "Z")
	private final boolean aBoolean44;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "S")
	private final short aShort11;

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!bq", name = "R", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!bq", name = "W", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "Z")
	private final boolean aBoolean45;

	@OriginalMember(owner = "client!bq", name = "O", descriptor = "Lclient!ab;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!bq", name = "T", descriptor = "Lclient!mr;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_1;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIZIIZ)V")
	public Class12_Sub2_Sub2(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static382.method5681(arg7, arg8));
		this.aBoolean43 = arg1.anInt788 != 0 && !arg6;
		this.aBoolean44 = arg6;
		this.aShort11 = (short) arg1.anInt802;
		this.aBoolean46 = arg9;
		this.aByte8 = (byte) arg7;
		this.aByte9 = (byte) arg2;
		super.anInt1074 = (short) arg3;
		this.aByte7 = (byte) arg8;
		super.anInt1077 = (short) arg5;
		this.aBoolean45 = arg0.method4527() && arg1.aBoolean65 && !this.aBoolean44 && Static193.anInt6663 != 0;
		@Pc(70) int local70 = 1024;
		if (this.aBoolean46) {
			local70 |= 0x8000;
		}
		@Pc(85) Class146 local85 = this.method672(arg0, local70, this.aBoolean45);
		if (local85 != null) {
			this.aClass3_1 = local85.aClass3_5;
			this.aClass2_Sub1_Sub6_1 = local85.aClass2_Sub1_Sub6_5;
			if (this.aBoolean46) {
				this.aClass3_1 = this.aClass3_1.method3481((byte) 0, local70, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!km;IBZ)Lclient!lt;")
	private Class146 method672(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class34 local18 = Static11.aClass123_5.method2703(this.aShort11 & 0xFFFF);
		@Pc(30) Class33 local30;
		@Pc(25) Class33 local25;
		if (this.aBoolean44) {
			local25 = Static39.aClass33Array2[0];
			local30 = Static345.aClass33Array3[this.aByte9];
		} else {
			local30 = Static39.aClass33Array2[this.aByte9];
			if (this.aByte9 < 3) {
				local25 = Static39.aClass33Array2[this.aByte9 + 1];
			} else {
				local25 = null;
			}
		}
		return local18.method827(local25, super.anInt1074, this.aByte8, local30, this.aByte7, arg0, arg1, arg2, super.anInt1077, super.anInt1076);
	}

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		if (this.aClass3_1 == null) {
			return null;
		}
		@Pc(11) Class54 local11 = arg0.method4556();
		local11.method4789(super.anInt1074, super.anInt1076, super.anInt1077);
		@Pc(30) Class22_Sub8 local30 = null;
		if (this.aBoolean43) {
			local30 = Static128.method2279(1);
		}
		this.aClass3_1.method3443(local11, local30 == null ? null : local30.aClass22_Sub1Array1[0], 0);
		return local30;
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return this.aByte8;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aByte7;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		@Pc(14) Class2_Sub1_Sub6 local14;
		if (this.aClass2_Sub1_Sub6_1 == null && this.aBoolean45) {
			@Pc(25) Class146 local25 = this.method672(arg0, 131072, true);
			local14 = local25 == null ? null : local25.aClass2_Sub1_Sub6_5;
		} else {
			local14 = this.aClass2_Sub1_Sub6_1;
			this.aClass2_Sub1_Sub6_1 = null;
		}
		if (local14 != null) {
			Static197.method3302(local14, this.aByte9, super.anInt1074, super.anInt1077, null);
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.method674(arg1, arg0);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BILclient!km;)Lclient!ab;")
	private Class3 method674(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1) {
		if (this.aClass3_1 != null && arg1.method4499(this.aClass3_1.method3474(), arg0) == 0) {
			return this.aClass3_1;
		} else {
			@Pc(29) Class146 local29 = this.method672(arg1, arg0, false);
			return local29 == null ? null : local29.aClass3_5;
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aShort11 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return this.aBoolean46;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aBoolean45;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		if (arg5 instanceof Class12_Sub2_Sub2) {
			@Pc(34) Class12_Sub2_Sub2 local34 = (Class12_Sub2_Sub2) arg5;
			if (this.aClass3_1 != null && local34.aClass3_1 != null) {
				this.aClass3_1.method3475(local34.aClass3_1, arg0, arg2, arg4, arg3);
			}
		} else if (arg5 instanceof Class12_Sub1_Sub4) {
			@Pc(14) Class12_Sub1_Sub4 local14 = (Class12_Sub1_Sub4) arg5;
			if (this.aClass3_1 != null && local14.aClass3_4 != null) {
				this.aClass3_1.method3475(local14.aClass3_4, arg0, arg2, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		this.aBoolean46 = false;
		if (this.aClass3_1 != null) {
			this.aClass3_1.method3473(this.aClass3_1.method3474() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class3 local15 = this.method674(65536, arg0);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class54 local20 = arg0.method4556();
			local20.method4789(super.anInt1074, super.anInt1076, super.anInt1077);
			return local15.method3444(arg2, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
		if (this.aClass3_1 != null) {
			this.aClass3_1.method3435();
		}
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class2_Sub1_Sub6 local25;
		if (this.aClass2_Sub1_Sub6_1 == null && this.aBoolean45) {
			@Pc(18) Class146 local18 = this.method672(arg0, 131072, true);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub6_5;
		} else {
			local25 = this.aClass2_Sub1_Sub6_1;
			this.aClass2_Sub1_Sub6_1 = null;
		}
		if (local25 != null) {
			Static64.method1166(local25, this.aByte9, super.anInt1074, super.anInt1077, null);
		}
	}
}
