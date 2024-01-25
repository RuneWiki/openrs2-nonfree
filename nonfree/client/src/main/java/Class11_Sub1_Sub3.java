import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class11_Sub1_Sub3 extends Class11_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "Z")
	private final boolean aBoolean203;

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "S")
	private final short aShort39;

	@OriginalMember(owner = "client!iq", name = "U", descriptor = "Z")
	private final boolean aBoolean206;

	@OriginalMember(owner = "client!iq", name = "G", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!iq", name = "F", descriptor = "Z")
	private boolean aBoolean204;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "Z")
	private final boolean aBoolean202;

	@OriginalMember(owner = "client!iq", name = "I", descriptor = "Lclient!i;")
	private Class2_Sub1_Sub5 aClass2_Sub1_Sub5_2;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!e;")
	public Class63 aClass63_2;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIZIIZ)V")
	public Class11_Sub1_Sub3(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static449.method6078(arg7, arg8));
		this.aBoolean203 = arg6;
		super.anInt3189 = arg3;
		this.aShort39 = (short) arg1.anInt5422;
		this.aBoolean206 = arg1.anInt5419 != 0 && !arg6;
		this.aByte54 = (byte) arg8;
		this.aByte53 = (byte) arg2;
		this.aByte52 = (byte) arg7;
		this.aBoolean204 = arg9;
		super.anInt3192 = arg5;
		this.aBoolean202 = arg0.method5952() && arg1.aBoolean384 && !this.aBoolean203 && Static434.aClass165_Sub1_1.method3392(Static404.anInt2752) != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean204) {
			local68 |= 0x10000;
		}
		@Pc(83) Class189 local83 = this.method2645(local68, arg0, this.aBoolean202);
		if (local83 != null) {
			this.aClass2_Sub1_Sub5_2 = local83.aClass2_Sub1_Sub5_5;
			this.aClass63_2 = local83.aClass63_6;
			if (this.aBoolean204) {
				this.aClass63_2 = this.aClass63_2.method6296((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!za;IZ)Lclient!oh;")
	private Class189 method2645(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class192 local17 = Static249.aClass39_2.method748(this.aShort39 & 0xFFFF);
		@Pc(25) Class22 local25;
		@Pc(29) Class22 local29;
		if (this.aBoolean203) {
			local25 = Static46.aClass22Array1[this.aByte53];
			local29 = Static114.aClass22Array2[0];
		} else {
			if (this.aByte53 >= 3) {
				local29 = null;
			} else {
				local29 = Static114.aClass22Array2[this.aByte53 + 1];
			}
			local25 = Static114.aClass22Array2[this.aByte53];
		}
		return local17.method4319(arg2, super.anInt3193, super.anInt3192, arg0, local29, this.aByte52, super.anInt3189, local25, arg1, this.aByte54);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		@Pc(29) Class2_Sub1_Sub5 local29;
		if (this.aClass2_Sub1_Sub5_2 == null && this.aBoolean202) {
			@Pc(22) Class189 local22 = this.method2645(262144, arg0, true);
			local29 = local22 == null ? null : local22.aClass2_Sub1_Sub5_5;
		} else {
			local29 = this.aClass2_Sub1_Sub5_2;
			this.aClass2_Sub1_Sub5_2 = null;
		}
		if (local29 != null) {
			Static452.method844(local29, this.aByte53, super.anInt3189, super.anInt3192, null);
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!za;II)Lclient!e;")
	private Class63 method2646(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass63_2 != null && arg0.method6023(this.aClass63_2.RA(), arg1) == 0) {
			return this.aClass63_2;
		} else {
			@Pc(23) Class189 local23 = this.method2645(arg1, arg0, false);
			return local23 == null ? null : local23.aClass63_6;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
		if (this.aClass63_2 != null) {
			this.aClass63_2.method6298();
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		if (this.aClass63_2 == null) {
			return null;
		}
		@Pc(11) Class6 local11 = arg0.method5990();
		local11.U(super.anInt3189, super.anInt3193, super.anInt3192);
		@Pc(21) Class28_Sub5 local21 = null;
		if (this.aBoolean206) {
			local21 = Static29.method474(1);
		}
		this.aClass63_2.method6293(local11, local21 == null ? null : local21.aClass28_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		@Pc(18) Class2_Sub1_Sub5 local18;
		if (this.aClass2_Sub1_Sub5_2 == null && this.aBoolean202) {
			@Pc(29) Class189 local29 = this.method2645(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass2_Sub1_Sub5_5;
		} else {
			local18 = this.aClass2_Sub1_Sub5_2;
			this.aClass2_Sub1_Sub5_2 = null;
		}
		if (local18 != null) {
			Static213.method3025(local18, this.aByte53, super.anInt3189, super.anInt3192, null);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.method2646(arg0, arg1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(9) Class63 local9 = this.method2646(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class6 local19 = arg2.method5990();
			local19.U(super.anInt3189, super.anInt3193, super.anInt3192);
			return local9.method6292(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aBoolean202;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aShort39 & 0xFFFF;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		this.aBoolean204 = false;
		if (this.aClass63_2 != null) {
			this.aClass63_2.D(this.aClass63_2.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return this.aBoolean204;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		if (arg5 instanceof Class11_Sub1_Sub3) {
			@Pc(5) Class11_Sub1_Sub3 local5 = (Class11_Sub1_Sub3) arg5;
			if (this.aClass63_2 != null && local5.aClass63_2 != null) {
				this.aClass63_2.method6284(local5.aClass63_2, arg4, arg0, arg2, arg3);
			}
		} else if (arg5 instanceof Class11_Sub5_Sub6) {
			@Pc(28) Class11_Sub5_Sub6 local28 = (Class11_Sub5_Sub6) arg5;
			if (this.aClass63_2 != null && local28.aClass63_7 != null) {
				this.aClass63_2.method6284(local28.aClass63_7, arg4, arg0, arg2, arg3);
			}
		}
	}
}
