import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!hm;IZI)V")
	public static void method650(@OriginalArg(1) Class107 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg0.anInt2648;
		if (arg0.aByte48 == 0) {
			arg0.anInt2648 = arg0.anInt2630;
		} else if (arg0.aByte48 == 1) {
			arg0.anInt2648 = arg1 - arg0.anInt2630;
		} else if (arg0.aByte48 == 2) {
			arg0.anInt2648 = arg0.anInt2630 * arg1 >> 14;
		}
		@Pc(45) int local45 = arg0.anInt2606;
		if (arg0.aByte47 == 0) {
			arg0.anInt2606 = arg0.anInt2640;
		} else if (arg0.aByte47 == 1) {
			arg0.anInt2606 = arg3 - arg0.anInt2640;
		} else if (arg0.aByte47 == 2) {
			arg0.anInt2606 = arg0.anInt2640 * arg3 >> 14;
		}
		if (arg0.aByte48 == 4) {
			arg0.anInt2648 = arg0.anInt2664 * arg0.anInt2606 / arg0.anInt2638;
		}
		if (arg0.aByte47 == 4) {
			arg0.anInt2606 = arg0.anInt2648 * arg0.anInt2638 / arg0.anInt2664;
		}
		if (Static312.aBoolean465 && (Static55.method767(arg0).anInt3891 != 0 || arg0.anInt2598 == 0)) {
			if (arg0.anInt2606 < 5 && arg0.anInt2648 < 5) {
				arg0.anInt2606 = 5;
				arg0.anInt2648 = 5;
			} else {
				if (arg0.anInt2606 <= 0) {
					arg0.anInt2606 = 5;
				}
				if (arg0.anInt2648 <= 0) {
					arg0.anInt2648 = 5;
				}
			}
		}
		if (Static286.anInt4796 == arg0.anInt2588) {
			Static440.aClass107_7 = arg0;
		}
		if (arg2 && arg0.anObjectArray20 != null && (local8 != arg0.anInt2648 || arg0.anInt2606 != local45)) {
			@Pc(187) Class1_Sub11 local187 = new Class1_Sub11();
			local187.anObjectArray2 = arg0.anObjectArray20;
			local187.aClass107_2 = arg0;
			Static328.aClass14_38.method205(local187);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
	public static String method652(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString6 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			@Pc(59) String local59 = local53.readLine();
			if (local59 == null) {
				return local24 + "| " + local56;
			}
			@Pc(65) int local65 = local59.indexOf(40);
			@Pc(72) int local72 = local59.indexOf(41, local65 + 1);
			@Pc(78) String local78;
			if (local65 == -1) {
				local78 = local59;
			} else {
				local78 = local59.substring(0, local65);
			}
			local78 = local78.trim();
			local78 = local78.substring(local78.lastIndexOf(32) + 1);
			local78 = local78.substring(local78.lastIndexOf(9) + 1);
			local24 = local24 + local78;
			if (local65 != -1 && local72 != -1) {
				@Pc(125) int local125 = local59.indexOf(".java:", local65);
				if (local125 >= 0) {
					local24 = local24 + local59.substring(local125 + 5, local72);
				}
			}
			local24 = local24 + ' ';
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIILclient!hr;)V")
	public static void method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub5 arg4) {
		@Pc(4) Class216 local4 = Static161.method2122(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt5778 = (arg1 << Static41.anInt612) + Static324.anInt5325;
		arg4.anInt5777 = arg3;
		arg4.anInt5783 = (arg2 << Static41.anInt612) + Static324.anInt5325;
		for (@Pc(28) Class259 local28 = local4.aClass259_1; local28 != null; local28 = local28.aClass259_4) {
			if (local28.aClass11_Sub1_2.aBoolean563) {
				@Pc(38) int local38 = local28.aClass11_Sub1_2.method5184();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt5777 += local8;
			arg4.aBoolean518 = true;
		} else if (local4.aClass11_Sub2_2 != null) {
			arg4.anInt5777 -= local4.aClass11_Sub2_2.aShort71;
		}
		local4.aClass11_Sub5_1 = arg4;
	}
}
