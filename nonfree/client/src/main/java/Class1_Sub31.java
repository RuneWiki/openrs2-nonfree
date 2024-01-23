import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Ljava/lang/String;")
	public String aString294;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub31(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString294 = arg0;
	}
}
