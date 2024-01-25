import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
	public static boolean aBoolean264;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!vm;")
	public static final Class363 aClass363_3 = new Class363();

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	public static int anInt3112 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Lclient!bha;")
	public static Class14_Sub4 method2650() {
		@Pc(8) Class14_Sub4 local8 = (Class14_Sub4) Static219.aClass363_4.method8483();
		if (local8 == null) {
			return new Class14_Sub4();
		} else {
			Static576.anInt9477--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method2651() {
		@Pc(20) Class5_Sub40 local20 = Static25.method507(Static98.aClass208_2, Static184.aClass181_27);
		local20.aClass5_Sub12_Sub2_2.method8647(Static259.method1979());
		local20.aClass5_Sub12_Sub2_2.method8655(Static254.anInt4283);
		local20.aClass5_Sub12_Sub2_2.method8655(Static438.anInt7403);
		local20.aClass5_Sub12_Sub2_2.method8647(Static627.aClass5_Sub46_31.aClass11_Sub6_2.method1369());
		Static612.method8496(local20);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILclient!dia;I)Lclient!tia;")
	public static Class5_Sub4_Sub19 method2652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg2.anInt1562;
		@Pc(19) Class5_Sub4_Sub19 local19 = (Class5_Sub4_Sub19) Static368.aClass368_2.method8528((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33 = Static416.aClass384_104.method8893(Static416.aClass384_104.method8867(local10));
		if (local33 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt1562;
			local19 = (Class5_Sub4_Sub19) Static368.aClass368_2.method8528((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local33 = Static416.aClass384_104.method8893(Static416.aClass384_104.method8867(local10));
			if (local33 == null) {
				local10 = arg2.anInt1562 | 0x3FFFC00;
				local19 = (Class5_Sub4_Sub19) Static368.aClass368_2.method8528((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local33 = Static416.aClass384_104.method8893(Static416.aClass384_104.method8867(local10));
				if (local33 == null) {
					return null;
				} else if (local33.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static407.method6233(local33);
					} catch (@Pc(200) Exception local200) {
						throw new RuntimeException(local200.getMessage() + " S: " + local10);
					}
					local19.aClass74_27 = arg2;
					Static368.aClass368_2.method8527((long) local10 << 16, local19);
					return local19;
				}
			} else if (local33.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static407.method6233(local33);
				} catch (@Pc(130) Exception local130) {
					throw new RuntimeException(local130.getMessage() + " S: " + local10);
				}
				local19.aClass74_27 = arg2;
				Static368.aClass368_2.method8527((long) local10 << 16, local19);
				return local19;
			}
		} else if (local33.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static407.method6233(local33);
			} catch (@Pc(58) Exception local58) {
				throw new RuntimeException(local58.getMessage() + " S: " + local10);
			}
			local19.aClass74_27 = arg2;
			Static368.aClass368_2.method8527((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!li;)Ljava/lang/String;")
	public static String method2653(@OriginalArg(1) Class5_Sub4_Sub14 arg0) {
		if (arg0.aString89 == null || arg0.aString89.length() == 0) {
			return arg0.aString91 == null || arg0.aString91.length() <= 0 ? arg0.aString90 : arg0.aString90 + Static76.aClass58_33.method1237(Static321.anInt5554) + arg0.aString91;
		} else if (arg0.aString91 == null || arg0.aString91.length() <= 0) {
			return arg0.aString90 + Static76.aClass58_33.method1237(Static321.anInt5554) + arg0.aString89;
		} else {
			return arg0.aString90 + Static76.aClass58_33.method1237(Static321.anInt5554) + arg0.aString91 + Static76.aClass58_33.method1237(Static321.anInt5554) + arg0.aString89;
		}
	}
}
