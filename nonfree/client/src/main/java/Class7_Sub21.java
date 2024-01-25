import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class7_Sub21 extends Class7 {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Ljava/lang/String;")
	public String aString239;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
	private Class7_Sub21() {
	}

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class7_Sub21(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString239 = arg0;
	}
}
