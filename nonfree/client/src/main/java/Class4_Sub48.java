import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class4_Sub48 extends Class4 {

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "Ljava/lang/String;")
	public String aString81;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	private Class4_Sub48() {
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub48(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString81 = arg0;
	}
}
