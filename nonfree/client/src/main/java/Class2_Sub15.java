import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
	public final int anInt2268;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "Z")
	public final boolean aBoolean179;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
	public final int anInt2267;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "I")
	public final int anInt2265;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
	public final int anInt2264;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	public final int anInt2266;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt2268 = arg1;
		this.aBoolean179 = arg5;
		this.anInt2267 = arg3;
		this.anInt2265 = arg2;
		this.anInt2264 = arg4;
		this.anInt2266 = arg0;
	}
}
