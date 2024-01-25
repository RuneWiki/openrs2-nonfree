import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class172_Sub1 extends Class172 implements Runnable {

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
	public int anInt5189 = -1;

	@OriginalMember(owner = "client!qk", name = "r", descriptor = "Z")
	private boolean aBoolean385 = true;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Lclient!pi;")
	private final Class118_Sub1 aClass118_Sub1_1;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class172_Sub1(@OriginalArg(0) Class118_Sub1 arg0) {
		this.aClass118_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public void method4784() {
		this.aBoolean385 = false;
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)V")
	public void method4785() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!qk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean385) {
			this.aClass118_Sub1_1.method4519(this);
		}
	}
}
