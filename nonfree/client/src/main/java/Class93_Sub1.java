import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class93_Sub1 extends Class93 implements Runnable {

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
	public int anInt2151 = -1;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "Lclient!tr;")
	private final Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!tr;)V")
	public Class93_Sub1(@OriginalArg(0) Class10_Sub2 arg0) {
		this.aClass10_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean161) {
			this.aClass10_Sub2_1.method5388(this);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	public void method1993() {
		this.aBoolean161 = false;
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public void method1996() {
		(new Thread(this, "a")).start();
	}
}
