import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class128_Sub1 extends Class128 implements Runnable {

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Z")
	private boolean aBoolean300 = true;

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	public int anInt3812 = -1;

	@OriginalMember(owner = "client!hg", name = "o", descriptor = "Lclient!kr;")
	private final Class175_Sub2 aClass175_Sub2_1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!kr;)V")
	public Class128_Sub1(@OriginalArg(0) Class175_Sub2 arg0) {
		this.aClass175_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!hg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean300) {
			this.aClass175_Sub2_1.method4165(this);
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
	public void method3308() {
		this.aBoolean300 = false;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
	public void method3309() {
		(new Thread(this, "a")).start();
	}
}
