import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 implements Interface5 {

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "S")
	private final short aShort18;

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "Z")
	private final boolean aBoolean105;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!ec", name = "db", descriptor = "B")
	private final byte aByte18;

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "Z")
	private final boolean aBoolean104;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "B")
	private final byte aByte17;

	@OriginalMember(owner = "client!ec", name = "O", descriptor = "Z")
	private boolean aBoolean103;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "Z")
	private final boolean aBoolean102;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Lclient!ka;")
	public Class108 aClass108_1;

	@OriginalMember(owner = "client!ec", name = "V", descriptor = "Lclient!ia;")
	private Class3_Sub3_Sub9 aClass3_Sub3_Sub9_1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qa;Lclient!cd;IIIIIZIIIIIIZ)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) Class167 arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt775 == 1, Static240.method5195(arg13, arg12));
		this.aShort18 = (short) arg1.anInt791;
		this.aBoolean105 = arg1.anInt788 != 0 && !arg7;
		this.aByte16 = (byte) arg12;
		this.aByte18 = (byte) arg3;
		this.aBoolean104 = arg7;
		this.aByte17 = (byte) arg13;
		this.aBoolean103 = arg14;
		this.aBoolean102 = arg0.method5969() && arg1.aBoolean42 && !this.aBoolean104 && Static39.aClass79_Sub1_1.method1942(Static402.anInt6656) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean103) {
			local80 |= 0x10000;
		}
		@Pc(95) Class130 local95 = this.method1531(arg0, local80, this.aBoolean102);
		if (local95 != null) {
			this.aClass108_1 = local95.aClass108_6;
			this.aClass3_Sub3_Sub9_1 = local95.aClass3_Sub3_Sub9_5;
			if (this.aBoolean103) {
				this.aClass108_1 = this.aClass108_1.method4930((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I")
	@Override
	public int method6263() {
		return this.aShort18 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class1_Sub3_Sub3) {
			@Pc(16) Class1_Sub3_Sub3 local16 = (Class1_Sub3_Sub3) arg1;
			if (this.aClass108_1 != null && local16.aClass108_7 != null) {
				this.aClass108_1.method4947(local16.aClass108_7, arg2, arg0, arg3, arg5);
			}
		} else if (arg1 instanceof Class1_Sub2_Sub2) {
			@Pc(38) Class1_Sub2_Sub2 local38 = (Class1_Sub2_Sub2) arg1;
			if (this.aClass108_1 != null && local38.aClass108_1 != null) {
				this.aClass108_1.method4947(local38.aClass108_1, arg2, arg0, arg3, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	@Override
	public Class108 method6258(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		return this.method1526(arg0, arg1);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(9) Class108 local9 = this.method1526(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class11 local19 = arg2.method5989();
			local19.C(super.anInt7560, super.anInt7563, super.anInt7557);
			return local9.method4937(arg1, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
	@Override
	public int method6184() {
		return this.aClass108_1 == null ? 0 : this.aClass108_1.ja();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!qa;)Lclient!ka;")
	private Class108 method1526(@OriginalArg(0) int arg0, @OriginalArg(2) Class167 arg1) {
		if (this.aClass108_1 != null && arg1.method6006(this.aClass108_1.ma(), arg0) == 0) {
			return this.aClass108_1;
		} else {
			@Pc(26) Class130 local26 = this.method1531(arg1, arg0, false);
			return local26 == null ? null : local26.aClass108_6;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		if (this.aClass108_1 == null) {
			return null;
		}
		@Pc(11) Class11 local11 = arg0.method5989();
		local11.C(super.anInt7560, super.anInt7563, super.anInt7557);
		@Pc(21) Class23_Sub5 local21 = null;
		if (this.aBoolean105) {
			local21 = Static217.method1031(1);
		}
		this.aClass108_1.method4931(local11, local21 == null ? null : local21.aClass23_Sub6Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	@Override
	public void method6264() {
		if (this.aClass108_1 != null) {
			this.aClass108_1.method4945();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method6265(@OriginalArg(0) Class167 arg0) {
		@Pc(31) Class3_Sub3_Sub9 local31;
		if (this.aClass3_Sub3_Sub9_1 == null && this.aBoolean102) {
			@Pc(24) Class130 local24 = this.method1531(arg0, 262144, true);
			local31 = local24 == null ? null : local24.aClass3_Sub3_Sub9_5;
		} else {
			local31 = this.aClass3_Sub3_Sub9_1;
			this.aClass3_Sub3_Sub9_1 = null;
		}
		if (local31 != null) {
			Static369.method5155(local31, this.aByte18, super.anInt7560, super.anInt7557, null);
		}
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)I")
	public int method1529() {
		return this.aClass108_1 == null ? 15 : this.aClass108_1.H() / 4;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6259(@OriginalArg(1) Class167 arg0) {
		@Pc(29) Class3_Sub3_Sub9 local29;
		if (this.aClass3_Sub3_Sub9_1 == null && this.aBoolean102) {
			@Pc(22) Class130 local22 = this.method1531(arg0, 262144, true);
			local29 = local22 == null ? null : local22.aClass3_Sub3_Sub9_5;
		} else {
			local29 = this.aClass3_Sub3_Sub9_1;
			this.aClass3_Sub3_Sub9_1 = null;
		}
		if (local29 != null) {
			Static279.method3856(local29, this.aByte18, super.anInt7560, super.anInt7557, null);
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!qa;IIZ)Lclient!kj;")
	private Class130 method1531(@OriginalArg(0) Class167 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class31 local18 = Static9.aClass149_1.method3573(this.aShort18 & 0xFFFF);
		@Pc(43) Class55 local43;
		@Pc(29) Class55 local29;
		if (this.aBoolean104) {
			local29 = Static182.aClass55Array2[0];
			local43 = Static349.aClass55Array3[this.aByte18];
		} else {
			if (this.aByte18 >= 3) {
				local29 = null;
			} else {
				local29 = Static182.aClass55Array2[this.aByte18 + 1];
			}
			local43 = Static182.aClass55Array2[this.aByte18];
		}
		return local18.method874(local29, this.aByte16 == 11 ? this.aByte17 + 4 : this.aByte17, super.anInt7563, arg1, arg0, arg2, this.aByte16 == 11 ? 10 : this.aByte16, local43, super.anInt7557, super.anInt7560);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)I")
	@Override
	public int method6261() {
		return this.aByte16;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		this.aBoolean103 = false;
		if (this.aClass108_1 != null) {
			this.aClass108_1.B(this.aClass108_1.ma() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return this.aBoolean103;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6260() {
		return this.aBoolean102;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I")
	@Override
	public int method6262() {
		return this.aByte17;
	}
}
