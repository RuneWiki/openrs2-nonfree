import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!em", name = "q", descriptor = "Lclient!ck;")
	public final Class42 aClass42_1;

	@OriginalMember(owner = "client!em", name = "L", descriptor = "Z")
	private final boolean aBoolean144;

	static {
		new Class231(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
		new Class231("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIIZIII)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static59.method1104(arg9, arg8));
		this.aClass42_1 = new Class42(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6327, super.anInt6325, arg7, arg10);
		this.aBoolean144 = arg1.anInt2984 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aClass42_1.anInt1029;
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		this.aClass42_1.method965(arg0);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
	}

	@OriginalMember(owner = "client!em", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.aClass42_1.method968(false, 0, 0, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class39 local21 = this.aClass42_1.method968(false, super.anInt6325, super.anInt6327, arg0, false, 131072);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class132 local28 = arg0.method3564();
			local28.method3986(super.anInt6327, super.anInt6329, super.anInt6325);
			return local21.method4888(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aClass42_1.method960();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.aClass42_1.method968(true, super.anInt6325, super.anInt6327, arg0, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class132 local23 = arg0.method3564();
		local23.method3986(super.anInt6327, super.anInt6329, super.anInt6325);
		@Pc(33) Class48_Sub6 local33 = null;
		if (this.aBoolean144) {
			local33 = Static403.method5489(1);
		}
		if (this.aClass42_1.aClass48_Sub1_1 == null) {
			local16.method4910(local23, local33 == null ? null : local33.aClass48_Sub7Array1[0], 0);
		} else {
			@Pc(68) Class115 local68 = this.aClass42_1.aClass48_Sub1_1.method1293();
			arg0.method3571(local16, local68, local23, local33 == null ? null : local33.aClass48_Sub7Array1[0]);
		}
		@Pc(87) int local87 = super.anInt6327 >> 7;
		@Pc(92) int local92 = super.anInt6325 >> 7;
		this.aClass42_1.method966(local92, local87, local87, local16, true, arg0, local92);
		return local33;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return this.aClass42_1.anInt1043;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.aClass42_1.method968(true, super.anInt6325, super.anInt6327, arg0, true, 262144);
		if (local16 != null) {
			@Pc(27) int local27 = super.anInt6327 >> 7;
			@Pc(32) int local32 = super.anInt6325 >> 7;
			this.aClass42_1.method966(local32, local27, local27, local16, false, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aClass42_1.anInt1023;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		this.aClass42_1.method967(arg0);
	}
}
