import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class275 {

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public final int anInt8349;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(II)V")
	public Class275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8349 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
