import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
	public final int anInt5251;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	public final int anInt5243;

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	public final int anInt5244;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
	public final int anInt5248;

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
	public final int anInt5245;

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "Z")
	public final boolean aBoolean423;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5251 = arg0;
		this.anInt5243 = arg2;
		this.anInt5244 = arg3;
		this.anInt5248 = arg4;
		this.anInt5245 = arg1;
		this.aBoolean423 = arg5;
	}
}
