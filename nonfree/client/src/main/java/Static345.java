import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "Lclient!wia;")
	public static Class386 aClass386_83;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "Lclient!qja;")
	public static Class26 aClass26_5;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "Lclient!ti;")
	public static final Class339 aClass339_9 = new Class339();

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "Z")
	public static boolean aBoolean438 = false;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_87 = new Class100(9, 7);

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZZIJ)Ljava/lang/String;")
	public static String method5288(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg3 < 0L) {
			local27 = true;
			arg3 = -arg3;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg2 > 0) {
			for (local48 = 0; local48 < arg2; local48++) {
				local53 = (int) arg3;
				arg3 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg3 * 10));
			}
			local41.append(local7);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg3;
			arg3 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local27) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg1) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
	public static String method5289(@OriginalArg(1) Throwable arg0) throws IOException {
		@Pc(26) String local26;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(16) RuntimeException_Sub1 local16 = (RuntimeException_Sub1) arg0;
			local26 = local16.aString29 + " | ";
			arg0 = local16.aThrowable1;
		} else {
			local26 = "";
		}
		@Pc(37) StringWriter local37 = new StringWriter();
		@Pc(42) PrintWriter local42 = new PrintWriter(local37);
		arg0.printStackTrace(local42);
		local42.close();
		@Pc(50) String local50 = local37.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local50));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local26 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(86) String local86;
			if (local70 == -1) {
				local86 = local64;
			} else {
				local86 = local64.substring(0, local70);
			}
			local86 = local86.trim();
			local86 = local86.substring(local86.lastIndexOf(32) + 1);
			local86 = local86.substring(local86.lastIndexOf(9) + 1);
			local26 = local26 + local86;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local26 = local26 + local64.substring(local130 + 5, local77);
				}
			}
			local26 = local26 + ' ';
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	public static void method5294() {
		Static130.anInt2522 = 0;
		Static143.anInt2732 = 0;
		Static563.anInt9771 = 0;
		Static473.anInt8240 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
	public static void method5295(@OriginalArg(1) int arg0) {
		Static367.anInt6812 = -1;
		if (arg0 == 37) {
			Static498.aFloat217 = 3.0F;
		} else if (arg0 == 50) {
			Static498.aFloat217 = 4.0F;
		} else if (arg0 == 75) {
			Static498.aFloat217 = 6.0F;
		} else if (arg0 == 100) {
			Static498.aFloat217 = 8.0F;
		} else if (arg0 == 200) {
			Static498.aFloat217 = 16.0F;
		}
		Static367.anInt6812 = -1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!jga;)V")
	public static void method5297(@OriginalArg(1) Class14_Sub3_Sub11 arg0) {
		if (Static505.aBoolean629) {
			return;
		}
		arg0.method9315();
		Static313.anInt9044--;
		if (!arg0.aBoolean325) {
			@Pc(25) long local25 = arg0.aLong145;
			@Pc(31) Class14_Sub3_Sub21 local31;
			for (local31 = (Class14_Sub3_Sub21) Static38.aClass187_6.method4078(local25); local31 != null && !local31.aString119.equals(arg0.aString58); local31 = (Class14_Sub3_Sub21) Static38.aClass187_6.method4086()) {
			}
			if (local31 != null && local31.method9262(arg0)) {
				Static50.method1049(local31);
				return;
			}
			return;
		}
		for (@Pc(62) Class14_Sub3_Sub21 local62 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1826(); local62 != null; local62 = (Class14_Sub3_Sub21) Static563.aClass73_11.method1827()) {
			if (local62.aString119.equals(arg0.aString58)) {
				@Pc(72) boolean local72 = false;
				for (@Pc(78) Class14_Sub3_Sub11 local78 = (Class14_Sub3_Sub11) local62.aClass73_13.method1826(); local78 != null; local78 = (Class14_Sub3_Sub11) local62.aClass73_13.method1827()) {
					if (arg0 == local78) {
						local72 = true;
						if (local62.method9262(arg0)) {
							Static50.method1049(local62);
						}
						break;
					}
				}
				if (local72) {
					return;
				}
			}
		}
	}
}
