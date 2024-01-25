import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
	public static int anInt5982 = 0;

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
	public static final int[] anIntArray385 = new int[100];

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I[Lclient!cr;I)V")
	public static void method4779(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(16) Class41 local16 = arg1[local3];
			if (local16 != null) {
				if (local16.anInt1642 == 0) {
					if (local16.aClass41Array1 != null) {
						method4779(arg0, local16.aClass41Array1);
					}
					@Pc(40) Class2_Sub25 local40 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local16.anInt1613);
					if (local40 != null) {
						Static442.method5989(local40.anInt4163, arg0);
					}
				}
				@Pc(59) Class2_Sub14 local59;
				if (arg0 == 0 && local16.anObjectArray21 != null) {
					local59 = new Class2_Sub14();
					local59.aClass41_5 = local16;
					local59.anObjectArray32 = local16.anObjectArray21;
					Static290.method4227(local59);
				}
				if (arg0 == 1 && local16.anObjectArray24 != null) {
					if (local16.anInt1683 >= 0) {
						@Pc(82) Class41 local82 = Static160.method2564(local16.anInt1613);
						if (local82 == null || local82.aClass41Array1 == null || local16.anInt1683 >= local82.aClass41Array1.length || local16 != local82.aClass41Array1[local16.anInt1683]) {
							continue;
						}
					}
					local59 = new Class2_Sub14();
					local59.anObjectArray32 = local16.anObjectArray24;
					local59.aClass41_5 = local16;
					Static290.method4227(local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	public static void method4780(@OriginalArg(0) int arg0) {
		Static351.anInt6183 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static86.anInt2009; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static360.anInt6340; local6++) {
				if (Static176.aClass113ArrayArrayArray3[arg0][local3][local6] == null) {
					Static176.aClass113ArrayArrayArray3[arg0][local3][local6] = new Class113(arg0, local3, local6);
				}
			}
		}
	}
}
