import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public final class Class78_Sub1 extends Class78 implements Runnable {

	@OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
	public int anInt7415 = -1;

	@OriginalMember(owner = "client!qga", name = "x", descriptor = "Z")
	private boolean aBoolean528 = true;

	@OriginalMember(owner = "client!qga", name = "s", descriptor = "Lclient!dt;")
	private final Class40_Sub1 aClass40_Sub1_1;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class78_Sub1(@OriginalArg(0) Class40_Sub1 arg0) {
		this.aClass40_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
	public void method6140() {
		this.aBoolean528 = false;
	}

	@OriginalMember(owner = "client!qga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean528) {
			this.aClass40_Sub1_1.method2285(this);
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V")
	public void method6143() {
		(new Thread(this, "a")).start();
	}
}
