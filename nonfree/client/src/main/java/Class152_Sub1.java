import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class152_Sub1 extends Class152 implements Runnable {

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "Z")
	private boolean aBoolean288 = true;

	@OriginalMember(owner = "client!lt", name = "z", descriptor = "I")
	public int anInt3748 = -1;

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "Lclient!qc;")
	private final Class29_Sub2 aClass29_Sub2_1;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!qc;)V")
	public Class152_Sub1(@OriginalArg(0) Class29_Sub2 arg0) {
		this.aClass29_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
	public void method3443() {
		this.aBoolean288 = false;
	}

	@OriginalMember(owner = "client!lt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean288) {
			this.aClass29_Sub2_1.method4198(this);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
	public void method3446() {
		(new Thread(this, "a")).start();
	}
}
