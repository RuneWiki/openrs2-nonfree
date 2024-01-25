import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
	public static int anInt317 = -1;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(III)Z")
	public static boolean method248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)Lclient!ja;")
	public static Class1_Sub5_Sub11 method250() {
		@Pc(8) Class1_Sub5_Sub11 local8 = (Class1_Sub5_Sub11) Static132.aClass225_2.method4942();
		if (local8 != null) {
			local8.method5915();
			local8.method5305();
			return local8;
		}
		do {
			local8 = (Class1_Sub5_Sub11) Static444.aClass225_10.method4942();
			if (local8 == null) {
				return null;
			}
			if (local8.method2666() > Static27.method359()) {
				return null;
			}
			local8.method5915();
			local8.method5305();
		} while ((local8.aLong211 & Long.MIN_VALUE) == 0L);
		return local8;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!oq;III)Lclient!nc;")
	public static Class1_Sub5_Sub14 method251(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt5150 | arg2 << 8;
		@Pc(19) Class1_Sub5_Sub14 local19 = (Class1_Sub5_Sub14) Static13.aClass17_1.method317((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(33) byte[] local33 = Static73.aClass82_19.method1815(Static73.aClass82_19.method1834(local10));
		if (local33 == null) {
			local10 = arg1 + 65536 << 8 | arg0.anInt5150;
			local19 = (Class1_Sub5_Sub14) Static13.aClass17_1.method317((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local33 = Static73.aClass82_19.method1815(Static73.aClass82_19.method1834(local10));
			if (local33 == null) {
				local10 = arg0.anInt5150 | 0xFFFF00;
				local19 = (Class1_Sub5_Sub14) Static13.aClass17_1.method317((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local33 = Static73.aClass82_19.method1815(Static73.aClass82_19.method1834(local10));
				if (local33 == null) {
					return null;
				} else if (local33.length <= 1) {
					return null;
				} else {
					local19 = Static188.method2687(local33);
					local19.aClass182_5 = arg0;
					Static13.aClass17_1.method315((long) local10 << 16, local19);
					return local19;
				}
			} else if (local33.length <= 1) {
				return null;
			} else {
				local19 = Static188.method2687(local33);
				local19.aClass182_5 = arg0;
				Static13.aClass17_1.method315((long) local10 << 16, local19);
				return local19;
			}
		} else if (local33.length <= 1) {
			return null;
		} else {
			local19 = Static188.method2687(local33);
			local19.aClass182_5 = arg0;
			Static13.aClass17_1.method315((long) local10 << 16, local19);
			return local19;
		}
	}
}
