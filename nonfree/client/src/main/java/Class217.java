import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class217 {

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "Lclient!nl;")
	public Class5_Sub33 aClass5_Sub33_1;

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "Lclient!fc;")
	public Class5_Sub15_Sub1 aClass5_Sub15_Sub1_3;

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lclient!mn;")
	public Class200 aClass200_1;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "Lclient!ar;")
	public Class5_Sub5_Sub1 aClass5_Sub5_Sub1_1;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
	public final int anInt6480;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
	public final int anInt6475;

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
	public final int anInt6478;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "I")
	public int anInt6476;

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
	public final int anInt6479;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(BIIIII)V")
	public Class217(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6480 = arg5;
		this.anInt6475 = arg2;
		this.anInt6478 = arg1;
		this.aByte62 = arg0;
		this.anInt6476 = arg3;
		this.anInt6479 = arg4;
	}
}
