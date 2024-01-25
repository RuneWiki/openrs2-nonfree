import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	public final int anInt4405;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public final int anInt4406;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V")
	public Class6_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4405 = arg0;
		this.anInt4406 = arg1;
	}
}
