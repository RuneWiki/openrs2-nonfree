import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class121_Sub1 extends Class121 implements Runnable {

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "Z")
	private boolean aBoolean488 = true;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public int anInt7780 = -1;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "Lclient!uu;")
	private final Class120_Sub2 aClass120_Sub2_1;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!uu;)V")
	public Class121_Sub1(@OriginalArg(0) Class120_Sub2 arg0) {
		this.aClass120_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
	public void method6355() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	public void method6359() {
		this.aBoolean488 = false;
	}

	@OriginalMember(owner = "client!wh", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean488) {
			this.aClass120_Sub2_1.method6084(this);
		}
	}
}
