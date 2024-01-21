import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!md;")
	public static Class30 aClass30_2;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub2Array3;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt53 = 0;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!oa;")
	private static Class56 aClass56_49 = Static33.method650("This world is full)3");

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!oa;")
	public static Class56 aClass56_50 = aClass56_49;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public static int anInt54 = 1;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[104][104];

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_51 = Static33.method650("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_52 = Static33.method650("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
	public static int anInt59 = 0;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_53 = Static33.method650("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
	public static int anInt60 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method37() {
		aClass56_49 = null;
		aClass3_Sub1_Sub1_Sub2Array3 = null;
		aClass56_50 = null;
		anIntArrayArray1 = null;
		aClass56_53 = null;
		aClass56_52 = null;
		aClass30_2 = null;
		aClass56_51 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BII)I")
	public static int method38(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Static28.method575(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method39() {
		for (@Pc(10) Class3_Sub6 local10 = (Class3_Sub6) Static67.aClass37_11.method989(); local10 != null; local10 = (Class3_Sub6) Static67.aClass37_11.method990()) {
			if (local10.anInt947 == -1) {
				local10.anInt949 = 0;
				Static52.method987(local10);
			} else {
				local10.method2055();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method40(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString1 + " | ";
			arg0 = local15.aThrowable1;
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
					@Pc(89) String local89 = local59.substring(local65 + 1, local72);
					@Pc(93) int local93 = local89.indexOf(".java:");
					if (local93 >= 0) {
						local89 = local89.substring(0, local93) + local89.substring(local93 + 5);
						local10 = local10 + local89 + ' ';
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
}
