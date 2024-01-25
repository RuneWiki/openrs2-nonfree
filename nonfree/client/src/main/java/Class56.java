import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class56 {

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
	private final int anInt1700;

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
	public final int anInt1697;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(II)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1700 = arg0;
		this.anInt1697 = arg1;
	}

	@OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I")
	public int method1571() {
		return this.anInt1700;
	}
}
