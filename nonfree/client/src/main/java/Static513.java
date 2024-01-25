import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_3 = new Class230(76, 5);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lclient!pe;BILclient!pe;)V")
	public static void method355(@OriginalArg(0) Class254 arg0, @OriginalArg(3) Class254 arg1) {
		Static25.aClass254_12 = arg1;
		Static200.aClass254_66 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
	public static void method356() {
		@Pc(1) Class134[] local1 = Class2.aClass134Array24;
		synchronized (Class2.aClass134Array24) {
			for (@Pc(5) int local5 = 0; local5 < Class2.aClass134Array24.length; local5++) {
				Class2.aClass134Array24[local5] = new Class134();
				Static380.anIntArray474[local5] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
	public static void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static580.aClass125ArrayArrayArray3[0][arg1][arg2] != null && Static580.aClass125ArrayArrayArray3[0][arg1][arg2].aClass125_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static580.aClass125ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class125 local46 = Static580.aClass125ArrayArrayArray3[local22][arg1][arg2] = new Class125(local22, arg1, arg2);
				if (local20) {
					local46.aByte36++;
				}
			}
		}
	}
}
