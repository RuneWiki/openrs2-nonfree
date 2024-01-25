import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_169 = new Class215(0, -1);

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_46 = new Class341();

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V")
	public static void method6823(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1) {
		Static590.aHashtable7.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	public static void method6825(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class2 local11 = Static514.aClass99_71.method3060(); local11 != null; local11 = Static514.aClass99_71.method3058()) {
			if ((local11.aLong278 >> 48 & 0xFFFFL) == (long) arg0) {
				local11.method9253();
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
	public static void method6826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static223.anInt4978;
		@Pc(12) int local12 = Static334.anInt6734;
		if (Static487.aBoolean676) {
			local5 += Static465.method7210();
			local12 += Static207.method4090();
		}
		@Pc(33) Class46 local33;
		if (Static592.anInt10450 == 1) {
			local33 = Static146.aClass46Array6[Static124.anInt11090 / 100];
			local33.method6213(local5 - 8, local12 + -8);
			Static113.method2842(local5 - 8, local5 - -local33.method6205() + -8, local12 - 8, local33.method6219() + -8 + local12);
		}
		if (Static592.anInt10450 == 2) {
			local33 = Static146.aClass46Array6[Static124.anInt11090 / 100 + 4];
			local33.method6213(local5 - 8, local12 + -8);
			Static113.method2842(local5 - 8, local33.method6205() + local5 + -8, local12 - 8, local33.method6219() + -8 + local12);
		}
		Static612.method8945();
	}
}
