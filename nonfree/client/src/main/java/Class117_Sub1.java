import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class117_Sub1 extends Class117 implements Runnable {

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "Z")
	private boolean aBoolean354 = true;

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
	public int anInt5371 = -1;

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "Lclient!hb;")
	private final Class57_Sub2 aClass57_Sub2_1;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class117_Sub1(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aClass57_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V")
	public void method4780() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)V")
	public void method4781() {
		this.aBoolean354 = false;
	}

	@OriginalMember(owner = "client!rn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean354) {
			this.aClass57_Sub2_1.method2415(this);
		}
	}
}
