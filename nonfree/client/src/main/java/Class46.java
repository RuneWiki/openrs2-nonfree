import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class46 {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Z")
	public boolean aBoolean116 = true;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
	public final int anInt2871;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	public final int anInt2862;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	public final int anInt2872;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public final int anInt2864;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
	public final int anInt2860;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
	public final int anInt2865;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2871 = arg1;
		this.aBoolean116 = arg6;
		this.anInt2862 = arg2;
		this.anInt2872 = arg0;
		this.anInt2864 = arg5;
		this.anInt2860 = arg4;
		this.anInt2865 = arg3;
	}
}
