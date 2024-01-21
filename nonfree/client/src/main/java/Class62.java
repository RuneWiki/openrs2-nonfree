import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class62 {

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	public boolean aBoolean132 = true;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public final int anInt2493;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
	public final int anInt2489;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public final int anInt2484;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
	public final int anInt2490;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	public final int anInt2487;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
	public final int anInt2488;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt2493 = arg1;
		this.anInt2489 = arg5;
		this.anInt2484 = arg3;
		this.anInt2490 = arg2;
		this.anInt2487 = arg0;
		this.aBoolean132 = arg6;
		this.anInt2488 = arg4;
	}
}
