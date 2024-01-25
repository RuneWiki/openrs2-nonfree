import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class48 {

	@OriginalMember(owner = "client!d", name = "j", descriptor = "I")
	public final int anInt1229;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class48(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1229 = arg1;
		this.aString9 = arg0;
	}

	@OriginalMember(owner = "client!d", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
