import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!uha", name = "j", descriptor = "I")
	public static int anInt9418;

	@OriginalMember(owner = "client!uha", name = "l", descriptor = "I")
	public static int anInt9419;

	@OriginalMember(owner = "client!uha", name = "y", descriptor = "I")
	public static int anInt9431;

	@OriginalMember(owner = "client!uha", name = "D", descriptor = "Lclient!qg;")
	public static Class3_Sub42 aClass3_Sub42_2;

	@OriginalMember(owner = "client!uha", name = "k", descriptor = "Z")
	public static boolean aBoolean708 = true;

	@OriginalMember(owner = "client!uha", name = "n", descriptor = "I")
	public static int anInt9421 = 0;

	@OriginalMember(owner = "client!uha", name = "s", descriptor = "I")
	public static int anInt9425 = 100;

	@OriginalMember(owner = "client!uha", name = "t", descriptor = "I")
	public static int anInt9426 = 100;

	@OriginalMember(owner = "client!uha", name = "x", descriptor = "I")
	public static final int anInt9430 = 1401;

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)Z")
	public static boolean method8072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static403.method6304(arg0, arg1) || Static354.method5710(arg1, arg0);
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(III)I")
	public static int method8074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static185.method3036(arg0 - 1, arg1 + -1) + Static185.method3036(arg0 - 1, arg1 + 1) + Static185.method3036(arg0 + 1, arg1 - 1) + Static185.method3036(arg0 + 1, arg1 + 1);
		@Pc(77) int local77 = Static185.method3036(arg0, arg1 - 1) + Static185.method3036(arg0, arg1 + 1) + Static185.method3036(arg0 - 1, arg1) + Static185.method3036(arg0 + 1, arg1);
		@Pc(84) int local84 = Static185.method3036(arg0, arg1);
		return local84 / 4 + local45 / 16 + local77 / 8;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lclient!nf;B)V")
	public static void method8075(@OriginalArg(0) Class236 arg0) {
		Static79.aClass236_1 = arg0;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Z)I")
	public static int method8076() {
		@Pc(7) Class82 local7 = Static266.aClass82_8;
		@Pc(9) boolean local9 = false;
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static205.method7240(0, local18, (Class343) null, (Interface5) null, 0);
			local9 = true;
		}
		@Pc(35) long local35 = Static191.method3071();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method6122();
		}
		@Pc(72) int local72 = (int) (Static191.method3071() - local35);
		local7.method6134(0, 100, 100, -16777216, 0);
		if (local9) {
			local7.method6133();
		}
		return local72;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(B[Lclient!fd;)V")
	public static void method8078(@OriginalArg(1) Class103[] arg0) {
		Static562.anInt9322 = arg0.length;
		Static234.anIntArray255 = new int[Static562.anInt9322 + 10];
		Static307.aClass103Array12 = new Class103[Static562.anInt9322 + 10];
		Static651.method752(arg0, 0, Static307.aClass103Array12, 0, Static562.anInt9322);
		for (@Pc(31) int local31 = 0; local31 < Static562.anInt9322; local31++) {
			Static234.anIntArray255[local31] = Static307.aClass103Array12[local31].method7451();
		}
		for (@Pc(50) int local50 = Static562.anInt9322; local50 < Static307.aClass103Array12.length; local50++) {
			Static234.anIntArray255[local50] = 12;
		}
	}
}
