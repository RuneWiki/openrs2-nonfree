import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class18_Sub1 extends Class18 implements Runnable {

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public int anInt6455 = -1;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "Z")
	private boolean aBoolean425 = true;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Lclient!hn;")
	private final Class77_Sub1 aClass77_Sub1_1;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!hn;)V")
	public Class18_Sub1(@OriginalArg(0) Class77_Sub1 arg0) {
		this.aClass77_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	public void method5137() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
	public void method5138() {
		this.aBoolean425 = false;
	}

	@OriginalMember(owner = "client!to", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean425) {
			this.aClass77_Sub1_1.method2242(this);
		}
	}
}
