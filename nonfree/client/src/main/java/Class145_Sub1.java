import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class145_Sub1 extends Class145 implements Runnable {

	@OriginalMember(owner = "client!t", name = "j", descriptor = "Z")
	private boolean aBoolean538 = true;

	@OriginalMember(owner = "client!t", name = "r", descriptor = "I")
	public int anInt6010 = -1;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!kr;")
	private final Class101_Sub2 aClass101_Sub2_1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!kr;)V")
	public Class145_Sub1(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aClass101_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean538) {
			this.aClass101_Sub2_1.method3256(this);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public void method5241() {
		this.aBoolean538 = false;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
	public void method5245() {
		(new Thread(this, "a")).start();
	}
}
