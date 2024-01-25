import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public final int anInt5434;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public int anInt5431;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V")
	public Class3_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5434 = arg0;
		this.anInt5431 = arg1;
	}
}
