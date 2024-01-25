import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class121_Sub1 extends Class121 implements Runnable {

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "Z")
	private boolean aBoolean409 = true;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	public int anInt5080 = -1;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!jl;")
	private final Class2_Sub2 aClass2_Sub2_1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!jl;)V")
	public Class121_Sub1(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass2_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public void method3973() {
		this.aBoolean409 = false;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public void method3974() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!pe", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean409) {
			this.aClass2_Sub2_1.method2566(this);
		}
	}
}
