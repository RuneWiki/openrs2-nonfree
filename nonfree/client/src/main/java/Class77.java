import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class77 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
	private final int anInt2336;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(II)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2336 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(B)I")
	public int method2113() {
		return this.anInt2336;
	}
}
