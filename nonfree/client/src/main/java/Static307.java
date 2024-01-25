import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public static int anInt6214 = 100;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)I")
	public static int method5415(@OriginalArg(1) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return local16 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ae;Lclient!na;III)V")
	public static void method5416(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class8 local12;
		if (arg3 < Static223.anInt4280) {
			local12 = Static275.aClass8ArrayArrayArray4[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass62_Sub3_1 != null && local12.aClass62_Sub3_1.method5564()) {
				arg1.method5570(true, 0, 128, local12.aClass62_Sub3_1, 0, arg0);
			}
		}
		if (arg4 < Static223.anInt4280) {
			local12 = Static275.aClass8ArrayArrayArray4[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass62_Sub3_1 != null && local12.aClass62_Sub3_1.method5564()) {
				arg1.method5570(true, 0, 0, local12.aClass62_Sub3_1, 128, arg0);
			}
		}
		if (arg3 < Static223.anInt4280 && arg4 < Static160.anInt3244) {
			local12 = Static275.aClass8ArrayArrayArray4[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass62_Sub3_1 != null && local12.aClass62_Sub3_1.method5564()) {
				arg1.method5570(true, 0, 128, local12.aClass62_Sub3_1, 128, arg0);
			}
		}
		if (arg3 < Static223.anInt4280 && arg4 > 0) {
			local12 = Static275.aClass8ArrayArrayArray4[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass62_Sub3_1 != null && local12.aClass62_Sub3_1.method5564()) {
				arg1.method5570(true, 0, 128, local12.aClass62_Sub3_1, -128, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z")
	public static boolean method5417(@OriginalArg(0) int arg0) {
		Static352.anInt6926 = arg0 + 1 & 0xFFFF;
		Static241.aBoolean425 = true;
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method5418(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString2 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local45));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			@Pc(63) String local63 = local57.readLine();
			if (local63 == null) {
				return local21 + "| " + local60;
			}
			@Pc(69) int local69 = local63.indexOf(40);
			@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
			@Pc(81) String local81;
			if (local69 == -1) {
				local81 = local63;
			} else {
				local81 = local63.substring(0, local69);
			}
			local81 = local81.trim();
			local81 = local81.substring(local81.lastIndexOf(32) + 1);
			local81 = local81.substring(local81.lastIndexOf(9) + 1);
			local21 = local21 + local81;
			if (local69 != -1 && local76 != -1) {
				@Pc(128) int local128 = local63.indexOf(".java:", local69);
				if (local128 >= 0) {
					local21 = local21 + local63.substring(local128 + 5, local76);
				}
			}
			local21 = local21 + ' ';
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!dg;)Lclient!nf;")
	public static Class79_Sub3 method5419(@OriginalArg(1) Class2_Sub10 arg0) {
		return new Class79_Sub3(arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4460(), arg0.method4463(), arg0.method4463(), arg0.method4421());
	}
}
