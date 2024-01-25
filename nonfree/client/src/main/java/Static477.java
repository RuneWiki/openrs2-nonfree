import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_245 = new Class235(18, 12);

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_83 = new Class70(37, -1);

	@OriginalMember(owner = "client!si", name = "d", descriptor = "I")
	public static int anInt8065 = 1;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "Z")
	public static boolean aBoolean617 = false;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(ILclient!rda;IB)J")
	public static long method6494(@OriginalArg(0) int arg0, @OriginalArg(1) Interface19 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class95 local19 = Static518.aClass96_4.method1925(arg1.method7640());
		@Pc(40) long local40 = (long) ((arg1.method7638() | 0x10000) << 14 | arg0 << 7 | arg2 | arg1.method7637() << 20);
		if (local19.anInt2399 == 0) {
			local40 |= local12;
		}
		if (local19.anInt2434 == 1) {
			local40 |= local5;
		}
		return local40 | (long) arg1.method7640() << 32;
	}
}
