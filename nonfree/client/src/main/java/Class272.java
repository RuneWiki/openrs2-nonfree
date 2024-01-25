import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class272 {

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString95;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString93;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString94;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class272(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString95 = arg2;
		this.aString93 = arg1;
		this.aString94 = arg0;
	}
}
