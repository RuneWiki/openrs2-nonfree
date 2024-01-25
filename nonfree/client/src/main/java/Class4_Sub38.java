import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "Ljava/lang/String;")
	public String aString158;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	private Class4_Sub38() {
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub38(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString158 = arg0;
	}
}
