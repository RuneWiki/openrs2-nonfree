import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_2;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "Lclient!pe;")
	public static Class13 aClass13_6;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "[I")
	public static int[] anIntArray79 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_180 = Static158.method3034("(U4");

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	public static int anInt752 = 0;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_181 = Static158.method3034("; Max)2Age=");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)[Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2[] method611() {
		@Pc(8) Class2_Sub1_Sub7_Sub2[] local8 = new Class2_Sub1_Sub7_Sub2[Static176.anInt4297];
		for (@Pc(10) int local10 = 0; local10 < Static176.anInt4297; local10++) {
			@Pc(21) Class2_Sub1_Sub7_Sub2 local21 = new Class2_Sub1_Sub7_Sub2();
			local21.anInt1593 = Static175.anInt4257;
			local21.anInt1591 = Static93.anInt2723;
			local21.anInt1595 = Static30.anIntArray96[local10];
			local21.anInt1592 = Static30.anIntArray95[local10];
			local21.anInt1596 = Static178.anIntArray468[local10];
			local21.anInt1594 = Static103.anIntArray342[local10];
			local21.anIntArray158 = Static16.anIntArray43;
			local21.aByteArray19 = Static197.aByteArrayArray10[local10];
			local8[local10] = local21;
		}
		Static81.method1910();
		return local8;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	public static void method612() {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Static184.aClass67_12.method2848(); local10 != null; local10 = (Class2_Sub19) Static184.aClass67_12.method2851()) {
			if (local10.aClass2_Sub7_Sub3_2 != null) {
				Static178.aClass2_Sub7_Sub4_2.method3316(local10.aClass2_Sub7_Sub3_2);
				local10.aClass2_Sub7_Sub3_2 = null;
			}
			if (local10.aClass2_Sub7_Sub3_3 != null) {
				Static178.aClass2_Sub7_Sub4_2.method3316(local10.aClass2_Sub7_Sub3_3);
				local10.aClass2_Sub7_Sub3_3 = null;
			}
		}
		Static184.aClass67_12.method2847();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method614(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			arg0 = local15.aThrowable1;
			local10 = local15.aString2 + " | ";
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(59) String local59 = local53.readLine();
				if (local59 == null) {
					return local10 + "| " + local56;
				}
				@Pc(65) int local65 = local59.indexOf(40);
				@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
				if (local65 >= 0 && local72 >= 0) {
					@Pc(83) String local83 = local59.substring(local65 + 1, local72);
					@Pc(87) int local87 = local83.indexOf(".java:");
					if (local87 >= 0) {
						local83 = local83.substring(0, local87) + local83.substring(local87 + 5);
						local10 = local10 + local83 + ' ';
						continue;
					}
					local59 = local59.substring(0, local65);
				}
				local59 = local59.trim();
				local59 = local59.substring(local59.lastIndexOf(32) + 1);
				local59 = local59.substring(local59.lastIndexOf(9) + 1);
				local10 = local10 + local59 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ob;ILclient!ob;Lclient!pe;)Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 method616(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class13 arg2) {
		@Pc(8) int local8 = arg2.method527(arg0);
		@Pc(22) int local22 = arg2.method514(local8, arg1);
		return Static130.method2736(arg2, local8, local22);
	}
}
