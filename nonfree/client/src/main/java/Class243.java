import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class243 {

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
	public final int anInt7052;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(II)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7052 = arg0;
	}

	@OriginalMember(owner = "client!qba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
