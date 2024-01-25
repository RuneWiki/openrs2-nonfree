import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class94 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	public final int anInt2209;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class94(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString19 = arg0;
		this.anInt2209 = arg1;
	}

	@OriginalMember(owner = "client!gp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
