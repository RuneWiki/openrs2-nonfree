import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "F")
	public static float aFloat223;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "[Lclient!s;")
	public static Class274[] aClass274Array1;

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "Lclient!wc;")
	public static Class47 aClass47_7;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public static int anInt8058 = 4;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
	public static boolean aBoolean687 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BC)Z")
	public static boolean method6740(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static127.method2908(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static10.aCharArray1;
			for (@Pc(25) int local25 = 0; local25 < local18.length; local25++) {
				@Pc(31) char local31 = local18[local25];
				if (local31 == arg0) {
					return true;
				}
			}
			@Pc(51) char[] local51 = Static219.aCharArray4;
			for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
				@Pc(59) char local59 = local51[local53];
				if (arg0 == local59) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ab;Lclient!ab;)V")
	public static void method6741(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) Class3_Sub1 arg1) {
		if (arg0.aClass3_Sub1_67 != null) {
			arg0.method8621();
		}
		arg0.aClass3_Sub1_66 = arg1.aClass3_Sub1_66;
		arg0.aClass3_Sub1_67 = arg1;
		arg0.aClass3_Sub1_67.aClass3_Sub1_66 = arg0;
		arg0.aClass3_Sub1_66.aClass3_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!et;)V")
	public static void method6747(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		if (arg0 == null) {
			return;
		}
		Static187.aClass276_28.method6906(arg0);
		Static443.anInt8026++;
		@Pc(39) Class3_Sub1_Sub10 local39;
		if (arg0.aBoolean288 || "".equals(arg0.aString27)) {
			local39 = new Class3_Sub1_Sub10(arg0.aString27);
			Static462.anInt8390++;
		} else {
			@Pc(33) long local33 = arg0.aLong73;
			for (local39 = (Class3_Sub1_Sub10) Static107.aClass307_15.method7424(local33); local39 != null && !local39.aString59.equals(arg0.aString27); local39 = (Class3_Sub1_Sub10) Static107.aClass307_15.method7422()) {
			}
			if (local39 == null) {
				local39 = (Class3_Sub1_Sub10) Static54.aClass112_23.method3640(local33);
				if (local39 != null && !local39.aString59.equals(arg0.aString27)) {
					local39 = null;
				}
				if (local39 == null) {
					local39 = new Class3_Sub1_Sub10(arg0.aString27);
				}
				Static107.aClass307_15.method7425(local33, local39);
				Static462.anInt8390++;
			}
		}
		if (local39.method4920(arg0)) {
			Static478.method8208(local39);
		}
	}
}
