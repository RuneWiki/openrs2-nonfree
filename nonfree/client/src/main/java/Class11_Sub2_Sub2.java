import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!il", name = "N", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!il", name = "y", descriptor = "Z")
	private final boolean aBoolean198;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "B")
	private final byte aByte50;

	@OriginalMember(owner = "client!il", name = "E", descriptor = "S")
	private final short aShort38;

	@OriginalMember(owner = "client!il", name = "K", descriptor = "Z")
	private final boolean aBoolean199;

	@OriginalMember(owner = "client!il", name = "S", descriptor = "Z")
	private final boolean aBoolean200;

	@OriginalMember(owner = "client!il", name = "M", descriptor = "Lclient!i;")
	private Class2_Sub1_Sub5 aClass2_Sub1_Sub5_1;

	@OriginalMember(owner = "client!il", name = "A", descriptor = "Lclient!e;")
	private Class63 aClass63_1;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIZIIIII)V")
	public Class11_Sub2_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static100.method1448(arg10, arg11));
		this.aByte51 = (byte) arg10;
		this.aBoolean198 = arg6;
		this.aByte49 = (byte) arg11;
		this.aByte50 = (byte) arg2;
		super.anInt4487 = arg5;
		this.aShort38 = (short) arg1.anInt5422;
		super.anInt4485 = arg3;
		this.aBoolean199 = arg1.anInt5419 != 0 && !arg6;
		this.aBoolean200 = arg0.method5952() && arg1.aBoolean384 && !this.aBoolean198 && Static434.aClass165_Sub1_1.method3392(Static404.anInt2752) != 0;
		@Pc(74) Class189 local74 = this.method2617(arg0, this.aBoolean200, 2048);
		if (local74 != null) {
			this.aClass2_Sub1_Sub5_1 = local74.aClass2_Sub1_Sub5_5;
			this.aClass63_1 = local74.aClass63_6;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
		if (this.aClass63_1 != null) {
			this.aClass63_1.method6298();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aShort38 & 0xFFFF;
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aByte49;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		@Pc(31) Class2_Sub1_Sub5 local31;
		if (this.aClass2_Sub1_Sub5_1 == null && this.aBoolean200) {
			@Pc(24) Class189 local24 = this.method2617(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass2_Sub1_Sub5_5;
		} else {
			local31 = this.aClass2_Sub1_Sub5_1;
			this.aClass2_Sub1_Sub5_1 = null;
		}
		if (local31 != null) {
			Static452.method844(local31, this.aByte50, super.anInt4485, super.anInt4487, null);
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.method2615(arg1, arg0);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		@Pc(18) Class2_Sub1_Sub5 local18;
		if (this.aClass2_Sub1_Sub5_1 == null && this.aBoolean200) {
			@Pc(29) Class189 local29 = this.method2617(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass2_Sub1_Sub5_5;
		} else {
			local18 = this.aClass2_Sub1_Sub5_1;
			this.aClass2_Sub1_Sub5_1 = null;
		}
		if (local18 != null) {
			Static213.method3025(local18, this.aByte50, super.anInt4485, super.anInt4487, null);
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I")
	@Override
	public int method3586() {
		return this.aClass63_1 == null ? 0 : this.aClass63_1.B();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!za;Z)Lclient!e;")
	private Class63 method2615(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (this.aClass63_1 != null && arg1.method6023(this.aClass63_1.RA(), arg0) == 0) {
			return this.aClass63_1;
		} else {
			@Pc(26) Class189 local26 = this.method2617(arg1, false, arg0);
			return local26 == null ? null : local26.aClass63_6;
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return this.aByte51;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aBoolean200;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!za;ZII)Lclient!oh;")
	private Class189 method2617(@OriginalArg(0) Class75 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class192 local13 = Static249.aClass39_2.method748(this.aShort38 & 0xFFFF);
		@Pc(26) Class22 local26;
		@Pc(39) Class22 local39;
		if (this.aBoolean198) {
			local39 = Static114.aClass22Array2[0];
			local26 = Static46.aClass22Array1[this.aByte50];
		} else {
			local26 = Static114.aClass22Array2[this.aByte50];
			if (this.aByte50 < 3) {
				local39 = Static114.aClass22Array2[this.aByte50 + 1];
			} else {
				local39 = null;
			}
		}
		return local13.method4319(arg1, super.anInt4479, super.anInt4487, arg2, local39, this.aByte51, super.anInt4485, local26, arg0, this.aByte49);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(16) Class63 local16 = this.method2615(131072, arg2);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class6 local21 = arg2.method5990();
			local21.U(super.anInt4485, super.anInt4479, super.anInt4487);
			return local16.method6292(arg0, arg1, local21, false);
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		if (this.aClass63_1 == null) {
			return null;
		}
		@Pc(16) Class6 local16 = arg0.method5990();
		local16.U(super.anInt4478 + super.anInt4485, super.anInt4479, super.anInt4475 + super.anInt4487);
		@Pc(32) Class28_Sub5 local32 = null;
		if (this.aBoolean199) {
			local32 = Static29.method474(1);
		}
		this.aClass63_1.method6293(local16, local32 == null ? null : local32.aClass28_Sub4Array1[0], 0);
		return local32;
	}
}
