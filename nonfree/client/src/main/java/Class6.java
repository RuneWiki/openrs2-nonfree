import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class6 {

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString4;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	public final int anInt193;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString4 = arg0;
		this.anInt193 = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
