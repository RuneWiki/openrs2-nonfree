import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class3_Sub28 extends Class3 {

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	private Class3_Sub28() {
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub28(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString50 = arg0;
	}
}
