import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
	public static boolean aBoolean93 = false;

	@OriginalMember(owner = "client!id", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_631 = Static158.method3034("Loading title screen )2 ");

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Lclient!ob;")
	public static Class60 aClass60_629 = aClass60_631;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_630 = Static158.method3034("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public static int anInt2336 = 0;

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_632 = Static158.method3034("Lade)3)3)3");

	@OriginalMember(owner = "client!id", name = "v", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_633 = Static158.method3034("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!id", name = "B", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_635 = Static158.method3034("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!id", name = "x", descriptor = "Lclient!ob;")
	public static Class60 aClass60_634 = aClass60_635;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
	public static final int[] anIntArray263 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!id", name = "E", descriptor = "Lclient!ob;")
	public static Class60 aClass60_636 = aClass60_633;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!og;IILclient!t;)V")
	public static void method1866(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class81 arg2) {
		@Pc(5) Class2_Sub24 local5 = new Class2_Sub24();
		local5.anInt4556 = arg0.method218();
		local5.anInt4560 = arg0.method206();
		local5.anIntArray494 = new int[local5.anInt4556];
		local5.anIntArray496 = new int[local5.anInt4556];
		local5.anIntArray495 = new int[local5.anInt4556];
		local5.aByteArrayArrayArray42 = new byte[local5.anInt4556][][];
		local5.aClass25Array1 = new Class25[local5.anInt4556];
		local5.aClass25Array2 = new Class25[local5.anInt4556];
		for (@Pc(58) int local58 = 0; local58 < local5.anInt4556; local58++) {
			try {
				@Pc(64) int local64 = arg0.method218();
				@Pc(91) String local91;
				@Pc(100) String local100;
				@Pc(106) int local106;
				if (local64 == 0 || local64 == 1 || local64 == 2) {
					local91 = new String(arg0.method240().method2674());
					local100 = new String(arg0.method240().method2674());
					local106 = 0;
					if (local64 == 1) {
						local106 = arg0.method206();
					}
					local5.anIntArray495[local58] = local64;
					local5.anIntArray494[local58] = local106;
					local5.aClass25Array1[local58] = arg2.method3157(local100, Static33.method822(local91));
				} else if (local64 == 3 || local64 == 4) {
					local91 = new String(arg0.method240().method2674());
					local100 = new String(arg0.method240().method2674());
					local106 = arg0.method218();
					@Pc(109) String[] local109 = new String[local106];
					for (@Pc(111) int local111 = 0; local111 < local106; local111++) {
						local109[local111] = new String(arg0.method240().method2674());
					}
					@Pc(137) byte[][] local137 = new byte[local106][];
					@Pc(150) int local150;
					if (local64 == 3) {
						for (@Pc(144) int local144 = 0; local144 < local106; local144++) {
							local150 = arg0.method206();
							local137[local144] = new byte[local150];
							arg0.method228(local150, local137[local144]);
						}
					}
					@Pc(170) Class[] local170 = new Class[local106];
					local5.anIntArray495[local58] = local64;
					for (local150 = 0; local150 < local106; local150++) {
						local170[local150] = Static33.method822(local109[local150]);
					}
					local5.aClass25Array2[local58] = arg2.method3154(local100, Static33.method822(local91), local170);
					local5.aByteArrayArrayArray42[local58] = local137;
				}
			} catch (@Pc(270) ClassNotFoundException local270) {
				local5.anIntArray496[local58] = -1;
			} catch (@Pc(277) SecurityException local277) {
				local5.anIntArray496[local58] = -2;
			} catch (@Pc(284) NullPointerException local284) {
				local5.anIntArray496[local58] = -3;
			} catch (@Pc(291) Exception local291) {
				local5.anIntArray496[local58] = -4;
			} catch (@Pc(298) Throwable local298) {
				local5.anIntArray496[local58] = -5;
			}
		}
		Static49.aClass67_3.method2843(local5);
	}
}
