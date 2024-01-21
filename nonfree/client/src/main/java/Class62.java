import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class62 {

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Z")
	public boolean aBoolean119 = true;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public final int anInt2980;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public final int anInt2974;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public final int anInt2976;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public final int anInt2971;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	public final int anInt2973;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public final int anInt2975;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean119 = arg6;
		this.anInt2980 = arg3;
		this.anInt2974 = arg5;
		this.anInt2976 = arg2;
		this.anInt2971 = arg4;
		this.anInt2973 = arg1;
		this.anInt2975 = arg0;
	}
}
