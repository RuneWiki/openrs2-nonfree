import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	private Class3_Sub23() {
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub23(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString62 = arg0;
	}
}
