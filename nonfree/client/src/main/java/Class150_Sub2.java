import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class150_Sub2 extends Class150 implements Interface1 {

	@OriginalMember(owner = "client!wba", name = "H", descriptor = "Lclient!ui;")
	private final Class289 aClass289_18;

	static {
		new Class114("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!ag;Lclient!ui;Z)V")
	public Class150_Sub2(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class289 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass289_18 = arg1;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7521() {
		return super.method7521();
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
	@Override
	public void method7527() {
		super.method7527();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method7519() {
		return super.method7519();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Lclient!ui;")
	@Override
	public Class289 method7529() {
		return this.aClass289_18;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V")
	@Override
	public void method7526(@OriginalArg(1) int arg0) {
		super.method7526(this.aClass289_18.anInt8371 * arg0);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)I")
	@Override
	public int method7517() {
		return super.method7517();
	}
}
