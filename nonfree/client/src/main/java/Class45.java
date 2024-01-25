import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class45 {

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
	public final int anInt1158;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(I)V")
	public Class45(@OriginalArg(0) int arg0) {
		this.anInt1158 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
