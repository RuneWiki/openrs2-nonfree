import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "Z")
	private final boolean aBoolean71;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "Z")
	private final boolean aBoolean70;

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "S")
	private final short aShort12;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Z")
	private boolean aBoolean69;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "Z")
	private final boolean aBoolean72;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Lclient!i;")
	private Class5_Sub2_Sub1 aClass5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!e;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIZIZ)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt2998, arg1.aBoolean187, arg1.aBoolean190);
		super.anInt7157 = arg3;
		this.aBoolean71 = arg1.anInt3001 != 0 && !arg6;
		this.aByte7 = (byte) arg7;
		super.anInt7159 = arg5;
		this.aBoolean70 = arg6;
		this.aByte8 = (byte) arg2;
		this.aShort12 = (short) arg1.anInt2994;
		this.aBoolean69 = arg8;
		this.aBoolean72 = arg0.method5821() && arg1.aBoolean192 && !this.aBoolean70 && Static216.aClass1_Sub1_1.method3580(Static146.anInt2644) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean69) {
			local69 |= 0x10000;
		}
		@Pc(84) Class108 local84 = this.method778(this.aBoolean72, local69, arg0);
		if (local84 != null) {
			this.aClass5_Sub2_Sub1_2 = local84.aClass5_Sub2_Sub1_4;
			this.aClass57_2 = local84.aClass57_5;
			if (this.aBoolean69) {
				this.aClass57_2 = this.aClass57_2.method6066((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		if (this.aClass57_2 == null) {
			return null;
		}
		@Pc(11) Class29 local11 = arg0.method5866();
		local11.U(super.anInt7157, super.anInt7154, super.anInt7159);
		@Pc(21) Class88_Sub2 local21 = null;
		if (this.aBoolean71) {
			local21 = Static232.method3033(1);
		}
		this.aClass57_2.method6060(local11, local21 == null ? null : local21.aClass88_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class57 local14 = this.method780(131072, arg0);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class29 local19 = arg0.method5866();
			local19.U(super.anInt7157, super.anInt7154, super.anInt7159);
			return local14.method6071(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (!(arg3 instanceof Class2_Sub3_Sub1)) {
			return;
		}
		@Pc(13) Class2_Sub3_Sub1 local13 = (Class2_Sub3_Sub1) arg3;
		if (this.aClass57_2 != null && local13.aClass57_2 != null) {
			this.aClass57_2.method6063(local13.aClass57_2, arg2, arg1, arg4, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aShort12 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
		if (this.aClass57_2 != null) {
			this.aClass57_2.method6069();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aByte7;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		@Pc(32) Class5_Sub2_Sub1 local32;
		if (this.aClass5_Sub2_Sub1_2 == null && this.aBoolean72) {
			@Pc(25) Class108 local25 = this.method778(true, 262144, arg0);
			local32 = local25 == null ? null : local25.aClass5_Sub2_Sub1_4;
		} else {
			local32 = this.aClass5_Sub2_Sub1_2;
			this.aClass5_Sub2_Sub1_2 = null;
		}
		if (local32 != null) {
			Static107.method1478(local32, this.aByte8, super.anInt7157, super.anInt7159, null);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZBILclient!za;)Lclient!hw;")
	private Class108 method778(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class200 arg2) {
		@Pc(18) Class114 local18 = Static398.aClass256_4.method5782(this.aShort12 & 0xFFFF);
		@Pc(26) Class125 local26;
		@Pc(34) Class125 local34;
		if (this.aBoolean70) {
			local26 = Static408.aClass125Array2[this.aByte8];
			local34 = Static110.aClass125Array1[0];
		} else {
			local26 = Static110.aClass125Array1[this.aByte8];
			if (this.aByte8 >= 3) {
				local34 = null;
			} else {
				local34 = Static110.aClass125Array1[this.aByte8 + 1];
			}
		}
		return local18.method2407(local26, arg1, 22, super.anInt7154, super.anInt7159, arg2, this.aByte7, arg0, super.anInt7157, local34);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.method780(arg1, arg0);
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		this.aBoolean69 = false;
		if (this.aClass57_2 != null) {
			this.aClass57_2.D(this.aClass57_2.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return 22;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!za;Z)Lclient!e;")
	private Class57 method780(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1) {
		if (this.aClass57_2 != null && arg1.method5860(this.aClass57_2.RA(), arg0) == 0) {
			return this.aClass57_2;
		} else {
			@Pc(29) Class108 local29 = this.method778(false, arg0, arg1);
			return local29 == null ? null : local29.aClass57_5;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return this.aBoolean69;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aBoolean72;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		@Pc(31) Class5_Sub2_Sub1 local31;
		if (this.aClass5_Sub2_Sub1_2 == null && this.aBoolean72) {
			@Pc(24) Class108 local24 = this.method778(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass5_Sub2_Sub1_4;
		} else {
			local31 = this.aClass5_Sub2_Sub1_2;
			this.aClass5_Sub2_Sub1_2 = null;
		}
		if (local31 != null) {
			Static79.method1162(local31, this.aByte8, super.anInt7157, super.anInt7159, null);
		}
	}
}
