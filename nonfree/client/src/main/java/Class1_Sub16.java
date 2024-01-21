import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	public final int anInt2358;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
	public final int anInt2359;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2358 = arg0;
		this.anInt2359 = arg1;
	}
}
