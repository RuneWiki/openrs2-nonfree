import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static323 {

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
	public static boolean aBoolean426;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_203 = new Class137(7, 0);

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_167 = new Class151("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
	public static int anInt5318 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBII)I")
	public static int method4126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg0 >>= 0x4;
		} else if (arg1 > 217) {
			arg0 >>= 0x3;
		} else if (arg1 > 192) {
			arg0 >>= 0x2;
		} else if (arg1 > 179) {
			arg0 >>= 0x1;
		}
		return (arg1 >> 1) + ((arg2 >> 2 & 0x3F) << 10) + (arg0 >> 5 << 7);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZII)I")
	public static int method4128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static203.anIntArray180[arg0 & 0x3] : Static14.anIntArray9[arg0 & 0x3];
	}
}
