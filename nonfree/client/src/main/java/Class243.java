import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class243 {

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
	private final int anInt7618;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(II)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7618 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)I")
	public int method6388() {
		return this.anInt7618;
	}
}
