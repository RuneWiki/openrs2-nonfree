import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Lclient!uia;")
	public static final Class340 aClass340_5 = new Class340();

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static int anInt7692 = -50;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_106 = new Class130(13, 8);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!qs;Z)V")
	public static void method6667(@OriginalArg(0) Class4_Sub8 arg0) {
		arg0.aClass4_Sub1_2 = null;
		@Pc(17) int local17 = arg0.aClass4_Sub5Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass4_Sub5Array1[local19].aBoolean514 = false;
		}
		@Pc(37) Class120[] local37 = Class339.aClass120Array1;
		synchronized (Class339.aClass120Array1) {
			if (local17 < Class339.aClass120Array1.length && Static106.anIntArray92[local17] < 200) {
				Class339.aClass120Array1[local17].method2960(arg0);
				@Pc(60) int local60 = Static106.anIntArray92[local17]++;
			}
		}
	}
}
