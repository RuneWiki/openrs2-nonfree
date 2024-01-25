import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class67 {

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Lclient!qk;")
	public Class1_Sub32_Sub1 aClass1_Sub32_Sub1_1;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "Lclient!jw;")
	public Class1_Sub26 aClass1_Sub26_1;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "Lclient!eg;")
	public Class1_Sub12_Sub1 aClass1_Sub12_Sub1_3;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "Lclient!ei;")
	public Class77 aClass77_1;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	public int anInt2380;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	public final int anInt2379;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public final int anInt2376;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	public final int anInt2374;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "B")
	public final byte aByte11;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "I")
	public final int anInt2372;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(BIIIII)V")
	public Class67(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2380 = arg3;
		this.anInt2379 = arg2;
		this.anInt2376 = arg5;
		this.anInt2374 = arg4;
		this.aByte11 = arg0;
		this.anInt2372 = arg1;
	}
}
