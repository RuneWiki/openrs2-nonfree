import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class123 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
	public final int anInt4227;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	private final int anInt4226;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(II)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4227 = arg1;
		this.anInt4226 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)I")
	public int method3400() {
		return this.anInt4226;
	}

	@OriginalMember(owner = "client!hga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
