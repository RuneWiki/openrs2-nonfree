import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class185 {

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
	private final int anInt6332;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
	public final int anInt6331;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
	public Class185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6332 = arg0;
		this.anInt6331 = arg1;
	}

	@OriginalMember(owner = "client!lga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)I")
	public int method5306() {
		return this.anInt6332;
	}
}
