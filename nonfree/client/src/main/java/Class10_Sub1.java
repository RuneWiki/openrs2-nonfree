import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class10_Sub1 extends Class10 implements Runnable {

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Z")
	private boolean aBoolean349 = true;

	@OriginalMember(owner = "client!li", name = "z", descriptor = "I")
	public int anInt3607 = -1;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Lclient!dk;")
	private final Class54_Sub2 aClass54_Sub2_1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!dk;)V")
	public Class10_Sub1(@OriginalArg(0) Class54_Sub2 arg0) {
		this.aClass54_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public void method2937() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	public void method2938() {
		this.aBoolean349 = false;
	}

	@OriginalMember(owner = "client!li", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean349) {
			this.aClass54_Sub2_1.method1125(this);
		}
	}
}
