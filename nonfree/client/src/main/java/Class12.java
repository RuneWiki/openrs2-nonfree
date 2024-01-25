import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public final class Class12 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
	public final int anInt526;

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class12(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt526 = arg1;
	}

	@OriginalMember(owner = "client!afa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)I")
	public int method500() {
		return this.anInt526;
	}
}
