import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt10352;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static final int anInt10350 = 1337;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_122 = new Class257(53, -1);

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIIILclient!tp;)V")
	public static void method8357(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class331 arg3) {
		@Pc(8) int local8 = arg3.anInt9553;
		if (arg3.aByte109 == 0) {
			arg3.anInt9553 = arg3.anInt9504;
		} else if (arg3.aByte109 == 1) {
			arg3.anInt9553 = arg1 - arg3.anInt9504;
		} else if (arg3.aByte109 == 2) {
			arg3.anInt9553 = arg1 * arg3.anInt9504 >> 14;
		}
		@Pc(59) int local59 = arg3.anInt9505;
		if (arg3.aByte108 == 0) {
			arg3.anInt9505 = arg3.anInt9571;
		} else if (arg3.aByte108 == 1) {
			arg3.anInt9505 = arg2 - arg3.anInt9571;
		} else if (arg3.aByte108 == 2) {
			arg3.anInt9505 = arg2 * arg3.anInt9571 >> 14;
		}
		if (arg3.aByte109 == 4) {
			arg3.anInt9553 = arg3.anInt9542 * arg3.anInt9505 / arg3.anInt9521;
		}
		if (arg3.aByte108 == 4) {
			arg3.anInt9505 = arg3.anInt9553 * arg3.anInt9521 / arg3.anInt9542;
		}
		if (Static54.aBoolean127 && (Static73.method1921(arg3).anInt6421 != 0 || arg3.anInt9490 == 0)) {
			if (arg3.anInt9505 < 5 && arg3.anInt9553 < 5) {
				arg3.anInt9553 = 5;
				arg3.anInt9505 = 5;
			} else {
				if (arg3.anInt9553 <= 0) {
					arg3.anInt9553 = 5;
				}
				if (arg3.anInt9505 <= 0) {
					arg3.anInt9505 = 5;
				}
			}
		}
		if (arg3.anInt9556 == anInt10350) {
			Static224.aClass331_7 = arg3;
		}
		if (arg0 && arg3.lb != null && (local8 != arg3.anInt9553 || arg3.anInt9505 != local59)) {
			@Pc(201) Class8_Sub40 local201 = new Class8_Sub40();
			local201.aClass331_14 = arg3;
			local201.anObjectArray2 = arg3.lb;
			Static203.aClass43_28.method1424(local201);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Lclient!vba;")
	public static Class351 method8358(@OriginalArg(1) int arg0) {
		@Pc(10) Class351 local10 = (Class351) Static489.aClass236_82.method6242((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static324.aClass237_86.method6314(1, arg0);
		local10 = new Class351();
		local10.anInt10072 = arg0;
		if (local20 != null) {
			local10.method8156(new Class8_Sub8(local20));
		}
		local10.method8159();
		if (local10.anInt10068 == 2 && Static234.aClass253_16.method6594((long) arg0) == null) {
			Static234.aClass253_16.method6591(new Class8_Sub17(Static320.anInt6432), (long) arg0);
			Static268.aClass351Array1[Static320.anInt6432++] = local10;
		}
		Static489.aClass236_82.method6241((long) arg0, local10);
		return local10;
	}
}
