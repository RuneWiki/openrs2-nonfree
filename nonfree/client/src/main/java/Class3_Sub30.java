import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class3_Sub30 extends Class3 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Ljava/lang/String;")
	public String aString217;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub30(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString217 = arg0;
	}
}
