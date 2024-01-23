import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!vk", name = "o", descriptor = "Ljava/lang/String;")
	public String aString189;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub31(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString189 = arg0;
	}
}
