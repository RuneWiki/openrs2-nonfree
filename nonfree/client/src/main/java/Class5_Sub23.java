import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class5_Sub23 extends Class5 {

	@OriginalMember(owner = "client!gda", name = "o", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
	private Class5_Sub23() {
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub23(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString27 = arg0;
	}
}
