import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class165 implements Interface9 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!fq;[IBJ)Ljava/lang/String;")
	@Override
	public String method4924(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (arg0 == Static33.aClass104_1) {
			@Pc(13) Class292 local13 = Static432.aClass311_1.method7468(arg1[0]);
			return local13.method7216((int) arg2);
		} else if (Static568.aClass104_18 == arg0 || Static402.aClass104_17 == arg0) {
			@Pc(31) Class237 local31 = Static367.aClass281_1.method6975((int) arg2);
			return local31.aString84;
		} else if (Static444.aClass104_16 == arg0 || Static36.aClass104_2 == arg0 || Static419.aClass104_13 == arg0) {
			return Static432.aClass311_1.method7468(arg1[0]).method7216((int) arg2);
		} else {
			return null;
		}
	}
}
