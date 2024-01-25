import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class161 {

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!gg;")
	public Class6_Sub10_Sub2 aClass6_Sub10_Sub2_3;

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "Lclient!ofa;")
	public Class6_Sub37 aClass6_Sub37_3;

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "Lclient!bh;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "Lclient!wb;")
	public Class6_Sub12_Sub1 aClass6_Sub12_Sub1_3;

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
	public final int anInt4833;

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "B")
	public final byte aByte46;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
	public final int anInt4830;

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
	public final int anInt4834;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
	public final int anInt4831;

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "I")
	public int anInt4835;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(BIIIII)V")
	public Class161(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4833 = arg5;
		this.aByte46 = arg0;
		this.anInt4830 = arg2;
		this.anInt4834 = arg1;
		this.anInt4831 = arg4;
		this.anInt4835 = arg3;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)Z")
	public boolean method4163() {
		return this.aByte46 == 2 || this.aByte46 == 3;
	}
}
