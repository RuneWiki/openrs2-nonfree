import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class7_Sub15 extends Class7 {

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
	public final int anInt2894;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
	public final int anInt2895;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V")
	public Class7_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2894 = arg0;
		this.anInt2895 = arg1;
	}
}
