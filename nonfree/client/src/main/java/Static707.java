import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static707 {

	@OriginalMember(owner = "client!wea", name = "y", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_189 = new Class397(79, -2);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
	public static void method9439() {
		if (Static568.aFileOutputStream1 != null) {
			try {
				Static568.aFileOutputStream1.close();
			} catch (@Pc(6) IOException local6) {
			}
		}
		Static568.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(BLclient!ika;)Lclient!la;")
	public static Class104 method9440(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(10) Class223 local10 = Static525.method7024()[arg0.method2048(255)];
		@Pc(17) Class352 local17 = Static588.method7593()[arg0.method2048(255)];
		@Pc(21) int local21 = arg0.method2017();
		@Pc(25) int local25 = arg0.method2017();
		@Pc(29) int local29 = arg0.method2028(-14795);
		@Pc(33) int local33 = arg0.method2028(-14795);
		@Pc(45) int local45 = arg0.method2017();
		@Pc(49) int local49 = arg0.method2036();
		@Pc(53) int local53 = arg0.method2036();
		return new Class104(local10, local17, local21, local25, local29, local33, local45, local49, local53);
	}
}
