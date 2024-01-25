import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class20_Sub4_Sub1 extends Class20_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!it", name = "S", descriptor = "Lclient!so;")
	private Class271 aClass271_2;

	@OriginalMember(owner = "client!it", name = "A", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!it", name = "R", descriptor = "Z")
	private final boolean aBoolean333;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "Z")
	private final boolean aBoolean332;

	@OriginalMember(owner = "client!it", name = "K", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!it", name = "U", descriptor = "S")
	private final short aShort39;

	@OriginalMember(owner = "client!it", name = "M", descriptor = "B")
	private final byte aByte54;

	@OriginalMember(owner = "client!it", name = "w", descriptor = "Z")
	private final boolean aBoolean331;

	@OriginalMember(owner = "client!it", name = "H", descriptor = "Lclient!k;")
	private Class1_Sub2_Sub2 aClass1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!it", name = "V", descriptor = "Lclient!r;")
	private Class97 aClass97_3;

	static {
		new Class45("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!qa;Lclient!cn;IIIIZIIIII)V")
	public Class20_Sub4_Sub1(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static280.method4895(arg11, arg10));
		super.anInt7239 = arg3;
		this.aByte52 = (byte) arg2;
		super.anInt7242 = arg5;
		this.aBoolean333 = arg6;
		this.aBoolean332 = arg1.anInt1632 != 0 && !arg6;
		this.aByte53 = (byte) arg11;
		this.aShort39 = (short) arg1.anInt1646;
		this.aByte54 = (byte) arg10;
		this.aBoolean331 = arg0.method7153() && arg1.aBoolean132 && !this.aBoolean333 && Static286.aClass1_Sub15_Sub1_1.method6358(Static449.anInt7876) != 0;
		@Pc(77) Class147 local77 = this.method3919(arg0, this.aBoolean331, 2048);
		if (local77 != null) {
			this.aClass1_Sub2_Sub2_2 = local77.aClass1_Sub2_Sub2_3;
			this.aClass97_3 = local77.aClass97_4;
		}
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V")
	@Override
	public void method8050() {
		if (this.aClass97_3 != null) {
			this.aClass97_3.method6777();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!qa;II)Lclient!r;")
	private Class97 method3916(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass97_3 != null && arg0.method7167(this.aClass97_3.ba(), arg1) == 0) {
			return this.aClass97_3;
		} else {
			@Pc(30) Class147 local30 = this.method3919(arg0, false, arg1);
			return local30 == null ? null : local30.aClass97_4;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method8043(@OriginalArg(1) Class4 arg0) {
		@Pc(14) Class1_Sub2_Sub2 local14;
		if (this.aClass1_Sub2_Sub2_2 == null && this.aBoolean331) {
			@Pc(25) Class147 local25 = this.method3919(arg0, true, 262144);
			local14 = local25 == null ? null : local25.aClass1_Sub2_Sub2_3;
		} else {
			local14 = this.aClass1_Sub2_Sub2_2;
			this.aClass1_Sub2_Sub2_2 = null;
		}
		if (local14 != null) {
			Static509.method7778(local14, this.aByte52, super.anInt7239, super.anInt7242, null);
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)I")
	@Override
	public int method8047() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)I")
	@Override
	public int method8044() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class97 local14 = this.method3916(arg0, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class128 local19 = arg0.method7165();
			local19.oa(super.anInt7239, super.anInt7234, super.anInt7242);
			return local14.method6785(arg1, arg2, local19, false);
		}
	}

	@OriginalMember(owner = "client!it", name = "f", descriptor = "(I)I")
	@Override
	public int method6522() {
		return this.aClass97_3 == null ? 0 : this.aClass97_3.TA();
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8049() {
		return this.aBoolean331;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class97 method8048(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return this.method3916(arg1, arg0);
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		if (this.aClass271_2 == null) {
			this.aClass271_2 = Static161.method2903(super.anInt7234, super.anInt7239, this.method3916(arg0, 0), super.anInt7242);
		}
		return this.aClass271_2;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	@Override
	public int method8046() {
		return this.aShort39 & 0xFFFF;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		if (this.aClass97_3 == null) {
			return null;
		}
		@Pc(11) Class128 local11 = arg0.method7165();
		local11.oa(super.anInt7238 + super.anInt7239, super.anInt7234, super.anInt7245 + super.anInt7242);
		@Pc(27) Class46_Sub6 local27 = null;
		if (this.aBoolean332) {
			local27 = Static490.method7528(1);
		}
		this.aClass97_3.method6773(local11, local27 == null ? null : local27.aClass46_Sub1Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!qa;ZII)Lclient!jc;")
	private Class147 method3919(@OriginalArg(0) Class4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class51 local18 = Static398.aClass18_4.method609(this.aShort39 & 0xFFFF);
		@Pc(26) Class7 local26;
		@Pc(30) Class7 local30;
		if (this.aBoolean333) {
			local26 = Static207.aClass7Array7[this.aByte52];
			local30 = Static411.aClass7Array12[0];
		} else {
			local26 = Static411.aClass7Array12[this.aByte52];
			if (this.aByte52 >= 3) {
				local30 = null;
			} else {
				local30 = Static411.aClass7Array12[this.aByte52 + 1];
			}
		}
		return local18.method1621(local26, arg1, arg2, local30, arg0, super.anInt7239, super.anInt7242, super.anInt7234, this.aByte53, this.aByte54);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method8045(@OriginalArg(0) Class4 arg0) {
		@Pc(18) Class1_Sub2_Sub2 local18;
		if (this.aClass1_Sub2_Sub2_2 == null && this.aBoolean331) {
			@Pc(29) Class147 local29 = this.method3919(arg0, true, 262144);
			local18 = local29 == null ? null : local29.aClass1_Sub2_Sub2_3;
		} else {
			local18 = this.aClass1_Sub2_Sub2_2;
			this.aClass1_Sub2_Sub2_2 = null;
		}
		if (local18 != null) {
			Static101.method2062(local18, this.aByte52, super.anInt7239, super.anInt7242, null);
		}
	}
}
