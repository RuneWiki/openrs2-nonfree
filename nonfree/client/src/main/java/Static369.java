import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
	public static int anInt7015;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V")
	public static void method5757() {
		Static572.aClass236_98.method6243(50);
		Static529.aClass236_87.method6243(50);
		Static385.aClass236_99.method6243(50);
		Static479.aClass236_80.method6243(50);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILclient!dia;IZLclient!oh;I)V")
	public static void method5758(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub16_Sub1 arg1, @OriginalArg(5) Class237 arg2, @OriginalArg(6) int arg3) {
		Static540.method7649(arg0, arg2, arg3);
		Static10.aClass8_Sub16_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLclient!wha;)Z")
	public static boolean method5759(@OriginalArg(1) Interface27 arg0) {
		@Pc(10) Class352 local10 = Static437.aClass199_3.method5342(arg0.method8342());
		if (local10.anInt10094 == -1) {
			return true;
		} else {
			@Pc(27) Class190 local27 = Static76.aClass67_1.method2155(local10.anInt10094);
			return local27.anInt5996 == -1 ? true : local27.method4919();
		}
	}
}
