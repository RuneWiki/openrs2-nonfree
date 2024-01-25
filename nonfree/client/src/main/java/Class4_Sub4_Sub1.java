import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "Z")
	private final boolean aBoolean193;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "B")
	private final byte aByte4;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "B")
	private final byte aByte5;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "Z")
	private final boolean aBoolean196;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "S")
	private final short aShort9;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "Z")
	private final boolean aBoolean197;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "Lclient!ts;")
	private Class112 aClass112_1;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "Lclient!lb;")
	private Class5_Sub1_Sub10 aClass5_Sub1_Sub10_1;

	static {
		new Class85("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
		new Class85("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!ea;Lclient!p;IIIIZIZ)V")
	public Class4_Sub4_Sub1(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean395, arg1.aBoolean393);
		this.aBoolean193 = arg1.anInt4756 != 0 && !arg6;
		this.aByte4 = (byte) arg2;
		this.aBoolean195 = arg8;
		this.aByte5 = (byte) arg7;
		super.anInt2905 = (short) arg5;
		super.anInt2907 = (short) arg3;
		this.aBoolean196 = arg6;
		this.aShort9 = (short) arg1.lb;
		this.aBoolean197 = arg0.method5160() && arg1.aBoolean396 && !this.aBoolean196 && Static95.anInt1828 != 0;
		@Pc(63) int local63 = 1024;
		if (this.aBoolean195) {
			local63 |= 0x8000;
		}
		@Pc(78) Class191 local78 = this.method2338(local63, this.aBoolean197, arg0);
		if (local78 != null) {
			this.aClass112_1 = local78.aClass112_6;
			this.aClass5_Sub1_Sub10_1 = local78.aClass5_Sub1_Sub10_6;
			if (this.aBoolean195) {
				this.aClass112_1 = this.aClass112_1.method4349((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZILclient!ea;I)Z")
	@Override
	public boolean method5900(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class112 local14 = this.method2334(65536, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class66 local19 = arg1.method5195();
			local19.method5822(super.anInt2907, super.anInt2906, super.anInt2905);
			return local14.method4340(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	@Override
	public void method5896() {
		this.aBoolean195 = false;
		if (this.aClass112_1 != null) {
			this.aClass112_1.method4339(this.aClass112_1.method4308() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	@Override
	public int method5908() {
		return this.aByte5;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!ea;)V")
	@Override
	public void method5912(@OriginalArg(1) Class55 arg0) {
		@Pc(26) Class5_Sub1_Sub10 local26;
		if (this.aClass5_Sub1_Sub10_1 == null && this.aBoolean197) {
			@Pc(37) Class191 local37 = this.method2338(131072, true, arg0);
			local26 = local37 == null ? null : local37.aClass5_Sub1_Sub10_6;
		} else {
			local26 = this.aClass5_Sub1_Sub10_1;
			this.aClass5_Sub1_Sub10_1 = null;
		}
		if (local26 != null) {
			Static146.method2670(local26, this.aByte4, super.anInt2907, super.anInt2905, null);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	@Override
	public Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1) {
		return this.method2334(arg1, arg0);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)I")
	@Override
	public int method5913() {
		return 22;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ea;I)V")
	@Override
	public void method5899(@OriginalArg(0) Class55 arg0) {
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ea;)Lclient!ts;")
	private Class112 method2334(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1) {
		if (this.aClass112_1 != null && arg1.method5181(this.aClass112_1.method4308(), arg0) == 0) {
			return this.aClass112_1;
		} else {
			@Pc(32) Class191 local32 = this.method2338(arg0, false, arg1);
			return local32 == null ? null : local32.aClass112_6;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
	@Override
	public int method5910() {
		return this.aShort9 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(ILclient!ea;)Lclient!ms;")
	@Override
	public Class32_Sub4 method5898(@OriginalArg(1) Class55 arg0) {
		if (this.aClass112_1 == null) {
			return null;
		}
		@Pc(11) Class66 local11 = arg0.method5195();
		local11.method5822(super.anInt2907, super.anInt2906, super.anInt2905);
		@Pc(21) Class32_Sub4 local21 = null;
		if (this.aBoolean193) {
			local21 = Static232.method4183(1);
		}
		this.aClass112_1.method4338(local11, local21 == null ? null : local21.aClass32_Sub8Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5895() {
		return this.aBoolean195;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ea;Lclient!ac;ZII)V")
	@Override
	public void method5897(@OriginalArg(1) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 instanceof Class4_Sub4_Sub1) {
			@Pc(9) Class4_Sub4_Sub1 local9 = (Class4_Sub4_Sub1) arg2;
			if (this.aClass112_1 != null && local9.aClass112_1 != null) {
				this.aClass112_1.method4311(local9.aClass112_1, arg0, arg5, arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5909() {
		return this.aBoolean197;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method5907() {
		if (this.aClass112_1 != null) {
			this.aClass112_1.method4343();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBZLclient!ea;)Lclient!to;")
	private Class191 method2338(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(17) Class156 local17 = Static111.method1967(this.aShort9 & 0xFFFF);
		@Pc(29) Class51 local29;
		@Pc(24) Class51 local24;
		if (this.aBoolean196) {
			local24 = Static56.aClass51Array2[0];
			local29 = Static219.aClass51Array3[this.aByte4];
		} else {
			local29 = Static56.aClass51Array2[this.aByte4];
			if (this.aByte4 >= 3) {
				local24 = null;
			} else {
				local24 = Static56.aClass51Array2[this.aByte4 + 1];
			}
		}
		return local17.method4221(local29, arg2, this.aByte5, arg1, 22, super.anInt2906, arg0, super.anInt2905, super.anInt2907, local24);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!ea;)V")
	@Override
	public void method5911(@OriginalArg(1) Class55 arg0) {
		@Pc(25) Class5_Sub1_Sub10 local25;
		if (this.aClass5_Sub1_Sub10_1 == null && this.aBoolean197) {
			@Pc(18) Class191 local18 = this.method2338(131072, true, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub1_Sub10_6;
		} else {
			local25 = this.aClass5_Sub1_Sub10_1;
			this.aClass5_Sub1_Sub10_1 = null;
		}
		if (local25 != null) {
			Static231.method4152(local25, this.aByte4, super.anInt2907, super.anInt2905, null);
		}
	}
}
