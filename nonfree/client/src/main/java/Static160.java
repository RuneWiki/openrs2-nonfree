import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!hr", name = "M", descriptor = "Lclient!vh;")
	public static Class250 aClass250_35;

	@OriginalMember(owner = "client!hr", name = "X", descriptor = "[Lclient!na;")
	public static Class136[] aClass136Array2;

	@OriginalMember(owner = "client!hr", name = "Y", descriptor = "I")
	public static int anInt2750;

	@OriginalMember(owner = "client!hr", name = "bb", descriptor = "Lclient!ep;")
	public static Class73 aClass73_4;

	@OriginalMember(owner = "client!hr", name = "U", descriptor = "[I")
	public static final int[] anIntArray258 = new int[2048];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!wo;ILclient!qa;I)V")
	public static void method2425(@OriginalArg(1) Class266 arg0, @OriginalArg(3) Class109 arg1) {
		Static67.aClass266_12.method6004();
		if (Static178.aBoolean187) {
			return;
		}
		for (@Pc(24) Class1_Sub28 local24 = (Class1_Sub28) arg0.method6000(); local24 != null; local24 = (Class1_Sub28) arg0.method5994()) {
			@Pc(32) Class231 local32 = Static7.aClass224_3.method5302(local24.anInt4274);
			if (Static179.method2763(local32)) {
				@Pc(44) boolean local44 = Static45.method767(arg1, local32, local24);
				if (local44) {
					Static156.method2350(local24, arg1, local32);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(CB)Z")
	public static boolean method2428(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(27) char[] local27 = Static348.aCharArray5;
			for (@Pc(29) int local29 = 0; local29 < local27.length; local29++) {
				@Pc(35) char local35 = local27[local29];
				if (arg0 == local35) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!m;ILjava/awt/Canvas;)Lclient!qa;")
	public static Class109 method2429(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		return new Class109_Sub2(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!vh;Lclient!vh;)I")
	public static int method2431(@OriginalArg(1) Class250 arg0, @OriginalArg(2) Class250 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method5668(Static451.anInt7783)) {
			local10++;
		}
		if (arg0.method5668(Static40.anInt742)) {
			local10++;
		}
		if (arg0.method5668(Static242.anInt4338)) {
			local10++;
		}
		if (arg1.method5668(Static451.anInt7783)) {
			local10++;
		}
		if (arg1.method5668(Static40.anInt742)) {
			local10++;
		}
		if (arg1.method5668(Static242.anInt4338)) {
			local10++;
		}
		return local10;
	}
}
