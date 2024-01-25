import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class135_Sub1 extends Class135 implements Runnable {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	public int anInt6982 = -1;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Z")
	private boolean aBoolean474 = true;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "Lclient!jv;")
	private final Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!jv;)V")
	public Class135_Sub1(@OriginalArg(0) Class12_Sub2 arg0) {
		this.aClass12_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean474) {
			this.aClass12_Sub2_1.method3113(this);
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
	public void method5695() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public void method5696() {
		this.aBoolean474 = false;
	}
}
