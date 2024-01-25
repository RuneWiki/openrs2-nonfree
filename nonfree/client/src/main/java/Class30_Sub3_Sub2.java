import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class30_Sub3_Sub2 extends Class30_Sub3 implements Interface5 {

	@OriginalMember(owner = "client!lf", name = "Q", descriptor = "Z")
	private final boolean aBoolean289;

	@OriginalMember(owner = "client!lf", name = "F", descriptor = "B")
	private final byte aByte60;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "B")
	private final byte aByte58;

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "Z")
	private boolean aBoolean287;

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
	private final boolean aBoolean286;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "B")
	private final byte aByte59;

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "Z")
	private final boolean aBoolean288;

	@OriginalMember(owner = "client!lf", name = "I", descriptor = "Lclient!e;")
	public Class17 aClass17_2;

	@OriginalMember(owner = "client!lf", name = "J", descriptor = "Lclient!i;")
	private Class1_Sub1_Sub10 aClass1_Sub1_Sub10_2;

	static {
		new Class158("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
		new Class158("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
		new Class158("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!za;Lclient!p;IIIIZIIZ)V")
	public Class30_Sub3_Sub2(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static358.method5055(arg7, arg8));
		super.anInt5437 = arg3;
		this.aBoolean289 = arg1.anInt5666 != 0 && !arg6;
		this.aByte60 = (byte) arg8;
		this.aShort60 = (short) arg1.anInt5642;
		this.aByte58 = (byte) arg2;
		this.aBoolean287 = arg9;
		this.aBoolean286 = arg6;
		this.aByte59 = (byte) arg7;
		super.anInt5438 = arg5;
		this.aBoolean288 = arg0.method5930() && arg1.aBoolean359 && !this.aBoolean286 && Static12.aClass34_Sub1_1.method5462(Static262.anInt2805) != 0;
		@Pc(71) int local71 = 2048;
		if (this.aBoolean287) {
			local71 |= 0x10000;
		}
		@Pc(86) Class132 local86 = this.method3502(this.aBoolean288, arg0, local71);
		if (local86 != null) {
			this.aClass17_2 = local86.aClass17_1;
			this.aClass1_Sub1_Sub10_2 = local86.aClass1_Sub1_Sub10_1;
			if (this.aBoolean287) {
				this.aClass17_2 = this.aClass17_2.method6202((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLclient!za;II)Lclient!jl;")
	private Class132 method3502(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class192 local11 = Static455.aClass161_4.method3628(this.aShort60 & 0xFFFF);
		@Pc(41) Class96 local41;
		@Pc(28) Class96 local28;
		if (this.aBoolean286) {
			local28 = Static262.aClass96Array3[0];
			local41 = Static221.aClass96Array4[this.aByte58];
		} else {
			if (this.aByte58 >= 3) {
				local28 = null;
			} else {
				local28 = Static262.aClass96Array3[this.aByte58 + 1];
			}
			local41 = Static262.aClass96Array3[this.aByte58];
		}
		return local11.method4371(arg1, super.anInt5437, local41, super.anInt5438, arg0, arg2, this.aByte59, super.anInt5439, local28, this.aByte60);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	@Override
	public int method5727() {
		return this.aByte59;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return this.aBoolean287;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		if (this.aClass17_2 == null) {
			return null;
		}
		@Pc(16) Class40 local16 = arg0.method5918();
		local16.U(super.anInt5437, super.anInt5439, super.anInt5438);
		@Pc(26) Class41_Sub7 local26 = null;
		if (this.aBoolean289) {
			local26 = Static306.method4409(1);
		}
		this.aClass17_2.method6189(local16, local26 == null ? null : local26.aClass41_Sub8Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 instanceof Class30_Sub3_Sub2) {
			@Pc(34) Class30_Sub3_Sub2 local34 = (Class30_Sub3_Sub2) arg4;
			if (this.aClass17_2 == null || local34.aClass17_2 == null) {
				return;
			}
			this.aClass17_2.method6199(local34.aClass17_2, arg0, arg3, arg2, arg5);
		} else if (arg4 instanceof Class30_Sub1_Sub4) {
			@Pc(15) Class30_Sub1_Sub4 local15 = (Class30_Sub1_Sub4) arg4;
			if (this.aClass17_2 != null && local15.aClass17_5 != null) {
				this.aClass17_2.method6199(local15.aClass17_5, arg0, arg3, arg2, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)I")
	@Override
	public int method5730() {
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	@Override
	public void method5734() {
		if (this.aClass17_2 != null) {
			this.aClass17_2.method6198();
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5731() {
		return this.aBoolean288;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)I")
	@Override
	public int method5729() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!za;I)Lclient!e;")
	private Class17 method3503(@OriginalArg(1) Class106 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass17_2 != null && arg0.method5913(this.aClass17_2.RA(), arg1) == 0) {
			return this.aClass17_2;
		} else {
			@Pc(28) Class132 local28 = this.method3502(false, arg0, arg1);
			return local28 == null ? null : local28.aClass17_1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method5728(@OriginalArg(1) Class106 arg0) {
		@Pc(25) Class1_Sub1_Sub10 local25;
		if (this.aClass1_Sub1_Sub10_2 == null && this.aBoolean288) {
			@Pc(18) Class132 local18 = this.method3502(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub10_1;
		} else {
			local25 = this.aClass1_Sub1_Sub10_2;
			this.aClass1_Sub1_Sub10_2 = null;
		}
		if (local25 != null) {
			Static17.method329(local25, this.aByte58, super.anInt5437, super.anInt5438, null);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class17 local9 = this.method3503(arg0, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(24) Class40 local24 = arg0.method5918();
			local24.U(super.anInt5437, super.anInt5439, super.anInt5438);
			return local9.method6203(arg2, arg1, local24, false);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5732(@OriginalArg(1) Class106 arg0) {
		@Pc(32) Class1_Sub1_Sub10 local32;
		if (this.aClass1_Sub1_Sub10_2 == null && this.aBoolean288) {
			@Pc(25) Class132 local25 = this.method3502(true, arg0, 262144);
			local32 = local25 == null ? null : local25.aClass1_Sub1_Sub10_1;
		} else {
			local32 = this.aClass1_Sub1_Sub10_2;
			this.aClass1_Sub1_Sub10_2 = null;
		}
		if (local32 != null) {
			Static124.method2026(local32, this.aByte58, super.anInt5437, super.anInt5438, null);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	@Override
	public Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1) {
		return this.method3503(arg1, arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		this.aBoolean287 = false;
		if (this.aClass17_2 != null) {
			this.aClass17_2.D(this.aClass17_2.RA() & 0xFFFEFFFF);
		}
	}
}
