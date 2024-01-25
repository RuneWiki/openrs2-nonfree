import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "Lclient!it;")
	public static Class164 aClass164_1;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!oh;")
	public static final Class252 aClass252_1 = new Class252(5, 1);

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "Lclient!em;")
	public static final Class83 aClass83_23 = new Class83(70, 8);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method715(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static458.aClass78_153 = arg0;
		Static59.anInt1129 = arg1;
		Static336.aBoolean470 = Static59.anInt1129 > 1 && Static458.aClass78_153.method6845();
		Static166.anInt7796 = 9;
		Static165.anInt3157 = 0x1 << Static166.anInt7796;
		Static513.anInt8858 = Static165.anInt3157 >> 1;
		Math.sqrt((double) (Static513.anInt8858 * Static513.anInt8858 + Static513.anInt8858 * Static513.anInt8858));
		Static119.anInt2474 = 4;
		Static327.anInt5993 = arg2;
		Static191.anInt3757 = arg3;
		Static548.anInt9156 = arg4;
		Static183.aClass210_1 = Static56.method962();
		Static495.method6776();
		Static368.aClass360ArrayArrayArray18 = new Class360[4][Static327.anInt5993][Static191.anInt3757];
		Static36.aClass129Array7 = new Class129[4];
		if (arg5) {
			Static351.anIntArrayArray33 = new int[Static327.anInt5993][Static191.anInt3757];
			Static411.aByteArrayArray22 = new byte[Static327.anInt5993][Static191.anInt3757];
			Static131.aShortArrayArray1 = new short[Static327.anInt5993][Static191.anInt3757];
			Static156.aClass360ArrayArrayArray8 = new Class360[1][Static327.anInt5993][Static191.anInt3757];
			Static150.aClass129Array4 = new Class129[1];
		} else {
			Static351.anIntArrayArray33 = null;
			Static411.aByteArrayArray22 = null;
			Static131.aShortArrayArray1 = null;
			Static156.aClass360ArrayArrayArray8 = null;
			Static150.aClass129Array4 = null;
		}
		if (arg6) {
			Static121.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static31.aClass49Array1 = new Class49[65535];
			Static328.aBooleanArray27 = new boolean[65535];
			Static356.anInt6520 = 0;
		} else {
			Static121.aLongArrayArrayArray1 = null;
			Static31.aClass49Array1 = null;
			Static328.aBooleanArray27 = null;
			Static356.anInt6520 = 0;
		}
		Static286.method4305(false);
		Static319.aClass11_Sub1ArrayArray3 = new Class11_Sub1[2][];
		Static319.aClass11_Sub1ArrayArray3[0] = new Class11_Sub1[Static41.anIntArray515[0]];
		Static319.aClass11_Sub1ArrayArray3[1] = new Class11_Sub1[Static41.anIntArray515[1]];
		Static420.anIntArray440 = new int[2];
		Static267.aClass11_Sub1ArrayArray2 = new Class11_Sub1[2][];
		Static267.aClass11_Sub1ArrayArray2[0] = new Class11_Sub1[Static115.anIntArray90[0]];
		Static267.aClass11_Sub1ArrayArray2[1] = new Class11_Sub1[Static115.anIntArray90[1]];
		Static512.anIntArray540 = new int[2];
		Static176.aClass11_Sub1ArrayArray1 = new Class11_Sub1[2][];
		Static176.aClass11_Sub1ArrayArray1[0] = new Class11_Sub1[Static112.anIntArray83[0]];
		Static176.aClass11_Sub1ArrayArray1[1] = new Class11_Sub1[Static112.anIntArray83[1]];
		Static275.anIntArray276 = new int[2];
		Static458.aClass11_Sub1Array141 = new Class11_Sub1[10000];
		Static300.anInt9562 = 0;
		Static21.aClass11_Sub1Array11 = new Class11_Sub1[5000];
		Static443.anInt7826 = 0;
		Static299.aClass11_Sub1_Sub1Array1 = new Class11_Sub1_Sub1[5000];
		Static435.anInt7764 = 0;
		Static496.aBooleanArrayArray7 = new boolean[Static548.anInt9156 + Static548.anInt9156 + 1][Static548.anInt9156 + Static548.anInt9156 + 1];
		Static321.aBooleanArrayArray5 = new boolean[Static548.anInt9156 + Static548.anInt9156 + 2][Static548.anInt9156 + Static548.anInt9156 + 2];
		if (Static336.aBoolean470) {
			Static288.aBooleanArrayArrayArray4 = new boolean[4][Static548.anInt9156 + Static548.anInt9156 + 1][Static548.anInt9156 + Static548.anInt9156 + 1];
			Static36.aBooleanArrayArrayArray6 = new boolean[4][][];
			if (Static511.aClass80Array1 != null) {
				Static375.method5456();
			}
			Static511.aClass80Array1 = new Class80[Static59.anInt1129];
			Static458.aClass78_153.method6793(Static511.aClass80Array1.length + 1);
			Static458.aClass78_153.method6849(0);
			for (@Pc(247) int local247 = 0; local247 < Static511.aClass80Array1.length; local247++) {
				Static511.aClass80Array1[local247] = new Class80(local247 + 1, Static458.aClass78_153);
				(new Thread(Static511.aClass80Array1[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static59.anInt1129 == 2) {
				local282 = 4;
				Static19.anInt533 = 2;
			} else if (Static59.anInt1129 == 3) {
				local282 = 6;
				Static19.anInt533 = 3;
			} else {
				local282 = 8;
				Static19.anInt533 = 4;
			}
			Static198.aClass187Array1 = new Class187[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static198.aClass187Array1[local302] = new Class187(Static14.aStringArrayArray1[Static59.anInt1129 - 2][local302]);
			}
		} else {
			Static19.anInt533 = 1;
		}
		Static64.anIntArray57 = new int[Static19.anInt533 - 1];
		Static145.anIntArray125 = new int[Static19.anInt533 - 1];
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II[B)[B")
	public static byte[] method717(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static598.method774(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
