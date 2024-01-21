import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
	public static int anInt3325;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1589 = Static193.method3027("Continue");

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1590 = aClass70_1589;

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1591 = Static193.method3027("::autoshadow on");

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1592 = Static193.method3027("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!rc", name = "H", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1597 = Static193.method3027("Your profile will be transferred in:");

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1593 = aClass70_1597;

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1594 = Static193.method3027("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1595 = Static193.method3027(" <col=00ff80>");

	@OriginalMember(owner = "client!rc", name = "J", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1598 = Static193.method3027("Loading)3)3)3");

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1596 = aClass70_1598;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!kh;IIIZBI)V")
	public static void method2435(@OriginalArg(0) Class52_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) (arg2 + (arg5 << 16));
		@Pc(16) Class3_Sub3_Sub3 local16 = (Class3_Sub3_Sub3) Static151.aClass40_12.method1029(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub3_Sub3) Static150.aClass40_11.method1029(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class3_Sub3_Sub3) Static41.aClass40_3.method1029(local10);
		if (local16 == null) {
			if (!arg3) {
				local16 = (Class3_Sub3_Sub3) Static119.aClass40_6.method1029(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class3_Sub3_Sub3();
			local16.anInt185 = arg1;
			local16.aClass52_Sub1_1 = arg0;
			local16.aByte1 = arg4;
			if (arg3) {
				Static151.aClass40_12.method1027(local16, local10);
				Static64.anInt1359++;
			} else {
				Static11.aClass23_1.method674(local16);
				Static41.aClass40_3.method1027(local16, local10);
				Static45.anInt952++;
			}
		} else if (arg3) {
			local16.method3214();
			Static151.aClass40_12.method1027(local16, local10);
			Static64.anInt1359++;
			Static45.anInt952--;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public static void method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = 0;
		Static16.method302(arg1, arg0 - arg3, arg0 - -arg3, Static157.anIntArrayArray24[arg2]);
		@Pc(23) int local23 = arg3;
		@Pc(31) int local31 = -arg3;
		@Pc(33) int local33 = -1;
		while (local23 > local3) {
			local33 += 2;
			local3++;
			local31 += local33;
			if (local31 >= 0) {
				local23--;
				local31 -= local23 << 1;
				@Pc(56) int[] local56 = Static157.anIntArrayArray24[arg2 + local23];
				@Pc(63) int[] local63 = Static157.anIntArrayArray24[arg2 - local23];
				@Pc(68) int local68 = arg0 + local3;
				@Pc(73) int local73 = arg0 - local3;
				Static16.method302(arg1, local73, local68, local56);
				Static16.method302(arg1, local73, local68, local63);
			}
			@Pc(89) int local89 = arg0 + local23;
			@Pc(95) int[] local95 = Static157.anIntArrayArray24[arg2 + local3];
			@Pc(100) int local100 = arg0 - local23;
			@Pc(107) int[] local107 = Static157.anIntArrayArray24[arg2 - local3];
			Static16.method302(arg1, local100, local89, local95);
			Static16.method302(arg1, local100, local89, local107);
		}
	}
}
