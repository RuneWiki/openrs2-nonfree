import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class296 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
	private final int anInt8506;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(II)V")
	public Class296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8506 = arg0;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)I")
	public int method6960() {
		return this.anInt8506;
	}

	@OriginalMember(owner = "client!uv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
