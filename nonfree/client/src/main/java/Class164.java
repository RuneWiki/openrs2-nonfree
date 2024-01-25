import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public final class Class164 {

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
	public final int anInt4099;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(II)V")
	public Class164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4099 = arg0;
	}

	@OriginalMember(owner = "client!iga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
