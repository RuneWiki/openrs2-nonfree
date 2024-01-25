import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rp", name = "Y", descriptor = "I")
	public static int anInt9165;

	@OriginalMember(owner = "client!rp", name = "Q", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_10 = new Class6(5, 1);

	@OriginalMember(owner = "client!rp", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!rp", name = "W", descriptor = "I")
	public static int anInt9163 = 0;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLclient!se;II)J")
	public static long method7698(@OriginalArg(1) Interface21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class161 local14 = Static27.aClass342_3.method8534(arg0.method8625());
		@Pc(35) long local35 = (long) (arg0.method8622() << 14 | arg2 | arg1 << 7 | arg0.method8624() << 20 | 0x40000000);
		if (local14.anInt5363 == 0) {
			local35 |= local7;
		}
		if (local14.anInt5375 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg0.method8625() << 32;
	}
}
