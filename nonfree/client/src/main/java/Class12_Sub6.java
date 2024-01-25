import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class12_Sub6 extends Class12 {

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	public final int anInt4165;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V")
	public Class12_Sub6(@OriginalArg(0) int arg0) {
		this.anInt4165 = arg0;
	}
}
