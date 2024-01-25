import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
	public static int anInt9651;

	@OriginalMember(owner = "client!ut", name = "w", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_217 = new Class362(24, 8);

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	public static int anInt9661 = 0;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method7887(@OriginalArg(0) Class44 arg0) {
		if (Static500.aClass244_57.method5973() == 0) {
			return;
		}
		@Pc(48) Class4_Sub28 local48;
		if (Static495.anInt9000 == 0) {
			for (local48 = (Class4_Sub28) Static500.aClass244_57.method5963(); local48 != null; local48 = (Class4_Sub28) Static500.aClass244_57.method5965()) {
				Static521.aClass273_2.method6719(arg0, local48.anInt6870, local48.anInt6873, local48.anInt6871, local48.anInt6869, local48.anInt6868, false, local48.aBoolean495 ? Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1 : null, arg0, false, Static454.aClass58_13);
				local48.method8379();
			}
			Static523.method7617();
			return;
		}
		if (Static393.aClass44_11 == null) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(36, 32);
			Static393.aClass44_11 = Static441.method4987(0, Static237.anInterface11_8, local18, 0, Static224.aClass176_61);
			Static14.aClass58_1 = Static393.aClass44_11.method4983(Static288.method8172(Static500.aClass176_119, Static329.anInt6334), Static598.method6315(Static281.aClass176_74, Static329.anInt6334));
		}
		for (local48 = (Class4_Sub28) Static500.aClass244_57.method5963(); local48 != null; local48 = (Class4_Sub28) Static500.aClass244_57.method5965()) {
			Static521.aClass273_2.method6719(arg0, local48.anInt6870, local48.anInt6873, local48.anInt6871, local48.anInt6869, local48.anInt6868, false, local48.aBoolean495 ? Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aClass166_1 : null, Static393.aClass44_11, false, Static14.aClass58_1);
			local48.method8379();
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BII)Z")
	public static boolean method7890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static224.method3664(arg0, arg1) & Static222.method3619(arg1, arg0);
	}
}
