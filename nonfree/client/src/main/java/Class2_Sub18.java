import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	private Class2_Sub18() {
	}

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub18(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString21 = arg0;
	}
}
