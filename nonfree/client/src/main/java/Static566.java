import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "[Lclient!bk;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "Lclient!nca;")
	public static Class254 aClass254_142;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ru", name = "o", descriptor = "Ljava/lang/Class;")
	private static Class aClass49;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "[[B")
	public static final byte[][] aByteArrayArray21 = new byte[250][];

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "Z")
	public static boolean aBoolean755 = false;

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
	public static int anInt8894 = 0;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public static void method7859() {
		@Pc(8) Class2_Sub6_Sub12 local8 = Static636.method8647(15, 0L);
		local8.method6245();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZIIIIIILclient!ha;)V")
	public static void method7860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class145 arg7) {
		@Pc(18) Interface25 local18 = (Interface25) Static91.method1414(arg6, arg2, arg5);
		@Pc(27) Class81 local27;
		@Pc(33) int local33;
		@Pc(37) int local37;
		@Pc(55) int local55;
		if (local18 != null) {
			local27 = Static148.aClass153_3.method3342(local18.method8986());
			local33 = local18.method8992() & 0x3;
			local37 = local18.method8991((byte) 56);
			if (local27.anInt1877 == -1) {
				local55 = arg4;
				if (local27.anInt1873 > 0) {
					local55 = arg0;
				}
				if (local37 == 0 || local37 == 2) {
					if (local33 == 0) {
						arg7.method9634(arg1, 4, arg3, local55);
					} else if (local33 == 1) {
						arg7.method9641(arg3, local55, 4, arg1);
					} else if (local33 == 2) {
						arg7.method9634(arg1 + 3, 4, arg3, local55);
					} else if (local33 == 3) {
						arg7.method9641(arg3 + 3, local55, 4, arg1);
					}
				}
				if (local37 == 3) {
					if (local33 == 0) {
						arg7.method9637(1, 1, arg3, local55, arg1);
					} else if (local33 == 1) {
						arg7.method9637(1, 1, arg3, local55, arg1 + 3);
					} else if (local33 == 2) {
						arg7.method9637(1, 1, arg3 + 3, local55, arg1 + 3);
					} else if (local33 == 3) {
						arg7.method9637(1, 1, arg3 + 3, local55, arg1);
					}
				}
				if (local37 == 2) {
					if (local33 == 0) {
						arg7.method9641(arg3, local55, 4, arg1);
					} else if (local33 == 1) {
						arg7.method9634(arg1 + 3, 4, arg3, local55);
					} else if (local33 == 2) {
						arg7.method9641(arg3 + 3, local55, 4, arg1);
					} else if (local33 == 3) {
						arg7.method9634(arg1, 4, arg3, local55);
					}
				}
			} else {
				Static350.method4845(arg7, local33, arg3, local27, arg1);
			}
		}
		local18 = (Interface25) Static140.method2072(arg6, arg2, arg5, aClass49 == null ? (aClass49 = Class331.a("vi")) : aClass49);
		if (local18 != null) {
			local27 = Static148.aClass153_3.method3342(local18.method8986());
			local33 = local18.method8992() & 0x3;
			local37 = local18.method8991((byte) 56);
			if (local27.anInt1877 != -1) {
				Static350.method4845(arg7, local33, arg3, local27, arg1);
			} else if (local37 == 9) {
				local55 = -1118482;
				if (local27.anInt1873 > 0) {
					local55 = -1179648;
				}
				if (local33 == 0 || local33 == 2) {
					arg7.method9688(local55, arg3, arg3 + 3, arg1, arg1 + 3);
				} else {
					arg7.method9688(local55, arg3 + 3, arg3, arg1, arg1 + 3);
				}
			}
		}
		local18 = (Interface25) Static441.method6382(arg6, arg2, arg5);
		if (local18 == null) {
			return;
		}
		local27 = Static148.aClass153_3.method3342(local18.method8986());
		local33 = local18.method8992() & 0x3;
		if (local27.anInt1877 != -1) {
			Static350.method4845(arg7, local33, arg3, local27, arg1);
			return;
		}
	}
}
