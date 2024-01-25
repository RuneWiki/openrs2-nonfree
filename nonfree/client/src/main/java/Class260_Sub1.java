import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class260_Sub1 extends Class260 implements Runnable {

	@OriginalMember(owner = "client!wba", name = "s", descriptor = "I")
	public int anInt9444 = -1;

	@OriginalMember(owner = "client!wba", name = "r", descriptor = "Z")
	private boolean aBoolean724 = true;

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Lclient!vaa;")
	private final Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lclient!vaa;)V")
	public Class260_Sub1(@OriginalArg(0) Class1_Sub1 arg0) {
		this.aClass1_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!wba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean724) {
			this.aClass1_Sub1_1.method7449(this);
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)V")
	public void method7707() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
	public void method7710() {
		this.aBoolean724 = false;
	}
}
