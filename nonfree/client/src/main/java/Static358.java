import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
	public static int anInt6492;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "[I")
	public static final int[] anIntArray372 = new int[4];

	@OriginalMember(owner = "client!m", name = "qb", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_129 = new Class359(131, 10);

	@OriginalMember(owner = "client!m", name = "tb", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!m", name = "vb", descriptor = "I")
	public static int anInt6495 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIJ)Lclient!rha;")
	public static Class5_Sub3_Sub17 method5408(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(14) Class5_Sub3_Sub17 local14 = (Class5_Sub3_Sub17) Static156.aClass300_14.method7188(arg1 | (long) arg0 << 56);
		if (local14 == null) {
			local14 = new Class5_Sub3_Sub17(arg0, arg1);
			Static156.aClass300_14.method7191(local14, local14.aLong307);
		}
		return local14;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZZZ)V")
	public static void method5409(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static205.anInt1048--;
			if (Static205.anInt1048 == 0) {
				Static336.anIntArray357 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static666.anInt10679--;
		if (Static666.anInt10679 == 0) {
			Static378.anIntArray380 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!daa;ILclient!ha;)I")
	public static int method5410(@OriginalArg(0) Class74 arg0, @OriginalArg(2) Class65 arg1) {
		if (arg0.anInt2148 != -1) {
			return arg0.anInt2148;
		}
		if (arg0.anInt2137 != -1) {
			@Pc(27) Class136 local27 = arg1.anInterface4_11.method358(arg0.anInt2137);
			if (!local27.aBoolean315) {
				return local27.aShort36;
			}
		}
		return arg0.anInt2146;
	}
}
