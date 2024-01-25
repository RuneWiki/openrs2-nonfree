import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_165 = new Class136(110, 7);

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
	public static final boolean aBoolean706 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!ee;)Ljava/lang/String;")
	public static String method7382(@OriginalArg(2) Class5_Sub12 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8614();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt10154 += Static575.aClass41_1.method851(0, arg0.aByteArray104, arg0.anInt10154, local19, local7);
			return Static62.method1073(0, local7, local19);
		} catch (@Pc(43) Exception local43) {
			return "Cabbage";
		}
	}
}
