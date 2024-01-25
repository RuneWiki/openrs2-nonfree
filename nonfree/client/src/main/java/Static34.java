import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static34 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	public static int anInt7200;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_143 = new Class92(35, 3);

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "[I")
	public static final int[] anIntArray495 = new int[2];

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BILclient!ru;)V")
	public static void method5940(@OriginalArg(1) int arg0, @OriginalArg(2) Class219 arg1) {
		if (Static336.aBoolean365) {
			arg0 = 0;
			Static336.aBoolean365 = false;
		}
		if (Static262.aClass219_2 != null && Static262.aClass219_2.method5249(arg1)) {
			return;
		}
		Static262.aClass219_2 = arg1;
		Static41.aLong44 = Static449.method6552();
		Static327.anInt5634 = arg0;
		Static182.anInt3600 = arg0;
		if (Static182.anInt3600 == 0) {
			Static224.method3365();
			return;
		}
		Static47.aFloat9 = Static65.aFloat20;
		Static245.aFloat37 = Static49.aFloat10;
		Static432.anInt7683 = Static191.anInt3693;
		Static259.aClass82_4 = Static58.aClass82_3;
		Static334.aFloat64 = Static145.aFloat25;
		anInt7200 = Static220.anInt3990;
		Static140.aFloat24 = Static350.aFloat87;
		Static195.aFloat96 = Static154.aFloat27;
		Static361.anInt6426 = Static147.anInt2986;
		Static343.aFloat65 = Static268.aFloat52;
	}
}
