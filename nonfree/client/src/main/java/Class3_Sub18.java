import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	public final int anInt3030;

	@OriginalMember(owner = "client!q", name = "v", descriptor = "I")
	public final int anInt3031;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
	public Class3_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3030 = arg0;
		this.anInt3031 = arg1;
	}
}
