import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class212 {

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
	private final int anInt6021;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(II)V")
	public Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6021 = arg0;
	}

	@OriginalMember(owner = "client!qt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)I")
	public int method4984() {
		return this.anInt6021;
	}
}
