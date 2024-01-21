import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!mg", name = "ib", descriptor = "Lclient!ga;")
	public static Class30 aClass30_36;

	@OriginalMember(owner = "client!mg", name = "lb", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!mg", name = "ab", descriptor = "Lclient!td;")
	public static Class79 aClass79_15 = new Class79(200);

	@OriginalMember(owner = "client!mg", name = "jb", descriptor = "I")
	public static int anInt2702 = 0;

	@OriginalMember(owner = "client!mg", name = "ob", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1039 = Static169.method2903("Please enter your password)3");

	@OriginalMember(owner = "client!mg", name = "qb", descriptor = "I")
	public static volatile int anInt2707 = 0;

	@OriginalMember(owner = "client!mg", name = "rb", descriptor = "I")
	public static int anInt2708 = 127;

	@OriginalMember(owner = "client!mg", name = "sb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1040 = aClass23_1039;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V")
	public static void method1815() {
		aClass30_36 = null;
		aClass79_15 = null;
		aClass23_1040 = null;
		aClass23_1039 = null;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)I")
	public static int method1816(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(30) int local30 = (local19 & 0x33333333) + (local19 >>> 2 & 0x73333333);
		@Pc(39) int local39 = local30 + (local30 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(Z)V")
	public static void method1817() {
		for (@Pc(6) Class1_Sub16 local6 = (Class1_Sub16) Static12.aClass10_1.method257(); local6 != null; local6 = (Class1_Sub16) Static12.aClass10_1.method260()) {
			@Pc(11) int local11 = local6.anInt3207;
			if (Static49.method916(local11)) {
				@Pc(17) boolean local17 = true;
				@Pc(21) Class60[] local21 = Static9.aClass60ArrayArray1[local11];
				for (@Pc(23) int local23 = 0; local23 < local21.length; local23++) {
					if (local21[local23] != null) {
						local17 = local21[local23].aBoolean155;
						break;
					}
				}
				if (!local17) {
					@Pc(51) int local51 = (int) local6.aLong140;
					@Pc(55) Class60 local55 = Static111.method1964(local51);
					if (local55 != null) {
						Static39.method659(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
	public static void method1818() {
		Static35.aClass1_Sub8_Sub1_2.method915();
		@Pc(16) int local16 = Static35.aClass1_Sub8_Sub1_2.method911(1);
		if (local16 == 0) {
			return;
		}
		@Pc(24) int local24 = Static35.aClass1_Sub8_Sub1_2.method911(2);
		if (local24 == 0) {
			Static60.anIntArray611[Static104.anInt2660++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local24 == 1) {
			local43 = Static35.aClass1_Sub8_Sub1_2.method911(3);
			Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.method1224(false, local43);
			local53 = Static35.aClass1_Sub8_Sub1_2.method911(1);
			if (local53 == 1) {
				Static60.anIntArray611[Static104.anInt2660++] = 2047;
			}
			return;
		}
		@Pc(95) int local95;
		if (local24 == 2) {
			local43 = Static35.aClass1_Sub8_Sub1_2.method911(3);
			Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.method1224(true, local43);
			local53 = Static35.aClass1_Sub8_Sub1_2.method911(3);
			Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.method1224(true, local53);
			local95 = Static35.aClass1_Sub8_Sub1_2.method911(1);
			if (local95 == 1) {
				Static60.anIntArray611[Static104.anInt2660++] = 2047;
			}
		} else if (local24 == 3) {
			local43 = Static35.aClass1_Sub8_Sub1_2.method911(7);
			local53 = Static35.aClass1_Sub8_Sub1_2.method911(1);
			if (local53 == 1) {
				Static60.anIntArray611[Static104.anInt2660++] = 2047;
			}
			local95 = Static35.aClass1_Sub8_Sub1_2.method911(7);
			@Pc(143) int local143 = Static35.aClass1_Sub8_Sub1_2.method911(1);
			Static85.anInt2267 = Static35.aClass1_Sub8_Sub1_2.method911(2);
			Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.method1217(local43, local95, local143 == 1);
		}
	}
}
