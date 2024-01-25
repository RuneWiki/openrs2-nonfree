import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wja", name = "C", descriptor = "I")
	public static int anInt10367;

	@OriginalMember(owner = "client!wja", name = "E", descriptor = "Lclient!lga;")
	public static Class223 aClass223_124;

	@OriginalMember(owner = "client!wja", name = "B", descriptor = "I")
	public static int anInt10368;

	@OriginalMember(owner = "client!wja", name = "K", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_123 = new Class241(58, 4);

	@OriginalMember(owner = "client!wja", name = "M", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_202 = new Class322(39, 4);

	@OriginalMember(owner = "client!wja", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[6][];

	@OriginalMember(owner = "client!wja", name = "f", descriptor = "(I)I")
	public static int method8939() {
		return Static512.anIntArray533 == null ? 0 : Static512.anIntArray533.length * 2;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method8940(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString52 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(41) StringWriter local41 = new StringWriter();
		@Pc(46) PrintWriter local46 = new PrintWriter(local41);
		arg0.printStackTrace(local46);
		local46.close();
		@Pc(54) String local54 = local41.toString();
		@Pc(62) BufferedReader local62 = new BufferedReader(new StringReader(local54));
		@Pc(65) String local65 = local62.readLine();
		while (true) {
			@Pc(68) String local68 = local62.readLine();
			if (local68 == null) {
				return local10 + "| " + local65;
			}
			@Pc(74) int local74 = local68.indexOf(40);
			@Pc(81) int local81 = local68.indexOf(41, local74 + 1);
			@Pc(93) String local93;
			if (local74 == -1) {
				local93 = local68;
			} else {
				local93 = local68.substring(0, local74);
			}
			local93 = local93.trim();
			local93 = local93.substring(local93.lastIndexOf(32) + 1);
			local93 = local93.substring(local93.lastIndexOf(9) + 1);
			local10 = local10 + local93;
			if (local74 != -1 && local81 != -1) {
				@Pc(142) int local142 = local68.indexOf(".java:", local74);
				if (local142 >= 0) {
					local10 = local10 + local68.substring(local142 + 5, local81);
				}
			}
			local10 = local10 + ' ';
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method8941(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(33) int local33 = 0;
			for (@Pc(35) long local35 = arg0; local35 != 0L; local35 /= 37L) {
				local33++;
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local33);
			while (arg0 != 0L) {
				@Pc(68) long local68 = arg0;
				arg0 /= 37L;
				@Pc(82) char local82 = Static330.aCharArray10[(int) (local68 - arg0 * 37L)];
				if (local82 == '_') {
					@Pc(92) int local92 = local62.length() - 1;
					local62.setCharAt(local92, Character.toUpperCase(local62.charAt(local92)));
					local82 = ' ';
				}
				local62.append(local82);
			}
			local62.reverse();
			local62.setCharAt(0, Character.toUpperCase(local62.charAt(0)));
			return local62.toString();
		}
	}
}
