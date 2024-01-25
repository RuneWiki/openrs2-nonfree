import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class6_Sub45 extends Class6 {

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	public final int anInt8087;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "Z")
	public final boolean aBoolean608;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
	public final int anInt8085;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
	public final int anInt8086;

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "I")
	public final int anInt8084;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	public final int anInt8082;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8087 = arg4;
		this.aBoolean608 = arg5;
		this.anInt8085 = arg2;
		this.anInt8086 = arg1;
		this.anInt8084 = arg0;
		this.anInt8082 = arg3;
	}
}
