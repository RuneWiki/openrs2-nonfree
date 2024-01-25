import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class15_Sub3_Sub3 extends Class15_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!mv", name = "B", descriptor = "Lclient!km;")
	private Class175 aClass175_4;

	@OriginalMember(owner = "client!mv", name = "p", descriptor = "Lclient!wca;")
	public final Class311 aClass311_3;

	@OriginalMember(owner = "client!mv", name = "q", descriptor = "Z")
	private final boolean aBoolean418;

	static {
		new Class40("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		new Class40("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIIZIII)V")
	public Class15_Sub3_Sub3(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static228.method3766(arg9, arg8));
		this.aClass311_3 = new Class311(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6146, super.anInt6142, arg7, arg10);
		this.aBoolean418 = arg1.anInt8152 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aClass311_3.method7255();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) Class36 local26 = this.aClass311_3.method7253(131072, arg0, false, false, super.anInt6142, super.anInt6146);
		if (local26 == null) {
			return false;
		} else {
			@Pc(33) Class78 local33 = arg0.method6994();
			local33.oa(super.anInt6146, super.anInt6143, super.anInt6142);
			return local26.method7359(arg1, arg2, local33, false);
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aClass311_3.anInt8956;
	}

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		this.aClass311_3.method7264(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return this.aClass311_3.anInt8958;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		this.aClass311_3.method7256(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		@Pc(24) Class36 local24 = this.aClass311_3.method7253(2048, arg0, false, true, super.anInt6142, super.anInt6146);
		if (local24 == null) {
			return null;
		}
		@Pc(31) Class78 local31 = arg0.method6994();
		local31.oa(super.anInt6146, super.anInt6143, super.anInt6142);
		@Pc(41) Class30_Sub1 local41 = null;
		if (this.aBoolean418) {
			local41 = Static363.method5549(1);
		}
		if (this.aClass311_3.aClass30_Sub7_7 == null) {
			local24.method7360(local31, local41 == null ? null : local41.aClass30_Sub6Array1[0], 0);
		} else {
			@Pc(71) Class267 local71 = this.aClass311_3.aClass30_Sub7_7.method5906();
			arg0.method7066(local24, local71, local31, local41 == null ? null : local41.aClass30_Sub6Array1[0]);
		}
		if (this.aClass175_4 == null) {
			this.aClass175_4 = Static272.method4491(local24, super.anInt6146, super.anInt6142, super.anInt6143);
		} else {
			Static82.method1444(local24, this.aClass175_4, super.anInt6142, super.anInt6146, super.anInt6143);
		}
		@Pc(117) int local117 = super.anInt6146 >> 7;
		@Pc(122) int local122 = super.anInt6142 >> 7;
		this.aClass311_3.method7252(local24, true, local122, arg0, local122, local117, local117);
		return local41;
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return this.aClass175_4;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		@Pc(21) Class36 local21 = this.aClass311_3.method7253(262144, arg0, true, true, super.anInt6142, super.anInt6146);
		if (local21 != null) {
			@Pc(28) int local28 = super.anInt6146 >> 7;
			@Pc(33) int local33 = super.anInt6142 >> 7;
			this.aClass311_3.method7252(local21, false, local33, arg0, local33, local28, local28);
		}
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aClass311_3.anInt8974;
	}

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.aClass311_3.method7253(arg0, arg1, false, false, 0, 0);
	}
}
