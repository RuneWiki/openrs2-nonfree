import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class6_Sub1_Sub3 extends Class6_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!mj;")
	public Class6_Sub1 aClass6_Sub1_3;

	static {
		new Class242("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIIIILclient!mj;)V")
	public Class6_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub1 arg5) {
		super(arg2, arg3, arg4, Static275.method3709(arg1, arg0));
		this.aClass6_Sub1_3 = arg5;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I")
	@Override
	public int method5644() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!qa;B)Lclient!c;")
	@Override
	public Class7 method5646(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	@Override
	public void method5647() {
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	@Override
	public int method5648() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5645() {
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5642(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I")
	@Override
	public int method5649() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5643(@OriginalArg(1) Class30 arg0) {
	}
}
