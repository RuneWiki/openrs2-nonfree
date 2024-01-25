import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
	public final int anInt5574;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
	public final int anInt5572;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
	public Class2_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5574 = arg0;
		this.anInt5572 = arg1;
	}
}
