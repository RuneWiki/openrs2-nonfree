import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public final class Class297 {

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
	public final int anInt7955;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(II)V")
	public Class297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7955 = arg1;
	}

	@OriginalMember(owner = "client!rw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
