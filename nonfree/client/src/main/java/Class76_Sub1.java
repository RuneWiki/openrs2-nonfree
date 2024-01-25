import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class76_Sub1 extends Class76 implements Runnable {

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public int anInt5460 = -1;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "Z")
	private boolean aBoolean450 = true;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!id;")
	private final Class91_Sub1 aClass91_Sub1_1;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!id;)V")
	public Class76_Sub1(@OriginalArg(0) Class91_Sub1 arg0) {
		this.aClass91_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean450) {
			this.aClass91_Sub1_1.method2364(this);
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
	public void method4839() {
		this.aBoolean450 = false;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V")
	public void method4841() {
		(new Thread(this, "a")).start();
	}
}
