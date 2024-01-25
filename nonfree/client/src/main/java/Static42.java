import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!ra;")
	public static Class170 aClass170_8;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "Lclient!vn;")
	public static final Class211 aClass211_2 = new Class211();

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_13 = new Class66(10);

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BIIIIII)V")
	public static void method902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class96 local8 = Static305.method5232(arg3, arg5);
		if (local8 != null && local8.anObjectArray5 != null) {
			@Pc(17) Class5_Sub12 local17 = new Class5_Sub12();
			local17.anObjectArray3 = local8.anObjectArray5;
			local17.aClass96_4 = local8;
			Static223.method3891(local17);
		}
		Static20.aBoolean40 = true;
		Static257.anInt5013 = arg4;
		Static258.anInt5020 = arg0;
		Static156.anInt3126 = arg2;
		Static151.anInt3085 = arg5;
		Static240.anInt4648 = arg1;
		Static21.anInt6209 = arg3;
		Static336.method4719(local8);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BILclient!bk;Lclient!am;)V")
	public static void method904(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(3) Class10 arg2) {
		@Pc(14) Class5_Sub21 local14 = new Class5_Sub21();
		local14.anInt2422 = arg1.method1832();
		local14.anInt2421 = arg1.method1826();
		local14.aClass60Array1 = new Class60[local14.anInt2422];
		local14.aClass60Array2 = new Class60[local14.anInt2422];
		local14.aByteArrayArrayArray13 = new byte[local14.anInt2422][][];
		local14.anIntArray146 = new int[local14.anInt2422];
		local14.anIntArray145 = new int[local14.anInt2422];
		local14.anIntArray147 = new int[local14.anInt2422];
		for (@Pc(56) int local56 = 0; local56 < local14.anInt2422; local56++) {
			try {
				@Pc(62) int local62 = arg1.method1832();
				@Pc(82) String local82;
				@Pc(86) String local86;
				@Pc(90) int local90;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local82 = arg1.method1840();
					local86 = arg1.method1840();
					local90 = 0;
					if (local62 == 1) {
						local90 = arg1.method1826();
					}
					local14.anIntArray147[local56] = local62;
					local14.anIntArray146[local56] = local90;
					local14.aClass60Array2[local56] = arg2.method334(local86, Static280.method4738(local82));
				} else if (local62 == 3 || local62 == 4) {
					local82 = arg1.method1840();
					local86 = arg1.method1840();
					local90 = arg1.method1832();
					@Pc(93) String[] local93 = new String[local90];
					for (@Pc(95) int local95 = 0; local95 < local90; local95++) {
						local93[local95] = arg1.method1840();
					}
					@Pc(110) byte[][] local110 = new byte[local90][];
					@Pc(123) int local123;
					if (local62 == 3) {
						for (@Pc(117) int local117 = 0; local117 < local90; local117++) {
							local123 = arg1.method1826();
							local110[local117] = new byte[local123];
							arg1.method1860(local110[local117], local123);
						}
					}
					local14.anIntArray147[local56] = local62;
					@Pc(152) Class[] local152 = new Class[local90];
					for (local123 = 0; local123 < local90; local123++) {
						local152[local123] = Static280.method4738(local93[local123]);
					}
					local14.aClass60Array1[local56] = arg2.method335(local86, local152, Static280.method4738(local82));
					local14.aByteArrayArrayArray13[local56] = local110;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local14.anIntArray145[local56] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local14.anIntArray145[local56] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local14.anIntArray145[local56] = -3;
			} catch (@Pc(258) Exception local258) {
				local14.anIntArray145[local56] = -4;
			} catch (@Pc(265) Throwable local265) {
				local14.anIntArray145[local56] = -5;
			}
		}
		Static148.aClass211_14.method5609(local14);
	}
}
