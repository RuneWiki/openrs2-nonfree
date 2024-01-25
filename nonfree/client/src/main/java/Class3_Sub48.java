import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
	public int anInt9332;

	@OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
	public final int anInt9328;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(II)V")
	public Class3_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9332 = arg1;
		this.anInt9328 = arg0;
	}
}
