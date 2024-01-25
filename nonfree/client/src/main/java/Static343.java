import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!li", name = "y", descriptor = "Lclient!oba;")
	public static Class3_Sub11_Sub14 aClass3_Sub11_Sub14_3;

	@OriginalMember(owner = "client!li", name = "F", descriptor = "Lclient!gw;")
	public static Class127 aClass127_5;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "[I")
	public static final int[] anIntArray503 = new int[6];

	@OriginalMember(owner = "client!li", name = "E", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_124 = new Class180(47, 3);

	@OriginalMember(owner = "client!li", name = "G", descriptor = "[I")
	public static final int[] anIntArray504 = new int[13];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!aj;I)Lclient!vr;")
	public static Class33 method5151(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class33 local17 = (Class33) Static245.aClass165_30.method4389((long) arg1);
		if (local17 == null) {
			if (Static122.aBoolean200) {
				local17 = Static674.aClass13_22.method8465(Static682.method2751(arg0, arg1), true);
			} else {
				local17 = Static321.method4918(arg0.method536(arg1));
			}
			Static245.aClass165_30.method4392(local17, (long) arg1);
		}
		return local17;
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(B)V")
	public static void method5153() {
		@Pc(7) Class214 local7 = null;
		try {
			local7 = Static497.method7131("2");
			@Pc(20) Class3_Sub25 local20 = new Class3_Sub25(Static277.anInt6587 * 6 + 3);
			local20.method8614(1);
			local20.method8649(Static277.anInt6587);
			for (@Pc(30) int local30 = 0; local30 < Static449.anIntArray636.length; local30++) {
				if (Static487.aBooleanArray38[local30]) {
					local20.method8649(local30);
					local20.method8588(Static449.anIntArray636[local30]);
				}
			}
			local7.method5378(0, local20.aByteArray106, local20.anInt9765);
		} catch (@Pc(65) Exception local65) {
		}
		try {
			if (local7 != null) {
				local7.method5380();
			}
		} catch (@Pc(72) Exception local72) {
		}
		Static123.aLong80 = Static524.method7320();
		Static430.aBoolean489 = false;
	}
}
