import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class287 {

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
	public final int anInt7793;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class287(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7793 = arg1;
	}

	@OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
