import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method2980() {
		Static147.aClass129_43.method3026();
		Static419.aClass129_73.method3026();
		Static294.aClass129_35.method3026();
		Static172.aClass129_26.method3026();
		Static387.aClass129_61.method3026();
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public static void method2981() {
		Static18.anInt404 = 0;
		Static148.aClass9Array1 = new Class9[50];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!cr;BI)V")
	public static void method2982(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(3) int arg2) {
		Static342.aClass41_12 = arg1;
		Static150.anInt2863 = arg0;
		Static60.anInt1702 = arg2;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!md;I)V")
	public static void method2983(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (Static451.aClass85_2 == null) {
			return;
		}
		try {
			Static451.aClass85_2.method1722(0L);
			Static451.aClass85_2.method1721(24, arg1, arg0.aByteArray136);
		} catch (@Pc(14) Exception local14) {
		}
	}
}
