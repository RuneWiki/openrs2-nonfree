import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static709 {

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "Lclient!vf;")
	public static final Class390 aClass390_13 = new Class390(2, 2);

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "Z")
	public static boolean aBoolean752 = false;

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B[[BLclient!uu;)V")
	public static void method9462(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class114_Sub1 arg1) {
		@Pc(8) int local8 = Static592.aByteArrayArray14.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) byte[] local21 = arg0[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static385.anIntArray437[local15] >> 8) * 64 - Static291.anInt4448;
				@Pc(45) int local45 = (Static385.anIntArray437[local15] & 0xFF) * 64 - Static189.anInt3243;
				Static445.method5895();
				arg1.method8693(local45, Static153.aClass22_4, local21, Static455.aClass109Array1, local34);
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!tc;I)Z")
	public static boolean method9464(@OriginalArg(0) Class354 arg0) {
		return arg0 == null ? false : Static84.method1820(arg0.anInt9241, arg0.anInt9245 - arg0.anInt9241, arg0.anInt9238 + -arg0.anInt9235, arg0.anInt9235, arg0.anInt9239 - arg0.anInt9240, arg0.anInt9240);
	}
}
