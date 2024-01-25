import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class71 {

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public final int anInt2623;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	private final int anInt2624;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2623 = arg1;
		this.anInt2624 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)I")
	public int method2221() {
		return this.anInt2624;
	}

	@OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
