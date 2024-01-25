import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class77 {

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public final int anInt1964;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	private final int anInt1965;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(II)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1964 = arg1;
		this.anInt1965 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
	public int method1792() {
		return this.anInt1965;
	}
}
