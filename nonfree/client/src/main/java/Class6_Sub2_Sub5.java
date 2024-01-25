import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class6_Sub2_Sub5 extends Class6_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "Lclient!pd;")
	public final Class185 aClass185_3;

	@OriginalMember(owner = "client!iv", name = "C", descriptor = "Z")
	private final boolean aBoolean244;

	static {
		new Class242("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
		new Class242("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIIZIIIIIII)V")
	public Class6_Sub2_Sub5(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2174 == 1, Static130.method1930(arg12, arg13));
		this.aClass185_3 = new Class185(arg0, arg1, arg12, arg13, super.aByte86, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean244 = arg1.anInt2194 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return this.aClass185_3.method4121(false, arg1, false, 0, arg0, 0);
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return this.aClass185_3.anInt5358;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return this.aClass185_3.anInt5364;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		@Pc(16) Class7 local16 = this.aClass185_3.method4121(true, arg0, true, super.anInt6061, 262144, super.anInt6062);
		if (local16 != null) {
			this.aClass185_3.method4120(super.aShort85, super.aShort84, false, super.aShort82, super.aShort83, arg0, local16);
		}
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
		this.aClass185_3.method4130(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		@Pc(16) Class7 local16 = this.aClass185_3.method4121(true, arg0, false, super.anInt6061, 2048, super.anInt6062);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class116 local28 = arg0.method4678();
		local28.R(super.anInt6062, super.anInt6067, super.anInt6061);
		@Pc(38) Class41_Sub6 local38 = null;
		if (this.aBoolean244) {
			local38 = Static381.method5198(1);
		}
		if (this.aClass185_3.aClass41_Sub1_6 == null) {
			local16.method4091(local28, local38 == null ? null : local38.aClass41_Sub4Array1[0], 0);
		} else {
			@Pc(54) Class256 local54 = this.aClass185_3.aClass41_Sub1_6.method3166();
			arg0.method4676(local16, local54, local28, local38 == null ? null : local38.aClass41_Sub4Array1[0]);
		}
		this.aClass185_3.method4120(super.aShort85, super.aShort84, true, super.aShort82, super.aShort83, arg0, local16);
		return local38;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
		this.aClass185_3.method4129(arg0);
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)I")
	@Override
	public int method4752() {
		return this.aClass185_3.method4132();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return this.aClass185_3.anInt5366;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return this.aClass185_3.method4124();
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		@Pc(18) Class7 local18 = this.aClass185_3.method4121(false, arg2, false, super.anInt6061, 131072, super.anInt6062);
		if (local18 == null) {
			return false;
		} else {
			@Pc(32) Class116 local32 = arg2.method4678();
			local32.R(super.anInt6062, super.anInt6067, super.anInt6061);
			return local18.method4082(arg0, arg1, local32, false);
		}
	}
}
