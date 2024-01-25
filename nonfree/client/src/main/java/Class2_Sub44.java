import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
	public final int anInt9119;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
	public final int anInt9116;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
	public final int anInt9121;

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	public final int anInt9114;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "Z")
	public final boolean aBoolean677;

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
	public final int anInt9117;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9119 = arg2;
		this.anInt9116 = arg4;
		this.anInt9121 = arg3;
		this.anInt9114 = arg0;
		this.aBoolean677 = arg5;
		this.anInt9117 = arg1;
	}
}
