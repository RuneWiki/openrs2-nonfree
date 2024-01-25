import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class105 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public final int anInt2549;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V")
	public Class105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2549 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
