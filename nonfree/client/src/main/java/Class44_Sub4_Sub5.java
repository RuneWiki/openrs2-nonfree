import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class44_Sub4_Sub5 extends Class44_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!wp", name = "gb", descriptor = "B")
	private final byte aByte93;

	@OriginalMember(owner = "client!wp", name = "V", descriptor = "Z")
	private final boolean aBoolean425;

	@OriginalMember(owner = "client!wp", name = "mb", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!wp", name = "jb", descriptor = "Z")
	private final boolean aBoolean426;

	@OriginalMember(owner = "client!wp", name = "L", descriptor = "Z")
	private boolean aBoolean424;

	@OriginalMember(owner = "client!wp", name = "O", descriptor = "S")
	private final short aShort91;

	@OriginalMember(owner = "client!wp", name = "Q", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!wp", name = "kb", descriptor = "Z")
	private final boolean aBoolean427;

	@OriginalMember(owner = "client!wp", name = "J", descriptor = "Lclient!sr;")
	private Class6_Sub2_Sub17 aClass6_Sub2_Sub17_6;

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "Lclient!rc;")
	public Class78 aClass78_7;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!ja;Lclient!fb;IIIIIZIIIIIIZ)V")
	public Class44_Sub4_Sub5(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1461 == 1, Static181.method3452(arg13, arg12));
		this.aByte93 = (byte) arg12;
		this.aBoolean425 = arg1.anInt1476 != 0;
		this.aByte94 = (byte) arg13;
		this.aBoolean426 = arg7;
		this.aBoolean424 = arg14;
		this.aShort91 = (short) arg1.anInt1497;
		this.aByte92 = (byte) arg3;
		this.aBoolean427 = arg0.method3011() && arg1.aBoolean108 && !this.aBoolean426 && Static282.anInt5340 != 0;
		@Pc(72) int local72 = 1024;
		if (this.aBoolean424) {
			local72 |= 0x8000;
		}
		@Pc(87) Class150 local87 = this.method5800(this.aBoolean427, local72, arg0);
		if (local87 != null) {
			this.aClass6_Sub2_Sub17_6 = local87.aClass6_Sub2_Sub17_4;
			this.aClass78_7 = local87.aClass78_5;
			if (this.aBoolean424) {
				this.aClass78_7 = this.aClass78_7.method4661((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZILclient!ja;Z)Lclient!ob;")
	private Class150 method5800(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2) {
		@Pc(12) Class66 local12 = Static196.method3622(this.aShort91 & 0xFFFF);
		@Pc(26) Class106 local26;
		@Pc(34) Class106 local34;
		if (this.aBoolean426) {
			local34 = Static99.aClass106Array4[0];
			local26 = Static84.aClass106Array1[this.aByte92];
		} else {
			local26 = Static99.aClass106Array4[this.aByte92];
			if (this.aByte92 >= 3) {
				local34 = null;
			} else {
				local34 = Static99.aClass106Array4[this.aByte92 + 1];
			}
		}
		return local12.method1365(this.aByte93 == 11 ? 10 : this.aByte93, arg2, arg0, super.anInt6335, local34, super.anInt6340, this.aByte93 == 11 ? this.aByte94 + 4 : this.aByte94, arg1, local26, super.anInt6339);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILclient!ja;)Lclient!rc;")
	@Override
	public Class78 method5792(@OriginalArg(1) int arg0, @OriginalArg(2) Class81 arg1) {
		return this.method5805(arg0, arg1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ja;I)V")
	@Override
	public void method5796(@OriginalArg(0) Class81 arg0) {
		@Pc(14) Class6_Sub2_Sub17 local14;
		if (this.aClass6_Sub2_Sub17_6 == null && this.aBoolean427) {
			@Pc(25) Class150 local25 = this.method5800(true, 131072, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub17_4;
		} else {
			local14 = this.aClass6_Sub2_Sub17_6;
			this.aClass6_Sub2_Sub17_6 = null;
		}
		if (local14 != null) {
			Static203.method3663(local14, this.aByte92, super.anInt6340, super.anInt6339, null);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		if (arg4 instanceof Class44_Sub5_Sub1) {
			@Pc(5) Class44_Sub5_Sub1 local5 = (Class44_Sub5_Sub1) arg4;
			if (this.aClass78_7 != null && local5.aClass78_4 != null) {
				this.aClass78_7.method4627(local5.aClass78_4, arg2, arg0, arg3, arg1);
			}
		} else if (arg4 instanceof Class44_Sub4_Sub5) {
			@Pc(28) Class44_Sub4_Sub5 local28 = (Class44_Sub4_Sub5) arg4;
			if (this.aClass78_7 != null && local28.aClass78_7 != null) {
				this.aClass78_7.method4627(local28.aClass78_7, arg2, arg0, arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)I")
	@Override
	public int method5784() {
		return this.aClass78_7 == null ? 0 : this.aClass78_7.method4639();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		if (this.aClass78_7 == null) {
			return null;
		}
		@Pc(11) Class72 local11 = arg0.method2990();
		local11.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
		@Pc(21) Class20_Sub6 local21 = null;
		if (this.aBoolean425) {
			local21 = Static208.method5776(1);
		}
		this.aClass78_7.method4649(local11, local21 == null ? null : local21.aClass20_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)I")
	@Override
	public int method5795() {
		return this.aByte93;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLclient!ja;)V")
	@Override
	public void method5794(@OriginalArg(1) Class81 arg0) {
		@Pc(14) Class6_Sub2_Sub17 local14;
		if (this.aClass6_Sub2_Sub17_6 == null && this.aBoolean427) {
			@Pc(25) Class150 local25 = this.method5800(true, 131072, arg0);
			local14 = local25 == null ? null : local25.aClass6_Sub2_Sub17_4;
		} else {
			local14 = this.aClass6_Sub2_Sub17_6;
			this.aClass6_Sub2_Sub17_6 = null;
		}
		if (local14 != null) {
			Static318.method5322(local14, this.aByte92, super.anInt6340, super.anInt6339, null);
		}
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
	@Override
	public void method5797() {
		if (this.aClass78_7 != null) {
			this.aClass78_7.method4633();
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I")
	@Override
	public int method5793() {
		return this.aByte94;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class78 local9 = this.method5805(65536, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class72 local20 = arg1.method2990();
			local20.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
			return local9.method4644(arg2, arg0, local20, false);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I")
	@Override
	public int method5799() {
		return this.aShort91 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5798() {
		return this.aBoolean427;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ja;B)Lclient!rc;")
	private Class78 method5805(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1) {
		if (this.aClass78_7 != null && arg1.method2958(this.aClass78_7.method4652(), arg0) == 0) {
			return this.aClass78_7;
		} else {
			@Pc(28) Class150 local28 = this.method5800(false, arg0, arg1);
			return local28 == null ? null : local28.aClass78_5;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return this.aBoolean424;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		this.aBoolean424 = false;
		if (this.aClass78_7 != null) {
			this.aClass78_7.method4624(this.aClass78_7.method4652() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)I")
	public int method5806() {
		return this.aClass78_7 == null ? 15 : this.aClass78_7.method4623() / 4;
	}
}
