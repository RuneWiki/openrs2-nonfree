import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!lg", name = "n", descriptor = "Ljava/lang/String;")
	public String aString125;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub20(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString125 = arg0;
	}
}
