import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!eka;")
	public static Class5_Sub17_Sub1 aClass5_Sub17_Sub1_1;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method490() {
		for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
			Static95.aBooleanArray30[local13] = false;
		}
		Static333.anInt6165 = Static200.anInt3808;
		Static438.anInt7717 = -1;
		Static382.anInt6782 = Static407.anInt7215;
		Static509.anInt8529 = Static26.anInt350;
		Static424.anInt7472 = Static332.anInt6132;
		Static672.anInt10801 = 0;
		Static660.anInt10605 = 5;
		Static643.anInt10418 = Static79.anInt1141;
		Static556.anInt9087 = 0;
		Static334.anInt6173 = Static207.anInt3885;
		Static542.anInt6469 = -1;
		Static493.anInt8261 = -1;
		Static513.anInt8562 = -1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method491(@OriginalArg(1) int arg0) {
		for (@Pc(3) Class5 local3 = Static9.aClass300_48.method7182(); local3 != null; local3 = Static9.aClass300_48.method7192()) {
			if ((long) arg0 == (local3.aLong307 >> 48 & 0xFFFFL)) {
				local3.method9052();
			}
		}
	}
}
