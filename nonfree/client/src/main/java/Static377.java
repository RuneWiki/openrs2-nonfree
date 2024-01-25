import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "[I")
	public static int[] anIntArray369;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_199 = new Class196(61, 7);

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_63 = new Class187(29, -1);

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_200 = new Class196(32, 28);

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[200];

	@OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
	public static int anInt6578 = -1;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BJ)V")
	public static void method5545(@OriginalArg(1) long arg0) {
		if (Static129.aClass313ArrayArrayArray7 != null) {
			if (Static133.anInt2254 == 1 || Static133.anInt2254 == 5) {
				Static547.method7536(arg0);
			} else if (Static133.anInt2254 == 4) {
				Static331.method5123(arg0);
			}
		}
		Static620.method8294(Static563.aClass143_13, (long) Static421.anInt7434);
		if (Static131.anInt2222 != -1) {
			Static57.method856(Static131.anInt2222);
		}
		for (@Pc(40) int local40 = 0; local40 < Static283.anInt4411; local40++) {
			if (Static425.aBooleanArray18[local40]) {
				Static209.aBooleanArray4[local40] = true;
			}
			Static224.aBooleanArray6[local40] = Static425.aBooleanArray18[local40];
			Static425.aBooleanArray18[local40] = false;
		}
		Static367.anInt6417 = Static421.anInt7434;
		Static655.method8587((Class394) null, -1, -1);
		Static178.method2615(-1, (Class394) null, -1);
		if (Static131.anInt2222 != -1) {
			Static283.anInt4411 = 0;
			Static81.method1270();
		}
		Static563.aClass143_13.la();
		Static155.method2355(Static563.aClass143_13);
		@Pc(99) int local99 = Static608.method8179();
		if (local99 == -1) {
			local99 = Static54.anInt8558;
		}
		if (local99 == -1) {
			local99 = Static464.anInt8094;
		}
		Static52.method801(local99);
		@Pc(118) int local118 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7917() << 8;
		Static367.method5391(local118 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367, local118 + Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366, Static648.anInt10220, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149);
		Static648.anInt10220 = 0;
	}
}
