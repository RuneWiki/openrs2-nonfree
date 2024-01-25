import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class37_Sub1 extends Class37 implements Runnable {

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
	public int anInt4353 = -1;

	@OriginalMember(owner = "client!ls", name = "B", descriptor = "Z")
	private boolean aBoolean324 = true;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "Lclient!tr;")
	private final Class16_Sub2 aClass16_Sub2_1;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!tr;)V")
	public Class37_Sub1(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aClass16_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V")
	public void method3289() {
		this.aBoolean324 = false;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
	public void method3291() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!ls", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean324) {
			this.aClass16_Sub2_1.method5264(this);
		}
	}
}
