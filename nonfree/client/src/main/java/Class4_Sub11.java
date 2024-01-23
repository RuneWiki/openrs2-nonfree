import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub11(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString45 = arg0;
	}
}
