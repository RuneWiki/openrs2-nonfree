import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class209 implements Interface9 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "([IJILclient!kg;)Ljava/lang/String;")
	@Override
	public String method4987(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) Class186 arg2) {
		if (arg2 == Static455.aClass186_13) {
			@Pc(13) Class238 local13 = Static561.aClass275_1.method6617(arg0[0]);
			return local13.method5742((int) arg1);
		} else if (arg2 == Static304.aClass186_9 || Static374.aClass186_11 == arg2) {
			@Pc(36) Class329 local36 = Static479.aClass348_1.method8197((int) arg1);
			return local36.aString127;
		} else if (arg2 == Static288.aClass186_8 || Static146.aClass186_5 == arg2 || arg2 == Static587.aClass186_14) {
			return Static561.aClass275_1.method6617(arg0[0]).method5742((int) arg1);
		} else {
			return null;
		}
	}
}
