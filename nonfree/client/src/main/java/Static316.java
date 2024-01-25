import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "B")
	public static byte aByte77;

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_191 = new Class34("level: ", "Stufe: ", "niveau ", "nível: ");

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_192 = new Class34("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)Lclient!jp;")
	public static Class1_Sub4_Sub14 method5545(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub4_Sub14 local15 = (Class1_Sub4_Sub14) Static18.aClass92_2.method2606((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static152.aClass216_71.method5648(5, arg0);
		local15 = new Class1_Sub4_Sub14();
		if (local25 != null) {
			local15.method2933(new Class1_Sub8(local25));
		}
		Static18.aClass92_2.method2601((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
	public static void method5551() {
		Static287.aClass87_50.method2473(5);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!il;IIII)V")
	public static void method5553(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static144.method2875(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static242.anInt6744) {
			Static144.method2875(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static144.method2875(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static315.anInt6124) {
			Static144.method2875(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static315.anInt6124) {
			Static144.method2875(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static242.anInt6744 && arg4 <= Static315.anInt6124) {
			Static144.method2875(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static144.method2875(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static242.anInt6744 && arg4 > 0) {
			Static144.method2875(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
