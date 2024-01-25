import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	public static int anInt1117;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_26 = new Class70(200);

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "[I")
	public static final int[] anIntArray125 = new int[128];

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)Lclient!sb;")
	public static Class181 method983(@OriginalArg(0) int arg0) {
		@Pc(10) Class181 local10 = (Class181) Static47.aClass70_23.method1396((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static268.aClass53_123.method1033(arg0, 1);
		local10 = new Class181();
		if (local20 != null) {
			local10.method4886(new Class6_Sub10(local20), arg0);
		}
		Static47.aClass70_23.method1406(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
	public static void method984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static92.aClass70_30 = new Class70(arg0);
		Static134.aClass70_46 = new Class70(arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Z")
	public static boolean method985() {
		return Static319.anInt5902 == 0 ? Static191.aClass6_Sub12_Sub1_3.method1468() : true;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(III)Z")
	public static boolean method987(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static201.aBoolean284) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static81.aClass132ArrayArray1[local13] == null || Static81.aClass132ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class132 local35 = Static81.aClass132ArrayArray1[local13][local17];
		@Pc(55) Class6_Sub32 local55;
		if (arg0 == -1 && local35.anInt3524 == 0) {
			for (local55 = (Class6_Sub32) Static214.aClass211_24.method5594(); local55 != null; local55 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
				if (local55.anInt4932 == 5 || local55.anInt4932 == 1010 || local55.anInt4932 == 29 || local55.anInt4932 == 37 || local55.anInt4932 == 14) {
					for (@Pc(145) Class132 local145 = Static249.method4316(local55.anInt4929); local145 != null; local145 = Static264.method4485(local145)) {
						if (local145.anInt3551 == local35.anInt3551) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class6_Sub32) Static214.aClass211_24.method5594(); local55 != null; local55 = (Class6_Sub32) Static214.aClass211_24.method5582()) {
				if (arg0 == local55.anInt4931 && local55.anInt4929 == local35.anInt3551 && (local55.anInt4932 == 5 || local55.anInt4932 == 1010 || local55.anInt4932 == 29 || local55.anInt4932 == 37 || local55.anInt4932 == 14)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B[S)[S")
	public static short[] method988(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static358.method957(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
