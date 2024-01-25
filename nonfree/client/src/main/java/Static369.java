import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ow", name = "v", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar4 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ow", name = "x", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_91 = new Class40("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) long local14 = (long) ((arg4 ? Integer.MIN_VALUE : 0) | arg3);
		@Pc(20) Class5_Sub24 local20 = (Class5_Sub24) Static138.aClass42_7.method1109(local14);
		if (local20 == null) {
			local20 = new Class5_Sub24();
			Static138.aClass42_7.method1106(local14, local20);
		}
		if (local20.anIntArray261.length <= arg2) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray261.length; local48++) {
				local41[local48] = local20.anIntArray261[local48];
				local46[local48] = local20.anIntArray260[local48];
			}
			for (@Pc(74) int local74 = local20.anIntArray261.length; local74 < arg2; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local20.anIntArray260 = local46;
			local20.anIntArray261 = local41;
		}
		local20.anIntArray261[arg2] = arg1;
		local20.anIntArray260[arg2] = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)V")
	public static void method5025() {
		Static290.aClass5_Sub15_Sub4_1.method6526();
		Static332.anInt6296 = 1;
		Static409.aClass117_173 = null;
	}
}
