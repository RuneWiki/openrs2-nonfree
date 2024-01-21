import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	public final int anInt1696;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9(@OriginalArg(0) int arg0) {
		this.anInt1696 = arg0;
	}
}
