import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class199_Sub1 extends Class199 implements Interface9 {

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	private int anInt5650;

	static {
		new Class7("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!kd;I[BIZ)V")
	public Class199_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5650 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method4692(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method5061(arg1, arg0);
		this.anInt5650 = 5123;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
	@Override
	public int method4694() {
		return this.anInt5650;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)J")
	@Override
	public long method4691() {
		return 0L;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)I")
	@Override
	public int method4693() {
		return super.anInt6063;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
	@Override
	protected void method5062() {
		super.aClass39_Sub2_37.method3160(this);
	}
}
