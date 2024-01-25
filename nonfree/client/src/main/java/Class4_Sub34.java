import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class4_Sub34 extends Class4 {

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	private Class4_Sub34() {
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub34(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString73 = arg0;
	}
}
