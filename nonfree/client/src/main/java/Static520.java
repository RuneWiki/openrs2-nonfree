import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
	public static int anInt8816;

	@OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
	public static int anInt8824;

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "[I")
	public static final int[] anIntArray668 = new int[8];

	@OriginalMember(owner = "client!uba", name = "z", descriptor = "Lclient!wba;")
	public static Class353 aClass353_61 = new Class353();

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)V")
	public static void method7227(@OriginalArg(0) int arg0) {
		if (!Static504.method4690(arg0)) {
			return;
		}
		@Pc(14) Class341[] local14 = Static578.aClass341ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class341 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt9253 = 0;
				local22.anInt9246 = 0;
				local22.anInt9288 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method7228(@OriginalArg(0) String arg0) {
		Static83.method1476(0, 0, "", "", "", arg0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIBIII)V")
	public static void method7229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg3;
		@Pc(14) int local14 = arg4 - arg2;
		if (local9 == 0) {
			if (local14 != 0) {
				Static366.method4945(arg3, arg0, arg2, arg4);
			}
		} else if (local14 == 0) {
			Static432.method6033(arg1, arg3, arg0, arg2);
		} else {
			@Pc(48) int local48 = (local14 << 12) / local9;
			@Pc(57) int local57 = arg2 - (arg3 * local48 >> 12);
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (arg1 < Static270.anInt4759) {
				local75 = (Static270.anInt4759 * local48 >> 12) + local57;
				local73 = Static270.anInt4759;
			} else if (Static162.anInt2935 >= arg1) {
				local73 = arg1;
				local75 = arg4;
			} else {
				local75 = (local48 * Static162.anInt2935 >> 12) + local57;
				local73 = Static162.anInt2935;
			}
			@Pc(104) int local104;
			@Pc(112) int local112;
			if (arg3 < Static270.anInt4759) {
				local104 = Static270.anInt4759;
				local112 = local57 + (local48 * Static270.anInt4759 >> 12);
			} else if (arg3 <= Static162.anInt2935) {
				local104 = arg3;
				local112 = arg2;
			} else {
				local104 = Static162.anInt2935;
				local112 = (Static162.anInt2935 * local48 >> 12) + local57;
			}
			if (Static514.anInt8722 > local75) {
				local75 = Static514.anInt8722;
				local73 = (Static514.anInt8722 - local57 << 12) / local48;
			} else if (local75 > Static451.anInt7775) {
				local73 = (Static451.anInt7775 - local57 << 12) / local48;
				local75 = Static451.anInt7775;
			}
			if (local112 < Static514.anInt8722) {
				local104 = (Static514.anInt8722 - local57 << 12) / local48;
				local112 = Static514.anInt8722;
			} else if (local112 > Static451.anInt7775) {
				local104 = (Static451.anInt7775 - local57 << 12) / local48;
				local112 = Static451.anInt7775;
			}
			Static95.method1634(local75, local112, local73, local104, arg0);
		}
	}
}
