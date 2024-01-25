import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class25_Sub1 extends Class25 implements Runnable {

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
	public int anInt615 = -1;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "Lclient!tu;")
	private final Class45_Sub2 aClass45_Sub2_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class25_Sub1(@OriginalArg(0) Class45_Sub2 arg0) {
		this.aClass45_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	public void method477() {
		this.aBoolean59 = false;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V")
	public void method479() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!bj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean59) {
			this.aClass45_Sub2_1.method5061(this);
		}
	}
}
