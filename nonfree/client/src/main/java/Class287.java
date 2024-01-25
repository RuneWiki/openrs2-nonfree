import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class287 {

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	private final int anInt8085;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public final int anInt8084;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V")
	public Class287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8085 = arg0;
		this.anInt8084 = arg1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
	public int method6360() {
		return this.anInt8085;
	}

	@OriginalMember(owner = "client!rl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
