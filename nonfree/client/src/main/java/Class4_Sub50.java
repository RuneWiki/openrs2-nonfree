import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class4_Sub50 extends Class4 {

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	private Class4_Sub50() {
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub50(@OriginalArg(0) String arg0) {
		this.aString105 = arg0;
	}
}
