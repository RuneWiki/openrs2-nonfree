import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class337 {

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	private final int anInt9243;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
	public final int anInt9241;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(II)V")
	public Class337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9243 = arg0;
		this.anInt9241 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I")
	public int method7976() {
		return this.anInt9243;
	}
}
