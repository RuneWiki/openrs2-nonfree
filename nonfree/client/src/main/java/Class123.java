import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public final class Class123 {

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
	public final int anInt3564;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	private final int anInt3561;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3564 = arg1;
		this.anInt3561 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)I")
	public int method2952() {
		return this.anInt3561;
	}
}
