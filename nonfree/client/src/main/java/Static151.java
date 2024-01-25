import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "[[[Lclient!tg;")
	public static Class217[][][] aClass217ArrayArrayArray3;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_107 = new Class184(11, -1);

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
	public static int anInt3305 = 0;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "Z")
	public static boolean aBoolean254 = false;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!mv;)I")
	public static int method2693(@OriginalArg(1) Class1_Sub3_Sub3_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt4907;
		@Pc(15) Class137 local15 = arg0.method4837();
		if (arg0.aBoolean429) {
			local6 = arg0.anInt4894;
		} else if (arg0.anInt6080 == local15.anInt4208 || local15.anInt4213 == arg0.anInt6080 || local15.anInt4187 == arg0.anInt6080 || arg0.anInt6080 == local15.anInt4207) {
			local6 = arg0.anInt4901;
		} else if (arg0.anInt6080 == local15.anInt4216 || arg0.anInt6080 == local15.anInt4191 || arg0.anInt6080 == local15.anInt4193 || arg0.anInt6080 == local15.anInt4188) {
			local6 = arg0.anInt4878;
		}
		return local6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([BI)[B")
	public static byte[] method2694(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static464.method5797(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
