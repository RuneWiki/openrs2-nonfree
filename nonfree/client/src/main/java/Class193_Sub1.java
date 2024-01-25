import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class193_Sub1 extends Class193 implements Runnable {

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "Z")
	private boolean aBoolean420 = true;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
	public int anInt5919 = -1;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "Lclient!ae;")
	private final Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class193_Sub1(@OriginalArg(0) Class6_Sub1 arg0) {
		this.aClass6_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean420) {
			this.aClass6_Sub1_1.method144(this);
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
	public void method4725() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
	public void method4727() {
		this.aBoolean420 = false;
	}
}
