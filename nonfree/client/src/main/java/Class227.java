import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class227 {

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class227(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString68 = arg2;
		this.aString67 = arg1;
		this.aString66 = arg0;
	}
}
