import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class212 {

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString136;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
	public final int anInt6307;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class212(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString136 = arg0;
		this.anInt6307 = arg1;
	}

	@OriginalMember(owner = "client!oda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
