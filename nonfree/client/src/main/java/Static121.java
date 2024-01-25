import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_60 = new Class209("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!ht;")
	public static final Class112 aClass112_7 = new Class112();

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public static int anInt2701 = 0;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_50 = new Class265(71, -2);

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_19 = new Class171(200);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(FIIIZIIII)[[I")
	public static int[][] method2116(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub2_Sub38 local13 = new Class2_Sub2_Sub38();
		local13.anInt7383 = (int) (arg0 * 4096.0F);
		local13.anInt7379 = 8;
		local13.anInt7385 = 4;
		local13.aBoolean485 = false;
		local13.anInt7386 = 3;
		local13.method5845();
		Static22.method463(256, 64);
		for (@Pc(54) int local54 = 0; local54 < 256; local54++) {
			local13.method5815(local54, local9[local54]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ga;ILclient!mg;)V")
	public static void method2118(@OriginalArg(0) Interface4 arg0, @OriginalArg(2) Class160 arg1) {
		Static297.anInterface4_5 = arg0;
		Static357.aClass160_70 = arg1;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(CI)C")
	public static char method2119(@OriginalArg(0) char arg0) {
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
}
