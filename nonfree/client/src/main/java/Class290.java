import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class290 {

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
	public final int anInt8594;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class290(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString86 = arg0;
		this.anInt8594 = arg1;
	}

	@OriginalMember(owner = "client!rga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
