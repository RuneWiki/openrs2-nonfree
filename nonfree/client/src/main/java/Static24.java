import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!al;")
	public static final Class11 aClass11_16 = new Class11(30);

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
	public static int anInt602 = 2;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString24 = "Checking for updates - ";

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!mo;BLclient!mo;)V")
	public static void method656(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Class143 arg1) {
		Static13.aClass143_55 = arg1;
		Static161.aClass143_67 = arg0;
		Static13.aClass143_55.method3732(36);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method657(@OriginalArg(1) int arg0) {
		@Pc(25) byte[] local25;
		if (arg0 == 100 && Static137.anInt2908 > 0) {
			local25 = Static117.aByteArrayArray23[--Static137.anInt2908];
			Static117.aByteArrayArray23[Static137.anInt2908] = null;
			return local25;
		} else if (arg0 == 5000 && Static76.anInt1858 > 0) {
			local25 = Static293.aByteArrayArray24[--Static76.anInt1858];
			Static293.aByteArrayArray24[Static76.anInt1858] = null;
			return local25;
		} else if (arg0 == 30000 && Static182.anInt3785 > 0) {
			local25 = Static257.aByteArrayArray19[--Static182.anInt3785];
			Static257.aByteArrayArray19[Static182.anInt3785] = null;
			return local25;
		} else {
			return new byte[arg0];
		}
	}
}
