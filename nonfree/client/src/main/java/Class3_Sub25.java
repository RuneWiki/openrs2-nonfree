import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!il", name = "r", descriptor = "I")
	public final int anInt4397;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public final int anInt4394;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "I")
	public final int anInt4398;

	@OriginalMember(owner = "client!il", name = "j", descriptor = "I")
	public final int anInt4391;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Z")
	public final boolean aBoolean336;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	public final int anInt4395;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4397 = arg4;
		this.anInt4394 = arg2;
		this.anInt4398 = arg1;
		this.anInt4391 = arg3;
		this.aBoolean336 = arg5;
		this.anInt4395 = arg0;
	}
}
