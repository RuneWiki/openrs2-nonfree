import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public final int anInt59;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public final int anInt61;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt59 = arg1;
		this.anInt61 = arg0;
	}
}
