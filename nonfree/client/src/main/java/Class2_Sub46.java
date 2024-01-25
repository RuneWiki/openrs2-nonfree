import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class2_Sub46 extends Class2 {

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "Ljava/lang/String;")
	public String aString123;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	private Class2_Sub46() {
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub46(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString123 = arg0;
	}
}
