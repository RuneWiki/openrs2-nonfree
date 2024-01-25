import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class17 {

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public final int anInt444;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(II)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt444 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
