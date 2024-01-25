import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class148 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public final int anInt4611;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4611 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
