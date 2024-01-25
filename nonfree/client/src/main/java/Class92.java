import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class92 {

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
	private final int anInt2834;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(II)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2834 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I")
	public int method2373() {
		return this.anInt2834;
	}
}
