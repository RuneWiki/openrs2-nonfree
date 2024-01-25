import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class11_Sub5_Sub6 extends Class11_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!up", name = "V", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!up", name = "S", descriptor = "Z")
	private final boolean aBoolean473;

	@OriginalMember(owner = "client!up", name = "v", descriptor = "Z")
	private boolean aBoolean472;

	@OriginalMember(owner = "client!up", name = "bb", descriptor = "Z")
	private final boolean aBoolean475;

	@OriginalMember(owner = "client!up", name = "Z", descriptor = "S")
	private final short aShort100;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "B")
	private final byte aByte87;

	@OriginalMember(owner = "client!up", name = "J", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!up", name = "W", descriptor = "Z")
	private final boolean aBoolean474;

	@OriginalMember(owner = "client!up", name = "U", descriptor = "Lclient!e;")
	public Class63 aClass63_7;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "Lclient!i;")
	private Class2_Sub1_Sub5 aClass2_Sub1_Sub5_6;

	static {
		new Class231("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!za;Lclient!oq;IIIIIZIIIIIIZ)V")
	public Class11_Sub5_Sub6(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5441 == 1, Static277.method3957(arg12, arg13));
		this.aByte89 = (byte) arg3;
		this.aBoolean473 = arg1.anInt5419 != 0 && !arg7;
		this.aBoolean472 = arg14;
		this.aBoolean475 = arg7;
		this.aShort100 = (short) arg1.anInt5422;
		this.aByte87 = (byte) arg13;
		this.aByte88 = (byte) arg12;
		this.aBoolean474 = arg0.method5952() && arg1.aBoolean384 && !this.aBoolean475 && Static434.aClass165_Sub1_1.method3392(Static404.anInt2752) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean472) {
			local77 |= 0x10000;
		}
		@Pc(92) Class189 local92 = this.method5728(this.aBoolean474, local77, arg0);
		if (local92 != null) {
			this.aClass63_7 = local92.aClass63_6;
			this.aClass2_Sub1_Sub5_6 = local92.aClass2_Sub1_Sub5_5;
			if (this.aBoolean472) {
				this.aClass63_7 = this.aClass63_7.method6296((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5722() {
		return this.aBoolean474;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5719(@OriginalArg(1) Class75 arg0) {
		@Pc(14) Class2_Sub1_Sub5 local14;
		if (this.aClass2_Sub1_Sub5_6 == null && this.aBoolean474) {
			@Pc(25) Class189 local25 = this.method5728(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub1_Sub5_5;
		} else {
			local14 = this.aClass2_Sub1_Sub5_6;
			this.aClass2_Sub1_Sub5_6 = null;
		}
		if (local14 != null) {
			Static452.method844(local14, this.aByte89, super.anInt7626, super.anInt7622, null);
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return this.aBoolean472;
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
	@Override
	public int method5721() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "(B)I")
	public int method5724() {
		return this.aClass63_7 == null ? 15 : this.aClass63_7.k() / 4;
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
	@Override
	public void method5716() {
		if (this.aClass63_7 != null) {
			this.aClass63_7.method6298();
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		if (arg5 instanceof Class11_Sub1_Sub3) {
			@Pc(5) Class11_Sub1_Sub3 local5 = (Class11_Sub1_Sub3) arg5;
			if (this.aClass63_7 != null && local5.aClass63_2 != null) {
				this.aClass63_7.method6284(local5.aClass63_2, arg4, arg0, arg2, arg3);
			}
		} else if (arg5 instanceof Class11_Sub5_Sub6) {
			@Pc(28) Class11_Sub5_Sub6 local28 = (Class11_Sub5_Sub6) arg5;
			if (this.aClass63_7 != null && local28.aClass63_7 != null) {
				this.aClass63_7.method6284(local28.aClass63_7, arg4, arg0, arg2, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		if (this.aClass63_7 == null) {
			return null;
		}
		@Pc(11) Class6 local11 = arg0.method5990();
		local11.U(super.anInt7626, super.anInt7624, super.anInt7622);
		@Pc(21) Class28_Sub5 local21 = null;
		if (this.aBoolean473) {
			local21 = Static29.method474(1);
		}
		this.aClass63_7.method6293(local11, local21 == null ? null : local21.aClass28_Sub4Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZLclient!za;I)Lclient!e;")
	@Override
	public Class63 method5717(@OriginalArg(1) Class75 arg0, @OriginalArg(2) int arg1) {
		return this.method5729(arg0, arg1);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5720(@OriginalArg(0) Class75 arg0) {
		@Pc(14) Class2_Sub1_Sub5 local14;
		if (this.aClass2_Sub1_Sub5_6 == null && this.aBoolean474) {
			@Pc(25) Class189 local25 = this.method5728(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass2_Sub1_Sub5_5;
		} else {
			local14 = this.aClass2_Sub1_Sub5_6;
			this.aClass2_Sub1_Sub5_6 = null;
		}
		if (local14 != null) {
			Static213.method3025(local14, this.aByte89, super.anInt7626, super.anInt7622, null);
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(B)I")
	@Override
	public int method5723() {
		return this.aByte87;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
	@Override
	public int method5718() {
		return this.aShort100 & 0xFFFF;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBILclient!za;)Lclient!oh;")
	private Class189 method5728(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(13) Class192 local13 = Static249.aClass39_2.method748(this.aShort100 & 0xFFFF);
		@Pc(32) Class22 local32;
		@Pc(27) Class22 local27;
		if (this.aBoolean475) {
			local27 = Static114.aClass22Array2[0];
			local32 = Static46.aClass22Array1[this.aByte89];
		} else {
			if (this.aByte89 < 3) {
				local27 = Static114.aClass22Array2[this.aByte89 + 1];
			} else {
				local27 = null;
			}
			local32 = Static114.aClass22Array2[this.aByte89];
		}
		return local13.method4319(arg0, super.anInt7624, super.anInt7622, arg1, local27, this.aByte88 == 11 ? 10 : this.aByte88, super.anInt7626, local32, arg2, this.aByte88 == 11 ? this.aByte87 + 4 : this.aByte87);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(20) Class63 local20 = this.method5729(arg2, 131072);
		if (local20 == null) {
			return false;
		} else {
			@Pc(25) Class6 local25 = arg2.method5990();
			local25.U(super.anInt7626, super.anInt7624, super.anInt7622);
			return local20.method6292(arg0, arg1, local25, false);
		}
	}

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		this.aBoolean472 = false;
		if (this.aClass63_7 != null) {
			this.aClass63_7.D(this.aClass63_7.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!za;II)Lclient!e;")
	private Class63 method5729(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass63_7 != null && arg0.method6023(this.aClass63_7.RA(), arg1) == 0) {
			return this.aClass63_7;
		} else {
			@Pc(31) Class189 local31 = this.method5728(false, arg1, arg0);
			return local31 == null ? null : local31.aClass63_6;
		}
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(Z)I")
	@Override
	public int method6213() {
		return this.aClass63_7 == null ? 0 : this.aClass63_7.B();
	}
}
