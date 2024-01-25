import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class361 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
	public final int anInt10749;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(II)V")
	public Class361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10749 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
