import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public final class Class136 {

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
	public final int anInt4034;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(II)V")
	public Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4034 = arg0;
	}

	@OriginalMember(owner = "client!hfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
