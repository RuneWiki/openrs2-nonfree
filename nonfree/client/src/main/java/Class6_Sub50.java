import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class6_Sub50 extends Class6 {

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	public final int anInt9263;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public final int anInt9262;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
	public Class6_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9263 = arg1;
		this.anInt9262 = arg0;
	}
}
