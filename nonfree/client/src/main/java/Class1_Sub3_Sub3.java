import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!u", name = "N", descriptor = "S")
	private final short aShort94;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Z")
	private final boolean aBoolean455;

	@OriginalMember(owner = "client!u", name = "s", descriptor = "Z")
	private final boolean aBoolean452;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "B")
	private final byte aByte85;

	@OriginalMember(owner = "client!u", name = "T", descriptor = "B")
	private final byte aByte86;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "Z")
	private final boolean aBoolean454;

	@OriginalMember(owner = "client!u", name = "W", descriptor = "Lclient!ia;")
	private Class3_Sub3_Sub9 aClass3_Sub3_Sub9_6;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!ka;")
	public Class108 aClass108_7;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIZIIZ)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static82.method1474(arg7, arg8));
		this.aShort94 = (short) arg1.anInt791;
		this.aByte84 = (byte) arg8;
		this.aBoolean455 = arg1.anInt788 != 0 && !arg6;
		this.aBoolean452 = arg6;
		super.anInt6695 = arg3;
		this.aBoolean453 = arg9;
		this.aByte85 = (byte) arg2;
		super.anInt6693 = arg5;
		this.aByte86 = (byte) arg7;
		this.aBoolean454 = arg0.method5969() && arg1.aBoolean42 && !this.aBoolean452 && Static39.aClass79_Sub1_1.method1942(Static402.anInt6656) != 0;
		@Pc(68) int local68 = 2048;
		if (this.aBoolean453) {
			local68 |= 0x10000;
		}
		@Pc(83) Class130 local83 = this.method5556(local68, arg0, this.aBoolean454);
		if (local83 != null) {
			this.aClass3_Sub3_Sub9_6 = local83.aClass3_Sub3_Sub9_5;
			this.aClass108_7 = local83.aClass108_6;
			if (this.aBoolean453) {
				this.aClass108_7 = this.aClass108_7.method4930((byte) 0, local68, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.method5557(arg0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		this.aBoolean453 = false;
		if (this.aClass108_7 != null) {
			this.aClass108_7.B(this.aClass108_7.ma() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return this.aByte86;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aShort94 & 0xFFFF;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		@Pc(14) Class3_Sub3_Sub9 local14;
		if (this.aClass3_Sub3_Sub9_6 == null && this.aBoolean454) {
			@Pc(25) Class130 local25 = this.method5556(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass3_Sub3_Sub9_5;
		} else {
			local14 = this.aClass3_Sub3_Sub9_6;
			this.aClass3_Sub3_Sub9_6 = null;
		}
		if (local14 != null) {
			Static279.method3856(local14, this.aByte85, super.anInt6695, super.anInt6693, null);
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aBoolean454;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class1_Sub3_Sub3) {
			@Pc(15) Class1_Sub3_Sub3 local15 = (Class1_Sub3_Sub3) arg1;
			if (this.aClass108_7 != null && local15.aClass108_7 != null) {
				this.aClass108_7.method4947(local15.aClass108_7, arg2, arg0, arg3, arg5);
			}
		} else if (arg1 instanceof Class1_Sub2_Sub2) {
			@Pc(37) Class1_Sub2_Sub2 local37 = (Class1_Sub2_Sub2) arg1;
			if (this.aClass108_7 != null && local37.aClass108_1 != null) {
				this.aClass108_7.method4947(local37.aClass108_1, arg2, arg0, arg3, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		@Pc(18) Class3_Sub3_Sub9 local18;
		if (this.aClass3_Sub3_Sub9_6 == null && this.aBoolean454) {
			@Pc(29) Class130 local29 = this.method5556(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass3_Sub3_Sub9_5;
		} else {
			local18 = this.aClass3_Sub3_Sub9_6;
			this.aClass3_Sub3_Sub9_6 = null;
		}
		if (local18 != null) {
			Static369.method5155(local18, this.aByte85, super.anInt6695, super.anInt6693, null);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!qa;ZB)Lclient!kj;")
	private Class130 method5556(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class31 local21 = Static9.aClass149_1.method3573(this.aShort94 & 0xFFFF);
		@Pc(33) Class55 local33;
		@Pc(28) Class55 local28;
		if (this.aBoolean452) {
			local28 = Static182.aClass55Array2[0];
			local33 = Static349.aClass55Array3[this.aByte85];
		} else {
			if (this.aByte85 >= 3) {
				local28 = null;
			} else {
				local28 = Static182.aClass55Array2[this.aByte85 + 1];
			}
			local33 = Static182.aClass55Array2[this.aByte85];
		}
		return local21.method874(local28, this.aByte84, super.anInt6691, arg0, arg1, arg2, this.aByte86, local33, super.anInt6693, super.anInt6695);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!qa;B)Lclient!ka;")
	private Class108 method5557(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		if (this.aClass108_7 != null && arg1.method6006(this.aClass108_7.ma(), arg0) == 0) {
			return this.aClass108_7;
		} else {
			@Pc(26) Class130 local26 = this.method5556(arg0, arg1, false);
			return local26 == null ? null : local26.aClass108_6;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(9) Class108 local9 = this.method5557(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class11 local19 = arg2.method5989();
			local19.C(super.anInt6695, super.anInt6691, super.anInt6693);
			return local9.method4937(arg1, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
		if (this.aClass108_7 != null) {
			this.aClass108_7.method4945();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return this.aBoolean453;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aByte84;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		if (this.aClass108_7 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method5989();
		local11.C(super.anInt6695, super.anInt6691, super.anInt6693);
		@Pc(21) Class23_Sub5 local21 = null;
		if (this.aBoolean455) {
			local21 = Static217.method1031(1);
		}
		this.aClass108_7.method4931(local11, local21 == null ? null : local21.aClass23_Sub6Array1[0], 0);
		return local21;
	}
}
