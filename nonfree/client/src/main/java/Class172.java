import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class172 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!va;")
	public Class6_Sub50 aClass6_Sub50_3;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!hl;")
	public Class6_Sub19_Sub2 aClass6_Sub19_Sub2_3;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Lclient!tq;")
	public Class309 aClass309_1;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!mda;")
	public Class6_Sub12_Sub1 aClass6_Sub12_Sub1_3;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "B")
	public final byte aByte56;

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public final int anInt4248;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public final int anInt4242;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	public final int anInt4249;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public final int anInt4245;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public int anInt4244;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(BIIIII)V")
	public Class172(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aByte56 = arg0;
		this.anInt4248 = arg2;
		this.anInt4242 = arg1;
		this.anInt4249 = arg5;
		this.anInt4245 = arg4;
		this.anInt4244 = arg3;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)Z")
	public boolean method3645() {
		return this.aByte56 == 2 || this.aByte56 == 3;
	}
}
