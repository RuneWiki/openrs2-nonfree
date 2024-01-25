import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class98 {

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "Lclient!nq;")
	public Class1_Sub28_Sub1 aClass1_Sub28_Sub1_1;

	@OriginalMember(owner = "client!gr", name = "e", descriptor = "Lclient!gh;")
	public Class1_Sub16 aClass1_Sub16_1;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "Lclient!cj;")
	public Class39 aClass39_1;

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "Lclient!ct;")
	public Class1_Sub9_Sub1 aClass1_Sub9_Sub1_1;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public final int anInt2404;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
	public int anInt2410;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
	public final int anInt2402;

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
	public final int anInt2403;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "B")
	public final byte aByte28;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	public final int anInt2405;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(BIIIII)V")
	public Class98(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2404 = arg1;
		this.anInt2410 = arg3;
		this.anInt2402 = arg5;
		this.anInt2403 = arg4;
		this.aByte28 = arg0;
		this.anInt2405 = arg2;
	}
}
