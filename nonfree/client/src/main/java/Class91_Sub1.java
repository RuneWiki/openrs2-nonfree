import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class91_Sub1 extends Class91 implements Runnable {

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Z")
	private boolean aBoolean123 = true;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
	public int anInt2253 = -1;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Lclient!ph;")
	private final Class54_Sub2 aClass54_Sub2_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!ph;)V")
	public Class91_Sub1(@OriginalArg(0) Class54_Sub2 arg0) {
		this.aClass54_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean123) {
			this.aClass54_Sub2_1.method4353(this);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public void method1872() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V")
	public void method1874() {
		this.aBoolean123 = false;
	}
}
