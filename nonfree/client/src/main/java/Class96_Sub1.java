import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class96_Sub1 extends Class96 implements Runnable {

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "Z")
	private boolean aBoolean660 = true;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
	public int anInt6692 = -1;

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "Lclient!gh;")
	private final Class42_Sub2 aClass42_Sub2_1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!gh;)V")
	public Class96_Sub1(@OriginalArg(0) Class42_Sub2 arg0) {
		this.aClass42_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public void method5598() {
		this.aBoolean660 = false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public void method5599() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!wj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean660) {
			this.aClass42_Sub2_1.method2041(this);
		}
	}
}
