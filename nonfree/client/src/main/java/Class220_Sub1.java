import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class220_Sub1 extends Class220 implements Runnable {

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
	public int anInt7290 = -1;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "Z")
	private boolean aBoolean491 = true;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "Lclient!gj;")
	private final Class92_Sub1 aClass92_Sub1_1;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class220_Sub1(@OriginalArg(0) Class92_Sub1 arg0) {
		this.aClass92_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
	public void method5608() {
		this.aBoolean491 = false;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)V")
	public void method5611() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!vs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean491) {
			this.aClass92_Sub1_1.method2135(this);
		}
	}
}
