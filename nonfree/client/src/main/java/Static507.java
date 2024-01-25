import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	public static int anInt9504;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString204 = null;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method7316(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (arg0 == 0) {
			Static39.aClass7_2 = Static447.method7798(0, Static18.aClass348_10, Static201.aCanvas7, Static455.aClass4_Sub35_Sub1_1.anInt9914 * 2, Static361.anInterface7_8);
			if (arg1 != null) {
				Static39.aClass7_2.ja(0);
				@Pc(28) Class198 local28 = Static375.method5821(Static478.aClass348_114, Static410.anInt8176);
				@Pc(37) Class45 local37 = Static39.aClass7_2.method7837(local28, Static598.method2456(Static159.aClass348_38, Static410.anInt8176));
				Static452.method6641();
				Static490.method7114(Static39.aClass7_2, true, local28, local37, arg1);
			}
		} else {
			@Pc(50) Class7 local50 = null;
			@Pc(78) Class45 local78;
			@Pc(69) Class198 local69;
			if (arg1 != null) {
				local50 = Static447.method7798(0, Static18.aClass348_10, Static201.aCanvas7, 0, Static361.anInterface7_8);
				local50.ja(0);
				local69 = Static375.method5821(Static478.aClass348_114, Static410.anInt8176);
				local78 = local50.method7837(local69, Static598.method2456(Static159.aClass348_38, Static410.anInt8176));
				Static452.method6641();
				Static490.method7114(local50, true, local69, local78, arg1);
			}
			try {
				Static39.aClass7_2 = Static447.method7798(arg0, Static18.aClass348_10, Static201.aCanvas7, Static455.aClass4_Sub35_Sub1_1.anInt9914 * 2, Static361.anInterface7_8);
				if (arg1 != null) {
					local50.ja(0);
					local69 = Static375.method5821(Static478.aClass348_114, Static410.anInt8176);
					local78 = local50.method7837(local69, Static598.method2456(Static159.aClass348_38, Static410.anInt8176));
					Static452.method6641();
					Static490.method7114(local50, true, local69, local78, arg1);
				}
				if (Static39.aClass7_2.method7831()) {
					@Pc(136) boolean local136 = true;
					try {
						local136 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(146) Throwable local146) {
					}
					@Pc(152) Class4_Sub8 local152;
					if (local136) {
						local152 = Static39.aClass7_2.method7818(146800640);
					} else {
						local152 = Static39.aClass7_2.method7818(104857600);
					}
					Static39.aClass7_2.method7851(local152);
				}
			} catch (@Pc(163) Throwable local163) {
				arg0 = 0;
				Static39.aClass7_2 = Static447.method7798(0, Static18.aClass348_10, Static201.aCanvas7, 0, Static361.anInterface7_8);
			}
			if (local50 != null) {
				try {
					local50.method7792();
				} catch (@Pc(180) Throwable local180) {
				}
			}
		}
		Static453.anInt8614 = arg0;
		Static536.method7530();
		Static39.aClass7_2.va(32);
		Static566.aClass81_6 = Static39.aClass7_2.method7842();
		Static313.aClass81_5 = Static39.aClass7_2.method7842();
		Static199.method3260();
		Static39.aClass7_2.method7826(!Static455.aClass4_Sub35_Sub1_1.aBoolean676);
		if (Static39.aClass7_2.method7779()) {
			Static15.method758(Static455.aClass4_Sub35_Sub1_1.aBoolean669);
		}
		Static396.method6080(Static390.anInt7654 >> 3, Static338.anInt6508 >> 3, Static39.aClass7_2);
		Static41.method1090();
		Static555.aBoolean697 = true;
		Static556.aBoolean698 = false;
		Static271.aClass77Array1 = null;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
	public static int method7317(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
