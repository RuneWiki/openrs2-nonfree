import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class11_Sub3_Sub2 extends Class11_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Z")
	private boolean aBoolean241;

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "Z")
	private final boolean aBoolean242;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "S")
	private final short aShort58;

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "Z")
	private final boolean aBoolean243;

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lclient!e;")
	private Class63 aClass63_4;

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "Lclient!i;")
	private Class2_Sub1_Sub5 aClass2_Sub1_Sub5_4;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIZIZ)V")
	public Class11_Sub3_Sub2(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt5445, arg1.aBoolean383, arg1.aBoolean378);
		this.aBoolean241 = arg8;
		this.aBoolean242 = arg6;
		this.aByte62 = (byte) arg7;
		this.aByte61 = (byte) arg2;
		this.aShort58 = (short) arg1.anInt5422;
		this.aBoolean240 = arg1.anInt5419 != 0 && !arg6;
		super.anInt6191 = arg5;
		super.anInt6194 = arg3;
		this.aBoolean243 = arg0.method5952() && arg1.aBoolean384 && !this.aBoolean242 && Static434.aClass165_Sub1_1.method3392(Static404.anInt2752) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean241) {
			local69 |= 0x10000;
		}
		@Pc(84) Class189 local84 = this.method3008(arg0, this.aBoolean243, local69);
		if (local84 != null) {
			this.aClass63_4 = local84.aClass63_6;
			this.aClass2_Sub1_Sub5_4 = local84.aClass2_Sub1_Sub5_5;
			if (this.aBoolean241) {
				this.aClass63_4 = this.aClass63_4.method6296((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
		if (this.aClass63_4 != null) {
			this.aClass63_4.method6298();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!za;ZII)Lclient!oh;")
	private Class189 method3008(@OriginalArg(0) Class75 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class192 local13 = Static249.aClass39_2.method748(this.aShort58 & 0xFFFF);
		@Pc(21) Class22 local21;
		@Pc(32) Class22 local32;
		if (this.aBoolean242) {
			local21 = Static46.aClass22Array1[this.aByte61];
			local32 = Static114.aClass22Array2[0];
		} else {
			local21 = Static114.aClass22Array2[this.aByte61];
			if (this.aByte61 < 3) {
				local32 = Static114.aClass22Array2[this.aByte61 + 1];
			} else {
				local32 = null;
			}
		}
		return local13.method4319(arg1, super.anInt6193, super.anInt6191, arg2, local32, 22, super.anInt6194, local21, arg0, this.aByte62);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aShort58 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		this.aBoolean241 = false;
		if (this.aClass63_4 != null) {
			this.aClass63_4.D(this.aClass63_4.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		if (!(arg5 instanceof Class11_Sub3_Sub2)) {
			return;
		}
		@Pc(17) Class11_Sub3_Sub2 local17 = (Class11_Sub3_Sub2) arg5;
		if (this.aClass63_4 != null && local17.aClass63_4 != null) {
			this.aClass63_4.method6284(local17.aClass63_4, arg4, arg0, arg2, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aBoolean243;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aByte62;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		if (this.aClass63_4 == null) {
			return null;
		}
		@Pc(11) Class6 local11 = arg0.method5990();
		local11.U(super.anInt6194, super.anInt6193, super.anInt6191);
		@Pc(26) Class28_Sub5 local26 = null;
		if (this.aBoolean240) {
			local26 = Static29.method474(1);
		}
		this.aClass63_4.method6293(local11, local26 == null ? null : local26.aClass28_Sub4Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.method3010(arg1, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return this.aBoolean241;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return 22;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(9) Class63 local9 = this.method3010(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class6 local14 = arg2.method5990();
			local14.U(super.anInt6194, super.anInt6193, super.anInt6191);
			return local9.method6292(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	private Class63 method3010(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (this.aClass63_4 != null && arg1.method6023(this.aClass63_4.RA(), arg0) == 0) {
			return this.aClass63_4;
		} else {
			@Pc(33) Class189 local33 = this.method3008(arg1, false, arg0);
			return local33 == null ? null : local33.aClass63_6;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		@Pc(25) Class2_Sub1_Sub5 local25;
		if (this.aClass2_Sub1_Sub5_4 == null && this.aBoolean243) {
			@Pc(18) Class189 local18 = this.method3008(arg0, true, 262144);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub5_5;
		} else {
			local25 = this.aClass2_Sub1_Sub5_4;
			this.aClass2_Sub1_Sub5_4 = null;
		}
		if (local25 != null) {
			Static452.method844(local25, this.aByte61, super.anInt6194, super.anInt6191, null);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		@Pc(21) Class2_Sub1_Sub5 local21;
		if (this.aClass2_Sub1_Sub5_4 == null && this.aBoolean243) {
			@Pc(32) Class189 local32 = this.method3008(arg0, true, 262144);
			local21 = local32 == null ? null : local32.aClass2_Sub1_Sub5_5;
		} else {
			local21 = this.aClass2_Sub1_Sub5_4;
			this.aClass2_Sub1_Sub5_4 = null;
		}
		if (local21 != null) {
			Static213.method3025(local21, this.aByte61, super.anInt6194, super.anInt6191, null);
		}
	}
}
