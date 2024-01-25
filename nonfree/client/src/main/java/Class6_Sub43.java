import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
	public final int anInt7502;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
	public int anInt7504;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
	public Class6_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7502 = arg0;
		this.anInt7504 = arg1;
	}
}
