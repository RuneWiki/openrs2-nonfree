import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
	public static int anInt5918;

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "I")
	public static int anInt5922;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "[I")
	public static final int[] anIntArray418 = new int[14];

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_94 = new Class6(83, 8);

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Lclient!wn;")
	public static Class2_Sub8 method5115() {
		@Pc(8) Class2_Sub8 local8 = (Class2_Sub8) Static526.aClass145_8.method3928();
		if (local8 == null) {
			return new Class2_Sub8();
		} else {
			Static151.anInt3439--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
	public static int method5116() {
		if (Static25.aBoolean94) {
			return 6;
		} else if (Static158.aClass1_Sub50_1 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static158.aClass1_Sub50_1.anInt8983;
			if (Static141.method2964(local19)) {
				return 1;
			} else if (Static34.method1308(local19)) {
				return 2;
			} else if (Static460.method6777(local19)) {
				return 3;
			} else if (Static270.method4524(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBLclient!n;Ljava/awt/Canvas;Lclient!kda;)Lclient!qa;")
	public static Class9 method5117(@OriginalArg(0) int arg0, @OriginalArg(2) Interface8 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class160 arg3) {
		if (!Static124.method4362()) {
			throw new RuntimeException("");
		} else if (Static531.method7565("jaggl")) {
			@Pc(24) OpenGL local24 = new OpenGL();
			@Pc(34) long local34 = local24.init(arg2, 8, 8, 8, 24, 0, arg0);
			if (local34 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(63) Class9_Sub1_Sub1 local63 = new Class9_Sub1_Sub1(local24, arg2, local34, arg1, arg3, arg0);
			local63.method7773();
			return local63;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)V")
	public static void method5119(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub13 local8 = Static476.method6225(6, arg0);
		local8.method4925();
	}
}
