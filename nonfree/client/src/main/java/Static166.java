import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_107 = new Class237(34, 12);

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static final int anInt6110 = 1339;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt6111 = 0;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
	public static final int[] anIntArray491 = new int[500];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!qo;IBI)Lclient!cl;")
	public static Class1_Sub2_Sub5 method4936(@OriginalArg(0) Class190 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt5735 | arg1 << 8;
		@Pc(19) Class1_Sub2_Sub5 local19 = (Class1_Sub2_Sub5) Static302.aClass90_1.method1862((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static215.aClass250_50.method5644(Static215.aClass250_50.method5672(local10));
		if (local31 == null) {
			local10 = arg0.anInt5735 | arg2 + 65536 << 8;
			local19 = (Class1_Sub2_Sub5) Static302.aClass90_1.method1862((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static215.aClass250_50.method5644(Static215.aClass250_50.method5672(local10));
			if (local31 == null) {
				local10 = arg0.anInt5735 | 0xFFFF00;
				local19 = (Class1_Sub2_Sub5) Static302.aClass90_1.method1862((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static215.aClass250_50.method5644(Static215.aClass250_50.method5672(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static46.method779(local31);
					local19.aClass190_3 = arg0;
					Static302.aClass90_1.method1865((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static46.method779(local31);
				local19.aClass190_3 = arg0;
				Static302.aClass90_1.method1865((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static46.method779(local31);
			local19.aClass190_3 = arg0;
			Static302.aClass90_1.method1865((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
	public static void method4937() {
		Static89.method1472(Static107.anInt1964);
	}
}
