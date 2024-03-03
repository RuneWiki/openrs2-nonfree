import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V", line = 68)
	public static void method937() {
		if (Static141.anIntArray173 != null && Static169.anIntArray203 != null) {
			return;
		}
		Static141.anIntArray173 = new int[256];
		Static169.anIntArray203 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static141.anIntArray173[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static169.anIntArray203[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIILclient!el;)V", line = 245)
	public static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3) {
		@Pc(4) Class67 local4 = Static245.method4501(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub2_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZIII)V", line = 267)
	public static void method939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static203.aClass177_Sub1_2.anInt4878 == 0 || arg0 == 0 || Class2_Sub2_Sub13.anInt4496 >= 50 || arg3 == -1) {
			return;
		}
		Class11_Sub5_Sub3.anIntArray321[Class2_Sub2_Sub13.anInt4496] = arg3;
		Class2_Sub3_Sub34.anIntArray419[Class2_Sub2_Sub13.anInt4496] = arg0;
		Class162.anIntArray283[Class2_Sub2_Sub13.anInt4496] = arg2;
		Class119.aClass247Array2[Class2_Sub2_Sub13.anInt4496] = null;
		Class115.anIntArray188[Class2_Sub2_Sub13.anInt4496] = 0;
		Class156.anIntArray256[Class2_Sub2_Sub13.anInt4496] = arg1;
		Class2_Sub2_Sub13.anInt4496++;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I", line = 389)
	public static int method941(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local14 & 0x33333333) + ((local14 & 0xCCCCCCCD) >>> 2);
		@Pc(32) int local32 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local32 + (local32 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
