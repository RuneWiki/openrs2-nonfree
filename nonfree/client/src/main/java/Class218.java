import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class218 {

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
	private final int anInt5963;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	public final int anInt5967;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(II)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5963 = arg0;
		this.anInt5967 = arg1;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)I")
	public int method5394() {
		return this.anInt5963;
	}

	@OriginalMember(owner = "client!mga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
