import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class34_Sub1 extends Class34 implements Runnable {

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt1159 = -1;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!fl;")
	private final Class22_Sub2 aClass22_Sub2_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!fl;)V")
	public Class34_Sub1(@OriginalArg(0) Class22_Sub2 arg0) {
		this.aClass22_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean101) {
			this.aClass22_Sub2_1.method1903(this);
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public void method847() {
		this.aBoolean101 = false;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
	public void method849() {
		(new Thread(this, "a")).start();
	}
}
