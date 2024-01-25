import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_76 = new Class156(47, -2);

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject9 = null;

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "I")
	public static int anInt3867 = 0;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!mj;IILclient!ha;I)V")
	public static void method3549(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3) {
		for (@Pc(16) int local16 = 63; local16 >= 0; local16--) {
			Static207.method3389(true, false);
			@Pc(40) int local40 = 0x3F | 0x380 | (local16 & 0x3F) << 10;
			@Pc(44) int local44 = Static408.anIntArray407[local40];
			Static616.method8461(false, true);
			arg3.aa(arg2, arg1 + (arg0.anInt5973 * (63 - local16) >> 6), arg0.anInt5985, (arg0.anInt5973 >> 6) + 1, local44, 0);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILclient!mj;B)V")
	public static void method3552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2) {
		@Pc(8) Class1 local8 = arg2.method5323(Static273.aClass100_6);
		if (local8 == null) {
			return;
		}
		Static273.aClass100_6.KA(arg0, arg1, arg0 + arg2.anInt5985, arg1 - -arg2.anInt5973);
		if (Static215.anInt3739 >= 3) {
			Static273.aClass100_6.A(-16777216, local8, arg0, arg1);
		} else {
			Static280.aClass155_13.method7201((float) arg2.anInt5985 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.anInt5973 / 2.0F, ((int) -Static243.aFloat117 & 0x3FFF) << 2, local8, arg0, arg1);
		}
	}
}
