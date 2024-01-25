import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class2_Sub20 extends Class2 {

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "Z")
	public final boolean aBoolean253;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public final int anInt2909;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public final int anInt2912;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	public final int anInt2911;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public final int anInt2913;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public final int anInt2914;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean253 = arg5;
		this.anInt2909 = arg0;
		this.anInt2912 = arg2;
		this.anInt2911 = arg3;
		this.anInt2913 = arg4;
		this.anInt2914 = arg1;
	}
}
