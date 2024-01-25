import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class120_Sub1 extends Class120 implements Runnable {

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "Z")
	private boolean aBoolean483 = true;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
	public int anInt5366 = -1;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Lclient!fc;")
	private final Class70_Sub1 aClass70_Sub1_1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class120_Sub1(@OriginalArg(0) Class70_Sub1 arg0) {
		this.aClass70_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
	public void method4109() {
		this.aBoolean483 = false;
	}

	@OriginalMember(owner = "client!pg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean483) {
			this.aClass70_Sub1_1.method1818(this);
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(B)V")
	public void method4112() {
		(new Thread(this, "a")).start();
	}
}
