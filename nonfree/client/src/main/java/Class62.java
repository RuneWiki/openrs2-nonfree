import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class62 {

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public final int anInt2526;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class62(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2526 = arg1;
		this.aString18 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
