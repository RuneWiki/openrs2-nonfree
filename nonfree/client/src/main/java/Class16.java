import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class16 implements Interface11 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!ud;IJ[I)Ljava/lang/String;")
	@Override
	public String method273(@OriginalArg(0) Class245 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 == Static120.aClass245_8) {
			@Pc(13) Class233 local13 = Static294.aClass252_1.method5639(arg2[0]);
			return local13.method4914((int) arg1);
		} else if (arg0 == Static220.aClass245_9 || Static72.aClass245_5 == arg0) {
			@Pc(31) Class80 local31 = Static416.aClass64_2.method1372((int) arg1);
			return local31.aString10;
		} else if (Static2.aClass245_1 == arg0 || Static331.aClass245_15 == arg0 || Static75.aClass245_6 == arg0) {
			return Static294.aClass252_1.method5639(arg2[0]).method4914((int) arg1);
		} else {
			return null;
		}
	}
}
