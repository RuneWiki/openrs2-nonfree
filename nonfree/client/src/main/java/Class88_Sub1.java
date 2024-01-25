import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class88_Sub1 extends Class88 implements Runnable {

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Z")
	private boolean aBoolean281 = true;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
	public int anInt4172 = -1;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "Lclient!cj;")
	private final Class38_Sub1 aClass38_Sub1_1;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!cj;)V")
	public Class88_Sub1(@OriginalArg(0) Class38_Sub1 arg0) {
		this.aClass38_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean281) {
			this.aClass38_Sub1_1.method578(this);
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public void method3649() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void method3651() {
		this.aBoolean281 = false;
	}
}
