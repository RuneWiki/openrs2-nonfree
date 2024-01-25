import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	private Class2_Sub1() {
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub1(@OriginalArg(0) String arg0) {
		this.aString1 = arg0;
	}
}
