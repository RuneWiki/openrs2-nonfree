import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class281 {

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
	public final int anInt7736;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V")
	public Class281(@OriginalArg(0) int arg0) {
		this.anInt7736 = arg0;
	}

	@OriginalMember(owner = "client!qda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
