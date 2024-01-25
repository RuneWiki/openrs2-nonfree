import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class218 {

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "Lclient!sb;")
	public Class222 aClass222_1;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Lclient!hn;")
	public Class2_Sub3_Sub3 aClass2_Sub3_Sub3_4;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Lclient!ck;")
	public Class2_Sub10_Sub1 aClass2_Sub10_Sub1_2;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "Lclient!um;")
	public Class2_Sub41 aClass2_Sub41_1;

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	public final int anInt5950;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
	public int anInt5948;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	public final int anInt5947;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	public final int anInt5946;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	public final int anInt5951;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(BIIIII)V")
	public Class218(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5950 = arg5;
		this.aByte87 = arg0;
		this.anInt5948 = arg3;
		this.anInt5947 = arg4;
		this.anInt5946 = arg1;
		this.anInt5951 = arg2;
	}
}
