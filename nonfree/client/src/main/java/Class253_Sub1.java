import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class253_Sub1 extends Class253 implements Runnable {

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
	public int anInt7560 = -1;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
	private boolean aBoolean541 = true;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!hb;")
	private final Class126_Sub1 aClass126_Sub1_1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class253_Sub1(@OriginalArg(0) Class126_Sub1 arg0) {
		this.aClass126_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean541) {
			this.aClass126_Sub1_1.method3480(this);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public void method6314() {
		this.aBoolean541 = false;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
	public void method6315() {
		(new Thread(this, "a")).start();
	}
}
