import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class41 {

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
	private final int anInt941;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(II)V")
	public Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt941 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	public int method919() {
		return this.anInt941;
	}

	@OriginalMember(owner = "client!cs", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
