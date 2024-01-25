import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "Lclient!kj;")
	public static Class133 aClass133_5;

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Lclient!hl;")
	public static Class103 aClass103_1;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IB)I")
	public static int method3068(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(28) int local28 = (local9 & 0x33333333) + (local9 >>> 2 & 0xF3333333);
		@Pc(36) int local36 = (local28 >>> 4) + local28 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V")
	public static void method3071() {
		Static169.aClass34_1.method3928();
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			Static125.aLongArray4[local17] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static347.aLongArray7[local29] = 0L;
		}
		Static20.anInt255 = 0;
	}
}
