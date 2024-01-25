import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	private Class3_Sub40() {
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub40(@OriginalArg(0) String arg0) {
		this.aString100 = arg0;
	}
}
