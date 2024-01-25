import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class8_Sub27 extends Class8 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	private Class8_Sub27() {
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class8_Sub27(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString59 = arg0;
	}
}
