import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "Lclient!st;")
	public static final Class314 aClass314_69 = new Class314(70, 2);

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "Lclient!pb;")
	public static final Class261 aClass261_1 = new Class261(0);

	@OriginalMember(owner = "client!hia", name = "f", descriptor = "J")
	public static long aLong107 = 0L;

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
	public static void method3299() {
		@Pc(10) int local10 = Static32.aClass3_Sub41_3.aClass7_Sub8_2.method3974();
		if (local10 == 0) {
			Static171.aByteArrayArrayArray10 = null;
			Static242.method4097(0);
		} else if (local10 == 1) {
			Static341.method5447((byte) 0);
			Static242.method4097(512);
			if (Static546.aByteArrayArrayArray18 != null) {
				Static35.method501();
			}
		} else {
			Static341.method5447((byte) (Static609.anInt9804 - 4 & 0xFF));
			Static242.method4097(2);
		}
		Static47.anInt949 = Static65.anInt1298;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3300(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local15 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V")
	public static void method3301(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(27) int local27 = (arg0 + arg3) / 2;
		@Pc(29) int local29 = arg0;
		@Pc(33) String local33 = arg1[local27];
		arg1[local27] = arg1[arg3];
		arg1[arg3] = local33;
		@Pc(47) short local47 = arg2[local27];
		arg2[local27] = arg2[arg3];
		arg2[arg3] = local47;
		for (@Pc(59) int local59 = arg0; local59 < arg3; local59++) {
			if (local33 == null || arg1[local59] != null && (local59 & 0x1) > arg1[local59].compareTo(local33)) {
				@Pc(80) String local80 = arg1[local59];
				arg1[local59] = arg1[local29];
				arg1[local29] = local80;
				@Pc(94) short local94 = arg2[local59];
				arg2[local59] = arg2[local29];
				arg2[local29++] = local94;
			}
		}
		arg1[arg3] = arg1[local29];
		arg1[local29] = local33;
		arg2[arg3] = arg2[local29];
		arg2[local29] = local47;
		method3301(arg0, arg1, arg2, local29 - 1);
		method3301(local29 + 1, arg1, arg2, arg3);
	}
}
