import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class37_Sub1 extends Class37 implements Runnable {

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	public int anInt5271 = -1;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Z")
	private boolean aBoolean380 = true;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "Lclient!ch;")
	private final Class6_Sub1 aClass6_Sub1_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class37_Sub1(@OriginalArg(0) Class6_Sub1 arg0) {
		this.aClass6_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public void method4361() {
		this.aBoolean380 = false;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	public void method4363() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!pi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean380) {
			this.aClass6_Sub1_1.method906(this);
		}
	}
}
