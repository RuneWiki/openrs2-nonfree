import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!li", name = "s", descriptor = "I")
	public static int anInt5853;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "I")
	public static int anInt5856 = 0;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
	public static void method4874() {
		@Pc(12) Class44 local12 = null;
		try {
			@Pc(18) Class26 local18 = Static375.aClass359_4.method8260("2");
			while (local18.anInt762 == 0) {
				Static57.method1062(1L);
			}
			if (local18.anInt762 == 1) {
				local12 = (Class44) local18.anObject3;
				@Pc(41) byte[] local41 = new byte[(int) local12.method957()];
				@Pc(54) int local54;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local54) {
					local54 = local12.method954(local41.length - local43, local43, local41);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static124.method2507(new Class2_Sub34(local41));
			}
		} catch (@Pc(79) Exception local79) {
		}
		try {
			if (local12 != null) {
				local12.method960();
			}
		} catch (@Pc(86) Exception local86) {
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method4875(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static387.method5829(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!li", name = "e", descriptor = "(I)V")
	public static void method4876() {
		Static527.aClass10Array4 = new Class10[500];
		Static167.anInt3711 = Static312.anInt5690;
		Static156.anInt3553 = 0;
		Static223.anInt4589 = Static312.anInt5690;
		Static612.anInt9984 = 0;
		Static448.aClass10Array2 = new Class10[1000];
		Static220.anInt4569 = 0;
		Static510.aBoolean637 = false;
		Static76.aClass10Array1 = new Class10[500];
		Static526.aClass10Array3 = new Class10[2000];
		Static22.anIntArrayArrayArray21 = new int[Static330.anInt4381][Static347.anInt6411 + 1][Static191.anInt6006 + 1];
		Static509.anInt8568 = 0;
		if (Static328.aClass87_6 instanceof oa) {
			Static417.aBoolean571 = false;
		} else {
			Static417.aBoolean571 = true;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method4877(@OriginalArg(1) String arg0) {
		@Pc(11) int local11 = arg0.length();
		@Pc(13) long local13 = 0L;
		for (@Pc(15) int local15 = 0; local15 < local11; local15++) {
			local13 = (local13 << 5) + (long) arg0.charAt(local15) - local13;
		}
		return local13;
	}
}
