import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class8_Sub3_Sub3 extends Class8_Sub3 implements Interface4 {

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!vn;")
	public Class8_Sub3 aClass8_Sub3_1;

	static {
		new Class15("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(IIIIIIIIIILclient!vn;)V")
	public Class8_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class8_Sub3 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static296.method3850(arg1, arg0));
		this.aClass8_Sub3_1 = arg10;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return 0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
	}

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)I")
	@Override
	public int method5882() {
		return 0;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return 0;
	}
}
