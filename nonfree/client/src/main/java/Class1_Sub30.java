import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Ljava/lang/String;")
	public String aString166;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub30(@OriginalArg(0) String arg0) {
		this.aString166 = arg0;
	}
}
