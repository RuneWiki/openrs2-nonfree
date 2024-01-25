import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static552 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!faa;Lclient!faa;)V")
	public static void method8061(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_287 != null) {
			arg1.method8412();
		}
		arg1.aClass3_288 = arg0;
		arg1.aClass3_287 = arg0.aClass3_287;
		arg1.aClass3_287.aClass3_288 = arg1;
		arg1.aClass3_288.aClass3_287 = arg1;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(BII)Z")
	public static boolean method8062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
