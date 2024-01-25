import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "[I")
	public static int[] anIntArray349 = null;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public static void method5604() {
		@Pc(12) Class3_Sub37 local12 = Static90.method1509(Static316.aClass240_52, Static226.aClass144_2);
		local12.aClass3_Sub4_Sub1_2.method7948(Static241.method3664());
		local12.aClass3_Sub4_Sub1_2.method7956(Static531.anInt8327);
		local12.aClass3_Sub4_Sub1_2.method7956(Static13.anInt306);
		local12.aClass3_Sub4_Sub1_2.method7948(Static336.aClass3_Sub41_18.aClass14_Sub10_2.method3046());
		Static301.method2678(local12);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I")
	public static int method5605(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Lclient!daa;")
	public static Class70 method5606(@OriginalArg(0) int arg0) {
		@Pc(8) Class70[] local8 = Static642.method8645();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(21) Class70 local21 = local8[local10];
			if (arg0 == local21.anInt1944) {
				return local21;
			}
		}
		return null;
	}
}
