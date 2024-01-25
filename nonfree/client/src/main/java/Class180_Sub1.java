import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class180_Sub1 extends Class180 implements Runnable {

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
	public int anInt5758 = -1;

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "Z")
	private boolean aBoolean372 = true;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!ae;")
	private final Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class180_Sub1(@OriginalArg(0) Class7_Sub1 arg0) {
		this.aClass7_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public void method4811() {
		this.aBoolean372 = false;
	}

	@OriginalMember(owner = "client!ln", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean372) {
			this.aClass7_Sub1_1.method510(this);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	public void method4817() {
		(new Thread(this, "a")).start();
	}
}
