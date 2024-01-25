import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Lclient!fd;")
	public static final Class98 aClass98_2 = new Class98();

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_53 = new Class40("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
	public static int anInt3315 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB[Ljava/lang/Object;[JI)V")
	public static void method2923(@OriginalArg(0) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) long local21 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local21;
		@Pc(35) Object local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		@Pc(55) int local55 = ~local21 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg0; local57 < arg3; local57++) {
			if ((long) (local55 & local57) + local21 > arg2[local57]) {
				@Pc(74) long local74 = arg2[local57];
				arg2[local57] = arg2[local17];
				arg2[local17] = local74;
				@Pc(88) Object local88 = arg1[local57];
				arg1[local57] = arg1[local17];
				arg1[local17++] = local88;
			}
		}
		arg2[arg3] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method2923(arg0, arg1, arg2, local17 - 1);
		method2923(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!sa;)V")
	public static void method2925(@OriginalArg(0) int arg0, @OriginalArg(1) Class131 arg1) {
		Static248.aClass131Array4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
	public static void method2927() {
		@Pc(5) Class288 local5 = Static195.aClass288_26;
		synchronized (Static195.aClass288_26) {
			Static195.aClass288_26.method6742();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BLjava/lang/String;I)I")
	public static int method2928(@OriginalArg(1) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg1.charAt(local12);
			if (local18 <= '\u007f') {
				arg0[local10++] = (byte) local18;
			} else if (local18 <= '\u07ff') {
				arg0[local10++] = (byte) (local18 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local18 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local18 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local18 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local18 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}
}
