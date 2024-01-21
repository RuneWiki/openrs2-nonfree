import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class6_Sub2_Sub3_Sub5 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
	public int anInt2287;

	@OriginalMember(owner = "client!qb", name = "zb", descriptor = "I")
	public int anInt2292;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)Lclient!jb;")
	@Override
	public Class6_Sub2_Sub3_Sub3 method2063() {
		return Static58.method1195(this.anInt2287).method692(this.anInt2292, true);
	}
}
