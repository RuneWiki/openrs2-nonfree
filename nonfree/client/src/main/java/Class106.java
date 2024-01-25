import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public final class Class106 {

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
	public final int anInt2264;

	@OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
	public final int anInt2271;

	@OriginalMember(owner = "client!eia", name = "k", descriptor = "I")
	public final int anInt2270;

	@OriginalMember(owner = "client!eia", name = "e", descriptor = "I")
	public final int anInt2265;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(IIII)V")
	public Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2264 = arg0;
		this.anInt2271 = arg3;
		this.anInt2270 = arg2;
		this.anInt2265 = arg1;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)Lclient!eia;")
	public Class106 method1966(@OriginalArg(1) int arg0) {
		return new Class106(this.anInt2264, arg0, this.anInt2270, this.anInt2271);
	}
}
