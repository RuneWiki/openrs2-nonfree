import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
	public static int anInt1471;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public static int anInt1472;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "Lclient!as;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!ef", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "[I")
	public static final int[] anIntArray94 = new int[50];

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "J")
	public static long aLong62 = 0L;

	@OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
	public static int anInt1514 = -60;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
	public static int method1151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static68.anIntArray84[arg1 & 0x3] : Static51.anIntArray66[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIILclient!ir;)Lclient!vn;")
	public static Class209 method1152(@OriginalArg(0) int arg0, @OriginalArg(3) Class100 arg1) {
		@Pc(15) byte[] local15 = arg1.method2319(arg0, 0);
		return local15 == null ? null : new Class209(local15);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(BI)V")
	public static void method1156(@OriginalArg(1) int arg0) {
		Static200.anInt4109 = arg0;
		Static152.aClass198_24.method5236();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BJIIZ)Ljava/lang/String;")
	public static String method1160(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(24) boolean local24 = false;
		if (arg0 < 0L) {
			local24 = true;
			arg0 = -arg0;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(45) int local45;
		@Pc(50) int local50;
		if (arg2 > 0) {
			for (local45 = 0; local45 < arg2; local45++) {
				local50 = (int) arg0;
				arg0 /= 10L;
				local38.append((char) (local50 + 48 - (int) arg0 * 10));
			}
			local38.append(local7);
		}
		local45 = 0;
		while (true) {
			local50 = (int) arg0;
			arg0 /= 10L;
			local38.append((char) (local50 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local24) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg3) {
				local45++;
				if (local45 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}
}
