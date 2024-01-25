import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class45 {

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	public final int anInt1405;

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
	private final int anInt1404;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(II)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1405 = arg1;
		this.anInt1404 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
	public int method1410() {
		return this.anInt1404;
	}

	@OriginalMember(owner = "client!cba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
