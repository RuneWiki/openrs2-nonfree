import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
	public final int anInt5487;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public final int anInt5488;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
	public Class3_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5487 = arg1;
		this.anInt5488 = arg0;
	}
}
