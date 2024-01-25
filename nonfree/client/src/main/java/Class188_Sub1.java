import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class188_Sub1 extends Class188 implements Runnable {

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "Z")
	private boolean aBoolean381 = true;

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
	public int anInt5145 = -1;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!dn;")
	private final Class51_Sub1 aClass51_Sub1_1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!dn;)V")
	public Class188_Sub1(@OriginalArg(0) Class51_Sub1 arg0) {
		this.aClass51_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public void method4428() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!qf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean381) {
			this.aClass51_Sub1_1.method1162(this);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public void method4430() {
		this.aBoolean381 = false;
	}
}
