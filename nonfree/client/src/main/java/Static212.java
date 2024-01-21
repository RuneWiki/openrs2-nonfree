import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
	public static int anInt4234;

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "[J")
	public static final long[] aLongArray9 = new long[500];

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1207 = Static181.method2795("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)Lclient!ma;")
	public static Class2_Sub2_Sub18 method3222(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub18 local15 = (Class2_Sub2_Sub18) Static5.aClass86_3.method2643((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static64.aClass28_72.method852(arg0, 27);
		local15 = new Class2_Sub2_Sub18();
		if (local25 != null) {
			local15.method1985(new Class2_Sub3(local25));
		}
		Static5.aClass86_3.method2647(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)Lclient!gg;")
	public static Class29_Sub1 method3224() {
		@Pc(25) Class29_Sub1 local25 = new Class29_Sub1(Static21.anInt570, Static9.anInt226, Static28.anIntArray61[0], Static124.anIntArray251[0], Static163.anIntArray314[0], Static131.anIntArray284[0], Static151.aByteArrayArray14[0], Static153.anIntArray317);
		Static17.method372();
		return local25;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = 2048 - arg1 & 0x7FF;
		@Pc(17) int local17 = 0;
		@Pc(23) int local23 = 2048 - arg4 & 0x7FF;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg5;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(48) int local48;
		if (local10 != 0) {
			local33 = Class16.anIntArray44[local10];
			local37 = Class16.anIntArray39[local10];
			local48 = local37 * 0 - arg5 * local33 >> 16;
			local27 = local37 * arg5 + local33 * 0 >> 16;
			local25 = local48;
		}
		if (local23 != 0) {
			local37 = Class16.anIntArray39[local23];
			local33 = Class16.anIntArray44[local23];
			local48 = local37 * 0 + local33 * local27 >> 16;
			local27 = local27 * local37 - local33 * 0 >> 16;
			local17 = local48;
		}
		Static21.anInt567 = arg6 - local17;
		Static174.anInt3596 = arg0 - local27;
		Static18.anInt2017 = arg1;
		Static54.anInt1360 = arg4;
		Static199.anInt3952 = arg2 - local25;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!eh;Lclient!eh;B)I")
	public static int method3226(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method861(Static101.anInt2322)) {
			local10++;
		}
		if (arg0.method861(Static67.anInt1608)) {
			local10++;
		}
		if (arg0.method861(Static208.anInt4123)) {
			local10++;
		}
		if (arg0.method861(Static121.anInt2744)) {
			local10++;
		}
		if (arg0.method861(Static68.anInt1619)) {
			local10++;
		}
		if (arg0.method861(Static186.anInt3728)) {
			local10++;
		}
		arg0.method861(Static159.anInt3221);
		arg0.method861(Static49.anInt1274);
		arg0.method861(Static11.anInt374);
		arg0.method861(Static71.anInt1688);
		arg0.method861(Static4.anInt93);
		return local10;
	}
}
