import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString160;

	@OriginalMember(owner = "client!nl", name = "E", descriptor = "Lclient!ib;")
	public static Class23 aClass23_1;

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "[I")
	public static int[] anIntArray367 = new int[2];

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
	public static int anInt4418 = 0;

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "Ljava/lang/String;")
	public static final String aString161 = "flash1:";

	@OriginalMember(owner = "client!nl", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString162 = "Please remove ";

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
	public static int anInt4419 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lclient!hs;")
	public static Class2_Sub3 method3682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class57 local7 = Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class2_Sub3 local14 = local7.aClass2_Sub3_1;
			local7.aClass2_Sub3_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method3683(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static98.aClass53_3);
		arg0.removeMouseMotionListener(Static98.aClass53_3);
		arg0.removeFocusListener(Static98.aClass53_3);
		Static288.anInt5834 = 0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!tq;I)Lclient!mr;")
	public static Class4_Sub4 method3685(@OriginalArg(0) Class4_Sub7 arg0) {
		arg0.method2380();
		@Pc(18) int local18 = arg0.method2380();
		@Pc(22) Class4_Sub4 local22 = Static48.method918(local18);
		local22.anInt6436 = arg0.method2380();
		@Pc(31) int local31 = arg0.method2380();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method2380();
			local22.method5387(local39, arg0);
		}
		local22.method5392();
		return local22;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([Lclient!fd;II)V")
	public static void method3686(@OriginalArg(0) Class72[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class72 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt1825 == 0) {
					if (local9.aClass72Array1 != null) {
						method3686(local9.aClass72Array1, arg1);
					}
					@Pc(33) Class4_Sub8 local33 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local9.anInt1830);
					if (local33 != null) {
						Static39.method733(local33.anInt1670, arg1);
					}
				}
				@Pc(49) Class4_Sub22 local49;
				if (arg1 == 0 && local9.anObjectArray2 != null) {
					local49 = new Class4_Sub22();
					local49.anObjectArray34 = local9.anObjectArray2;
					local49.aClass72_12 = local9;
					Static97.method1756(local49);
				}
				if (arg1 == 1 && local9.anObjectArray8 != null) {
					if (local9.anInt1849 >= 0) {
						@Pc(72) Class72 local72 = Static66.method1243(local9.anInt1830);
						if (local72 == null || local72.aClass72Array1 == null || local9.anInt1849 >= local72.aClass72Array1.length || local72.aClass72Array1[local9.anInt1849] != local9) {
							continue;
						}
					}
					local49 = new Class4_Sub22();
					local49.anObjectArray34 = local9.anObjectArray8;
					local49.aClass72_12 = local9;
					Static97.method1756(local49);
				}
			}
		}
	}
}
