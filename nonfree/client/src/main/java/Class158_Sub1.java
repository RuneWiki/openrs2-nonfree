import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class158_Sub1 extends Class158 implements Runnable {

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Z")
	private boolean aBoolean445 = true;

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
	public int anInt6002 = -1;

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "Lclient!dn;")
	private final Class45_Sub1 aClass45_Sub1_1;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!dn;)V")
	public Class158_Sub1(@OriginalArg(0) Class45_Sub1 arg0) {
		this.aClass45_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V")
	public void method5098() {
		this.aBoolean445 = false;
	}

	@OriginalMember(owner = "client!tm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean445) {
			this.aClass45_Sub1_1.method1352(this);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
	public void method5099() {
		(new Thread(this, "a")).start();
	}
}
