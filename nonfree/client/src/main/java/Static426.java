import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	public static int anInt7851 = 0;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "[I")
	public static final int[] anIntArray564 = new int[14];

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_89 = new Class181(0, 7);

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "[I")
	public static final int[] anIntArray565 = new int[1000];

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!iaa;I)Lclient!bo;")
	public static Class39 method6566(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(7) Class39 local7 = new Class39();
		local7.anInt1256 = arg0.method4999();
		local7.aClass6_Sub4_Sub1_1 = Static96.aClass221_2.method5320(local7.anInt1256);
		return local7;
	}
}
