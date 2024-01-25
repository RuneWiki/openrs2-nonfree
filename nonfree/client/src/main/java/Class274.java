import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class274 {

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	public final int anInt7264;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class274(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString69 = arg0;
		this.anInt7264 = arg1;
	}

	@OriginalMember(owner = "client!qh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
