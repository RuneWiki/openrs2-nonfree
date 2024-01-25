import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public final int anInt5482;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	public final int anInt5483;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(II)V")
	public Class4_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5482 = arg1;
		this.anInt5483 = arg0;
	}
}
