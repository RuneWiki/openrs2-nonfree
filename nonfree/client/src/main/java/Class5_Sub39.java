import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class5_Sub39 extends Class5 {

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
	private Class5_Sub39() {
	}

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub39(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString69 = arg0;
	}
}
