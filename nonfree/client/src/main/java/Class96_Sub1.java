import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class96_Sub1 extends Class96 implements Runnable {

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public int anInt3342 = -1;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!ib;")
	private final Class43_Sub2 aClass43_Sub2_1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!ib;)V")
	public Class96_Sub1(@OriginalArg(0) Class43_Sub2 arg0) {
		this.aClass43_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public void method2997() {
		this.aBoolean208 = false;
	}

	@OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean208) {
			this.aClass43_Sub2_1.method3645(this);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public void method3000() {
		(new Thread(this, "a")).start();
	}
}
