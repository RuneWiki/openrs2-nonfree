import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class78 implements Interface15 {

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
	public final int anInt2377;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class78(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2377 = arg1;
	}

	@OriginalMember(owner = "client!dja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
