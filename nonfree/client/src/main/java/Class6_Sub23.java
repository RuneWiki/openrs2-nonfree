import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public final class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!hia", name = "j", descriptor = "I")
	public final int anInt4411;

	@OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
	public int anInt4410;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(II)V")
	public Class6_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4411 = arg0;
		this.anInt4410 = arg1;
	}
}
