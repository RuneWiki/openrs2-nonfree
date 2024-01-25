import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public static int anInt9339;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt9343;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_135 = new Class376(48, -1);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method7937() {
		Static67.aClass167Array15 = new Class167[1000];
		Static142.aClass167Array12 = new Class167[500];
		Static22.anInt704 = 0;
		Static246.anInt4586 = 0;
		Static76.anInt1725 = Static10.anInt118;
		Static447.anInt7715 = 0;
		Static114.anInt2292 = 0;
		Static322.anInt6002 = Static10.anInt118;
		Static243.aClass167Array11 = new Class167[2000];
		Static491.aClass167Array16 = new Class167[500];
		Static175.aBoolean264 = false;
		Static662.anIntArrayArrayArray20 = new int[Static373.anInt6613][Static410.anInt6962 + 1][Static315.anInt5894 + 1];
		if (Static486.aClass16_8 instanceof oa) {
			Static44.aBoolean107 = false;
		} else {
			Static44.aBoolean107 = true;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V")
	public static void method7939(@OriginalArg(1) boolean arg0) {
		Static312.method4827();
		if (!Static561.method7660(Static520.anInt6836)) {
			return;
		}
		Static607.anInt9516++;
		if (Static607.anInt9516 < 50 && !arg0) {
			return;
		}
		Static607.anInt9516 = 0;
		if (!Static5.aBoolean10 && Static673.aClass160_3 != null) {
			@Pc(39) Class3_Sub44 local39 = Static275.method5689(Static63.aClass376_116, Static540.aClass282_4);
			Static616.method8089(local39);
			try {
				Static73.method1618();
			} catch (@Pc(46) IOException local46) {
				Static5.aBoolean10 = true;
			}
		}
		Static312.method4827();
	}
}
