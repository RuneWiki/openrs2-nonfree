import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray13 = new Rectangle[100];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZI)Z")
	public static boolean method3934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static265.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V")
	public static void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static294.aString249 = arg2;
		Static323.aString278 = arg1;
		Static117.anInt2215 = arg0;
		if (Static323.aString278.equals("") || Static294.aString249.equals("")) {
			Static24.anInt400 = 3;
		} else if (Static181.anInt3403 == -1) {
			Static226.anInt4217 = 0;
			Static155.anInt5413 = 0;
			Static24.anInt400 = -3;
			Static109.anInt2025 = 1;
			@Pc(39) Class6_Sub10 local39 = new Class6_Sub10(128);
			local39.method3968(10);
			local39.method3976((int) (Math.random() * 9.9999999E7D));
			local39.method3970(Static217.method3880(Static323.aString278));
			local39.method3976((int) (Math.random() * 9.9999999E7D));
			local39.method3966(Static294.aString249);
			local39.method3976((int) (Math.random() * 9.9999999E7D));
			local39.method4004(Static343.aBigInteger6, Static102.aBigInteger5);
			Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
			Static131.aClass6_Sub10_Sub1_2.method3968(24);
			Static131.aClass6_Sub10_Sub1_2.method3968(local39.anInt4188 + 2);
			Static131.aClass6_Sub10_Sub1_2.method4025(558);
			Static131.aClass6_Sub10_Sub1_2.method4014(local39.aByteArray67, local39.anInt4188);
		} else {
			Static75.method1311();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZ)V")
	public static void method3938(@OriginalArg(1) boolean arg0) {
		Static13.method227(Static62.anInt1131, arg0, Static209.anInt3815, Static94.anInt1731);
	}
}
