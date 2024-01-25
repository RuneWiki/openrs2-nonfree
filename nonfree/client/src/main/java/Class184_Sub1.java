import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class184_Sub1 extends Class184 implements Runnable {

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
	public int anInt4555 = -1;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "Z")
	private boolean aBoolean339 = true;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Lclient!bo;")
	private final Class28_Sub1 aClass28_Sub1_1;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class184_Sub1(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aClass28_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)V")
	public void method3631() {
		this.aBoolean339 = false;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public void method3632() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!nt", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean339) {
			this.aClass28_Sub1_1.method495(this);
		}
	}
}
