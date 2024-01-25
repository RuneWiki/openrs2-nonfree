import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static int anInt139;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_2 = new Class99();

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)I")
	public static int method265(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return ~local45 & arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!jk;)I")
	public static int method266(@OriginalArg(1) Class15_Sub2_Sub1_Sub2 arg0) {
		@Pc(13) Class305 local13 = arg0.aClass305_1;
		if (local13.anIntArray679 != null) {
			local13 = local13.method7150(Static540.aClass242_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local13.anInt8818;
		@Pc(32) Class281 local32 = arg0.method4026();
		if (arg0.aBoolean299) {
			local28 = local13.anInt8828;
		} else if (arg0.anInt4725 == local32.anInt8093 || arg0.anInt4725 == local32.anInt8117 || arg0.anInt4725 == local32.anInt8113 || arg0.anInt4725 == local32.anInt8121) {
			local28 = local13.anInt8830;
		} else if (local32.anInt8124 == arg0.anInt4725 || arg0.anInt4725 == local32.anInt8099 || local32.anInt8116 == arg0.anInt4725 || local32.anInt8098 == arg0.anInt4725) {
			local28 = local13.anInt8807;
		}
		return local28;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!n;Lclient!gp;I)V")
	public static void method268(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class117 arg1) {
		Static149.aClass117_77 = arg1;
		Static405.anInterface8_119 = arg0;
	}
}
