import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Ljava/lang/String;")
	public String aString300;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub22(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString300 = arg0;
	}
}
