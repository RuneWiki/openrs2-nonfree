import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public final class Class222 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public final int anInt6790;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class222(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString72 = arg0;
		this.anInt6790 = arg1;
	}

	@OriginalMember(owner = "client!mp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
