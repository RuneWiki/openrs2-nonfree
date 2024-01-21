import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "Lclient!a;")
	public static Class1 aClass1_47;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "Lclient!gh;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
	public static int anInt3591 = -1;

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "[I")
	public static final int[] anIntArray350 = new int[32];

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
	public static int anInt3596 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!ja;")
	public static Class4_Sub1_Sub9 method2731(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub9 local10 = (Class4_Sub1_Sub9) Static4.aClass66_40.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static106.aClass62_27.method2878(4, arg0);
		local10 = new Class4_Sub1_Sub9();
		if (local20 != null) {
			local10.method1605(arg0, new Class4_Sub11(local20));
		}
		Static4.aClass66_40.method2222(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public static void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static28.aBoolean38 = true;
		Static26.anInt651 = arg0;
		Static30.anInt762 = arg1;
		Static134.anInt3184 = arg2;
		Static104.anInt2621 = -1;
		Static188.anInt4186 = -1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!ac;)V")
	public static void method2734(@OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt2792 == 0) {
			return;
		}
		@Pc(41) int local41;
		@Pc(48) int local48;
		if (arg0.anInt2799 != -1 && arg0.anInt2799 < 32768) {
			@Pc(33) Class4_Sub1_Sub1_Sub1_Sub2 local33 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt2799];
			if (local33 != null) {
				local41 = arg0.anInt2832 - local33.anInt2832;
				local48 = arg0.anInt2803 - local33.anInt2803;
				if (local41 != 0 || local48 != 0) {
					arg0.anInt2829 = (int) (Math.atan2((double) local41, (double) local48) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(78) int local78;
		if (arg0.anInt2799 >= 32768) {
			local78 = arg0.anInt2799 - 32768;
			if (local78 == Static151.anInt3441) {
				local78 = 2047;
			}
			@Pc(87) Class4_Sub1_Sub1_Sub1_Sub1 local87 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local78];
			if (local87 != null) {
				local48 = arg0.anInt2832 - local87.anInt2832;
				@Pc(103) int local103 = arg0.anInt2803 - local87.anInt2803;
				if (local48 != 0 || local103 != 0) {
					arg0.anInt2829 = (int) (Math.atan2((double) local48, (double) local103) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2817 != 0 || arg0.anInt2791 != 0) && (arg0.anInt2823 == 0 || arg0.anInt2838 > 0)) {
			local78 = arg0.anInt2832 - (arg0.anInt2817 - Static103.anInt2610 - Static103.anInt2610) * 64;
			local41 = arg0.anInt2803 - (arg0.anInt2791 - Static184.anInt4144 - Static184.anInt4144) * 64;
			if (local78 != 0 || local41 != 0) {
				arg0.anInt2829 = (int) (Math.atan2((double) local78, (double) local41) * 325.949D) & 0x7FF;
			}
			arg0.anInt2817 = 0;
			arg0.anInt2791 = 0;
		}
		local78 = arg0.anInt2829 - arg0.anInt2822 & 0x7FF;
		if (local78 == 0) {
			arg0.anInt2843 = 0;
			return;
		}
		arg0.anInt2843++;
		@Pc(223) boolean local223;
		if (local78 <= 1024) {
			arg0.anInt2822 += arg0.anInt2792;
			local223 = true;
			if (local78 < arg0.anInt2792 || local78 > 2048 - arg0.anInt2792) {
				arg0.anInt2822 = arg0.anInt2829;
				local223 = false;
			}
			if (arg0.anInt2816 == arg0.anInt2809 && (arg0.anInt2843 > 25 || local223)) {
				if (arg0.anInt2789 == -1) {
					arg0.anInt2809 = arg0.anInt2810;
				} else {
					arg0.anInt2809 = arg0.anInt2789;
				}
			}
		} else {
			arg0.anInt2822 -= arg0.anInt2792;
			local223 = true;
			if (arg0.anInt2792 > local78 || local78 > 2048 - arg0.anInt2792) {
				arg0.anInt2822 = arg0.anInt2829;
				local223 = false;
			}
			if (arg0.anInt2816 == arg0.anInt2809 && (arg0.anInt2843 > 25 || local223)) {
				if (arg0.anInt2796 == -1) {
					arg0.anInt2809 = arg0.anInt2810;
				} else {
					arg0.anInt2809 = arg0.anInt2796;
				}
			}
		}
		arg0.anInt2822 &= 0x7FF;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method2735(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			local17 = local7.aString2 + " | ";
			arg0 = local7.aThrowable1;
		} else {
			local17 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(53) String local53 = local32.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local17 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(94) String local94 = local67.substring(local73 + 1, local80);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local17 = local17 + local94 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local17 = local17 + local67 + ' ';
			}
		}
	}
}
