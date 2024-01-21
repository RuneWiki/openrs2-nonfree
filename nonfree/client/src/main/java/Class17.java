import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class17 {

	@OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
	public boolean aBoolean28 = true;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "I")
	public final int anInt606;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	public final int anInt609;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	public final int anInt603;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "I")
	public final int anInt604;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	public final int anInt607;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public final int anInt613;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt606 = arg0;
		this.anInt609 = arg1;
		this.anInt603 = arg3;
		this.anInt604 = arg2;
		this.anInt607 = arg4;
		this.aBoolean28 = arg6;
		this.anInt613 = arg5;
	}
}
