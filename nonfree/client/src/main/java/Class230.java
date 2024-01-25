import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public final class Class230 {

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class230(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString71 = arg1;
		this.aString70 = arg2;
		this.aString72 = arg0;
	}
}
