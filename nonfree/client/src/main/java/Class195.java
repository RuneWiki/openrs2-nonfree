import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class195 {

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString45;

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
	public final int anInt4912;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class195(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString45 = arg0;
		this.anInt4912 = arg1;
	}

	@OriginalMember(owner = "client!kr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
