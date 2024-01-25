import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!iaa", name = "E", descriptor = "I")
	public static int anInt4674;

	@OriginalMember(owner = "client!iaa", name = "D", descriptor = "I")
	public static int anInt4678;

	@OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
	public static int anInt4671 = 0;

	@OriginalMember(owner = "client!iaa", name = "A", descriptor = "Lclient!kl;")
	public static final Class211 aClass211_3 = new Class211();

	@OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
	public static int anInt4675 = -1;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "I")
	public static int anInt4677 = 1;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIII)V")
	public static void method4295(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class6_Sub2_Sub4 local16 = Static602.method8315((long) arg0, 11);
		local16.method2040();
		local16.anInt2113 = arg2;
		local16.anInt2111 = arg1;
	}
}
