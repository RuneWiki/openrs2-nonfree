import jaggl.OpenGL;
import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!mla", name = "l", descriptor = "I")
	public static int anInt6386;

	@OriginalMember(owner = "client!mla", name = "k", descriptor = "I")
	public static int anInt6387;

	@OriginalMember(owner = "client!mla", name = "f", descriptor = "Lclient!uu;")
	public static Class114_Sub1 aClass114_Sub1_15;

	@OriginalMember(owner = "client!mla", name = "a", descriptor = "(Lclient!ik;Ljava/awt/Canvas;IILclient!d;)Lclient!ha;")
	public static Class22 method5527(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface4 arg3) {
		if (!Static39.method1147()) {
			throw new RuntimeException("");
		} else if (Static67.method1514("jaggl")) {
			@Pc(28) OpenGL local28 = new OpenGL();
			@Pc(46) long local46 = local28.init(arg1, 8, 8, 8, 24, 0, arg2);
			if (local46 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(68) Class22_Sub2_Sub2 local68 = new Class22_Sub2_Sub2(local28, arg1, local46, arg3, arg0, arg2);
			local68.method8903();
			return local68;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!mla", name = "a", descriptor = "(ZLclient!pka;)Z")
	public static boolean method5528(@OriginalArg(1) Class292 arg0) {
		try {
			return Static374.method5104(arg0);
		} catch (@Pc(16) IOException local16) {
			if (Static98.anInt2140 == 9) {
				arg0.aClass118_2 = null;
				return false;
			} else {
				Static526.method7028();
				return true;
			}
		} catch (@Pc(32) Exception local32) {
			@Pc(108) String local108 = "T2 - " + (arg0.aClass397_131 == null ? -1 : arg0.aClass397_131.method9308()) + "," + (arg0.aClass397_130 == null ? -1 : arg0.aClass397_130.method9308()) + "," + (arg0.aClass397_133 == null ? -1 : arg0.aClass397_133.method9308()) + " - " + arg0.anInt8012 + "," + (Static291.anInt4448 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0]) + "," + (Static189.anInt3243 + Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0]) + " - ";
			for (@Pc(110) int local110 = 0; arg0.anInt8012 > local110 && local110 < 50; local110++) {
				local108 = local108 + arg0.aClass3_Sub2_Sub1_2.aByteArray20[local110] + ",";
			}
			Static275.method4893(local108, local32);
			Static164.method2681(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!mla", name = "a", descriptor = "(IIB)Z")
	public static boolean method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
