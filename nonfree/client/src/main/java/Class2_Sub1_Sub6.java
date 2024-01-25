import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!wt", name = "R", descriptor = "Lclient!ah;")
	public final Class8 aClass8_4;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "Z")
	private final boolean aBoolean507;

	static {
		new Class198("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
		new Class198("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIIZIIIIIII)V")
	public Class2_Sub1_Sub6(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt2983 == 1, Static420.method1206(arg13, arg12));
		this.aClass8_4 = new Class8(arg0, arg1, arg12, arg13, super.aByte105, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean507 = arg1.anInt3001 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		this.aClass8_4.method152(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aClass8_4.anInt196;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		@Pc(23) Class57 local23 = this.aClass8_4.method155(super.anInt7500, arg0, true, true, 262144, super.anInt7502);
		if (local23 != null) {
			this.aClass8_4.method156(super.aShort106, arg0, false, local23, super.aShort107, super.aShort104, super.aShort105);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aClass8_4.anInt215;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		this.aClass8_4.method154(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z)I")
	@Override
	public int method6031() {
		return this.aClass8_4.method157();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return this.aClass8_4.anInt219;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aClass8_4.method161();
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass8_4.method155(super.anInt7500, arg0, false, false, 131072, super.anInt7502);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class29 local28 = arg0.method5866();
			local28.U(super.anInt7500, super.anInt7501, super.anInt7502);
			return local16.method6071(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		@Pc(16) Class57 local16 = this.aClass8_4.method155(super.anInt7500, arg0, true, false, 2048, super.anInt7502);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class29 local23 = arg0.method5866();
		local23.U(super.anInt7500, super.anInt7501, super.anInt7502);
		@Pc(37) Class88_Sub2 local37 = null;
		if (this.aBoolean507) {
			local37 = Static232.method3033(1);
		}
		if (this.aClass8_4.aClass88_Sub6_1 == null) {
			local16.method6060(local23, local37 == null ? null : local37.aClass88_Sub8Array1[0], 0);
		} else {
			@Pc(67) Class255 local67 = this.aClass8_4.aClass88_Sub6_1.method5045();
			arg0.method5869(local16, local67, local23, local37 == null ? null : local37.aClass88_Sub8Array1[0]);
		}
		this.aClass8_4.method156(super.aShort106, arg0, true, local16, super.aShort107, super.aShort104, super.aShort105);
		return local37;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.aClass8_4.method155(0, arg0, false, false, arg1, 0);
	}
}
