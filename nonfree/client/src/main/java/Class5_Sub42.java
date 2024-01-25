import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class5_Sub42 extends Class5 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Ljava/lang/String;")
	public String aString367;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	private Class5_Sub42() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub42(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString367 = arg0;
	}
}
