import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "Ljava/lang/String;")
	public String aString126;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
	private Class3_Sub47() {
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub47(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString126 = arg0;
	}
}
