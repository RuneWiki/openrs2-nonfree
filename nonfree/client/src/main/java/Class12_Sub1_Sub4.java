import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class12_Sub1_Sub4 extends Class12_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!lg", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!lg", name = "jb", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!lg", name = "M", descriptor = "Z")
	private final boolean aBoolean270;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "S")
	private final short aShort48;

	@OriginalMember(owner = "client!lg", name = "T", descriptor = "B")
	private final byte aByte35;

	@OriginalMember(owner = "client!lg", name = "N", descriptor = "B")
	private final byte aByte34;

	@OriginalMember(owner = "client!lg", name = "ib", descriptor = "Z")
	private final boolean aBoolean272;

	@OriginalMember(owner = "client!lg", name = "cb", descriptor = "Z")
	private boolean aBoolean271;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "Z")
	private final boolean aBoolean269;

	@OriginalMember(owner = "client!lg", name = "V", descriptor = "Lclient!mr;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_4;

	@OriginalMember(owner = "client!lg", name = "Z", descriptor = "Lclient!ab;")
	public Class3 aClass3_4;

	static {
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIIZIIIIIIZ)V")
	public Class12_Sub1_Sub4(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt815 == 1, Static281.method4319(arg12, arg13));
		this.aByte36 = (byte) arg3;
		this.aBoolean270 = arg1.anInt788 != 0 && !arg7;
		this.aShort48 = (short) arg1.anInt802;
		this.aByte35 = (byte) arg12;
		this.aByte34 = (byte) arg13;
		this.aBoolean272 = arg7;
		this.aBoolean271 = arg14;
		this.aBoolean269 = arg0.method4527() && arg1.aBoolean65 && !this.aBoolean272 && Static193.anInt6663 != 0;
		@Pc(74) int local74 = 1024;
		if (this.aBoolean271) {
			local74 |= 0x8000;
		}
		@Pc(89) Class146 local89 = this.method3331(this.aBoolean269, arg0, local74);
		if (local89 != null) {
			this.aClass2_Sub1_Sub6_4 = local89.aClass2_Sub1_Sub6_5;
			this.aClass3_4 = local89.aClass3_5;
			if (this.aBoolean271) {
				this.aClass3_4 = this.aClass3_4.method3481((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)I")
	@Override
	public int method5459() {
		return this.aClass3_4 == null ? 0 : this.aClass3_4.method3459();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		if (arg5 instanceof Class12_Sub2_Sub2) {
			@Pc(35) Class12_Sub2_Sub2 local35 = (Class12_Sub2_Sub2) arg5;
			if (this.aClass3_4 == null || local35.aClass3_1 == null) {
				return;
			}
			this.aClass3_4.method3475(local35.aClass3_1, arg0, arg2, arg4, arg3);
		} else if (arg5 instanceof Class12_Sub1_Sub4) {
			@Pc(16) Class12_Sub1_Sub4 local16 = (Class12_Sub1_Sub4) arg5;
			if (this.aClass3_4 != null && local16.aClass3_4 != null) {
				this.aClass3_4.method3475(local16.aClass3_4, arg0, arg2, arg4, arg3);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		if (this.aClass3_4 == null) {
			return null;
		}
		@Pc(11) Class54 local11 = arg0.method4556();
		local11.method4789(super.anInt6328, super.anInt6322, super.anInt6317);
		@Pc(21) Class22_Sub8 local21 = null;
		if (this.aBoolean270) {
			local21 = Static128.method2279(1);
		}
		this.aClass3_4.method3443(local11, local21 == null ? null : local21.aClass22_Sub1Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		this.aBoolean271 = false;
		if (this.aClass3_4 != null) {
			this.aClass3_4.method3473(this.aClass3_4.method3474() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.method3332(arg0, arg1);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class2_Sub1_Sub6 local25;
		if (this.aClass2_Sub1_Sub6_4 == null && this.aBoolean269) {
			@Pc(18) Class146 local18 = this.method3331(true, arg0, 131072);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub6_5;
		} else {
			local25 = this.aClass2_Sub1_Sub6_4;
			this.aClass2_Sub1_Sub6_4 = null;
		}
		if (local25 != null) {
			Static197.method3302(local25, this.aByte36, super.anInt6328, super.anInt6317, null);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return this.aByte35;
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return this.aBoolean271;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZLclient!km;I)Lclient!lt;")
	private Class146 method3331(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class34 local21 = Static11.aClass123_5.method2703(this.aShort48 & 0xFFFF);
		@Pc(33) Class33 local33;
		@Pc(28) Class33 local28;
		if (this.aBoolean272) {
			local28 = Static39.aClass33Array2[0];
			local33 = Static345.aClass33Array3[this.aByte36];
		} else {
			local33 = Static39.aClass33Array2[this.aByte36];
			if (this.aByte36 >= 3) {
				local28 = null;
			} else {
				local28 = Static39.aClass33Array2[this.aByte36 + 1];
			}
		}
		return local21.method827(local28, super.anInt6328, this.aByte35 == 11 ? 10 : this.aByte35, local33, this.aByte35 == 11 ? this.aByte34 + 4 : this.aByte34, arg1, arg2, arg0, super.anInt6317, super.anInt6322);
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		@Pc(21) Class2_Sub1_Sub6 local21;
		if (this.aClass2_Sub1_Sub6_4 == null && this.aBoolean269) {
			@Pc(32) Class146 local32 = this.method3331(true, arg0, 131072);
			local21 = local32 == null ? null : local32.aClass2_Sub1_Sub6_5;
		} else {
			local21 = this.aClass2_Sub1_Sub6_4;
			this.aClass2_Sub1_Sub6_4 = null;
		}
		if (local21 != null) {
			Static64.method1166(local21, this.aByte36, super.anInt6328, super.anInt6317, null);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILclient!km;I)Lclient!ab;")
	private Class3 method3332(@OriginalArg(1) Class82 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass3_4 != null && arg0.method4499(this.aClass3_4.method3474(), arg1) == 0) {
			return this.aClass3_4;
		} else {
			@Pc(31) Class146 local31 = this.method3331(false, arg0, arg1);
			return local31 == null ? null : local31.aClass3_5;
		}
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aBoolean269;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
		if (this.aClass3_4 != null) {
			this.aClass3_4.method3435();
		}
	}

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)I")
	public int method3333() {
		return this.aClass3_4 == null ? 15 : this.aClass3_4.method3452() / 4;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aShort48 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3 local9 = this.method3332(arg0, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class54 local14 = arg0.method4556();
			local14.method4789(super.anInt6328, super.anInt6322, super.anInt6317);
			return local9.method3444(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aByte34;
	}
}
