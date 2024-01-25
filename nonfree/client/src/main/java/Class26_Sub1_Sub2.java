import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class26_Sub1_Sub2 extends Class26_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!br", name = "s", descriptor = "Lclient!eo;")
	public final Class72 aClass72_1;

	@OriginalMember(owner = "client!br", name = "v", descriptor = "Z")
	private final boolean aBoolean25;

	static {
		new Class84("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!qa;Lclient!pk;IIIIIZIII)V")
	public Class26_Sub1_Sub2(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static253.method3734(arg8, arg9));
		this.aClass72_1 = new Class72(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt3955, super.anInt3954, arg7, arg10);
		this.aBoolean25 = arg1.anInt5468 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5512() {
		return false;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		@Pc(16) Class37 local16 = this.aClass72_1.method1507(true, super.anInt3955, 2048, super.anInt3954, arg0, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class18 local23 = arg0.method4709();
		local23.R(super.anInt3955, super.anInt3956, super.anInt3954);
		@Pc(33) Class39_Sub4 local33 = null;
		if (this.aBoolean25) {
			local33 = Static72.method1208(1);
		}
		if (this.aClass72_1.aClass39_Sub8_1 == null) {
			local16.method4230(local23, local33 == null ? null : local33.aClass39_Sub7Array1[0], 0);
		} else {
			@Pc(65) Class185 local65 = this.aClass72_1.aClass39_Sub8_1.method5629();
			arg0.method4736(local16, local65, local23, local33 == null ? null : local33.aClass39_Sub7Array1[0]);
		}
		@Pc(90) int local90 = super.anInt3955 >> 7;
		@Pc(95) int local95 = super.anInt3954 >> 7;
		this.aClass72_1.method1505(local90, arg0, local16, true, local90, local95, local95);
		return local33;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	@Override
	public void method4672() {
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)I")
	@Override
	public int method4670() {
		return this.aClass72_1.anInt1795;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!co;ILclient!qa;ZZ)V")
	@Override
	public void method5514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class109 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)I")
	@Override
	public int method4666() {
		return this.aClass72_1.anInt1791;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class37 local16 = this.aClass72_1.method1507(false, super.anInt3955, 131072, super.anInt3954, arg0, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class18 local29 = arg0.method4709();
			local29.R(super.anInt3955, super.anInt3956, super.anInt3954);
			return local16.method4228(arg1, arg2, local29, false);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method4669(@OriginalArg(1) int arg0, @OriginalArg(2) Class109 arg1) {
		return this.aClass72_1.method1507(false, 0, arg0, 0, arg1, false);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)I")
	@Override
	public int method4665() {
		return this.aClass72_1.anInt1806;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4671() {
		return this.aClass72_1.method1512();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4667(@OriginalArg(1) Class109 arg0) {
		this.aClass72_1.method1509(arg0);
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
		@Pc(24) Class37 local24 = this.aClass72_1.method1507(true, super.anInt3955, 262144, super.anInt3954, arg0, true);
		if (local24 != null) {
			@Pc(31) int local31 = super.anInt3955 >> 7;
			@Pc(36) int local36 = super.anInt3954 >> 7;
			this.aClass72_1.method1505(local31, arg0, local24, false, local31, local36, local36);
		}
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(I)V")
	@Override
	public void method5516() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4668(@OriginalArg(1) Class109 arg0) {
		this.aClass72_1.method1508(arg0);
	}
}
