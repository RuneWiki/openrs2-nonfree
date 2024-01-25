import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class86_Sub1 extends Class86 implements Runnable {

	@OriginalMember(owner = "client!er", name = "p", descriptor = "I")
	public int anInt2373 = -1;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "Z")
	private boolean aBoolean151 = true;

	@OriginalMember(owner = "client!er", name = "s", descriptor = "Lclient!ec;")
	private final Class75_Sub1 aClass75_Sub1_1;

	static {
		new Class306("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!ec;)V")
	public Class86_Sub1(@OriginalArg(0) Class75_Sub1 arg0) {
		this.aClass75_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public void method1991() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!er", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean151) {
			this.aClass75_Sub1_1.method1785(this);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	public void method1993() {
		this.aBoolean151 = false;
	}
}
