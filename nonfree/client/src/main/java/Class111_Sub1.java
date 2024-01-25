import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class111_Sub1 extends Class111 implements Runnable {

	@OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
	private boolean aBoolean733 = true;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
	public int anInt6709 = -1;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Lclient!mb;")
	private final Class58_Sub2 aClass58_Sub2_1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!mb;)V")
	public Class111_Sub1(@OriginalArg(0) Class58_Sub2 arg0) {
		this.aClass58_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
	public void method5262() {
		this.aBoolean733 = false;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	public void method5264() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!uf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean733) {
			this.aClass58_Sub2_1.method3499(this);
		}
	}
}
