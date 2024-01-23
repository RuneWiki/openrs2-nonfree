import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!b", name = "U", descriptor = "Lclient!kb;")
	public static Class83 aClass83_15;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "[I")
	public static int[] anIntArray22 = new int[50];

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!gn;B)V")
	public static void method289(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class66 arg1) {
		while (true) {
			@Pc(16) Class43 local16 = arg1.method1608(arg0);
			while (local16.anInt1456 == 0) {
				Static230.method4022(10L);
			}
			if (local16.anInt1456 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static230.method4022(100L);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IILclient!ek;Z)V")
	public static void method290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25_Sub1_Sub2 arg2) {
		if (arg1 == arg2.anInt1625 && arg1 != -1) {
			@Pc(19) Class163 local19 = Static115.method1895(arg1);
			@Pc(22) int local22 = local19.anInt5911;
			if (local22 == 1) {
				arg2.anInt1653 = arg0;
				arg2.anInt1619 = 1;
				arg2.anInt1614 = 0;
				arg2.anInt1608 = 0;
				arg2.anInt1670 = 0;
				Static188.method3369(arg2.anInt1604, local19, arg2.anInt1608, arg2.anInt1635, false);
			}
			if (local22 == 2) {
				arg2.anInt1670 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt1625 == -1 || Static115.method1895(arg1).anInt5905 >= Static115.method1895(arg2.anInt1625).anInt5905) {
			arg2.anInt1608 = 0;
			arg2.anInt1670 = 0;
			arg2.anInt1652 = arg2.anInt1610;
			arg2.anInt1614 = 0;
			arg2.anInt1619 = 1;
			arg2.anInt1625 = arg1;
			arg2.anInt1653 = arg0;
			if (arg2.anInt1625 != -1) {
				Static188.method3369(arg2.anInt1604, Static115.method1895(arg2.anInt1625), arg2.anInt1608, arg2.anInt1635, false);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method291(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static102.method1686(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local41 <= local44);
			return Static34.method726(arg0, local44);
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public static void method292() {
		Static141.method2524(0, 0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)V")
	public static void method293(@OriginalArg(0) int arg0) {
		if (Static275.anIntArray590 == null || Static275.anIntArray590.length < arg0) {
			Static275.anIntArray590 = new int[arg0];
		}
	}
}
