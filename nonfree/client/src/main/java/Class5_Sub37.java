import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class5_Sub37 extends Class5 {

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "Ljava/lang/String;")
	public String aString76;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	private Class5_Sub37() {
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub37(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString76 = arg0;
	}
}
