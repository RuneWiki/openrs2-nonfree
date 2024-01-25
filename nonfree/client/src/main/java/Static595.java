import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!sr", name = "pb", descriptor = "Lclient!ec;")
	public static Class86 aClass86_1;

	@OriginalMember(owner = "client!sr", name = "U", descriptor = "I")
	public static int anInt9721;

	@OriginalMember(owner = "client!sr", name = "qb", descriptor = "Lclient!si;")
	public static final Class338 aClass338_57 = new Class338(32);

	@OriginalMember(owner = "client!sr", name = "hb", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_169 = new Class186(74, 7);

	@OriginalMember(owner = "client!sr", name = "S", descriptor = "[Lclient!iq;")
	public static Class178[] aClass178Array1 = new Class178[4];

	@OriginalMember(owner = "client!sr", name = "jb", descriptor = "Z")
	public static boolean aBoolean702 = false;

	@OriginalMember(owner = "client!sr", name = "gb", descriptor = "Lclient!ur;")
	public static final Class377 aClass377_2 = new Class377();

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIII)V")
	public static void method8198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(11, (long) arg0);
		local9.method630();
		local9.anInt803 = arg1;
		local9.anInt805 = arg2;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!gg;[[B)V")
	public static void method8199(@OriginalArg(1) Class131_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = arg1.length;
		@Pc(39) int local39;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) byte[] local26 = arg1[local20];
			if (local26 != null) {
				@Pc(33) Class3_Sub28 local33 = new Class3_Sub28(local26);
				local39 = Static46.anIntArray54[local20] >> 8;
				@Pc(45) int local45 = Static46.anIntArray54[local20] & 0xFF;
				@Pc(52) int local52 = local39 * 64 - Static714.anInt11156;
				@Pc(58) int local58 = local45 * 64 - Static339.anInt5859;
				Static140.method2345();
				arg0.method3077(local58, Static339.anInt5859, Static678.aClass360Array5, local33, Static714.anInt11156, local52);
				arg0.method3084(Static488.aClass67_12, local52, local33, local58);
			}
		}
		for (@Pc(88) int local88 = 0; local88 < local8; local88++) {
			@Pc(100) int local100 = (Static46.anIntArray54[local88] >> 8) * 64 - Static714.anInt11156;
			local39 = (Static46.anIntArray54[local88] & 0xFF) * 64 - Static339.anInt5859;
			@Pc(115) byte[] local115 = arg1[local88];
			if (local115 == null && Static650.anInt10443 < 800) {
				Static140.method2345();
				arg0.method3070(local39, local100);
			}
		}
	}
}
