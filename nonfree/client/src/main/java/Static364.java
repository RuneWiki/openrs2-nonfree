import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public static int anInt6467 = 0;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!kh;BLclient!kh;)V")
	public static void method5418(@OriginalArg(0) Class208 arg0, @OriginalArg(2) Class208 arg1) {
		@Pc(12) Class3_Sub44 local12 = Static275.method5689(Static349.aClass376_90, Static540.aClass282_4);
		local12.aClass3_Sub17_Sub2_3.method4854(arg1.anInt5653);
		local12.aClass3_Sub17_Sub2_3.method4885(arg1.anInt5645);
		local12.aClass3_Sub17_Sub2_3.method4885(arg1.anInt5608);
		local12.aClass3_Sub17_Sub2_3.method4854(arg0.anInt5653);
		local12.aClass3_Sub17_Sub2_3.method4840(arg0.anInt5645);
		local12.aClass3_Sub17_Sub2_3.method4840(arg0.anInt5608);
		Static616.method8089(local12);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIB)I")
	public static int method5419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class3_Sub7_Sub2.anIntArray170[arg0 * 8192 / arg1] >> 1;
		return (local16 * arg2 >> 16) + (arg3 * (65536 - local16) >> 16);
	}
}
