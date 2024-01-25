import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
	public static int anInt4007 = 0;

	@OriginalMember(owner = "client!kt", name = "G", descriptor = "Z")
	public static final boolean aBoolean266 = false;

	@OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
	public static int anInt4009 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIII)I")
	public static int method3324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg2 & 0xF;
		@Pc(24) int local24 = local15 >= 8 ? arg1 : arg0;
		@Pc(41) int local41 = local15 < 4 ? arg1 : local15 == 12 || local15 == 14 ? arg0 : arg3;
		return ((local15 & 0x2) == 0 ? local41 : -local41) + ((local15 & 0x1) == 0 ? local24 : -local24);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
	public static void method3325(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class6 local9 = Static172.aClass74_18.method1889(); local9 != null; local9 = Static172.aClass74_18.method1881()) {
			if ((local9.aLong229 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method6525();
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([II)Ljava/lang/String;")
	public static String method3327(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static20.anInt656;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(24) Class262 local24 = Static282.aClass164_1.method3820(arg0[local13]);
			if (local24.anInt7763 != -1) {
				@Pc(37) Class87 local37 = (Class87) Static176.aClass44_25.method1353((long) local24.anInt7763);
				if (local37 == null) {
					@Pc(45) Class194 local45 = Static458.method4494(Static350.aClass100_69, local24.anInt7763, 0);
					if (local45 != null) {
						local37 = Static126.aClass66_5.method5038(local45);
						Static176.aClass44_25.method1349(local37, (long) local24.anInt7763);
					}
				}
				if (local37 != null) {
					Static58.aClass87Array8[local11] = local37;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIBI)I")
	public static int method3331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static55.aClass86Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local11 < 0 || local20 < 0 || Static181.anInt3574 - 1 < local11 || Static117.anInt2450 - 1 < local20) {
			return 0;
		}
		@Pc(45) int local45 = arg0;
		if (arg0 < 3 && (Static203.aByteArrayArrayArray11[1][local11][local20] & 0x2) != 0) {
			local45 = arg0 + 1;
		}
		return Static55.aClass86Array1[local45].method6590(arg2, arg1);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3333(@OriginalArg(0) String arg0) {
		return Static435.method6308(10, arg0);
	}
}
