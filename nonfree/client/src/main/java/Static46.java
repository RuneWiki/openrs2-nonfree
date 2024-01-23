import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public static int anInt6184 = -1;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!na;BLclient!na;)V")
	public static void method4783(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg0.aClass1_Sub2_69 != null) {
			arg0.method4661();
		}
		arg0.aClass1_Sub2_68 = arg1.aClass1_Sub2_68;
		arg0.aClass1_Sub2_69 = arg1;
		arg0.aClass1_Sub2_69.aClass1_Sub2_68 = arg0;
		arg0.aClass1_Sub2_68.aClass1_Sub2_69 = arg0;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
	public static void method4786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static223.method941(arg0, Static223.anInt1245, Static152.anInt3532);
		@Pc(17) int local17 = Static223.method941(arg4, Static223.anInt1245, Static152.anInt3532);
		@Pc(23) int local23 = Static223.method941(arg2, Static88.anInt2052, Static102.anInt2239);
		@Pc(31) int local31 = Static223.method941(arg1, Static88.anInt2052, Static102.anInt2239);
		for (@Pc(33) int local33 = local11; local33 <= local17; local33++) {
			Static89.method1538(Static57.anIntArrayArray9[local33], local31, local23, arg3);
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public static void method4787(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static1.aClass171_1);
		arg0.removeFocusListener(Static1.aClass171_1);
		Static270.anInt5840 = -1;
	}
}
