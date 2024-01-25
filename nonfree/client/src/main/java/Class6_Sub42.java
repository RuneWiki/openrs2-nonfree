import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class6_Sub42 extends Class6 {

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public final int anInt9054;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public final int anInt9056;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(II)V")
	public Class6_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9054 = arg0;
		this.anInt9056 = arg1;
	}
}
