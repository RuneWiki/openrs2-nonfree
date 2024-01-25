import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "Lclient!og;")
	public static final Class247 aClass247_5 = new Class247(2);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!dc;I)V")
	public static void method8059(@OriginalArg(0) Class4_Sub11_Sub1 arg0) {
		arg0.method4909(Static347.aClass176_87.method3976());
		arg0.method4909(Static557.aClass176_27.method3976());
		arg0.method4909(Static93.aClass176_31.method3976());
		arg0.method4909(Static231.aClass176_63.method3976());
		arg0.method4909(Static399.aClass176_103.method3976());
		arg0.method4909(Static261.aClass176_69.method3976());
		arg0.method4909(Static55.aClass176_104.method3976());
		arg0.method4909(Static309.aClass176_81.method3976());
		arg0.method4909(Static281.aClass176_74.method3976());
		arg0.method4909(Static67.aClass176_25.method3976());
		arg0.method4909(Static212.aClass176_60.method3976());
		arg0.method4909(Static518.aClass176_127.method3976());
		arg0.method4909(Static536.aClass176_128.method3976());
		arg0.method4909(Static500.aClass176_119.method3976());
		arg0.method4909(Static112.aClass176_35.method3976());
		arg0.method4909(Static176.aClass176_48.method3976());
		arg0.method4909(Static49.aClass176_18.method3976());
		arg0.method4909(Static79.aClass176_28.method3976());
		arg0.method4909(Static157.aClass176_43.method3976());
		arg0.method4909(Static467.aClass176_114.method3976());
		arg0.method4909(Static34.aClass176_11.method3976());
		arg0.method4909(Static586.aClass176_132.method3976());
		arg0.method4909(Static333.aClass176_97.method3976());
		arg0.method4909(Static12.aClass176_6.method3976());
		arg0.method4909(Static256.aClass176_67.method3976());
		arg0.method4909(Static194.aClass176_55.method3976());
		arg0.method4909(Static502.aClass176_121.method3976());
		arg0.method4909(Static266.aClass176_71.method3976());
		arg0.method4909(Static362.aClass176_94.method3976());
		arg0.method4909(Static137.aClass176_42.method3976());
		arg0.method4909(Static362.aClass176_93.method3976());
		arg0.method4909(Static224.aClass176_61.method3976());
		arg0.method4909(Static289.method5061());
		arg0.method4909(Static22.method269());
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
	public static void method8061() {
		@Pc(7) Class136[] local7 = Class34.aClass136Array1;
		synchronized (Class34.aClass136Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class34.aClass136Array1.length; local11++) {
				Class34.aClass136Array1[local11] = new Class136();
				Static212.anIntArray191[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z")
	public static boolean method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
