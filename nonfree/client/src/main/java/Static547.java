import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
	public static int anInt6998 = -1;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_131 = new Class286(59, 8);

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
	public static int anInt7003 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;IILclient!qj;)Lclient!bj;")
	public static Class35 method5856(@OriginalArg(0) String arg0, @OriginalArg(3) Class100_Sub3 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static286.anIntArray351, 0);
		if (Static286.anIntArray351[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class35(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
	public static int method5857() {
		@Pc(7) Class100 local7 = Static307.aClass100_6;
		@Pc(9) boolean local9 = false;
		if (Static391.anInt6846 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static448.method6213(0, 0, null, local18, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static548.method7437();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method6220();
		}
		@Pc(67) int local67 = (int) (Static548.method7437() - local35);
		local7.method6261(-16777216, 0, 0, 100, 100);
		if (local9) {
			local7.method6262();
		}
		return local67;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;ZIB)I")
	public static int method5858(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(79) int local79;
			if (local41 >= '0' && local41 <= '9') {
				local79 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local79 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local79 = local41 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local79 >= arg1) {
				throw new NumberFormatException();
			}
			if (local26) {
				local79 = -local79;
			}
			@Pc(115) int local115 = arg1 * local30 + local79;
			if (local115 / arg1 != local30) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local115;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
	public static void method5859(@OriginalArg(0) int arg0) {
		Static404.method5910(arg0, Static290.aClass198_14.method4365(Static52.anInt1264));
	}
}
