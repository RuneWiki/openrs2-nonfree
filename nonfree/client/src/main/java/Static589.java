import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public static volatile int anInt8959 = -1;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	public static void method7598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class3_Sub7_Sub21 local16 = Static136.method2378((long) arg1, 12);
		local16.method9256();
		local16.anInt10899 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)[Lclient!fr;")
	public static Class123[] method7599() {
		return new Class123[] { Static266.aClass123_3, Static488.aClass123_9, Static369.aClass123_6, Static494.aClass123_10, Static150.aClass123_1, Static297.aClass123_5, Static281.aClass123_4, Static702.aClass123_13, Static412.aClass123_8, Static181.aClass123_2, Static572.aClass123_11, Static394.aClass123_7, Static613.aClass123_12, Static722.aClass123_14 };
	}
}
