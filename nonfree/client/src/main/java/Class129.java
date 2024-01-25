import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class129 {

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
	public final int anInt3357;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	private final int anInt3356;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(II)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3357 = arg1;
		this.anInt3356 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
	public int method2698() {
		return this.anInt3356;
	}
}
