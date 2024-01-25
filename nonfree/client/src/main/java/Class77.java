import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class77 implements Interface15 {

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(J[IILclient!baa;)Ljava/lang/String;")
	@Override
	public String method1453(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class28 arg2) {
		if (arg2 == Static370.aClass28_17) {
			@Pc(21) Class309 local21 = Static522.aClass217_1.method5012(arg1[0]);
			return local21.method6908((int) arg0);
		} else if (arg2 == Static67.aClass28_3 || arg2 == Static440.aClass28_19) {
			@Pc(39) Class339 local39 = Static296.aClass218_1.method5067((int) arg0);
			return local39.aString97;
		} else if (Static45.aClass28_2 == arg2 || Static291.aClass28_9 == arg2 || arg2 == Static315.aClass28_21) {
			return Static522.aClass217_1.method5012(arg1[0]).method6908((int) arg0);
		} else {
			return null;
		}
	}
}
