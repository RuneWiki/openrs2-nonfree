import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class7_Sub45 extends Class7 {

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	private Class7_Sub45() {
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class7_Sub45(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString72 = arg0;
	}
}
