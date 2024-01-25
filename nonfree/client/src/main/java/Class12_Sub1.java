import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class12_Sub1 extends Class12 implements Runnable {

	@OriginalMember(owner = "client!al", name = "u", descriptor = "I")
	public int anInt174 = -1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!al", name = "v", descriptor = "Lclient!rm;")
	private final Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!rm;)V")
	public Class12_Sub1(@OriginalArg(0) Class20_Sub1 arg0) {
		this.aClass20_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method176() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public void method177() {
		this.aBoolean6 = false;
	}

	@OriginalMember(owner = "client!al", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean6) {
			this.aClass20_Sub1_1.method4984(this);
		}
	}
}
