import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class235 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	public final int anInt6547;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V")
	public Class235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6547 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
