import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class4_Sub5_Sub4 extends Class4_Sub5 implements Interface5 {

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "Z")
	private final boolean aBoolean501;

	@OriginalMember(owner = "client!tf", name = "X", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!tf", name = "ab", descriptor = "B")
	private final byte aByte61;

	@OriginalMember(owner = "client!tf", name = "ib", descriptor = "Z")
	private boolean aBoolean503;

	@OriginalMember(owner = "client!tf", name = "S", descriptor = "S")
	private final short aShort83;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
	private final boolean aBoolean500;

	@OriginalMember(owner = "client!tf", name = "Z", descriptor = "Z")
	private final boolean aBoolean502;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "Lclient!lb;")
	private Class5_Sub1_Sub10 aClass5_Sub1_Sub10_5;

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "Lclient!ts;")
	public Class112 aClass112_5;

	static {
		new Class85("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIIZIIIIIIZ)V")
	public Class4_Sub5_Sub4(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4761 == 1, Static248.method4432(arg12, arg13));
		this.aByte59 = (byte) arg13;
		this.aBoolean501 = arg1.anInt4756 != 0 && !arg7;
		this.aByte60 = (byte) arg12;
		this.aByte61 = (byte) arg3;
		this.aBoolean503 = arg14;
		this.aShort83 = (short) arg1.lb;
		this.aBoolean500 = arg7;
		this.aBoolean502 = arg0.method5160() && arg1.aBoolean396 && !this.aBoolean500 && Static95.anInt1828 != 0;
		@Pc(74) int local74 = 1024;
		if (this.aBoolean503) {
			local74 |= 0x8000;
		}
		@Pc(89) Class191 local89 = this.method5379(arg0, local74, this.aBoolean502);
		if (local89 != null) {
			this.aClass5_Sub1_Sub10_5 = local89.aClass5_Sub1_Sub10_6;
			this.aClass112_5 = local89.aClass112_6;
			if (this.aBoolean503) {
				this.aClass112_5 = this.aClass112_5.method4349((byte) 0, local74, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aBoolean502;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ea;IBZ)Lclient!to;")
	private Class191 method5379(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) Class156 local17 = Static111.method1967(this.aShort83 & 0xFFFF);
		@Pc(40) Class51 local40;
		@Pc(26) Class51 local26;
		if (this.aBoolean500) {
			local26 = Static56.aClass51Array2[0];
			local40 = Static219.aClass51Array3[this.aByte61];
		} else {
			if (this.aByte61 >= 3) {
				local26 = null;
			} else {
				local26 = Static56.aClass51Array2[this.aByte61 + 1];
			}
			local40 = Static56.aClass51Array2[this.aByte61];
		}
		return local17.method4221(local40, arg0, this.aByte60 == 11 ? this.aByte59 + 4 : this.aByte59, arg2, this.aByte60 == 11 ? 10 : this.aByte60, super.anInt6633, arg1, super.anInt6632, super.anInt6631, local26);
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aShort83 & 0xFFFF;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aClass112_5 == null ? 0 : this.aClass112_5.method4331();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
		if (this.aClass112_5 != null) {
			this.aClass112_5.method4343();
		}
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)I")
	public int method5381() {
		return this.aClass112_5 == null ? 15 : this.aClass112_5.method4313() / 4;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class4_Sub3_Sub2) {
			@Pc(9) Class4_Sub3_Sub2 local9 = (Class4_Sub3_Sub2) arg2;
			if (this.aClass112_5 != null && local9.aClass112_4 != null) {
				this.aClass112_5.method4311(local9.aClass112_4, arg0, arg5, arg4, arg3);
			}
		} else if (arg2 instanceof Class4_Sub5_Sub4) {
			@Pc(32) Class4_Sub5_Sub4 local32 = (Class4_Sub5_Sub4) arg2;
			if (this.aClass112_5 != null && local32.aClass112_5 != null) {
				this.aClass112_5.method4311(local32.aClass112_5, arg0, arg5, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return this.aBoolean503;
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		@Pc(33) Class5_Sub1_Sub10 local33;
		if (this.aClass5_Sub1_Sub10_5 == null && this.aBoolean502) {
			@Pc(26) Class191 local26 = this.method5379(arg0, 131072, true);
			local33 = local26 == null ? null : local26.aClass5_Sub1_Sub10_6;
		} else {
			local33 = this.aClass5_Sub1_Sub10_5;
			this.aClass5_Sub1_Sub10_5 = null;
		}
		if (local33 != null) {
			Static231.method4152(local33, this.aByte61, super.anInt6631, super.anInt6632, null);
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aByte59;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ea;IB)Lclient!ts;")
	private Class112 method5382(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass112_5 != null && arg0.method5181(this.aClass112_5.method4308(), arg1) == 0) {
			return this.aClass112_5;
		} else {
			@Pc(26) Class191 local26 = this.method5379(arg0, arg1, false);
			return local26 == null ? null : local26.aClass112_6;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.method5382(arg0, arg1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		@Pc(29) Class5_Sub1_Sub10 local29;
		if (this.aClass5_Sub1_Sub10_5 == null && this.aBoolean502) {
			@Pc(22) Class191 local22 = this.method5379(arg0, 131072, true);
			local29 = local22 == null ? null : local22.aClass5_Sub1_Sub10_6;
		} else {
			local29 = this.aClass5_Sub1_Sub10_5;
			this.aClass5_Sub1_Sub10_5 = null;
		}
		if (local29 != null) {
			Static146.method2670(local29, this.aByte61, super.anInt6631, super.anInt6632, null);
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		if (this.aClass112_5 == null) {
			return null;
		}
		@Pc(11) Class66 local11 = arg0.method5195();
		local11.method5822(super.anInt6631, super.anInt6633, super.anInt6632);
		@Pc(21) Class32_Sub4 local21 = null;
		if (this.aBoolean501) {
			local21 = Static232.method4183(1);
		}
		this.aClass112_5.method4338(local11, local21 == null ? null : local21.aClass32_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		this.aBoolean503 = false;
		if (this.aClass112_5 != null) {
			this.aClass112_5.method4339(this.aClass112_5.method4308() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class112 local9 = this.method5382(arg1, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class66 local14 = arg1.method5195();
			local14.method5822(super.anInt6631, super.anInt6633, super.anInt6632);
			return local9.method4340(arg2, arg0, local14, false);
		}
	}
}
