import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public final class Class177_Sub1 extends Class177 implements Runnable {

	@OriginalMember(owner = "client!nw", name = "s", descriptor = "Z")
	private boolean aBoolean354 = true;

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "I")
	public int anInt5197 = -1;

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "Lclient!bw;")
	private final Class32_Sub1 aClass32_Sub1_1;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!bw;)V")
	public Class177_Sub1(@OriginalArg(0) Class32_Sub1 arg0) {
		this.aClass32_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "(I)V")
	public void method4388() {
		this.aBoolean354 = false;
	}

	@OriginalMember(owner = "client!nw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean354) {
			this.aClass32_Sub1_1.method811(this);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
	public void method4389() {
		(new Thread(this, "a")).start();
	}
}
