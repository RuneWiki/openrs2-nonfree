import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!fo;")
	public static final Class107 aClass107_7 = new Class107();

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	public static void method5196() {
		@Pc(13) Class6_Sub1_Sub5 local13 = Static77.method1176(0, 15);
		local13.method770();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[B")
	public static byte[] method5197(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub1_Sub16 local12 = (Class6_Sub1_Sub16) Static10.aClass284_2.method6449((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(40) int local40 = 0; local40 < 255; local40++) {
				@Pc(47) int local47 = 255 - local40;
				@Pc(52) int local52 = Static29.method431(local47, local23);
				@Pc(56) byte local56 = local17[local52];
				local17[local52] = local17[local47];
				local17[local47] = local17[511 - local40] = local56;
			}
			local12 = new Class6_Sub1_Sub16(local17);
			Static10.aClass284_2.method6450((long) arg0, local12);
		}
		return local12.aByteArray106;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)I")
	public static int method5198(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public static void method5199() {
		@Pc(5) int local5 = 0;
		if (Static480.aClass6_Sub37_Sub1_1 != null) {
			local5 = Static480.aClass6_Sub37_Sub1_1.method5156(Static567.anInt9503);
		}
		@Pc(30) int local30;
		@Pc(39) int local39;
		if (local5 == 2) {
			local30 = Static544.anInt9196 <= 800 ? Static544.anInt9196 : 800;
			Static502.anInt8364 = local30;
			local39 = Static371.anInt6408 <= 600 ? Static371.anInt6408 : 600;
			Static411.anInt7204 = (Static544.anInt9196 - local30) / 2;
			Static141.anInt2538 = 0;
			Static476.anInt8045 = local39;
		} else if (local5 == 1) {
			local30 = Static544.anInt9196 > 1024 ? 1024 : Static544.anInt9196;
			local39 = Static371.anInt6408 <= 768 ? Static371.anInt6408 : 768;
			Static411.anInt7204 = (Static544.anInt9196 - local30) / 2;
			Static502.anInt8364 = local30;
			Static141.anInt2538 = 0;
			Static476.anInt8045 = local39;
		} else {
			Static502.anInt8364 = Static544.anInt9196;
			Static411.anInt7204 = 0;
			Static141.anInt2538 = 0;
			Static476.anInt8045 = Static371.anInt6408;
		}
	}
}
