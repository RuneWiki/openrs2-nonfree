import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "I")
	public static int anInt109;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
	public static int anInt111;

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_1 = new Class286(31, 3);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!gg;[[B)V")
	public static void method111(@OriginalArg(1) Class131_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static423.aByteArrayArray9.length;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) byte[] local21 = arg1[local15];
			if (local21 != null) {
				@Pc(34) int local34 = (Static46.anIntArray54[local15] >> 8) * 64 - Static714.anInt11156;
				@Pc(45) int local45 = (Static46.anIntArray54[local15] & 0xFF) * 64 - Static339.anInt5859;
				Static140.method2345();
				arg0.method3086(local34, local45, local21, Static488.aClass67_12, Static678.aClass360Array5);
			}
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljava/lang/String;BILclient!cea;)Lclient!ke;")
	public static Class201 method112(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class47 arg2) {
		return Static97.method1297(arg2, "openjs", arg1, arg0);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILclient!ha;I)Lclient!bka;")
	public static Class9 method113(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1) {
		@Pc(17) Class3_Sub24 local17 = (Class3_Sub24) Static699.aClass136_50.method3503((long) arg0);
		if (local17 != null) {
			@Pc(24) Class3_Sub8_Sub4 local24 = local17.aClass78_Sub1_1.method2094();
			local17.aBoolean270 = true;
			if (local24 != null) {
				return local24.method9120(arg1);
			}
		}
		return null;
	}
}
