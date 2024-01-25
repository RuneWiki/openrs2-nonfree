import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class54_Sub1 extends Class54 implements Runnable {

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	public int anInt1889 = -1;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Z")
	private boolean aBoolean118 = true;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!wi;")
	private final Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!wi;)V")
	public Class54_Sub1(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public void method1373() {
		this.aBoolean118 = false;
	}

	@OriginalMember(owner = "client!df", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean118) {
			this.aClass9_Sub2_1.method6070(this);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public void method1374() {
		(new Thread(this, "a")).start();
	}
}
