import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class17_Sub1 extends Class17 implements Runnable {

	@OriginalMember(owner = "client!au", name = "j", descriptor = "I")
	public int anInt301 = -1;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "Z")
	private boolean aBoolean18 = true;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "Lclient!ms;")
	private final Class143_Sub1 aClass143_Sub1_1;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!ms;)V")
	public Class17_Sub1(@OriginalArg(0) Class143_Sub1 arg0) {
		this.aClass143_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean18) {
			this.aClass143_Sub1_1.method3641(this);
		}
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V")
	public void method249() {
		this.aBoolean18 = false;
	}

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
	public void method250() {
		(new Thread(this, "a")).start();
	}
}
