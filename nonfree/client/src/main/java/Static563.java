import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	public static int anInt9475;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
	public static int anInt9470 = 0;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)V")
	public static void method8170(@OriginalArg(0) int arg0) {
		@Pc(16) Class5_Sub21 local16 = (Class5_Sub21) Static115.aClass273_5.method6581((long) arg0);
		if (local16 != null) {
			local16.aClass73_Sub1_1.method5423();
			Static109.method1691(local16.anInt2436, local16.aBoolean185);
			local16.method9047();
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public static void method8172() {
		if (Static9.anInterface2Array1 == null) {
			return;
		}
		@Pc(14) Interface2[] local14 = Static9.anInterface2Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface2 local22 = local14[local16];
			local22.method8794();
		}
	}
}
