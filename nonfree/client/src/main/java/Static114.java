import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
	public static int anInt2375;

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_21 = new Class342();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!nt;IZ)V")
	public static void method2189(@OriginalArg(1) int arg0, @OriginalArg(2) Class270 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) int local15 = arg1.anInt7015;
		if (arg1.aByte107 == 0) {
			arg1.anInt7015 = arg1.anInt7011;
		} else if (arg1.aByte107 == 1) {
			arg1.anInt7015 = arg0 - arg1.anInt7011;
		} else if (arg1.aByte107 == 2) {
			arg1.anInt7015 = arg0 * arg1.anInt7011 >> 14;
		}
		@Pc(63) int local63 = arg1.anInt7045;
		if (arg1.aByte108 == 0) {
			arg1.anInt7045 = arg1.anInt7048;
		} else if (arg1.aByte108 == 1) {
			arg1.anInt7045 = arg2 - arg1.anInt7048;
		} else if (arg1.aByte108 == 2) {
			arg1.anInt7045 = arg1.anInt7048 * arg2 >> 14;
		}
		if (arg1.aByte107 == 4) {
			arg1.anInt7015 = arg1.anInt6980 * arg1.anInt7045 / arg1.anInt7039;
		}
		if (arg1.aByte108 == 4) {
			arg1.anInt7045 = arg1.anInt7015 * arg1.anInt7039 / arg1.anInt6980;
		}
		if (Static571.aBoolean583 && (Static85.method1871(arg1).anInt7682 != 0 || arg1.anInt7008 == 0)) {
			if (arg1.anInt7045 < 5 && arg1.anInt7015 < 5) {
				arg1.anInt7015 = 5;
				arg1.anInt7045 = 5;
			} else {
				if (arg1.anInt7045 <= 0) {
					arg1.anInt7045 = 5;
				}
				if (arg1.anInt7015 <= 0) {
					arg1.anInt7015 = 5;
				}
			}
		}
		if (arg1.anInt7042 == Static727.anInt11271) {
			Static34.aClass270_2 = arg1;
		}
		if (arg3 && arg1.anObjectArray33 != null && (local15 != arg1.anInt7015 || arg1.anInt7045 != local63)) {
			@Pc(244) Class3_Sub41 local244 = new Class3_Sub41();
			local244.aClass270_12 = arg1;
			local244.anObjectArray4 = arg1.anObjectArray33;
			Static501.aClass342_61.method7654(local244);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method2191(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = arg1 ? 32768 : 0;
		@Pc(31) int local31 = (arg1 ? Static134.aClass246_1.anInt6233 : Static134.aClass246_1.anInt6232) + local20;
		@Pc(79) int local79;
		for (@Pc(33) int local33 = local20; local33 < local31; local33++) {
			@Pc(40) Class3_Sub7_Sub20 local40 = Static134.aClass246_1.method5420(local33);
			if (local40.aBoolean668 && local40.method8500().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static685.anInt6067 = -1;
					Static721.aShortArray66 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(77) short[] local77 = new short[local11.length * 2];
					for (local79 = 0; local79 < local13; local79++) {
						local77[local79] = local11[local79];
					}
					local11 = local77;
				}
				local11[local13++] = (short) local33;
			}
		}
		Static685.anInt6067 = local13;
		Static528.anInt8243 = 0;
		Static721.aShortArray66 = local11;
		@Pc(122) String[] local122 = new String[Static685.anInt6067];
		for (local79 = 0; local79 < Static685.anInt6067; local79++) {
			local122[local79] = Static134.aClass246_1.method5420(local11[local79]).method8500();
		}
		Static727.method9603(local122, Static721.aShortArray66);
	}
}
