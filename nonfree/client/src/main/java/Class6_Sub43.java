import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!se", name = "t", descriptor = "I")
	public final int anInt8493;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	public int anInt8487;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
	public Class6_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8493 = arg0;
		this.anInt8487 = arg1;
	}
}
