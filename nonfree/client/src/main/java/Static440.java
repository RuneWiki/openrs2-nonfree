import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_47 = new Class265(30);

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_239 = new Class196(125, 3);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLclient!kv;[I[III)Lclient!no;")
	public static Class1_Sub3 method6582(@OriginalArg(1) Class143_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) byte[] local8 = new byte[arg4 * arg3];
		for (@Pc(10) int local10 = 0; local10 < arg4; local10++) {
			@Pc(24) int local24 = arg2[local10] + arg3 * local10;
			for (@Pc(26) int local26 = 0; local26 < arg1[local10]; local26++) {
				local8[local24++] = -1;
			}
		}
		return new Class1_Sub3(arg0, arg3, arg4, local8);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZB)V")
	public static void method6585(@OriginalArg(0) boolean arg0) {
		Static491.method7177();
		if (!Static427.method8766(Static539.anInt8853)) {
			return;
		}
		Static53.anInt4077++;
		if (Static53.anInt4077 < 50 && !arg0) {
			return;
		}
		Static53.anInt4077 = 0;
		if (!Static396.aBoolean496 && Static537.aClass240_34 != null) {
			@Pc(35) Class5_Sub16 local35 = Static455.method6717(Static544.aClass187_83, Static16.aClass332_8);
			Static479.method7038(local35);
			try {
				Static652.method8576();
			} catch (@Pc(42) IOException local42) {
				Static396.aBoolean496 = true;
			}
		}
		Static491.method7177();
	}
}
