import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class41 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public int anInt1233;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	private int anInt1234;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(II)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1233 = arg0;
		this.anInt1234 = Static154.anInt2852;
	}

	@OriginalMember(owner = "client!dn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		Static154.method2377(this.anInt1233, this.anInt1234);
		super.finalize();
	}
}
