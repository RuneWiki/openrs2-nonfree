import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ma", name = "zc", descriptor = "Lclient!bc;")
	public static Class1 aClass1_17;

	@OriginalMember(owner = "client!ma", name = "Cc", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!ma", name = "Dc", descriptor = "Lclient!wg;")
	public static Class94 aClass94_3;

	@OriginalMember(owner = "client!ma", name = "vc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_941 = Static120.method1824("::fpsoff");

	@OriginalMember(owner = "client!ma", name = "wc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_942 = Static120.method1824("scrollen:");

	@OriginalMember(owner = "client!ma", name = "xc", descriptor = "I")
	public static int anInt2370 = 0;

	@OriginalMember(owner = "client!ma", name = "Bc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_943 = Static120.method1824("scrollbar");

	@OriginalMember(owner = "client!ma", name = "Gc", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_944 = Static120.method1824("(Y<)4col>");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lclient!rd;II)Lclient!rd;")
	public static Class80 method1629(@OriginalArg(0) int arg0, @OriginalArg(1) Class80[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg2; local5++) {
			if (arg1[local5 + arg0] == null) {
				arg1[local5 + arg0] = Static111.aClass80_989;
			}
			local3 += arg1[arg0 + local5].anInt3421;
		}
		@Pc(39) byte[] local39 = new byte[local3];
		@Pc(41) int local41 = 0;
		@Pc(52) Class80 local52;
		for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
			local52 = arg1[arg0 + local43];
			Static200.method1179(local52.aByteArray43, 0, local39, local41, local52.anInt3421);
			local41 += local52.anInt3421;
		}
		local52 = new Class80();
		local52.anInt3421 = local3;
		local52.aByteArray43 = local39;
		return local52;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1630(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	public static void method1632(@OriginalArg(1) int arg0) {
		Static4.anInt187 += arg0 * 128;
		@Pc(27) int local27;
		if (Static4.anInt187 > Static184.anIntArray497.length) {
			Static4.anInt187 -= Static184.anIntArray497.length;
			local27 = (int) (Math.random() * 12.0D);
			Static122.method1835(Static126.aClass3_Sub1_Sub4_Sub1Array6[local27]);
		}
		@Pc(36) int local36 = arg0 * 128;
		@Pc(43) int local43 = (256 - arg0) * 128;
		local27 = 0;
		@Pc(71) int local71;
		for (@Pc(47) int local47 = 0; local47 < local43; local47++) {
			local71 = Static59.anIntArray172[local36 + local27] - arg0 * Static184.anIntArray497[local27 + Static4.anInt187 & Static184.anIntArray497.length + -1] / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static59.anIntArray172[local27++] = local71;
		}
		@Pc(98) int local98;
		@Pc(107) int local107;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local98 = local71 * 128;
			for (@Pc(100) int local100 = 0; local100 < 128; local100++) {
				local107 = (int) (Math.random() * 100.0D);
				if (local107 < 50 && local100 > 10 && local100 < 118) {
					Static59.anIntArray172[local100 + local98] = 255;
				} else {
					Static59.anIntArray172[local100 + local98] = 0;
				}
			}
		}
		if (Static185.anInt4181 > 0) {
			Static185.anInt4181 -= arg0 * 4;
		}
		if (Static9.anInt239 > 0) {
			Static9.anInt239 -= arg0 * 4;
		}
		if (Static9.anInt239 == 0 && Static185.anInt4181 == 0) {
			local98 = (int) (Math.random() * (double) (2000 / arg0));
			if (local98 == 1) {
				Static185.anInt4181 = 1024;
			}
			if (local98 == 0) {
				Static9.anInt239 = 1024;
			}
		}
		for (local98 = 0; local98 < 256 - arg0; local98++) {
			Static10.anIntArray34[local98] = Static10.anIntArray34[local98 + arg0];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static10.anIntArray34[local107] = (int) (Math.sin((double) Static196.anInt3939 / 14.0D) * 16.0D + Math.sin((double) Static196.anInt3939 / 15.0D) * 14.0D + Math.sin((double) Static196.anInt3939 / 16.0D) * 12.0D);
			Static196.anInt3939++;
		}
		Static137.anInt2896 += arg0;
		@Pc(276) int local276 = ((Static193.anInt4411 & 0x1) + arg0) / 2;
		if (local276 <= 0) {
			return;
		}
		@Pc(289) int local289;
		@Pc(296) int local296;
		for (@Pc(280) int local280 = 0; local280 < Static137.anInt2896 * 100; local280++) {
			local289 = (int) (Math.random() * 124.0D) + 2;
			local296 = (int) (Math.random() * 128.0D) + 128;
			Static59.anIntArray172[local289 + (local296 << 7)] = 192;
		}
		Static137.anInt2896 = 0;
		@Pc(326) int local326;
		@Pc(329) int local329;
		for (local289 = 0; local289 < 256; local289++) {
			local296 = 0;
			local326 = local289 * 128;
			for (local329 = -local276; local329 < 128; local329++) {
				if (local329 + local276 < 128) {
					local296 += Static59.anIntArray172[local329 + local326 + local276];
				}
				if (local329 - local276 - 1 >= 0) {
					local296 -= Static59.anIntArray172[local329 + local326 - local276 - 1];
				}
				if (local329 >= 0) {
					Static170.anIntArray462[local326 + local329] = local296 / (local276 * 2 + 1);
				}
			}
		}
		for (local296 = 0; local296 < 128; local296++) {
			local326 = 0;
			for (local329 = -local276; local329 < 256; local329++) {
				@Pc(411) int local411 = local329 * 128;
				if (local329 + local276 < 256) {
					local326 += Static170.anIntArray462[local276 * 128 + local296 + local411];
				}
				if (local329 - local276 - 1 >= 0) {
					local326 -= Static170.anIntArray462[local411 + local296 - (local276 + 1) * 128];
				}
				if (local329 >= 0) {
					Static59.anIntArray172[local411 + local296] = local326 / (local276 * 2 + 1);
				}
			}
		}
	}
}
