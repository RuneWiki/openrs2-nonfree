import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class176 {

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString85;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class176(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString85 = arg2;
		this.aString87 = arg1;
		this.aString86 = arg0;
	}
}
