import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class16_Sub4_Sub2 extends Class16_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "Lclient!bi;")
	public final Class23 aClass23_1;

	@OriginalMember(owner = "client!ft", name = "K", descriptor = "Z")
	private final boolean aBoolean234;

	static {
		new Class83("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!ya;Lclient!rd;IIIIIZII)V")
	public Class16_Sub4_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean527, arg1.aBoolean529);
		this.aClass23_1 = new Class23(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean234 = arg1.anInt5813 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return this.aClass23_1.anInt551;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	@Override
	public Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return this.aClass23_1.method578(0, false, arg0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!fi;BZLclient!ya;I)V")
	@Override
	public void method5337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZLclient!ya;)V")
	@Override
	public void method5349(@OriginalArg(1) Class19 arg0) {
		this.aClass23_1.method588(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)I")
	@Override
	public int method5354() {
		return this.aClass23_1.anInt536;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)I")
	@Override
	public int method5350() {
		return this.aClass23_1.anInt548;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	@Override
	public void method5333() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5351() {
		return this.aClass23_1.method584();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5348(@OriginalArg(0) Class19 arg0) {
		this.aClass23_1.method582(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5338() {
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class110 local16 = this.aClass23_1.method578(super.anInt3647, false, arg1, super.anInt3646, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(27) Class31 local27 = arg1.method4289();
			local27.j(super.anInt3646, super.anInt3648, super.anInt3647);
			return local16.method4894(arg2, arg0, local27, false);
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
		@Pc(23) Class110 local23 = this.aClass23_1.method578(super.anInt3647, true, arg0, super.anInt3646, 262144, true);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt3646 >> 7;
			@Pc(35) int local35 = super.anInt3647 >> 7;
			this.aClass23_1.method586(false, local35, local23, local30, arg0, local35, local30);
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		@Pc(16) Class110 local16 = this.aClass23_1.method578(super.anInt3647, true, arg0, super.anInt3646, 2048, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class31 local23 = arg0.method4289();
		local23.j(super.anInt3646, super.anInt3648, super.anInt3647);
		@Pc(33) Class3_Sub3 local33 = null;
		if (this.aBoolean234) {
			local33 = Static38.method672(1);
		}
		if (this.aClass23_1.aClass3_Sub2_1 == null) {
			local16.method4889(local23, local33 == null ? null : local33.aClass3_Sub5Array1[0], 0);
		} else {
			@Pc(49) Class146 local49 = this.aClass23_1.aClass3_Sub2_1.method171();
			arg0.method4262(local16, local49, local23, local33 == null ? null : local33.aClass3_Sub5Array1[0]);
		}
		@Pc(82) int local82 = super.anInt3646 >> 7;
		@Pc(94) int local94 = super.anInt3647 >> 7;
		this.aClass23_1.method586(true, local94, local16, local82, arg0, local94, local82);
		return local33;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
	@Override
	public void method5353() {
	}
}
