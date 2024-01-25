import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class14_Sub29 extends Class14 {

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "Ljava/lang/String;")
	public String aString201;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	private Class14_Sub29() {
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub29(@OriginalArg(0) String arg0) {
		this.aString201 = arg0;
	}
}
