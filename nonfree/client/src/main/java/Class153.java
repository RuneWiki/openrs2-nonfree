import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class153 implements Interface6 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(JILclient!bja;[I)Ljava/lang/String;")
	@Override
	public String method3331(@OriginalArg(0) long arg0, @OriginalArg(2) Class27 arg1, @OriginalArg(3) int[] arg2) {
		if (Static673.aClass27_35 == arg1) {
			@Pc(13) Class381 local13 = Static599.aClass311_1.method6971(arg2[0]);
			return local13.method8604((int) arg0);
		} else if (Static407.aClass27_11 == arg1 || Static557.aClass27_31 == arg1) {
			@Pc(31) Class110 local31 = Static532.aClass255_2.method5210((int) arg0);
			return local31.aString24;
		} else if (Static486.aClass27_26 == arg1 || Static582.aClass27_32 == arg1 || Static180.aClass27_34 == arg1) {
			return Static599.aClass311_1.method6971(arg2[0]).method8604((int) arg0);
		} else {
			return null;
		}
	}
}
