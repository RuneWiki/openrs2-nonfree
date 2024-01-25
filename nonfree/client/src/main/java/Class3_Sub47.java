import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
	public final int anInt9573;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public final int anInt9569;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
	public Class3_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9573 = arg1;
		this.anInt9569 = arg0;
	}
}
