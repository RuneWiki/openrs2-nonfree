import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Lclient!db;")
	public static Class44 aClass44_1;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public static void method2010() {
		@Pc(17) Class154 local17 = null;
		try {
			@Pc(22) Class108 local22 = Static89.aClass114_3.method2363("2");
			while (local22.anInt2803 == 0) {
				Static20.method1515(1L);
			}
			if (local22.anInt2803 == 1) {
				local17 = (Class154) local22.anObject4;
				@Pc(46) byte[] local46 = new byte[(int) local17.method3331()];
				@Pc(61) int local61;
				for (@Pc(48) int local48 = 0; local48 < local46.length; local48 += local61) {
					local61 = local17.method3333(local48, local46.length - local48, local46);
					if (local61 == -1) {
						throw new IOException("EOF");
					}
				}
				Static359.method5001(new Class4_Sub30(local46));
			}
		} catch (@Pc(90) Exception local90) {
		}
		try {
			if (local17 != null) {
				local17.method3335();
			}
		} catch (@Pc(97) Exception local97) {
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)Z")
	public static boolean method2011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static287.method4005(arg0, arg1) | Static317.method4377(arg1, arg0)) & Static344.method4803(arg1, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!m;Ljava/awt/Canvas;ILclient!hu;B)Lclient!qa;")
	public static Class30 method2012(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class114 arg3) {
		return new h(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	public static void method2014() {
		if (Static55.aBoolean100) {
			return;
		}
		if (Static126.aClass67_Sub1_1.aBoolean402) {
			Static416.aFloat208 = (int) Static416.aFloat208 + 47 & 0xFFFFFFF0;
		} else {
			Static311.aFloat155 += (12.0F - Static311.aFloat155) / 2.0F;
		}
		Static280.aBoolean347 = true;
		Static55.aBoolean100 = true;
	}
}
