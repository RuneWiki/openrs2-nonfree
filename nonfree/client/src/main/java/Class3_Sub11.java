import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
	public final int anInt1653;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	public final int anInt1654;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(II)V")
	public Class3_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1653 = arg1;
		this.anInt1654 = arg0;
	}
}
