import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class109_Sub1 extends Class109 implements Runnable {

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Z")
	private boolean aBoolean473 = true;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	public int anInt6358 = -1;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!iu;")
	private final Class137_Sub1 aClass137_Sub1_1;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!iu;)V")
	public Class109_Sub1(@OriginalArg(0) Class137_Sub1 arg0) {
		this.aClass137_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public void method5414() {
		this.aBoolean473 = false;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public void method5416() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!of", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean473) {
			this.aClass137_Sub1_1.method3396(this);
		}
	}
}
