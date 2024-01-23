import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public static int anInt381;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public static int anInt383;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!dh;")
	public static Class33 aClass33_3 = new Class33(32);

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[Lclient!qm;")
	public static Class141[] aClass141Array1 = new Class141[14];

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public static int anInt380 = 2;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public static int anInt382 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public static void method325() {
		aClass141Array1 = null;
		aClass33_3 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	public static void method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(30) Class4_Sub11 local30 = Static127.aClass4_Sub11ArrayArrayArray1[local9][arg0][arg1] = Static127.aClass4_Sub11ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local30 != null) {
				local30.anInt1048--;
				for (@Pc(40) int local40 = 0; local40 < local30.anInt1054; local40++) {
					@Pc(49) Class173 local49 = local30.aClass173Array1[local40];
					if ((local49.aLong183 >> 29 & 0x3L) == 2L && local49.anInt5149 == arg0 && local49.anInt5157 == arg1) {
						local49.anInt5156--;
					}
				}
			}
		}
		if (Static127.aClass4_Sub11ArrayArrayArray1[0][arg0][arg1] == null) {
			Static127.aClass4_Sub11ArrayArrayArray1[0][arg0][arg1] = new Class4_Sub11(0, arg0, arg1);
		}
		Static127.aClass4_Sub11ArrayArrayArray1[0][arg0][arg1].aClass4_Sub11_1 = local7;
		Static127.aClass4_Sub11ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method328() {
		Static231.aClass33_34.method843();
		Static250.aClass33_36.method843();
	}
}
