import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class30_Sub1_Sub4 extends Class30_Sub1 implements Interface5 {

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "B")
	private final byte aByte82;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "Z")
	private final boolean aBoolean389;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
	private boolean aBoolean391;

	@OriginalMember(owner = "client!qn", name = "U", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "Z")
	private final boolean aBoolean392;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "S")
	private final short aShort92;

	@OriginalMember(owner = "client!qn", name = "W", descriptor = "Z")
	private final boolean aBoolean393;

	@OriginalMember(owner = "client!qn", name = "V", descriptor = "Lclient!e;")
	public Class17 aClass17_5;

	@OriginalMember(owner = "client!qn", name = "cb", descriptor = "Lclient!i;")
	private Class1_Sub1_Sub10 aClass1_Sub1_Sub10_5;

	static {
		new Class158("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIIZIIIIIIZ)V")
	public Class30_Sub1_Sub4(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5634 == 1, Static396.method5460(arg12, arg13));
		this.aByte82 = (byte) arg3;
		this.aByte83 = (byte) arg12;
		this.aBoolean389 = arg1.anInt5666 != 0 && !arg7;
		this.aBoolean391 = arg14;
		this.aByte84 = (byte) arg13;
		this.aBoolean392 = arg7;
		this.aShort92 = (short) arg1.anInt5642;
		this.aBoolean393 = arg0.method5930() && arg1.aBoolean359 && !this.aBoolean392 && Static12.aClass34_Sub1_1.method5462(Static262.anInt2805) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean391) {
			local80 |= 0x10000;
		}
		@Pc(95) Class132 local95 = this.method4719(local80, arg0, this.aBoolean393);
		if (local95 != null) {
			this.aClass17_5 = local95.aClass17_1;
			this.aClass1_Sub1_Sub10_5 = local95.aClass1_Sub1_Sub10_1;
			if (this.aBoolean391) {
				this.aClass17_5 = this.aClass17_5.method6202((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return this.aByte83;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aShort92 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		@Pc(30) Class1_Sub1_Sub10 local30;
		if (this.aClass1_Sub1_Sub10_5 == null && this.aBoolean393) {
			@Pc(23) Class132 local23 = this.method4719(262144, arg0, true);
			local30 = local23 == null ? null : local23.aClass1_Sub1_Sub10_1;
		} else {
			local30 = this.aClass1_Sub1_Sub10_5;
			this.aClass1_Sub1_Sub10_5 = null;
		}
		if (local30 != null) {
			Static17.method329(local30, this.aByte82, super.anInt7490, super.anInt7488, null);
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		this.aBoolean391 = false;
		if (this.aClass17_5 != null) {
			this.aClass17_5.D(this.aClass17_5.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!za;IB)Lclient!e;")
	private Class17 method4717(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass17_5 != null && arg0.method5913(this.aClass17_5.RA(), arg1) == 0) {
			return this.aClass17_5;
		} else {
			@Pc(34) Class132 local34 = this.method4719(arg1, arg0, false);
			return local34 == null ? null : local34.aClass17_1;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		@Pc(21) Class1_Sub1_Sub10 local21;
		if (this.aClass1_Sub1_Sub10_5 == null && this.aBoolean393) {
			@Pc(32) Class132 local32 = this.method4719(262144, arg0, true);
			local21 = local32 == null ? null : local32.aClass1_Sub1_Sub10_1;
		} else {
			local21 = this.aClass1_Sub1_Sub10_5;
			this.aClass1_Sub1_Sub10_5 = null;
		}
		if (local21 != null) {
			Static124.method2026(local21, this.aByte82, super.anInt7490, super.anInt7488, null);
		}
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)I")
	public int method4718() {
		return this.aClass17_5 == null ? 15 : this.aClass17_5.k() / 4;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		if (this.aClass17_5 == null) {
			return null;
		}
		@Pc(16) Class40 local16 = arg0.method5918();
		local16.U(super.anInt7490, super.anInt7495, super.anInt7488);
		@Pc(26) Class41_Sub7 local26 = null;
		if (this.aBoolean389) {
			local26 = Static306.method4409(1);
		}
		this.aClass17_5.method6189(local16, local26 == null ? null : local26.aClass41_Sub8Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!za;ZB)Lclient!jl;")
	private Class132 method4719(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class192 local17 = Static455.aClass161_4.method3628(this.aShort92 & 0xFFFF);
		@Pc(29) Class96 local29;
		@Pc(24) Class96 local24;
		if (this.aBoolean392) {
			local24 = Static262.aClass96Array3[0];
			local29 = Static221.aClass96Array4[this.aByte82];
		} else {
			local29 = Static262.aClass96Array3[this.aByte82];
			if (this.aByte82 < 3) {
				local24 = Static262.aClass96Array3[this.aByte82 + 1];
			} else {
				local24 = null;
			}
		}
		return local17.method4371(arg1, super.anInt7490, local29, super.anInt7488, arg2, arg0, this.aByte83 == 11 ? 10 : this.aByte83, super.anInt7495, local24, this.aByte83 == 11 ? this.aByte84 + 4 : this.aByte84);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class30_Sub3_Sub2) {
			@Pc(40) Class30_Sub3_Sub2 local40 = (Class30_Sub3_Sub2) arg4;
			if (this.aClass17_5 == null || local40.aClass17_2 == null) {
				return;
			}
			this.aClass17_5.method6199(local40.aClass17_2, arg0, arg3, arg2, arg5);
		} else if (arg4 instanceof Class30_Sub1_Sub4) {
			@Pc(21) Class30_Sub1_Sub4 local21 = (Class30_Sub1_Sub4) arg4;
			if (this.aClass17_5 != null && local21.aClass17_5 != null) {
				this.aClass17_5.method6199(local21.aClass17_5, arg0, arg3, arg2, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return this.aBoolean391;
	}

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)I")
	@Override
	public int method5724() {
		return this.aClass17_5 == null ? 0 : this.aClass17_5.B();
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte84;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
		if (this.aClass17_5 != null) {
			this.aClass17_5.method6198();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.method4717(arg1, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aBoolean393;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class17 local15 = this.method4717(arg0, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class40 local20 = arg0.method5918();
			local20.U(super.anInt7490, super.anInt7495, super.anInt7488);
			return local15.method6203(arg2, arg1, local20, false);
		}
	}
}
