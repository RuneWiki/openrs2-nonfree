import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class25_Sub1 extends Class25 implements Runnable {

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
	public int anInt4730 = -1;

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "Z")
	private boolean aBoolean333 = true;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Lclient!ok;")
	private final Class155_Sub1 aClass155_Sub1_1;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class25_Sub1(@OriginalArg(0) Class155_Sub1 arg0) {
		this.aClass155_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	public void method4364() {
		this.aBoolean333 = false;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public void method4366() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!qe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean333) {
			this.aClass155_Sub1_1.method4060(this);
		}
	}
}
