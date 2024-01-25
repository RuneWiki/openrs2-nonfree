import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
	public static int anInt10199;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method8741(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class279 local8 = Static406.method6473(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray27 != null) {
			@Pc(18) Class3_Sub21 local18 = new Class3_Sub21();
			local18.anObjectArray1 = local8.anObjectArray27;
			local18.anInt2946 = arg1;
			local18.aClass279_5 = local8;
			local18.aString24 = arg0;
			Static304.method4843(local18);
		}
		if (Static485.anInt8420 != 10 || !Static76.method1833(local8).method2318(arg1 - 1)) {
			return;
		}
		@Pc(60) Class3_Sub14 local60;
		if (arg1 == 1) {
			local60 = Static139.method2308(Static356.aClass130_95, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 2) {
			local60 = Static139.method2308(Static215.aClass130_63, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 3) {
			local60 = Static139.method2308(Static377.aClass130_98, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 4) {
			local60 = Static139.method2308(Static171.aClass130_50, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 5) {
			local60 = Static139.method2308(Static427.aClass130_106, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 6) {
			local60 = Static139.method2308(Static9.aClass130_1, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 7) {
			local60 = Static139.method2308(Static12.aClass130_4, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 8) {
			local60 = Static139.method2308(Static478.aClass130_113, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 9) {
			local60 = Static139.method2308(Static205.aClass130_60, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
		if (arg1 == 10) {
			local60 = Static139.method2308(Static334.aClass130_90, Static24.aClass233_1);
			Static642.method8747(arg3, arg2, local60, local8.anInt8217);
			Static562.method8096(local60);
		}
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
	public static void method8742() {
		Static364.anIntArray475 = null;
		Static76.anIntArray60 = null;
		Static177.anIntArray178 = null;
		Static607.anIntArray658 = null;
		Static13.aBoolean727 = false;
		Static342.anIntArray397 = null;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(Z)V")
	public static void method8743() {
		Static624.anIntArray654 = Static575.method8158(0.4F);
	}
}
