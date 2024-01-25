import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class180 implements Interface2 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public final int anInt5498;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class180(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5498 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
