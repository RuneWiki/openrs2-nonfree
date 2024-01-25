import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class70 {

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public final int anInt1788;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	private final int anInt1787;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(II)V")
	public Class70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1788 = arg1;
		this.anInt1787 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
	public int method1475() {
		return this.anInt1787;
	}
}
