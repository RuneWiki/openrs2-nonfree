import java.awt.Dimension;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_8 = new Class251(0, 8);

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "[B")
	public static final byte[] aByteArray2 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "[S")
	public static final short[] aShortArray5 = new short[] { 3, 49, 8, 59, 19, 58, 51, 22 };

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)I")
	public static int method243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static551.aClass355_1.anInt9855 == -1) {
			return 1;
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != arg1) {
			Static11.method236(arg1, true, Static21.aClass21_12.method324(Static26.anInt352));
			if (Static181.aClass14_Sub26_9.aClass43_Sub1_1.method801() != arg1) {
				return -1;
			}
		}
		try {
			@Pc(41) Dimension local41 = Static626.aCanvas12.getSize();
			Static478.method7167(Static372.aClass350_5, Static446.aClass68_8, true, Static21.aClass21_12.method324(Static26.anInt352), Static103.aClass144_3);
			@Pc(58) Class72 local58 = Static227.method3839(Static640.aClass310_127, Static551.aClass355_1.anInt9855);
			@Pc(61) long local61 = Static26.method382();
			Static103.aClass144_3.la();
			Static281.aClass263_4.method8444(0, Static193.anInt9749, 0);
			Static103.aClass144_3.method6896(Static281.aClass263_4);
			Static103.aClass144_3.DA(local41.width / 2, local41.height / 2, 512, 512);
			Static103.aClass144_3.xa(1.0F);
			Static103.aClass144_3.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(102) Class129 local102 = Static103.aClass144_3.method6908(local58, 2048, 64, 64, 768);
			@Pc(104) int local104 = 0;
			label41: for (@Pc(106) int local106 = 0; local106 < 500; local106++) {
				Static103.aClass144_3.GA(0);
				Static103.aClass144_3.ya();
				for (@Pc(114) int local114 = 15; local114 >= 0; local114--) {
					for (@Pc(117) int local117 = 0; local117 <= local114; local117++) {
						Static467.aClass263_9.method8444((int) ((float) Static391.anInt6813 * (-((float) local114 / 2.0F) + (float) local117)), 0, (local114 + 1) * Static391.anInt6813);
						local104++;
						local102.method5307(Static467.aClass263_9, (Class4_Sub1) null, 0);
						if (Static26.method382() - local61 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static103.aClass144_3.method6901();
			@Pc(183) long local183 = (long) (local104 * 1000) / (Static26.method382() - local61);
			Static103.aClass144_3.GA(0);
			Static103.aClass144_3.ya();
			return (int) local183;
		} catch (@Pc(192) Throwable local192) {
			local192.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BZILclient!rg;III)V")
	public static void method244(@OriginalArg(2) int arg0, @OriginalArg(3) Class310 arg1, @OriginalArg(5) int arg2) {
		Static210.anInt3677 = arg0;
		Static485.anInt8392 = arg2;
		Static316.anInt5540 = 0;
		Static431.aClass310_93 = arg1;
		Static270.aBoolean372 = false;
		Static625.anInt11174 = 1;
		Static338.anInt5769 = 2;
		Static556.aClass14_Sub1_Sub3_4 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIB)Lclient!lb;")
	public static Class47 method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 986053L ^ (long) arg1 * 475427L ^ (long) arg2 * 67481L ^ (long) arg4 * 97549L ^ (long) arg5 * 32147369L ^ (long) arg0 * 76724863L;
		@Pc(39) Class47 local39 = (Class47) Static129.aClass317_14.method7882(local33);
		if (local39 == null) {
			local39 = Static127.aClass144_17.method6894(arg2, arg4, arg1, arg3, arg5, arg0);
			Static129.aClass317_14.method7875(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
