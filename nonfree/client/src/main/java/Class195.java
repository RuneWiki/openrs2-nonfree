import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class195 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class195(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString66 = arg2;
		this.aString68 = arg1;
		this.aString67 = arg0;
	}
}
