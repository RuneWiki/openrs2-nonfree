import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "Lclient!vj;")
	public Class6_Sub2 aClass6_Sub2_1;

	static {
		new Class242(" days.", " Tage.", " jours.", " dias.");
		new Class242("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIIILclient!vj;)V")
	public Class6_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class6_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static428.method5505(arg0, arg1));
		this.aClass6_Sub2_1 = arg10;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)I")
	@Override
	public int method4752() {
		return 0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return 0;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return 0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return 0;
	}
}
