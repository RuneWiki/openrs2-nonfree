import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Lclient!lb;")
	public static Class198 aClass198_1;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_75 = new Class269(8, 2);

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_10 = new Class266(7, 7);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)I")
	public static int method6516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg0 >> 31 & arg1 - 1;
		return local19 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)J")
	public static synchronized long method6517() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static385.aLong198 > local5) {
			Static603.aLong269 += Static385.aLong198 - local5;
		}
		Static385.aLong198 = local5;
		return local5 + Static603.aLong269;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I")
	public static int method6518() {
		return Static368.aClass349_2.method8071();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method6519(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static606.anInt9911 = 1;
		Static288.anInt5415 = -1;
		Static490.method7019(false, arg0, arg1);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII[BII[B)V")
	public static void method6521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg0++;
				arg4[local26] += arg7[arg5++];
				@Pc(38) int local38 = arg0++;
				arg4[local38] += arg7[arg5++];
				@Pc(50) int local50 = arg0++;
				arg4[local50] += arg7[arg5++];
				@Pc(62) int local62 = arg0++;
				arg4[local62] += arg7[arg5++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg0++;
				arg4[local26] += arg7[arg5++];
			}
			arg5 += arg1;
			arg0 += arg2;
		}
	}
}
