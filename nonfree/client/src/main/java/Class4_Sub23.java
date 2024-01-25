import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class4_Sub23 extends Class4 {

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	public int anInt3992;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	public final int anInt3993;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(II)V")
	public Class4_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3992 = arg1;
		this.anInt3993 = arg0;
	}
}
