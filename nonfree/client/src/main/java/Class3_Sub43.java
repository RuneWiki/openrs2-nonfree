import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class3_Sub43 extends Class3 {

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Ljava/lang/String;")
	public String aString67;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	private Class3_Sub43() {
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub43(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString67 = arg0;
	}
}
