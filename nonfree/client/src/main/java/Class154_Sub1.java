import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class154_Sub1 extends Class154 implements Runnable {

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
	private boolean aBoolean358 = true;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public int anInt5122 = -1;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Lclient!aaa;")
	private final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!aaa;)V")
	public Class154_Sub1(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aClass2_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public void method4333() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!kg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean358) {
			this.aClass2_Sub1_1.method200(this);
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public void method4335() {
		this.aBoolean358 = false;
	}
}
