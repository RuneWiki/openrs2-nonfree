import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class12_Sub32 extends Class12 {

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V")
	private Class12_Sub32() {
	}

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class12_Sub32(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString61 = arg0;
	}
}
