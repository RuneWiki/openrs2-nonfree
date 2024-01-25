import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	private Class2_Sub37() {
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub37(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString95 = arg0;
	}
}
