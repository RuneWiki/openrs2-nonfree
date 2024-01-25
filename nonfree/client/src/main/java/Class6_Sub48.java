import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class6_Sub48 extends Class6 {

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
	public final int anInt9145;

	@OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
	public final int anInt9144;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
	public final int anInt9148;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	public final int anInt9147;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
	public final int anInt9149;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Z")
	public final boolean aBoolean666;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9145 = arg2;
		this.anInt9144 = arg1;
		this.anInt9148 = arg4;
		this.anInt9147 = arg0;
		this.anInt9149 = arg3;
		this.aBoolean666 = arg5;
	}
}
