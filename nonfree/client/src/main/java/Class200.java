import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class200 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	private final int anInt5274;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	public final int anInt5279;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5274 = arg0;
		this.anInt5279 = arg1;
	}

	@OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	public int method4622() {
		return this.anInt5274;
	}
}
