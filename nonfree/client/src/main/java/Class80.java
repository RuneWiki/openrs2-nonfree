import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class80 {

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "I")
	public final int anInt1861;

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class80(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aString28 = arg0;
		this.anInt1861 = arg2;
	}

	@OriginalMember(owner = "client!dja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
