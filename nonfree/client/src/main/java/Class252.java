import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class252 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public final int anInt7316;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(II)V")
	public Class252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7316 = arg0;
	}

	@OriginalMember(owner = "client!pq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
