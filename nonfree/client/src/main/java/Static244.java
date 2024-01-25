import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public static int anInt4046 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!dj;II)V")
	public static void method3470(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (Static438.aBoolean577) {
			Static438.aBoolean577 = false;
			arg1 = 0;
		}
		if (Static175.aClass75_4 != null && Static175.aClass75_4.method1458(arg0)) {
			return;
		}
		Static175.aClass75_4 = arg0;
		Static459.aLong201 = Static362.method5133();
		Static87.anInt9596 = arg1;
		Static529.anInt8482 = arg1;
		if (Static529.anInt8482 == 0) {
			Static89.method1345();
			return;
		}
		Static5.aFloat5 = Static159.aFloat58;
		Static443.aFloat191 = Static498.aFloat204;
		Static88.anInt1496 = Static366.anInt6169;
		Static183.aFloat61 = Static77.aFloat31;
		Static98.anInt1736 = Static327.anInt5512;
		Static75.aFloat30 = Static87.aFloat260;
		Static576.aClass17_4 = Static496.aClass17_3;
		Static558.aFloat239 = Static384.aFloat180;
		Static388.anInt6398 = Static532.anInt8756;
		Static146.aFloat55 = Static57.aFloat26;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IC)C")
	public static char method3471(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IC)Z")
	public static boolean method3473(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)[B")
	public static byte[] method3479(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub2_Sub4 local17 = (Class2_Sub2_Sub4) Static503.aClass236_3.method5075((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(43) int local43 = 0; local43 < 255; local43++) {
				@Pc(49) int local49 = 255 - local43;
				@Pc(54) int local54 = Static328.method4754(local28, local49);
				@Pc(58) byte local58 = local22[local54];
				local22[local54] = local22[local49];
				local22[local49] = local22[511 - local43] = local58;
			}
			local17 = new Class2_Sub2_Sub4(local22);
			Static503.aClass236_3.method5071(local17, (long) arg0);
		}
		return local17.aByteArray35;
	}
}
