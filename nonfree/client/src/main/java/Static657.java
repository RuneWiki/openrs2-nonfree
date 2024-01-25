import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
	public static int anInt10171;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "Lclient!ft;")
	public static Class122 aClass122_37;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "Z")
	public static volatile boolean aBoolean757 = true;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
	public static final int[] anIntArray684 = new int[1];

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[8];

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "[I")
	public static final int[] anIntArray685 = new int[50];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!eea;I)V")
	public static void method8767(@OriginalArg(0) Class6_Sub15_Sub1 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static27.anInt372; local8++) {
			@Pc(16) int local16 = Static604.anIntArray620[local8];
			@Pc(20) Class60_Sub1_Sub1_Sub3_Sub1 local20 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local16];
			@Pc(24) int local24 = arg0.method3030();
			if ((local24 & 0x8) != 0) {
				local24 += arg0.method3030() << 8;
			}
			if ((local24 & 0x400) != 0) {
				local24 += arg0.method3030() << 16;
			}
			Static345.method5308(local20, local24, local16, arg0);
		}
		anInt10171++;
	}
}
