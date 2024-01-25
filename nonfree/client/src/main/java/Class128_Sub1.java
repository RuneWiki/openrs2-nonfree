import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class128_Sub1 extends Class128 implements Runnable {

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public int anInt3700 = -1;

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Z")
	private boolean aBoolean281 = true;

	@OriginalMember(owner = "client!lb", name = "n", descriptor = "Lclient!ih;")
	private final Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class128_Sub1(@OriginalArg(0) Class11_Sub1 arg0) {
		this.aClass11_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean281) {
			this.aClass11_Sub1_1.method2662(this);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method3337() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
	public void method3338() {
		this.aBoolean281 = false;
	}
}
