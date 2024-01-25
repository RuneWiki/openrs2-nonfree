import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cia", name = "k", descriptor = "Lclient!cj;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!cia", name = "m", descriptor = "Lclient!uq;")
	public static Class362 aClass362_16;

	@OriginalMember(owner = "client!cia", name = "j", descriptor = "Lclient!daa;")
	public static final Class70 aClass70_1 = new Class70(0);

	@OriginalMember(owner = "client!cia", name = "l", descriptor = "Lclient!g;")
	public static final Class122 aClass122_4 = new Class122(1);

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILclient!qba;)V")
	public static void method1316(@OriginalArg(1) Class34_Sub1_Sub1_Sub2 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt9642 == Static122.anInt2190 || arg0.anInt9664 == -1 || arg0.anInt9698 != 0) {
			local5 = true;
		} else {
			@Pc(29) Class239 local29 = Static13.aClass213_1.method5008(arg0.anInt9664);
			if (local29.aBoolean446 || arg0.anInt9680 + 1 > local29.anIntArray337[arg0.anInt9674]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(58) int local58 = arg0.anInt9642 - arg0.anInt9685;
			@Pc(64) int local64 = Static122.anInt2190 - arg0.anInt9685;
			@Pc(76) int local76 = arg0.anInt9643 * 512 + arg0.method7866() * 256;
			@Pc(88) int local88 = arg0.anInt9656 * 512 + arg0.method7866() * 256;
			@Pc(100) int local100 = arg0.anInt9677 * 512 + arg0.method7866() * 256;
			@Pc(111) int local111 = arg0.anInt9640 * 512 + arg0.method7866() * 256;
			arg0.anInt9619 = (local88 * (local58 - local64) + local111 * local64) / local58;
			arg0.anInt9614 = ((local58 - local64) * local76 + local100 * local64) / local58;
		}
		arg0.anInt9704 = 0;
		if (arg0.anInt9645 == 0) {
			arg0.method7864(false, 8192);
		}
		if (arg0.anInt9645 == 1) {
			arg0.method7864(false, 12288);
		}
		if (arg0.anInt9645 == 2) {
			arg0.method7864(false, 0);
		}
		if (arg0.anInt9645 == 3) {
			arg0.method7864(false, 4096);
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method1318(@OriginalArg(0) String arg0) {
		return Static590.method7802(arg0, 16);
	}
}
