import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dk", name = "Ib", descriptor = "I")
	public static final int anInt1385 = 4096;

	@OriginalMember(owner = "client!dk", name = "Lb", descriptor = "I")
	public static final int anInt1386 = Static428.method5666(2200);

	@OriginalMember(owner = "client!dk", name = "Ob", descriptor = "I")
	public static final int anInt1388 = 4096;

	@OriginalMember(owner = "client!dk", name = "mc", descriptor = "I")
	public static int anInt1393 = 0;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!cd;[Lclient!dk;)Lclient!dk;")
	public static Class57_Sub1 method1225(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) Class57_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class57_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class57_Sub1(arg0, arg1);
		}
	}
}
