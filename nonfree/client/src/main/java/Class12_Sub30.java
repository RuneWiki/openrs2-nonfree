import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class12_Sub30 extends Class12 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public final int anInt5208;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public final int anInt5209;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
	public final int anInt5212;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	public final int anInt5214;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Z")
	public final boolean aBoolean402;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	public final int anInt5210;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class12_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5208 = arg1;
		this.anInt5209 = arg0;
		this.anInt5212 = arg2;
		this.anInt5214 = arg3;
		this.aBoolean402 = arg5;
		this.anInt5210 = arg4;
	}
}
