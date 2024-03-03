import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class50 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public static int anInt1547 = -1;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public final int anInt1551;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 37)
	public Class50(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString15 = arg0;
		this.anInt1551 = arg1;
	}

	@OriginalMember(owner = "client!dn", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
