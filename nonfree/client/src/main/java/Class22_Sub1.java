import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class22_Sub1 extends Class22 implements Runnable {

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Z")
	private boolean aBoolean592 = true;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	public int anInt6963 = -1;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "Lclient!jd;")
	private final Class125_Sub1 aClass125_Sub1_1;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!jd;)V")
	public Class22_Sub1(@OriginalArg(0) Class125_Sub1 arg0) {
		this.aClass125_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public void method5455() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean592) {
			this.aClass125_Sub1_1.method2946(this);
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public void method5457() {
		this.aBoolean592 = false;
	}
}
