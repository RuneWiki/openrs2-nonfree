import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!br", name = "m", descriptor = "I")
	public int anInt726;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "I")
	public int anInt731;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	public int anInt725 = -1;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(I)V")
	public Class14_Sub5(@OriginalArg(0) int arg0) {
		this.anInt725 = arg0;
	}
}
