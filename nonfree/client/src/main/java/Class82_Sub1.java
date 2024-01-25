import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class82_Sub1 extends Class82 implements Runnable {

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
	public int anInt2472 = -1;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "Lclient!li;")
	private final Class28_Sub2 aClass28_Sub2_1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!li;)V")
	public Class82_Sub1(@OriginalArg(0) Class28_Sub2 arg0) {
		this.aClass28_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean225) {
			this.aClass28_Sub2_1.method3477(this);
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	public void method2395() {
		this.aBoolean225 = false;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	public void method2399() {
		(new Thread(this, "a")).start();
	}
}
