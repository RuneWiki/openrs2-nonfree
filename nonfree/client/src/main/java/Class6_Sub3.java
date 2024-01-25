import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!am", name = "n", descriptor = "I")
	public final int anInt196;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	public final int anInt195;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(II)V")
	public Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt196 = arg0;
		this.anInt195 = arg1;
	}
}
