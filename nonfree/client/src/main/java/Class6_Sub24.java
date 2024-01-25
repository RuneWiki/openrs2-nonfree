import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class6_Sub24 extends Class6 {

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	private Class6_Sub24() {
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub24(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString31 = arg0;
	}
}
