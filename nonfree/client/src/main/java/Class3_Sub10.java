import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public int anInt1853;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
	public final int anInt1852;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(II)V")
	public Class3_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1853 = arg1;
		this.anInt1852 = arg0;
	}
}
