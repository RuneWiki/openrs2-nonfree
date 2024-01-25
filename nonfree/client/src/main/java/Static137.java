import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eu", name = "O", descriptor = "Lclient!gu;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
	public static int anInt2416 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIB)V")
	public static void method2017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static9.aClass133_1 == null) {
			return;
		}
		@Pc(14) int local14 = Static6.anInt95;
		@Pc(16) int local16 = Static28.anInt358;
		Static452.method6797(arg0, arg1);
		if (Static483.anInt8236 == 0) {
			Static477.anInterface16_1 = null;
			Static477.anInterface16_1 = Static9.aClass133_1.method7288(Static9.aClass133_1.method7271(Static404.anInt6761, Static447.anInt7618), Static9.aClass133_1.method7313(Static404.anInt6761, Static447.anInt7618));
		} else if (Static483.anInt8236 == 1 && (Static197.anInterface16Array5 == null || Static6.anInt95 != local14 || local16 != Static28.anInt358)) {
			Static197.anInterface16Array5 = new Interface16[Static6.anInt95 * Static28.anInt358];
			for (@Pc(45) int local45 = 0; local45 < Static197.anInterface16Array5.length; local45++) {
				Static197.anInterface16Array5[local45] = Static9.aClass133_1.method7288(Static9.aClass133_1.method7271(Static408.anInt7120, Static252.anInt4593), Static9.aClass133_1.method7313(Static408.anInt7120, Static252.anInt4593));
			}
			Static641.anIntArray604 = new int[Static28.anInt358 * Static6.anInt95];
			Static182.anInt3238 = 1;
		}
		Static28.aBoolean15 = true;
	}
}
