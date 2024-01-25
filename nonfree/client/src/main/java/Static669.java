import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "Lclient!kl;")
	public static Class196 aClass196_2;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "F")
	public static float aFloat238;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "F")
	public static float aFloat237 = 1.0F;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!bt;ZIIZII)V")
	public static void method8919(@OriginalArg(0) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		Static566.anInt8739 = arg1;
		Static586.aClass34_116 = arg0;
		Static670.anInt6846 = 2;
		Static91.anInt1809 = 1;
		Static414.anInt5938 = arg2;
		Static46.anInt907 = 0;
		Static466.aBoolean583 = false;
		Static554.aClass4_Sub3_Sub4_5 = null;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IJLclient!ha;)V")
	public static void method8921(@OriginalArg(1) long arg0, @OriginalArg(2) Class33 arg1) {
		Static250.anInt4101 = 0;
		Static369.anInt5530 = Static516.anInt8026;
		Static561.anInt8624 = 0;
		Static516.anInt8026 = 0;
		@Pc(16) long local16 = Static429.method5935();
		for (@Pc(21) Class3_Sub7 local21 = (Class3_Sub7) Static645.aClass236_10.method4958(); local21 != null; local21 = (Class3_Sub7) Static645.aClass236_10.method4950()) {
			if (local21.method7306(arg1, arg0)) {
				Static561.anInt8624++;
			}
		}
		if (Static299.aBoolean349 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static645.aClass236_10.method4954() + ", running: " + Static561.anInt8624);
			System.out.println("Emitters: " + Static250.anInt4101 + " Particles: " + Static516.anInt8026 + ". Time taken: " + (Static429.method5935() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIB)V")
	public static void method8922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub5_Sub11 local13 = Static652.method8695((long) arg1, 14);
		local13.method3955();
		local13.anInt4427 = arg0;
	}
}
