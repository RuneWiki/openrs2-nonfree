import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
	public final int anInt1084;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public final int anInt1081;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Z")
	public final boolean aBoolean74;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public final int anInt1079;

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
	public final int anInt1080;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public final int anInt1082;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt1084 = arg0;
		this.anInt1081 = arg1;
		this.aBoolean74 = arg5;
		this.anInt1079 = arg4;
		this.anInt1080 = arg3;
		this.anInt1082 = arg2;
	}
}
