import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class69_Sub1 extends Class69 implements Runnable {

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	public int anInt3081 = -1;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Lclient!ul;")
	private final Class37_Sub2 aClass37_Sub2_1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ul;)V")
	public Class69_Sub1(@OriginalArg(0) Class37_Sub2 arg0) {
		this.aClass37_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	public void method2442() {
		this.aBoolean240 = false;
	}

	@OriginalMember(owner = "client!hk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean240) {
			this.aClass37_Sub2_1.method5294(this);
		}
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	public void method2443() {
		(new Thread(this, "a")).start();
	}
}
