import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class43 implements Interface8 {

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
	public final int anInt1053;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class43(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1053 = arg1;
	}

	@OriginalMember(owner = "client!cq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
