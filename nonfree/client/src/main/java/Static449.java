import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "[I")
	public static int[] anIntArray636;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Lclient!dd;")
	public static Class72 aClass72_2;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public static int anInt7419 = 0;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "Lclient!ml;")
	public static final Class223 aClass223_12 = new Class223("", 10);

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public static int anInt7431 = 0;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
	public static int anInt7433 = 0;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
	public static int anInt7436 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BIIII)V")
	public static void method6561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(96) Class164 local96 = Static15.aClass164ArrayArrayArray5[arg2][arg0][arg3];
			if (local96 != null) {
				if (arg1 == 1) {
					local96.aShort46 = 0;
				} else if (arg1 == 2) {
					local96.aShort48 = 0;
				}
			}
			Static309.method4731();
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < Static169.anInt3342; local15++) {
			@Pc(21) Class60 local21 = Static492.aClass60Array9[local15];
			if (local21.aByte26 == arg1 && arg0 == local21.aShort15 && arg3 == local21.aShort16 || local21.aShort14 == arg0 && local21.aShort16 == arg3) {
				if (local15 != Static169.anInt3342) {
					Static684.method5327(Static492.aClass60Array9, local15 + 1, Static492.aClass60Array9, local15, Static492.aClass60Array9.length - local15 - 1);
				}
				Static169.anInt3342--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLclient!qn;Ljava/lang/String;Ljava/lang/String;Z)V")
	public static void method6563(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class291 arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4) {
		if (!arg0) {
			Static442.method6277(arg1, arg3, 3);
			return;
		}
		@Pc(30) String local30;
		if (Static497.aString91.startsWith("win") && arg1.aBoolean619) {
			local30 = null;
			if (Static124.anApplet1 != null) {
				local30 = Static124.anApplet1.getParameter("haveie6");
			}
			if (local30 == null || !local30.equals("1")) {
				@Pc(48) Class81 local48 = Static442.method6277(arg1, arg3, 0);
				Static270.aString45 = arg3;
				Static506.aClass81_6 = local48;
				Static257.aClass291_2 = arg1;
				return;
			}
		}
		if (Static497.aString91.startsWith("mac")) {
			local30 = null;
			if (Static124.anApplet1 != null) {
				local30 = Static124.anApplet1.getParameter("havefirefox");
			}
			if (local30 != null && local30.equals("1") && arg4) {
				Static496.method7117(arg3, arg1, arg2, 1);
				return;
			}
		}
		Static442.method6277(arg1, arg3, 2);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method6568() {
		for (@Pc(6) Class3_Sub11_Sub8 local6 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local6 != null; local6 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
			if (local6.anInt3796 > 1) {
				local6.anInt3796 = 0;
				Static555.aClass165_63.method4392(local6, ((Class3_Sub11_Sub14) local6.aClass74_4.aClass3_Sub11_16.aClass3_Sub11_67).aLong212);
				local6.aClass74_4.method1845();
			}
		}
		Static450.anInt7444 = 0;
		Static71.anInt1334 = 0;
		Static78.aClass338_99.method8175();
		Static369.aClass83_24.method2374();
		Static111.aClass74_3.method1845();
		Static30.method699(Static367.aClass3_Sub11_Sub14_4);
	}
}
