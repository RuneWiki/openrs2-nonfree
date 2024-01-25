import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class288_Sub1 extends Class288 implements Runnable {

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Z")
	private boolean aBoolean643 = true;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
	public int anInt8656 = -1;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!md;")
	private final Class58_Sub2 aClass58_Sub2_1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!md;)V")
	public Class288_Sub1(@OriginalArg(0) Class58_Sub2 arg0) {
		this.aClass58_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public void method7228() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public void method7229() {
		this.aBoolean643 = false;
	}

	@OriginalMember(owner = "client!sl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean643) {
			this.aClass58_Sub2_1.method5098(this);
		}
	}
}
