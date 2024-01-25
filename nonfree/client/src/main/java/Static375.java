import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
	public static int anInt6241;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Z")
	public static boolean aBoolean416 = true;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4931(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static12.method193(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static244.anInt3939; local25++) {
			@Pc(31) String local31 = Static225.aStringArray27[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static12.method193(local31);
			if (local31 != null && local31.equals(local20)) {
				Static244.anInt3939--;
				for (@Pc(55) int local55 = local25; local55 < Static244.anInt3939; local55++) {
					Static225.aStringArray27[local55] = Static225.aStringArray27[local55 + 1];
					Static88.aStringArray48[local55] = Static88.aStringArray48[local55 + 1];
					Static226.anIntArray238[local55] = Static226.anIntArray238[local55 + 1];
					Static10.aStringArray3[local55] = Static10.aStringArray3[local55 + 1];
					Static211.anIntArray217[local55] = Static211.anIntArray217[local55 + 1];
					Static165.aBooleanArray10[local55] = Static165.aBooleanArray10[local55 + 1];
				}
				Static62.anInt1134 = Static319.anInt4969;
				Static288.method3576(Static36.aClass194_10);
				Static281.aClass5_Sub15_Sub2_13.method5583(Static21.method357(arg0));
				Static281.aClass5_Sub15_Sub2_13.method5545(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method4933(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(25) String local25;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local25 = local15.aString21 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local25 = "";
		}
		@Pc(36) StringWriter local36 = new StringWriter();
		@Pc(41) PrintWriter local41 = new PrintWriter(local36);
		arg0.printStackTrace(local41);
		local41.close();
		@Pc(49) String local49 = local36.toString();
		@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local49));
		@Pc(60) String local60 = local57.readLine();
		while (true) {
			@Pc(63) String local63 = local57.readLine();
			if (local63 == null) {
				return local25 + "| " + local60;
			}
			@Pc(69) int local69 = local63.indexOf(40);
			@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
			@Pc(85) String local85;
			if (local69 == -1) {
				local85 = local63;
			} else {
				local85 = local63.substring(0, local69);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local25 = local25 + local85;
			if (local69 != -1 && local76 != -1) {
				@Pc(130) int local130 = local63.indexOf(".java:", local69);
				if (local130 >= 0) {
					local25 = local25 + local63.substring(local130 + 5, local76);
				}
			}
			local25 = local25 + ' ';
		}
	}
}
