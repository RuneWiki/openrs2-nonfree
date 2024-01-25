import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class235 {

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
	public final int anInt6654;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class235(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6654 = arg1;
		this.aString57 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
