import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2_Sub1 extends Class2 implements Runnable {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public int anInt32 = -1;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!oi;")
	private final Class158_Sub2 aClass158_Sub2_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!oi;)V")
	public Class2_Sub1(@OriginalArg(0) Class158_Sub2 arg0) {
		this.aClass158_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean1) {
			this.aClass158_Sub2_1.method5361(this);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
	public void method48() {
		this.aBoolean1 = false;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public void method49() {
		(new Thread(this, "a")).start();
	}
}
