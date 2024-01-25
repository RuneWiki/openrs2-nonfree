import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!it", name = "r", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_73 = new Class140("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!it", name = "w", descriptor = "Z")
	public static boolean aBoolean287 = true;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Z")
	public static boolean method2839(@OriginalArg(1) int arg0) {
		if (Static230.aBooleanArray26[arg0]) {
			return true;
		} else if (Static14.aClass104_9.method2746(arg0)) {
			@Pc(23) int local23 = Static14.aClass104_9.method2745(arg0);
			if (local23 == 0) {
				Static230.aBooleanArray26[arg0] = true;
				return true;
			}
			if (Static264.aClass68ArrayArray1[arg0] == null) {
				Static264.aClass68ArrayArray1[arg0] = new Class68[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static264.aClass68ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static14.aClass104_9.method2756(arg0, local45);
					if (local59 != null) {
						@Pc(71) Class68 local71 = Static264.aClass68ArrayArray1[arg0][local45] = new Class68();
						local71.anInt1857 = local45 + (arg0 << 16);
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method1872(new Class2_Sub12(local59));
					}
				}
			}
			Static230.aBooleanArray26[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)V")
	public static void method2840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class141 local7 = Static301.method5064(arg1);
		@Pc(10) int local10 = local7.anInt4854;
		@Pc(13) int local13 = local7.anInt4852;
		@Pc(24) int local24 = local7.anInt4853;
		@Pc(30) int local30 = Class149.anIntArray396[local24 - local13];
		if (arg0 < 0 || arg0 > local30) {
			arg0 = 0;
		}
		local30 <<= local13;
		Static160.method3259(~local30 & Static258.anIntArray417[local10] | arg0 << local13 & local30, local10);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)V")
	public static void method2842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub9_Sub4 local16 = Static98.method1971(15, 0);
		local16.method1801();
		local16.anInt1729 = arg1;
		local16.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	public static void method2843() {
		for (@Pc(10) Class2_Sub9_Sub21 local10 = (Class2_Sub9_Sub21) Static129.aClass180_22.method4919(); local10 != null; local10 = (Class2_Sub9_Sub21) Static129.aClass180_22.method4916()) {
			@Pc(15) Class1_Sub2_Sub5 local15 = local10.aClass1_Sub2_Sub5_1;
			if (local15.aByte77 != Static291.anInt5263 || Static6.anInt91 > local15.anInt4611) {
				local10.method5723();
				local15.method3964();
			} else if (Static6.anInt91 >= local15.anInt4597) {
				if (local15.anInt4599 > 0) {
					@Pc(48) Class1_Sub2_Sub3_Sub2 local48 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local15.anInt4599 - 1];
					if (local48 != null && local48.anInt6893 >= 0 && local48.anInt6893 < Static66.anInt1177 * 128 && local48.anInt6888 >= 0 && Static12.anInt213 * 128 > local48.anInt6888) {
						local15.method3962(local48.anInt6888, Static97.method1899(local15.aByte77, local48.anInt6888, local48.anInt6893) - local15.anInt4590, local48.anInt6893, Static6.anInt91);
					}
				}
				if (local15.anInt4599 < 0) {
					@Pc(100) int local100 = -local15.anInt4599 - 1;
					@Pc(109) Class1_Sub2_Sub3_Sub1 local109;
					if (local100 == Static217.anInt4819) {
						local109 = Static177.aClass1_Sub2_Sub3_Sub1_1;
					} else {
						local109 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local100];
					}
					if (local109 != null && local109.anInt6893 >= 0 && Static66.anInt1177 * 128 > local109.anInt6893 && local109.anInt6888 >= 0 && local109.anInt6888 < Static12.anInt213 * 128) {
						local15.method3962(local109.anInt6888, Static97.method1899(local15.aByte77, local109.anInt6888, local109.anInt6893) - local15.anInt4590, local109.anInt6893, Static6.anInt91);
					}
				}
				local15.method3969(Static170.anInt5086);
				Static342.method5581(local15, true);
			}
		}
	}
}
