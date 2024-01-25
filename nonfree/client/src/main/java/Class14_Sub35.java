import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class14_Sub35 extends Class14 {

	@OriginalMember(owner = "client!of", name = "v", descriptor = "I")
	public final int anInt7322;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	public final int anInt7321;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	public final int anInt7318;

	@OriginalMember(owner = "client!of", name = "y", descriptor = "I")
	public final int anInt7316;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Z")
	public final boolean aBoolean512;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "I")
	public final int anInt7319;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class14_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7322 = arg1;
		this.anInt7321 = arg0;
		this.anInt7318 = arg3;
		this.anInt7316 = arg4;
		this.aBoolean512 = arg5;
		this.anInt7319 = arg2;
	}
}
