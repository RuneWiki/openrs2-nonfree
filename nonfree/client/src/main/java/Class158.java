import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public final class Class158 {

	@OriginalMember(owner = "client!js", name = "d", descriptor = "I")
	public final int anInt4745;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(II)V")
	public Class158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4745 = arg0;
	}

	@OriginalMember(owner = "client!js", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
