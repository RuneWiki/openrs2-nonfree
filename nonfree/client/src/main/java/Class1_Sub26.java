import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Ljava/lang/String;")
	public String aString139;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub26(@OriginalArg(0) String arg0) {
		this.aString139 = arg0;
	}
}
