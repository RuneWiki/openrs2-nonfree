import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static686 {

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_179 = new Class397(90, -1);

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public static int anInt10661 = 0;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLclient!ik;I)Lclient!kw;")
	public static Class178 method9056(@OriginalArg(1) Class182 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class178 local10 = (Class178) Static121.aClass307_28.method7002((long) arg1);
		if (local10 == null) {
			if (Static185.aBoolean202) {
				local10 = Static153.aClass22_4.method9363(Static735.method8272(arg0, arg1), true);
			} else {
				local10 = Static271.method3836(arg0.method3961(arg1));
			}
			Static121.aClass307_28.method7000(local10, (long) arg1);
		}
		return local10;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	public static void method9057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg1, 5);
		local9.method9256();
		local9.anInt10899 = arg0;
	}
}
