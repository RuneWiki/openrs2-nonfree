import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class183_Sub1 extends Class183 implements Runnable {

	@OriginalMember(owner = "client!og", name = "q", descriptor = "Z")
	private boolean aBoolean458 = true;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "I")
	public int anInt5005 = -1;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Lclient!os;")
	private final Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class183_Sub1(@OriginalArg(0) Class12_Sub2 arg0) {
		this.aClass12_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean458) {
			this.aClass12_Sub2_1.method4095(this);
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
	public void method3982() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public void method3984() {
		this.aBoolean458 = false;
	}
}
