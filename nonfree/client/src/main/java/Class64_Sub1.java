import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class64_Sub1 extends Class64 implements Runnable {

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public int anInt1948 = -1;

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!wi;")
	private final Class28_Sub2 aClass28_Sub2_1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!wi;)V")
	public Class64_Sub1(@OriginalArg(0) Class28_Sub2 arg0) {
		this.aClass28_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean129) {
			this.aClass28_Sub2_1.method5725(this);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public void method1792() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public void method1793() {
		this.aBoolean129 = false;
	}
}
