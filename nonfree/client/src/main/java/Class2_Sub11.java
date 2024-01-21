import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
	public final int anInt1935;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11(@OriginalArg(0) int arg0) {
		this.anInt1935 = arg0;
	}
}
