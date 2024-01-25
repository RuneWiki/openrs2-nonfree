import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class316 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	private final int anInt8882;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
	public Class316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8882 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	public int method7072() {
		return this.anInt8882;
	}
}
