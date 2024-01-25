import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class111_Sub1 extends Class111 implements Runnable {

	@OriginalMember(owner = "client!gba", name = "p", descriptor = "Z")
	private boolean aBoolean271 = true;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	public int anInt2980 = -1;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "Lclient!wr;")
	private final Class40_Sub2 aClass40_Sub2_1;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class111_Sub1(@OriginalArg(0) Class40_Sub2 arg0) {
		this.aClass40_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V")
	public void method2792() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
	public void method2794() {
		this.aBoolean271 = false;
	}

	@OriginalMember(owner = "client!gba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean271) {
			this.aClass40_Sub2_1.method8222(this);
		}
	}
}
