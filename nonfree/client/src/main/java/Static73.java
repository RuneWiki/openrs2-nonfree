import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!fc", name = "nb", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt1334 = 0;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt1335 = 0;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public static int anInt1343 = 0;

	@OriginalMember(owner = "client!fc", name = "R", descriptor = "Z")
	public static boolean aBoolean104 = true;

	@OriginalMember(owner = "client!fc", name = "ab", descriptor = "Z")
	public static boolean aBoolean106 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/Throwable;Z)Ljava/lang/String;")
	public static String method1084(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(21) String local21;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			local21 = local11.aString104 + " | ";
			arg0 = local11.aThrowable1;
		} else {
			local21 = "";
		}
		@Pc(35) StringWriter local35 = new StringWriter();
		@Pc(40) PrintWriter local40 = new PrintWriter(local35);
		arg0.printStackTrace(local40);
		local40.close();
		@Pc(48) String local48 = local35.toString();
		@Pc(56) BufferedReader local56 = new BufferedReader(new StringReader(local48));
		@Pc(59) String local59 = local56.readLine();
		while (true) {
			@Pc(62) String local62 = local56.readLine();
			if (local62 == null) {
				return local21 + "| " + local59;
			}
			@Pc(70) int local70 = local62.indexOf(40);
			@Pc(77) int local77 = local62.indexOf(41, local70 + 1);
			@Pc(82) String local82;
			if (local70 == -1) {
				local82 = local62;
			} else {
				local82 = local62.substring(0, local70);
			}
			local82 = local82.trim();
			local82 = local82.substring(local82.lastIndexOf(32) + 1);
			local82 = local82.substring(local82.lastIndexOf(9) + 1);
			local21 = local21 + local82;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local62.indexOf(".java:", local70);
				if (local130 >= 0) {
					local21 = local21 + local62.substring(local130 + 5, local77);
				}
			}
			local21 = local21 + ' ';
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	public static void method1097() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glDisableClientState(32886);
		Static178.method2776(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static178.method2784();
		for (@Pc(19) int local19 = 0; local19 < Static42.aClass4_Sub14ArrayArray1[0].length; local19++) {
			@Pc(31) Class4_Sub14 local31 = Static42.aClass4_Sub14ArrayArray1[0][local19];
			if (local31.anInt1879 >= 0 && Static262.method3974(Static204.anInterface2_1.method1983(local31.anInt1879))) {
				local1.glColor4fv(Static257.method3881(local31.anInt1875), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean140 ? 1.0F : 0.5F);
				local31.method1453(Static127.aClass4_Sub11ArrayArrayArray1, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static178.method2757();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static178.method2748();
	}
}
