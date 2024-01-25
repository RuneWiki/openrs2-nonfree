import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "[I")
	public static final int[] anIntArray372 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)[Lclient!fea;")
	public static Class104[] method5348() {
		return new Class104[] { Static648.aClass104_9, Static227.aClass104_4, Static44.aClass104_1, Static444.aClass104_8, Static120.aClass104_5, Static226.aClass104_7, Static210.aClass104_6 };
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!laa;Z)V")
	public static void method5350(@OriginalArg(0) Class6_Sub4_Sub10 arg0) {
		arg0.method9043();
		@Pc(14) boolean local14 = false;
		for (@Pc(19) Class6_Sub4_Sub10 local19 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local19 != null; local19 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
			if (Static300.method4281(arg0.method4630(), local19.method4630())) {
				local14 = true;
				Static42.method910(local19, arg0);
				break;
			}
		}
		if (!local14) {
			Static258.aClass384_7.method8909(arg0);
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBLclient!gga;)V")
	public static void method5351(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (Static446.aClass238_7 == null) {
			return;
		}
		try {
			Static446.aClass238_7.method5542(0L);
			Static446.aClass238_7.method5535(arg0, arg1.aByteArray101, 24);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
