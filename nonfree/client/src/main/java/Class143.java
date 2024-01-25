import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class143 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	public final int anInt4449;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V")
	public Class143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4449 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
