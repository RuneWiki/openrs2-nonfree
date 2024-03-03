import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!mr;)I", line = 29)
	public static int method6020(@OriginalArg(1) Class11_Sub5_Sub2 arg0) {
		if (arg0.anInt4596 == 0) {
			return 0;
		}
		@Pc(54) int local54;
		@Pc(61) int local61;
		if (arg0.anInt4602 != -1) {
			@Pc(22) Class11_Sub5_Sub2 local22 = null;
			if (arg0.anInt4602 < 32768) {
				local22 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[arg0.anInt4602];
			} else if (arg0.anInt4602 >= 32768) {
				local22 = Class9.aClass11_Sub5_Sub2_Sub1Array1[arg0.anInt4602 - 32768];
			}
			if (local22 != null) {
				local54 = arg0.anInt6768 - local22.anInt6768;
				local61 = arg0.anInt6770 - local22.anInt6770;
				if (local54 != 0 || local61 != 0) {
					arg0.method4326((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub5_Sub2_Sub1) {
			@Pc(160) Class11_Sub5_Sub2_Sub1 local160 = (Class11_Sub5_Sub2_Sub1) arg0;
			if (local160.anInt4168 != -1 && (local160.anInt4634 == 0 || local160.anInt4632 > 0)) {
				local160.method4326(local160.anInt4168);
				local160.anInt4168 = -1;
			}
		} else if (arg0 instanceof Class11_Sub5_Sub2_Sub2) {
			@Pc(90) Class11_Sub5_Sub2_Sub2 local90 = (Class11_Sub5_Sub2_Sub2) arg0;
			if (local90.anInt4654 != -1 && (local90.anInt4634 == 0 || local90.anInt4632 > 0)) {
				local54 = local90.anInt6768 - (local90.anInt4654 - Static154.anInt3136 - Static154.anInt3136) * 64;
				local61 = local90.anInt6770 - (local90.anInt4648 - Static139.anInt2716 - Static139.anInt2716) * 64;
				if (local54 != 0 || local61 != 0) {
					local90.method4326((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local90.anInt4654 = -1;
			}
		}
		return arg0.method4328();
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V", line = 136)
	public static void method6022() {
		Class39.aClass98_3.method2616();
	}
}
