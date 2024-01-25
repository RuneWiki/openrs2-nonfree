import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class132_Sub1 extends Class132 implements Runnable {

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
	public int anInt4645 = -1;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "Z")
	private boolean aBoolean401 = true;

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!mo;")
	private final Class80_Sub2 aClass80_Sub2_1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!mo;)V")
	public Class132_Sub1(@OriginalArg(0) Class80_Sub2 arg0) {
		this.aClass80_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public void method3995() {
		this.aBoolean401 = false;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	public void method3999() {
		(new Thread(this, "a")).start();
	}

	@OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean401) {
			this.aClass80_Sub2_1.method3931(this);
		}
	}
}
