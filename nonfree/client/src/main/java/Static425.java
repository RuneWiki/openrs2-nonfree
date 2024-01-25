import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!dq;")
	public static Class60 aClass60_5;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public static int anInt6825 = 0;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!eh;")
	public static Class67 aClass67_257 = null;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!oi;)V")
	public static void method5420(@OriginalArg(1) Class185 arg0) {
		Static249.anInt4442 = arg0.method4005("titlebg");
		Static28.anInt421 = arg0.method4005("logo");
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	public static void method5421(@OriginalArg(0) int arg0) {
		if (Static95.method5202(arg0)) {
			Static191.method2765(Static45.aClass107ArrayArray1[arg0], -1);
		}
	}
}
