import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dca", name = "f", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
	public static int anInt2152 = 0;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I[BIZ)[B")
	public static byte[] method1985(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(9) byte[] local9;
		if (arg0 <= 0) {
			local9 = arg1;
		} else {
			local9 = new byte[arg2];
			for (@Pc(16) int local16 = 0; local16 < arg2; local16++) {
				local9[local16] = arg1[local16 + arg0];
			}
		}
		@Pc(40) Class220 local40 = new Class220();
		local40.method5044();
		local40.method5043(local9, (long) (arg2 * 8));
		@Pc(60) byte[] local60 = new byte[64];
		local40.method5045(local60);
		return local60;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(17) Class3_Sub7_Sub21 local17 = Static136.method2378((long) arg0, 3);
		local17.method9256();
		local17.aString131 = arg1;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BF)F")
	public static float method1989(@OriginalArg(1) float arg0) {
		return (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V")
	public static void method1990(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static347.anInt5553 == 2) {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[0]);
				Static647.aClass405Array1[1].method9485(Static306.aClass353Array1[1]);
			} else if (Static347.anInt5553 == 3) {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[0]);
				Static647.aClass405Array1[1].method9485(Static306.aClass353Array1[1]);
				Static647.aClass405Array1[2].method9485(Static306.aClass353Array1[2]);
			} else {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[0]);
				Static647.aClass405Array1[1].method9485(Static306.aClass353Array1[1]);
				Static647.aClass405Array1[2].method9485(Static306.aClass353Array1[2]);
				Static647.aClass405Array1[3].method9485(Static306.aClass353Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static347.anInt5553 == 2) {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[2]);
			} else if (Static347.anInt5553 == 3) {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[3]);
				Static647.aClass405Array1[1].method9485(Static306.aClass353Array1[4]);
			} else {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[4]);
				Static647.aClass405Array1[1].method9485(Static306.aClass353Array1[5]);
				Static647.aClass405Array1[2].method9485(Static306.aClass353Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static347.anInt5553 == 2) {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[3]);
				return;
			}
			if (Static347.anInt5553 == 3) {
				Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[5]);
				return;
			}
			Static647.aClass405Array1[0].method9485(Static306.aClass353Array1[7]);
		}
	}
}
