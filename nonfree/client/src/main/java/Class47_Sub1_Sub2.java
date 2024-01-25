import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class47_Sub1_Sub2 extends Class47_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!cs", name = "O", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!cs", name = "hb", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "B")
	private final byte aByte12;

	@OriginalMember(owner = "client!cs", name = "cb", descriptor = "Z")
	private final boolean aBoolean90;

	@OriginalMember(owner = "client!cs", name = "Q", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "Z")
	private final boolean aBoolean87;

	@OriginalMember(owner = "client!cs", name = "ab", descriptor = "S")
	private final short aShort16;

	@OriginalMember(owner = "client!cs", name = "T", descriptor = "Z")
	private final boolean aBoolean89;

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "Lclient!c;")
	public Class37 aClass37_2;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "Lclient!j;")
	private Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIIZIIIIIIZ)V")
	public Class47_Sub1_Sub2(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt531 == 1, Static196.method3040(arg12, arg13));
		this.aByte13 = (byte) arg13;
		this.aBoolean91 = arg14;
		this.aByte12 = (byte) arg12;
		this.aBoolean90 = arg7;
		this.aByte14 = (byte) arg3;
		this.aBoolean87 = arg1.anInt550 != 0 && !arg7;
		this.aShort16 = (short) arg1.anInt545;
		this.aBoolean89 = arg0.method4638() && arg1.aBoolean44 && !this.aBoolean90 && Static327.aClass230_Sub1_1.method5636(Static146.anInt2664) != 0;
		@Pc(74) int local74 = 2048;
		if (this.aBoolean91) {
			local74 |= 0x10000;
		}
		@Pc(89) Class209 local89 = this.method892(local74, arg0, this.aBoolean89);
		if (local89 != null) {
			this.aClass37_2 = local89.aClass37_6;
			this.aClass1_Sub1_Sub3_1 = local89.aClass1_Sub1_Sub3_5;
			if (this.aBoolean91) {
				this.aClass37_2 = this.aClass37_2.method4155((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return this.aByte12;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		@Pc(31) Class1_Sub1_Sub3 local31;
		if (this.aClass1_Sub1_Sub3_1 == null && this.aBoolean89) {
			@Pc(24) Class209 local24 = this.method892(262144, arg0, true);
			local31 = local24 == null ? null : local24.aClass1_Sub1_Sub3_5;
		} else {
			local31 = this.aClass1_Sub1_Sub3_1;
			this.aClass1_Sub1_Sub3_1 = null;
		}
		if (local31 != null) {
			Static317.method4368(local31, this.aByte14, super.anInt7060, super.anInt7066, null);
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aBoolean89;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(14) Class37 local14 = this.method893(131072, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class43 local19 = arg2.method4588();
			local19.R(super.anInt7060, super.anInt7064, super.anInt7066);
			return local14.method4166(arg1, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		@Pc(18) Class1_Sub1_Sub3 local18;
		if (this.aClass1_Sub1_Sub3_1 == null && this.aBoolean89) {
			@Pc(29) Class209 local29 = this.method892(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass1_Sub1_Sub3_5;
		} else {
			local18 = this.aClass1_Sub1_Sub3_1;
			this.aClass1_Sub1_Sub3_1 = null;
		}
		if (local18 != null) {
			Static1.method23(local18, this.aByte14, super.anInt7060, super.anInt7066, null);
		}
	}

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "(I)I")
	public int method891() {
		return this.aClass37_2 == null ? 15 : this.aClass37_2.ra() / 4;
	}

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		this.aBoolean91 = false;
		if (this.aClass37_2 != null) {
			this.aClass37_2.u(this.aClass37_2.n() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		if (arg4 instanceof Class47_Sub2_Sub1) {
			@Pc(9) Class47_Sub2_Sub1 local9 = (Class47_Sub2_Sub1) arg4;
			if (this.aClass37_2 != null && local9.aClass37_3 != null) {
				this.aClass37_2.method4165(local9.aClass37_3, arg1, arg0, arg5, arg3);
			}
		} else if (arg4 instanceof Class47_Sub1_Sub2) {
			@Pc(32) Class47_Sub1_Sub2 local32 = (Class47_Sub1_Sub2) arg4;
			if (this.aClass37_2 != null && local32.aClass37_2 != null) {
				this.aClass37_2.method4165(local32.aClass37_2, arg1, arg0, arg5, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return this.aBoolean91;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILclient!qa;Z)Lclient!rl;")
	private Class209 method892(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class29 local18 = Static251.aClass207_2.method4977(this.aShort16 & 0xFFFF);
		@Pc(43) Class70 local43;
		@Pc(34) Class70 local34;
		if (this.aBoolean90) {
			local34 = Static60.aClass70Array1[0];
			local43 = Static315.aClass70Array3[this.aByte14];
		} else {
			if (this.aByte14 < 3) {
				local34 = Static60.aClass70Array1[this.aByte14 + 1];
			} else {
				local34 = null;
			}
			local43 = Static60.aClass70Array1[this.aByte14];
		}
		return local18.method464(arg1, local34, super.anInt7064, this.aByte12 == 11 ? 10 : this.aByte12, super.anInt7060, this.aByte12 == 11 ? this.aByte13 + 4 : this.aByte13, arg2, super.anInt7066, arg0, local43);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BILclient!qa;)Lclient!c;")
	private Class37 method893(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		if (this.aClass37_2 != null && arg1.method4634(this.aClass37_2.n(), arg0) == 0) {
			return this.aClass37_2;
		} else {
			@Pc(31) Class209 local31 = this.method892(arg0, arg1, false);
			return local31 == null ? null : local31.aClass37_6;
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
		if (this.aClass37_2 != null) {
			this.aClass37_2.method4158();
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method893(arg0, arg1);
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(Z)I")
	@Override
	public int method5447() {
		return this.aClass37_2 == null ? 0 : this.aClass37_2.b();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aShort16 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		if (this.aClass37_2 == null) {
			return null;
		}
		@Pc(11) Class43 local11 = arg0.method4588();
		local11.R(super.anInt7060, super.anInt7064, super.anInt7066);
		@Pc(26) Class36_Sub1 local26 = null;
		if (this.aBoolean87) {
			local26 = Static309.method4241(1);
		}
		this.aClass37_2.method4167(local11, local26 == null ? null : local26.aClass36_Sub8Array1[0], 0);
		return local26;
	}
}
