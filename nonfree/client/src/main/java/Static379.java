import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_241 = new Class62("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_242 = new Class62("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "J")
	public static long aLong201 = -1L;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!kd;I)V")
	public static void method5965(@OriginalArg(0) Class123 arg0) {
		Static190.anInt3986 = 3;
		Static168.method2965(true);
		Static107.anInt2388 = 127;
		Static135.aBoolean204 = true;
		Static266.anInt5047 = 2;
		Static135.aBoolean205 = true;
		Static104.aBoolean168 = true;
		Static41.aBoolean51 = true;
		Static314.aBoolean421 = true;
		Static87.anInt1875 = 0;
		Static260.anInt4975 = 0;
		Static73.anInt1628 = 1;
		Static72.aBoolean125 = true;
		Static11.anInt210 = 0;
		Static183.aBoolean279 = true;
		Static120.anInt2646 = 0;
		Static382.aBoolean487 = true;
		Static308.aBoolean416 = true;
		Static228.anInt4592 = 255;
		Static135.anInt2943 = 127;
		Static74.aBoolean127 = true;
		if (Static199.anInt4131 >= 96) {
			Static133.method2326(2);
		} else {
			Static133.method2326(0);
		}
		Static220.aBoolean317 = false;
		Static71.anInt1579 = Static205.anInt4226 == 1 ? 2 : 4;
		Static42.anInt733 = 0;
		Static232.anInt4637 = 2;
		Static224.aBoolean324 = true;
		Static202.anInt4200 = 2;
		Static73.aBoolean126 = true;
		Static260.aBoolean369 = false;
		Static34.anInt592 = 0;
		Static70.aBoolean117 = false;
		@Pc(94) Class248 local94 = null;
		try {
			@Pc(98) Class86 local98 = arg0.method3248();
			while (local98.anInt2590 == 0) {
				Static215.method3855(1L);
			}
			if (local98.anInt2590 == 1) {
				local94 = (Class248) local98.anObject2;
				@Pc(125) byte[] local125 = new byte[(int) local94.method6007()];
				@Pc(140) int local140;
				for (@Pc(127) int local127 = 0; local127 < local125.length; local127 += local140) {
					local140 = local94.method6006(local127, local125, local125.length - local127);
					if (local140 == -1) {
						throw new IOException("EOF");
					}
				}
				Static350.method5577(new Class2_Sub24(local125));
			}
		} catch (@Pc(164) Exception local164) {
		}
		try {
			if (local94 != null) {
				local94.method6004();
			}
		} catch (@Pc(171) Exception local171) {
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIILclient!g;III)V")
	public static void method5969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class83 arg2) {
		Static333.anInt6164 = 2;
		Static84.anInt1838 = arg1;
		Static131.anInt2857 = 0;
		Static19.anInt320 = arg0;
		Static194.aClass83_72 = arg2;
		Static348.anInt6384 = 1;
		Static350.aBoolean465 = false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public static void method5974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static85.aClass38_1 == Static202.aClass38_2) {
			if (!Static312.method5048(1, false, 0, arg1, 0, -2, arg0, 1)) {
				Static312.method5048(1, false, 0, arg1, 0, -3, arg0, 1);
			}
		} else if (!Static312.method5048(1, false, 0, arg1, 0, -3, arg0, 1)) {
			Static312.method5048(1, false, 0, arg1, 0, -2, arg0, 1);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)Z")
	public static boolean method5976(@OriginalArg(0) int arg0) {
		if (arg0 == 46 || arg0 == 48 || arg0 == 30 || arg0 == 5 || arg0 == 25) {
			return true;
		} else {
			return arg0 == 6 || arg0 == 1008;
		}
	}
}
