import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!qn", name = "P", descriptor = "Lclient!iq;")
	public static Class104 aClass104_121;

	@OriginalMember(owner = "client!qn", name = "S", descriptor = "Lclient!lp;")
	public static Class71 aClass71_4;

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_14 = new Class143(12, 14);

	@OriginalMember(owner = "client!qn", name = "T", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_15 = new Class143(5, 7);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!iq;)V")
	public static void method4031(@OriginalArg(1) Class104 arg0) {
		Static149.anInt3387 = arg0.method2769("titlebg");
		Static257.anInt5343 = arg0.method2769("logo");
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public static void method4032(@OriginalArg(1) int arg0) {
		Static129.anIntArray224 = new int[arg0];
		Static247.anIntArray404 = new int[arg0];
		Static95.anIntArray148 = new int[arg0];
		Static116.anIntArray200 = new int[arg0];
		Static233.anIntArray395 = new int[arg0];
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!fq;IIII)V")
	public static void method4033(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static309.aClass180_41.method4919(); local10 != null; local10 = (Class2_Sub37) Static309.aClass180_41.method4916()) {
			if (local10.anInt5749 == arg1 && arg3 * 128 == local10.anInt5748 && local10.anInt5751 == arg2 * 128 && local10.aClass74_1.anInt2071 == arg0.anInt2071) {
				if (local10.aClass2_Sub11_Sub4_3 != null) {
					Static31.aClass2_Sub11_Sub3_1.method4110(local10.aClass2_Sub11_Sub4_3);
					local10.aClass2_Sub11_Sub4_3 = null;
				}
				if (local10.aClass2_Sub11_Sub4_2 != null) {
					Static31.aClass2_Sub11_Sub3_1.method4110(local10.aClass2_Sub11_Sub4_2);
					local10.aClass2_Sub11_Sub4_2 = null;
				}
				local10.method5723();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method4035(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg0[local17 + arg2] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(45) char local45 = Static287.aCharArray6[local27 - 128];
					if (local45 == '\u0000') {
						local45 = '?';
					}
					local27 = local45;
				}
				local8[local10++] = (char) local27;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4036(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(18) byte local18 = 2;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(26) char local26 = arg0.charAt(local20);
			if (local18 == 0) {
				local26 = Character.toLowerCase(local26);
			} else if (local18 == 2 || Character.isUpperCase(local26)) {
				local26 = Static309.method5158(local26);
			}
			if (Character.isLetter(local26)) {
				local18 = 0;
			} else if (local26 == '.' || local26 == '?' || local26 == '!') {
				local18 = 2;
			} else if (!Character.isSpaceChar(local26)) {
				local18 = 1;
			} else if (local18 != 2) {
				local18 = 1;
			}
			local11[local20] = local26;
		}
		return new String(local11);
	}
}
