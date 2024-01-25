import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class7_Sub34 extends Class7 {

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	public final int anInt5534;

	@OriginalMember(owner = "client!rr", name = "u", descriptor = "I")
	public final int anInt5536;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
	public final int anInt5530;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Z")
	public final boolean aBoolean411;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
	public final int anInt5533;

	@OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
	public final int anInt5535;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class7_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5534 = arg4;
		this.anInt5536 = arg2;
		this.anInt5530 = arg1;
		this.aBoolean411 = arg5;
		this.anInt5533 = arg0;
		this.anInt5535 = arg3;
	}
}
