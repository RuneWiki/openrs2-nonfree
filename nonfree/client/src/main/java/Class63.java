import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class63 {

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
	public final int anInt1690;

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString19;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class63(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1690 = arg1;
		this.aString19 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
