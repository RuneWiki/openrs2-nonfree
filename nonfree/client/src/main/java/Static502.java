import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
	public static int anInt8074;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "([Lclient!hk;I)V")
	public static void method6975(@OriginalArg(0) Class155[] arg0, @OriginalArg(1) int arg1) {
		Static242.anInt5017 = arg0.length;
		Static12.anIntArray9 = new int[arg1 + Static242.anInt5017];
		Static67.aClass155Array3 = new Class155[Static242.anInt5017 + 10];
		Static693.method8316(arg0, 0, Static67.aClass155Array3, 0, Static242.anInt5017);
		for (@Pc(26) int local26 = 0; local26 < Static242.anInt5017; local26++) {
			Static12.anIntArray9[local26] = Static67.aClass155Array3[local26].method7209();
		}
		for (@Pc(43) int local43 = Static242.anInt5017; local43 < Static67.aClass155Array3.length; local43++) {
			Static12.anIntArray9[local43] = 12;
		}
	}
}
