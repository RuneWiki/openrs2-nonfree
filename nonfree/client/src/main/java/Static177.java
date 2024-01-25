import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public static int anInt1347;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas3;

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "Lclient!ui;")
	public static Class230 aClass230_25;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "Lclient!bt;")
	public static Class33 aClass33_3;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
	public static int anInt1356 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ui;ZIIII)V")
	public static void method1112(@OriginalArg(0) int arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static315.aClass230_71 = arg1;
		Static243.anInt4123 = arg0;
		Static211.anInt3648 = 0;
		Static157.anInt2868 = arg2;
		Static355.aBoolean431 = false;
		Static271.anInt4720 = 1;
		Static229.anInt3862 = Static197.aClass1_Sub7_Sub1_3.method1078() / arg3;
		if (Static229.anInt3862 < 1) {
			Static229.anInt3862 = 1;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!re;Z)V")
	public static void method1113(@OriginalArg(0) Class1_Sub33 arg0) {
		@Pc(13) byte[] local13 = new byte[24];
		if (Static31.aClass192_1 != null) {
			@Pc(25) int local25;
			try {
				Static31.aClass192_1.method4397(0L);
				Static31.aClass192_1.method4399(local13);
				for (local25 = 0; local25 < 24 && local13[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local25 = 0; local25 < 24; local25++) {
					local13[local25] = -1;
				}
			}
		}
		arg0.method5152(24, local13);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ct;B)V")
	public static void method1119(@OriginalArg(0) Class48 arg0) {
		Static209.aClass1_Sub33_Sub2_2.method5198(arg0.method895());
	}
}
