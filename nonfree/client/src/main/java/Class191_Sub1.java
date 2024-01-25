import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class191_Sub1 extends Class191 implements Runnable {

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	public int anInt5887 = -1;

	@OriginalMember(owner = "client!uh", name = "o", descriptor = "Z")
	private boolean aBoolean448 = true;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!si;")
	private final Class137_Sub2 aClass137_Sub2_1;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class191_Sub1(@OriginalArg(0) Class137_Sub2 arg0) {
		this.aClass137_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public void method5264() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
	public void method5266() {
		this.aBoolean448 = false;
	}

	@OriginalMember(owner = "client!uh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean448) {
			this.aClass137_Sub2_1.method4830(this);
		}
	}
}
