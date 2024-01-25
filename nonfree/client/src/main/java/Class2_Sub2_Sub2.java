import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "Z")
	private final boolean aBoolean90;

	@OriginalMember(owner = "client!cm", name = "ab", descriptor = "S")
	private final short aShort14;

	@OriginalMember(owner = "client!cm", name = "I", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!cm", name = "z", descriptor = "Z")
	private final boolean aBoolean89;

	@OriginalMember(owner = "client!cm", name = "N", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "B")
	private final byte aByte11;

	@OriginalMember(owner = "client!cm", name = "T", descriptor = "Z")
	private final boolean aBoolean91;

	@OriginalMember(owner = "client!cm", name = "cb", descriptor = "Lclient!i;")
	private Class5_Sub2_Sub1 aClass5_Sub2_Sub1_3;

	@OriginalMember(owner = "client!cm", name = "W", descriptor = "Lclient!e;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIZIIIII)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static232.method3036(arg11, arg10));
		this.aBoolean90 = arg1.anInt3001 != 0 && !arg6;
		this.aShort14 = (short) arg1.anInt2994;
		this.aByte9 = (byte) arg11;
		super.anInt4377 = arg5;
		this.aBoolean89 = arg6;
		this.aByte10 = (byte) arg10;
		super.anInt4386 = arg3;
		this.aByte11 = (byte) arg2;
		this.aBoolean91 = arg0.method5821() && arg1.aBoolean192 && !this.aBoolean89 && Static216.aClass1_Sub1_1.method3580(Static146.anInt2644) != 0;
		@Pc(80) Class108 local80 = this.method926(arg0, this.aBoolean91, 2048);
		if (local80 != null) {
			this.aClass5_Sub2_Sub1_3 = local80.aClass5_Sub2_Sub1_4;
			this.aClass57_3 = local80.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		if (this.aClass57_3 == null) {
			return null;
		}
		@Pc(11) Class29 local11 = arg0.method5866();
		local11.U(super.anInt4386 + super.anInt4391, super.anInt4393, super.anInt4381 + super.anInt4377);
		@Pc(28) Class88_Sub2 local28 = null;
		if (this.aBoolean90) {
			local28 = Static232.method3033(1);
		}
		this.aClass57_3.method6060(local11, local28 == null ? null : local28.aClass88_Sub8Array1[0], 0);
		return local28;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aShort14 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!za;ZIZ)Lclient!hw;")
	private Class108 method926(@OriginalArg(0) Class200 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class114 local13 = Static398.aClass256_4.method5782(this.aShort14 & 0xFFFF);
		@Pc(38) Class125 local38;
		@Pc(29) Class125 local29;
		if (this.aBoolean89) {
			local29 = Static110.aClass125Array1[0];
			local38 = Static408.aClass125Array2[this.aByte11];
		} else {
			if (this.aByte11 < 3) {
				local29 = Static110.aClass125Array1[this.aByte11 + 1];
			} else {
				local29 = null;
			}
			local38 = Static110.aClass125Array1[this.aByte11];
		}
		return local13.method2407(local38, arg2, this.aByte10, super.anInt4393, super.anInt4377, arg0, this.aByte9, arg1, super.anInt4386, local29);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return this.aByte10;
	}

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)I")
	@Override
	public int method3486() {
		return this.aClass57_3 == null ? 0 : this.aClass57_3.B();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aByte9;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		@Pc(14) Class5_Sub2_Sub1 local14;
		if (this.aClass5_Sub2_Sub1_3 == null && this.aBoolean91) {
			@Pc(25) Class108 local25 = this.method926(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass5_Sub2_Sub1_4;
		} else {
			local14 = this.aClass5_Sub2_Sub1_3;
			this.aClass5_Sub2_Sub1_3 = null;
		}
		if (local14 != null) {
			Static79.method1162(local14, this.aByte11, super.anInt4386, super.anInt4377, null);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		@Pc(32) Class5_Sub2_Sub1 local32;
		if (this.aClass5_Sub2_Sub1_3 == null && this.aBoolean91) {
			@Pc(25) Class108 local25 = this.method926(arg0, true, 262144);
			local32 = local25 == null ? null : local25.aClass5_Sub2_Sub1_4;
		} else {
			local32 = this.aClass5_Sub2_Sub1_3;
			this.aClass5_Sub2_Sub1_3 = null;
		}
		if (local32 != null) {
			Static107.method1478(local32, this.aByte11, super.anInt4386, super.anInt4377, null);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	private Class57 method927(@OriginalArg(1) Class200 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass57_3 != null && arg0.method5860(this.aClass57_3.RA(), arg1) == 0) {
			return this.aClass57_3;
		} else {
			@Pc(33) Class108 local33 = this.method926(arg0, false, arg1);
			return local33 == null ? null : local33.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method6069();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.method927(arg0, arg1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class57 local14 = this.method927(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class29 local19 = arg0.method5866();
			local19.U(super.anInt4386, super.anInt4393, super.anInt4377);
			return local14.method6071(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aBoolean91;
	}
}
