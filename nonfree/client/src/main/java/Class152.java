import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public final class Class152 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
	public final int anInt3713;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(II)V")
	public Class152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3713 = arg1;
	}

	@OriginalMember(owner = "client!hfa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
