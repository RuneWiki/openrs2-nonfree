import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!nb", name = "V", descriptor = "[Lclient!of;")
	public static Class40[] aClass40Array27;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "Lclient!bn;")
	public static final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
	public static volatile int anInt3763 = 0;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString160 = "flash2:";

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!nb", name = "W", descriptor = "I")
	public static int anInt3768 = -1;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
	public static void method3689() {
		Static54.aClass108_7.method2909();
		Static252.aClass108_28.method2909();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(JZBII)Ljava/lang/String;")
	public static String method3690(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg2 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg2 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg0 < 0L) {
			arg0 = -arg0;
			local22 = true;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg3 > 0) {
			for (local48 = 0; local48 < arg3; local48++) {
				local53 = (int) arg0;
				arg0 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg0 * 10));
			}
			local41.append(local7);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg0;
			arg0 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local22) {
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

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIBI)V")
	public static void method3691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static6.method125(arg3, Static230.anInt4308, Static327.anInt3039);
		@Pc(17) int local17 = Static6.method125(arg2, Static230.anInt4308, Static327.anInt3039);
		@Pc(33) int local33 = Static6.method125(arg4, Static265.anInt4933, Static311.anInt5837);
		@Pc(39) int local39 = Static6.method125(arg0, Static265.anInt4933, Static311.anInt5837);
		for (@Pc(41) int local41 = local11; local41 <= local17; local41++) {
			Static14.method247(local39, arg1, Static11.anIntArrayArray11[local41], local33);
		}
	}

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "(B)Lclient!iq;")
	public static Class6_Sub2_Sub8 method3692() {
		@Pc(15) Class6_Sub2_Sub8 local15 = (Class6_Sub2_Sub8) Static156.aClass143_15.method3766();
		if (local15 != null) {
			local15.method5756();
			local15.method5761();
			return local15;
		}
		do {
			local15 = (Class6_Sub2_Sub8) Static176.aClass143_12.method3766();
			if (local15 == null) {
				return null;
			}
			if (local15.method2644() > Static245.method4300()) {
				return null;
			}
			local15.method5756();
			local15.method5761();
		} while ((local15.aLong219 & Long.MIN_VALUE) == 0L);
		return local15;
	}
}
