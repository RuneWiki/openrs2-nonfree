import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[Lclient!ug;")
	public static Class243[] aClass243Array5;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ga;")
	public static Interface4 anInterface4_15;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
	public static final int[] anIntArray645 = new int[1];

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_159 = new Class7(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	public static int method5865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static165.anIntArray275[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
	public static void method5866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static3.aClass151_6.method3475(Static39.aClass7_17.method331(Static341.anInt5770));
		@Pc(21) int local21;
		for (@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) Static55.aClass181_63.method4112(); local16 != null; local16 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
			local21 = Static77.method1517(local16);
			if (local21 > local11) {
				local11 = local21;
			}
		}
		local11 += 8;
		local21 = Static217.anInt4004 * 16 + 21;
		@Pc(50) int local50 = arg1 - local11 / 2;
		if (local50 + local11 > Static95.anInt1971) {
			local50 = Static95.anInt1971 - local11;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(73) int local73 = arg0;
		if (Static34.anInt715 < local21 + arg0) {
			local73 = Static34.anInt715 - local21;
		}
		Static280.anInt4913 = local50;
		if (local73 < 0) {
			local73 = 0;
		}
		Static270.anInt4802 = local11;
		Static389.anInt6274 = Static217.anInt4004 * 16 + (Static297.aBoolean374 ? 26 : 22);
		Static385.aBoolean436 = true;
		Static315.anInt5432 = local73;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)I")
	public static int method5871(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
