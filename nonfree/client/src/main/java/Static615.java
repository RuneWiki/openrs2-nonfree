import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
	public static int anInt10350;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Lclient!de;")
	public static final Class70 aClass70_4 = new Class70();

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_130 = new Class100(65, -1);

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)V")
	public static void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg1, 14);
		local9.method2817();
		local9.anInt3419 = arg0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public static void method8632() {
		@Pc(15) Class285 local15 = null;
		try {
			@Pc(21) Class150 local21 = Static234.aClass333_5.method8140("2");
			while (local21.anInt4247 == 0) {
				Static20.method9254(1L);
			}
			if (local21.anInt4247 == 1) {
				local15 = (Class285) local21.anObject8;
				@Pc(48) byte[] local48 = new byte[(int) local15.method7147()];
				@Pc(63) int local63;
				for (@Pc(50) int local50 = 0; local50 < local48.length; local50 += local63) {
					local63 = local15.method7141(local48, local48.length - local50, local50);
					if (local63 == -1) {
						throw new IOException("EOF");
					}
				}
				Static186.method9080(new Class14_Sub29(local48));
			}
		} catch (@Pc(92) Exception local92) {
		}
		try {
			if (local15 != null) {
				local15.method7142();
			}
		} catch (@Pc(99) Exception local99) {
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public static void method8633() {
		@Pc(17) Class14_Sub19 local17 = Static286.method4081(Static205.aClass394_1, Static400.aClass100_100);
		local17.aClass14_Sub29_Sub1_1.method5854(Static482.method7137());
		local17.aClass14_Sub29_Sub1_1.method5859(Static561.anInt9759);
		local17.aClass14_Sub29_Sub1_1.method5859(Static639.anInt10685);
		local17.aClass14_Sub29_Sub1_1.method5854(Static56.aClass14_Sub22_5.aClass21_Sub9_1.method2372());
		Static576.method8234(local17);
	}
}
