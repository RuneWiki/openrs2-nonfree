import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!uq", name = "I", descriptor = "Lclient!paa;")
	public static Class261 aClass261_12 = null;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!vj;ILclient!mr;B)V")
	public static void method7948(@OriginalArg(0) Class2_Sub22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class226 arg2) {
		@Pc(9) Class2_Sub17 local9 = new Class2_Sub17();
		local9.anInt3528 = arg0.method8547();
		local9.anInt3529 = arg0.method8542();
		local9.anIntArray234 = new int[local9.anInt3528];
		local9.aClass108Array2 = new Class108[local9.anInt3528];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt3528][][];
		local9.anIntArray233 = new int[local9.anInt3528];
		local9.anIntArray235 = new int[local9.anInt3528];
		local9.aClass108Array1 = new Class108[local9.anInt3528];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt3528; local55++) {
			try {
				@Pc(61) int local61 = arg0.method8547();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(91) int local91;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local83 = arg0.method8549();
					local87 = arg0.method8549();
					local91 = 0;
					if (local61 == 1) {
						local91 = arg0.method8542();
					}
					local9.anIntArray235[local55] = local61;
					local9.anIntArray233[local55] = local91;
					local9.aClass108Array2[local55] = arg2.method4854(Static638.method6786(local83), local87);
				} else if (local61 == 3 || local61 == 4) {
					local83 = arg0.method8549();
					local87 = arg0.method8549();
					local91 = arg0.method8547();
					@Pc(94) String[] local94 = new String[local91];
					for (@Pc(96) int local96 = 0; local96 < local91; local96++) {
						local94[local96] = arg0.method8549();
					}
					@Pc(111) byte[][] local111 = new byte[local91][];
					@Pc(122) int local122;
					if (local61 == 3) {
						for (@Pc(116) int local116 = 0; local116 < local91; local116++) {
							local122 = arg0.method8542();
							local111[local116] = new byte[local122];
							arg0.method8502(local111[local116], 0, local122);
						}
					}
					local9.anIntArray235[local55] = local61;
					@Pc(151) Class[] local151 = new Class[local91];
					for (local122 = 0; local122 < local91; local122++) {
						local151[local122] = Static638.method6786(local94[local122]);
					}
					local9.aClass108Array1[local55] = arg2.method4844(local151, local87, Static638.method6786(local83));
					local9.aByteArrayArrayArray6[local55] = local111;
				}
			} catch (@Pc(230) ClassNotFoundException local230) {
				local9.anIntArray234[local55] = -1;
			} catch (@Pc(237) SecurityException local237) {
				local9.anIntArray234[local55] = -2;
			} catch (@Pc(244) NullPointerException local244) {
				local9.anIntArray234[local55] = -3;
			} catch (@Pc(251) Exception local251) {
				local9.anIntArray234[local55] = -4;
			} catch (@Pc(258) Throwable local258) {
				local9.anIntArray234[local55] = -5;
			}
		}
		Static568.aClass109_66.method2323(local9);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZILjava/io/File;)V")
	public static void method7949(@OriginalArg(2) File arg0) {
		if (Static466.anObject17 == null) {
			Static295.method4068();
		}
		try {
			@Pc(15) Class local15 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			@Pc(36) Method local36 = local15.getDeclaredMethod("dumpHeap", String.class, Boolean.TYPE);
			local36.invoke(Static466.anObject17, arg0.getAbsolutePath(), Boolean.valueOf(false));
		} catch (@Pc(56) Exception local56) {
			System.out.println("HeapDump error:");
			local56.printStackTrace();
		}
	}
}
