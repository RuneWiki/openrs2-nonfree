import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Ljava/lang/String;")
	public String aString74;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString74 = arg0;
	}
}
