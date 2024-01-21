import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "Lclient!pc;")
	public static Class77 aClass77_110;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Lclient!eh;")
	public static Class28 aClass28_204;

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1228 = Static181.method2795("hint_headicons");

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLclient!ee;ILclient!b;)V")
	public static void method3252(@OriginalArg(1) Class28_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(9) Class19 local9 = Static96.aClass19_11;
		synchronized (Static96.aClass19_11) {
			for (@Pc(16) Class2_Sub17 local16 = (Class2_Sub17) Static96.aClass19_11.method691(); local16 != null; local16 = (Class2_Sub17) Static96.aClass19_11.method686()) {
				if ((long) arg1 == local16.aLong149 && local16.aClass8_3 == arg2 && local16.anInt2536 == 0) {
					local3 = local16.aByteArray24;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(66) byte[] local66 = arg2.method299(arg1);
			arg0.method882(arg1, arg2, local66, true);
		} else {
			arg0.method882(arg1, arg2, local3, true);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ra;I)Lclient!nj;")
	public static Class35_Sub3 method3253(@OriginalArg(0) Class2_Sub3 arg0) {
		return new Class35_Sub3(arg0.method242(), arg0.method242(), arg0.method242(), arg0.method242(), arg0.method261(), arg0.method261(), arg0.method260());
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!eh;B)V")
	public static void method3255(@OriginalArg(0) Class28 arg0) {
		aClass28_204 = arg0;
	}
}
