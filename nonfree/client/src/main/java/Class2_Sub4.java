import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
	private Class2_Sub4() {
	}

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub4(@OriginalArg(0) String arg0) {
		this.aString2 = arg0;
	}
}
