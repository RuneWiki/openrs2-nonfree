import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	public static int anInt5923;

	@OriginalMember(owner = "client!qk", name = "z", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
	public static int anInt5927;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_207 = new Class184(36, 12);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public static void method4722() {
		Static22.aClass135_1 = new Class135(8);
		Static348.anInt7446 = 0;
		for (@Pc(19) Class13_Sub8 local19 = (Class13_Sub8) Static182.aClass40_3.method1188(); local19 != null; local19 = (Class13_Sub8) Static182.aClass40_3.method1195()) {
			local19.method5939();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!vo;)V")
	public static void method4723(@OriginalArg(1) Class253 arg0) {
		Static9.aClass253_1 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Lclient!ce;")
	public static Class3_Sub3_Sub5 method4726() {
		return Static210.aClass3_Sub3_Sub5_3;
	}
}
