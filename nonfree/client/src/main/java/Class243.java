import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class243 implements Interface16 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!go;[IIJ)Ljava/lang/String;")
	@Override
	public String method5293(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == Static226.aClass121_5) {
			@Pc(17) Class162 local17 = Static108.aClass98_1.method2399(arg1[0]);
			return local17.method3402((int) arg2);
		} else if (arg0 == Static259.aClass121_7 || arg0 == Static324.aClass121_11) {
			@Pc(35) Class222 local35 = Static230.aClass225_1.method4857((int) arg2);
			return local35.aString70;
		} else if (Static455.aClass121_13 == arg0 || Static253.aClass121_6 == arg0 || arg0 == Static388.aClass121_12) {
			return Static108.aClass98_1.method2399(arg1[0]).method3402((int) arg2);
		} else {
			return null;
		}
	}
}
