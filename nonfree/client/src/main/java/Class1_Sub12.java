import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub12(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString55 = arg0;
	}
}
