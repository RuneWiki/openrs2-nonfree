import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class4_Sub48 extends Class4 {

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
	public final int anInt9508;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
	public final int anInt9507;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class4_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9508 = arg1;
		this.anInt9507 = arg0;
	}
}
