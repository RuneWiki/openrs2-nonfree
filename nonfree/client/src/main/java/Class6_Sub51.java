import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class6_Sub51 extends Class6 {

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
	public final int anInt9946;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "I")
	public final int anInt9949;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(II)V")
	public Class6_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9946 = arg1;
		this.anInt9949 = arg0;
	}
}
