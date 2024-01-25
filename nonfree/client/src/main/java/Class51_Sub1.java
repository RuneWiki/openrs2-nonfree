import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class51_Sub1 extends Class51 implements Runnable {

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
	public int anInt8064 = -1;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "Z")
	private boolean aBoolean665 = true;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "Lclient!io;")
	private final Class89_Sub2 aClass89_Sub2_1;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!io;)V")
	public Class51_Sub1(@OriginalArg(0) Class89_Sub2 arg0) {
		this.aClass89_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	public void method6651() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	public void method6652() {
		this.aBoolean665 = false;
	}

	@OriginalMember(owner = "client!pq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean665) {
			this.aClass89_Sub2_1.method3873(this);
		}
	}
}
