import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class146 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
	private final int anInt3600;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V")
	public Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3600 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
	public int method2858() {
		return this.anInt3600;
	}
}
