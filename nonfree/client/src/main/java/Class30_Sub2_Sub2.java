import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class30_Sub2_Sub2 extends Class30_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "B")
	private final byte aByte93;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "S")
	private final short aShort98;

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "Z")
	private final boolean aBoolean467;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "Z")
	private final boolean aBoolean466;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
	private final boolean aBoolean465;

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "Lclient!i;")
	private Class1_Sub1_Sub10 aClass1_Sub1_Sub10_6;

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!e;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIZIIIII)V")
	public Class30_Sub2_Sub2(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static114.method1852(arg11, arg10));
		this.aByte94 = (byte) arg2;
		super.anInt7376 = arg3;
		this.aByte92 = (byte) arg10;
		this.aByte93 = (byte) arg11;
		this.aShort98 = (short) arg1.anInt5642;
		this.aBoolean467 = arg6;
		super.anInt7385 = arg5;
		this.aBoolean466 = arg1.anInt5666 != 0 && !arg6;
		this.aBoolean465 = arg0.method5930() && arg1.aBoolean359 && !this.aBoolean467 && Static12.aClass34_Sub1_1.method5462(Static262.anInt2805) != 0;
		@Pc(74) Class132 local74 = this.method5527(arg0, this.aBoolean465, 2048);
		if (local74 != null) {
			this.aClass1_Sub1_Sub10_6 = local74.aClass1_Sub1_Sub10_1;
			this.aClass17_6 = local74.aClass17_1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	private Class17 method5526(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1) {
		if (this.aClass17_6 != null && arg1.method5913(this.aClass17_6.RA(), arg0) == 0) {
			return this.aClass17_6;
		} else {
			@Pc(29) Class132 local29 = this.method5527(arg1, false, arg0);
			return local29 == null ? null : local29.aClass17_1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I")
	@Override
	public int method5620() {
		return this.aClass17_6 == null ? 0 : this.aClass17_6.B();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class17 local9 = this.method5526(131072, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class40 local19 = arg0.method5918();
			local19.U(super.anInt7376, super.anInt7379, super.anInt7385);
			return local9.method6203(arg2, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!za;ZBI)Lclient!jl;")
	private Class132 method5527(@OriginalArg(0) Class106 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class192 local16 = Static455.aClass161_4.method3628(this.aShort98 & 0xFFFF);
		@Pc(24) Class96 local24;
		@Pc(32) Class96 local32;
		if (this.aBoolean467) {
			local24 = Static221.aClass96Array4[this.aByte94];
			local32 = Static262.aClass96Array3[0];
		} else {
			local24 = Static262.aClass96Array3[this.aByte94];
			if (this.aByte94 >= 3) {
				local32 = null;
			} else {
				local32 = Static262.aClass96Array3[this.aByte94 + 1];
			}
		}
		return local16.method4371(arg0, super.anInt7376, local24, super.anInt7385, arg1, arg2, this.aByte92, super.anInt7379, local32, this.aByte93);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aShort98 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		@Pc(18) Class1_Sub1_Sub10 local18;
		if (this.aClass1_Sub1_Sub10_6 == null && this.aBoolean465) {
			@Pc(29) Class132 local29 = this.method5527(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass1_Sub1_Sub10_1;
		} else {
			local18 = this.aClass1_Sub1_Sub10_6;
			this.aClass1_Sub1_Sub10_6 = null;
		}
		if (local18 != null) {
			Static17.method329(local18, this.aByte94, super.anInt7376, super.anInt7385, null);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.method5526(arg0, arg1);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte93;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		@Pc(30) Class1_Sub1_Sub10 local30;
		if (this.aClass1_Sub1_Sub10_6 == null && this.aBoolean465) {
			@Pc(23) Class132 local23 = this.method5527(arg0, true, 262144);
			local30 = local23 == null ? null : local23.aClass1_Sub1_Sub10_1;
		} else {
			local30 = this.aClass1_Sub1_Sub10_6;
			this.aClass1_Sub1_Sub10_6 = null;
		}
		if (local30 != null) {
			Static124.method2026(local30, this.aByte94, super.anInt7376, super.anInt7385, null);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		if (this.aClass17_6 == null) {
			return null;
		}
		@Pc(11) Class40 local11 = arg0.method5918();
		local11.U(super.anInt7376 + super.anInt7380, super.anInt7379, super.anInt7385 + super.anInt7381);
		@Pc(35) Class41_Sub7 local35 = null;
		if (this.aBoolean466) {
			local35 = Static306.method4409(1);
		}
		this.aClass17_6.method6189(local11, local35 == null ? null : local35.aClass41_Sub8Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aBoolean465;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
		if (this.aClass17_6 != null) {
			this.aClass17_6.method6198();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return this.aByte92;
	}
}
