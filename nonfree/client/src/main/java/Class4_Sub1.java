import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 implements Runnable {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public int anInt72 = -1;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
	private boolean aBoolean8 = true;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!wg;")
	private final Class103_Sub2 aClass103_Sub2_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class4_Sub1(@OriginalArg(0) Class103_Sub2 arg0) {
		this.aClass103_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method35() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public void method36() {
		this.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!ac", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean8) {
			this.aClass103_Sub2_1.method5646(this);
		}
	}
}
