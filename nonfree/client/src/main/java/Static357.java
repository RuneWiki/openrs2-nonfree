import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
	public static int anInt6823;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	public static int anInt6815 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZBZLclient!td;)V")
	public static void method5709(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub40 arg2) {
		@Pc(8) int local8 = arg2.anInt6092;
		@Pc(12) int local12 = (int) arg2.aLong219;
		arg2.method5723();
		if (arg0) {
			Static25.method324(local8);
		}
		Static121.method2358(local8);
		@Pc(32) Class68 local32 = Static8.method144(local12);
		if (local32 != null) {
			Static114.method2241(local32);
		}
		Static12.method180();
		if (!arg1 && Static269.anInt6658 != -1) {
			Static271.method4703(1, Static269.anInt6658);
		}
		@Pc(54) Class58 local54 = new Class58(Static303.aClass41_32);
		for (@Pc(59) Class2_Sub40 local59 = (Class2_Sub40) local54.method1361(); local59 != null; local59 = (Class2_Sub40) local54.method1364()) {
			if (!local59.method5722()) {
				local59 = (Class2_Sub40) local54.method1361();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt6090 == 3) {
				@Pc(81) int local81 = (int) local59.aLong219;
				if (local8 == local81 >>> 16) {
					method5709(true, arg1, local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIBI)V")
	public static void method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(39) String local39 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local39);
		Static133.method2575(true, local39);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
	public static void method5711() {
		if (Static293.anInt5826 != 3) {
			Static122.anInt2591 = -1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)Lclient!le;")
	public static Class126 method5712(@OriginalArg(0) int arg0) {
		@Pc(15) Class126 local15 = (Class126) Static186.aClass107_20.method3021((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static195.aClass104_108.method2756(31, arg0);
		local15 = new Class126();
		if (local25 != null) {
			local15.method3469(new Class2_Sub12(local25), arg0);
		}
		Static186.aClass107_20.method3018((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5713(@OriginalArg(1) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) long local17 = 0L;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = (long) arg0.charAt(local19) + (local17 << 5) - local17;
		}
		return local17;
	}
}
