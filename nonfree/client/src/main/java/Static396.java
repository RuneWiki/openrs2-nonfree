import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_214 = new Class189("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_12 = new Class61(10, 2, 2, 0);

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_14 = new Class95(10, 15);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!bu;IZIZII)V")
	public static void method5084(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2) {
		Static120.anInt2585 = 0;
		Static61.anInt1580 = arg1;
		Static181.anInt3614 = arg2;
		Static193.aBoolean332 = false;
		Static301.anInt2467 = 2;
		Static50.aClass32_21 = arg0;
		Static410.anInt6753 = 1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
	public static void method5085() {
		if (Static111.aBoolean220) {
			return;
		}
		if (Static374.aClass20_Sub1_1.aBoolean186) {
			Static252.aFloat47 = (int) Static252.aFloat47 + 191 & 0xFFFFFF80;
		} else {
			Static352.aFloat67 += (24.0F - Static352.aFloat67) / 2.0F;
		}
		Static224.aBoolean359 = true;
		Static111.aBoolean220 = true;
	}
}
