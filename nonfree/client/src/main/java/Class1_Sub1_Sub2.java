import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "S")
	private final short aShort28;

	@OriginalMember(owner = "client!gq", name = "ab", descriptor = "B")
	private final byte aByte26;

	@OriginalMember(owner = "client!gq", name = "U", descriptor = "B")
	private final byte aByte25;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "Z")
	private final boolean aBoolean188;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "Z")
	private final boolean aBoolean187;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "B")
	private final byte aByte24;

	@OriginalMember(owner = "client!gq", name = "Y", descriptor = "Z")
	private final boolean aBoolean189;

	@OriginalMember(owner = "client!gq", name = "cb", descriptor = "Lclient!ka;")
	private Class108 aClass108_2;

	@OriginalMember(owner = "client!gq", name = "T", descriptor = "Lclient!ia;")
	private Class3_Sub3_Sub9 aClass3_Sub3_Sub9_2;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIZIIIII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static48.method915(arg11, arg10));
		this.aShort28 = (short) arg1.anInt791;
		this.aByte26 = (byte) arg2;
		this.aByte25 = (byte) arg11;
		this.aBoolean188 = arg1.anInt788 != 0 && !arg6;
		this.aBoolean187 = arg6;
		this.aByte24 = (byte) arg10;
		super.anInt7724 = arg3;
		super.anInt7728 = arg5;
		this.aBoolean189 = arg0.method5969() && arg1.aBoolean42 && !this.aBoolean187 && Static39.aClass79_Sub1_1.method1942(Static402.anInt6656) != 0;
		@Pc(77) Class130 local77 = this.method2122(arg0, this.aBoolean189, 2048);
		if (local77 != null) {
			this.aClass108_2 = local77.aClass108_6;
			this.aClass3_Sub3_Sub9_2 = local77.aClass3_Sub3_Sub9_5;
		}
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)I")
	@Override
	public int method6252() {
		return this.aClass108_2 == null ? 0 : this.aClass108_2.ja();
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(ILclient!qa;I)Lclient!ka;")
	private Class108 method2120(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		if (this.aClass108_2 != null && arg1.method6006(this.aClass108_2.ma(), arg0) == 0) {
			return this.aClass108_2;
		} else {
			@Pc(34) Class130 local34 = this.method2122(arg1, false, arg0);
			return local34 == null ? null : local34.aClass108_6;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		@Pc(31) Class3_Sub3_Sub9 local31;
		if (this.aClass3_Sub3_Sub9_2 == null && this.aBoolean189) {
			@Pc(24) Class130 local24 = this.method2122(arg0, true, 262144);
			local31 = local24 == null ? null : local24.aClass3_Sub3_Sub9_5;
		} else {
			local31 = this.aClass3_Sub3_Sub9_2;
			this.aClass3_Sub3_Sub9_2 = null;
		}
		if (local31 != null) {
			Static279.method3856(local31, this.aByte26, super.anInt7724, super.anInt7728, null);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aBoolean189;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(9) Class108 local9 = this.method2120(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class11 local14 = arg2.method5989();
			local14.C(super.anInt7724, super.anInt7732, super.anInt7728);
			return local9.method4937(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		@Pc(18) Class3_Sub3_Sub9 local18;
		if (this.aClass3_Sub3_Sub9_2 == null && this.aBoolean189) {
			@Pc(29) Class130 local29 = this.method2122(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass3_Sub3_Sub9_5;
		} else {
			local18 = this.aClass3_Sub3_Sub9_2;
			this.aClass3_Sub3_Sub9_2 = null;
		}
		if (local18 != null) {
			Static369.method5155(local18, this.aByte26, super.anInt7724, super.anInt7728, null);
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aShort28 & 0xFFFF;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		if (this.aClass108_2 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method5989();
		local11.C(super.anInt7737 + super.anInt7724, super.anInt7732, super.anInt7739 + super.anInt7728);
		@Pc(27) Class23_Sub5 local27 = null;
		if (this.aBoolean188) {
			local27 = Static217.method1031(1);
		}
		this.aClass108_2.method4931(local11, local27 == null ? null : local27.aClass23_Sub6Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.method2120(arg0, arg1);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aByte25;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!qa;ZBI)Lclient!kj;")
	private Class130 method2122(@OriginalArg(0) Class167 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(23) Class31 local23 = Static9.aClass149_1.method3573(this.aShort28 & 0xFFFF);
		@Pc(31) Class55 local31;
		@Pc(35) Class55 local35;
		if (this.aBoolean187) {
			local31 = Static349.aClass55Array3[this.aByte26];
			local35 = Static182.aClass55Array2[0];
		} else {
			local31 = Static182.aClass55Array2[this.aByte26];
			if (this.aByte26 >= 3) {
				local35 = null;
			} else {
				local35 = Static182.aClass55Array2[this.aByte26 + 1];
			}
		}
		return local23.method874(local35, this.aByte25, super.anInt7732, arg2, arg0, arg1, this.aByte24, local31, super.anInt7728, super.anInt7724);
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
		if (this.aClass108_2 != null) {
			this.aClass108_2.method4945();
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return this.aByte24;
	}
}
