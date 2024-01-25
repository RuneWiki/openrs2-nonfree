import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nt", name = "u", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!nt", name = "E", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_119 = new Class319(71, 3);

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
	public static void method5312() throws IOException {
		if (Static400.aClass75_3 == null || Static478.anInt8068 <= 0) {
			return;
		}
		@Pc(11) int local11 = 0;
		while (true) {
			@Pc(16) Class1_Sub48 local16 = (Class1_Sub48) Static225.aClass361_49.method7854();
			if (local16 == null) {
				Static552.anInt8530 += local11;
				Static314.anInt5650 = 0;
				break;
			}
			Static400.aClass75_3.method1854(local16.anInt8519, local16.aClass1_Sub20_Sub1_2.aByteArray52);
			Static478.anInt8068 -= local16.anInt8519;
			local11 += local16.anInt8519;
			local16.method7878();
			local16.aClass1_Sub20_Sub1_2.method4392();
			local16.method7048();
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
	public static void method5314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static479.aClass1_Sub7_Sub1_1.anInt3096 != 0 && arg0 != 0 && Static113.anInt2286 < 50 && arg1 != -1) {
			Static450.aClass177Array1[Static113.anInt2286++] = new Class177((byte) 1, arg1, arg0, arg3, arg2, 0);
		}
	}
}
