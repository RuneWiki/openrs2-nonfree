import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class17_Sub1 extends Class17 implements Runnable {

	@OriginalMember(owner = "client!au", name = "m", descriptor = "Z")
	private boolean aBoolean29 = true;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "I")
	public int anInt354 = -1;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "Lclient!ah;")
	private final Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class17_Sub1(@OriginalArg(0) Class8_Sub1 arg0) {
		this.aClass8_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)V")
	public void method283() {
		this.aBoolean29 = false;
	}

	@OriginalMember(owner = "client!au", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean29) {
			this.aClass8_Sub1_1.method81(this);
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
	public void method285() {
		(new Thread(this, "a")).start();
	}
}
