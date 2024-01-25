import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public final class Class14_Sub50 extends Class14 {

	@OriginalMember(owner = "client!vea", name = "l", descriptor = "Ljava/lang/String;")
	public String aString121;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "()V")
	private Class14_Sub50() {
	}

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class14_Sub50(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString121 = arg0;
	}
}
