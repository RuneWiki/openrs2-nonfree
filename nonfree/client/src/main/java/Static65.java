import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cha", name = "j", descriptor = "Lclient!us;")
	public static final Class344 aClass344_21 = new Class344(25, 12);

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(I[B[[BI[I[[B[IB)I")
	public static int method1479(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(9) int local9 = arg6[arg3];
		@Pc(15) int local15 = arg4[arg3] + local9;
		@Pc(19) int local19 = arg6[arg0];
		@Pc(26) int local26 = local19 + arg4[arg0];
		@Pc(28) int local28 = local9;
		if (local19 > local9) {
			local28 = local19;
		}
		@Pc(35) int local35 = local15;
		if (local26 < local15) {
			local35 = local26;
		}
		@Pc(46) int local46 = arg1[arg3] & 0xFF;
		if (local46 > (arg1[arg0] & 0xFF)) {
			local46 = arg1[arg0] & 0xFF;
		}
		@Pc(67) byte[] local67 = arg5[arg3];
		@Pc(84) byte[] local84 = arg2[arg0];
		@Pc(89) int local89 = local28 - local9;
		@Pc(94) int local94 = local28 - local19;
		for (@Pc(96) int local96 = local28; local96 < local35; local96++) {
			@Pc(108) int local108 = local84[local94++] + local67[local89++];
			if (local108 < local46) {
				local46 = local108;
			}
		}
		return -local46;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Lclient!nga;BILjava/lang/String;)Lclient!wp;")
	public static Class376 method1480(@OriginalArg(0) Class228 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg1 == 0) {
			return arg0.method5946(arg2);
		}
		@Pc(37) Class376 local37;
		if (arg1 == 1) {
			try {
				Static653.method5391(Static632.anApplet2, new Object[] { (new URL(Static632.anApplet2.getCodeBase(), arg2)).toString() }, "openjs");
				local37 = new Class376();
				local37.anInt10510 = 1;
				return local37;
			} catch (@Pc(43) Throwable local43) {
				local37 = new Class376();
				local37.anInt10510 = 2;
				return local37;
			}
		} else if (arg1 == 2) {
			try {
				Static632.anApplet2.getAppletContext().showDocument(new URL(Static632.anApplet2.getCodeBase(), arg2), "_blank");
				local37 = new Class376();
				local37.anInt10510 = 1;
				return local37;
			} catch (@Pc(77) Exception local77) {
				local37 = new Class376();
				local37.anInt10510 = 2;
				return local37;
			}
		} else if (arg1 == 3) {
			try {
				Static653.method5390("loggedout", Static632.anApplet2);
			} catch (@Pc(109) Throwable local109) {
			}
			try {
				Static632.anApplet2.getAppletContext().showDocument(new URL(Static632.anApplet2.getCodeBase(), arg2), "_top");
				local37 = new Class376();
				local37.anInt10510 = 1;
				return local37;
			} catch (@Pc(129) Exception local129) {
				local37 = new Class376();
				local37.anInt10510 = 2;
				return local37;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(IIIIZII)V")
	public static void method1481(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class369[] local7 = Static253.aClass369Array1;
		for (@Pc(14) int local14 = 0; local14 < local7.length; local14++) {
			@Pc(20) Class369 local20 = local7[local14];
			if (local20 != null && local20.anInt10333 == 2) {
				Static299.method7331(arg0 >> 1, local20.anInt10334 * 2, local20.anInt10341, local20.anInt10344, local20.anInt10342, arg3 >> 1);
				if (Static379.anIntArray437[0] > -1 && Static251.anInt5580 % 20 < 10) {
					@Pc(66) Class5 local66 = Static474.aClass5Array14[local20.anInt10337];
					@Pc(74) int local74 = arg2 + Static379.anIntArray437[0] - 12;
					@Pc(82) int local82 = arg1 + Static379.anIntArray437[1] - 28;
					local66.method7577(local74, local82);
					Static241.method4616(local82 + local66.method7585(), local82, local74 + local66.method7589(), local74);
				}
			}
		}
	}
}
