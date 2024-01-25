import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class14 {

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	public final int anInt222;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(II)V")
	public Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt222 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
