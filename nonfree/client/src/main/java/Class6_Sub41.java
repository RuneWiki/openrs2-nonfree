import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class6_Sub41 extends Class6 {

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	public final int anInt6819;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	public final int anInt6820;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(II)V")
	public Class6_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6819 = arg0;
		this.anInt6820 = arg1;
	}
}
