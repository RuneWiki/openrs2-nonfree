import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString9 = arg0;
	}
}
