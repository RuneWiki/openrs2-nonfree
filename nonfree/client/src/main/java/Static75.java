import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!fi", name = "T", descriptor = "Lclient!wf;")
	public static Class191 aClass191_4;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "I")
	public static int anInt1755 = 99;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!fc;)I")
	public static int method1315(@OriginalArg(1) Class2_Sub4_Sub1 arg0) {
		@Pc(13) Class145 local13 = arg0.aClass145_1;
		if (local13.anIntArray455 != null) {
			local13 = local13.method3711();
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local13.anInt4927;
		@Pc(35) Class91 local35 = arg0.method2095();
		if (local35.anInt3138 == arg0.anInt2820) {
			local31 = local13.anInt4925;
		} else if (local35.anInt3125 == arg0.anInt2820 || local35.anInt3130 == arg0.anInt2820 || local35.anInt3132 == arg0.anInt2820 || arg0.anInt2820 == local35.anInt3155) {
			local31 = local13.anInt4924;
		} else if (local35.anInt3134 == arg0.anInt2820 || arg0.anInt2820 == local35.anInt3131 || local35.anInt3147 == arg0.anInt2820 || local35.anInt3148 == arg0.anInt2820) {
			local31 = local13.anInt4915;
		}
		return local31;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(BLclient!fc;)V")
	public static void method1317(@OriginalArg(1) Class2_Sub4_Sub1 arg0) {
		for (@Pc(10) Class1_Sub16 local10 = (Class1_Sub16) Static13.aClass26_3.method666(); local10 != null; local10 = (Class1_Sub16) Static13.aClass26_3.method672()) {
			if (local10.aClass2_Sub4_Sub1_1 == arg0) {
				if (local10.aClass1_Sub10_Sub4_2 != null) {
					Static101.aClass1_Sub10_Sub2_2.method1864(local10.aClass1_Sub10_Sub4_2);
					local10.aClass1_Sub10_Sub4_2 = null;
				}
				local10.method4767();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method1318(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) byte local15 = 2;
		@Pc(18) char[] local18 = new char[local13];
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(27) char local27 = arg0.charAt(local20);
			if (local15 == 0) {
				local27 = Character.toLowerCase(local27);
			} else if (local15 == 2 || Character.isUpperCase(local27)) {
				local27 = Static14.method358(local27);
			}
			if (Character.isLetter(local27)) {
				local15 = 0;
			} else if (local27 == '.' || local27 == '?' || local27 == '!') {
				local15 = 2;
			} else if (!Character.isSpaceChar(local27)) {
				local15 = 1;
			} else if (local15 != 2) {
				local15 = 1;
			}
			local18[local20] = local27;
		}
		return new String(local18);
	}
}
