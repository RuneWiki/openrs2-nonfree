import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class261 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public final int anInt7428;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	public Class261(@OriginalArg(0) int arg0) {
		this.anInt7428 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
