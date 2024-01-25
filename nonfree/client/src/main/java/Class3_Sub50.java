import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!v", name = "q", descriptor = "I")
	public final int anInt9622;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	public final int anInt9619;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "I")
	public final int anInt9615;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "I")
	public final int anInt9621;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "Z")
	public final boolean aBoolean691;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "I")
	public final int anInt9617;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9622 = arg3;
		this.anInt9619 = arg4;
		this.anInt9615 = arg2;
		this.anInt9621 = arg0;
		this.aBoolean691 = arg5;
		this.anInt9617 = arg1;
	}
}
