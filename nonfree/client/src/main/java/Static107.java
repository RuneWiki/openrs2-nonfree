import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_41;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "Lclient!pg;")
	public static Class1_Sub24 aClass1_Sub24_1 = new Class1_Sub24(0, 0);

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "[I")
	public static int[] anIntArray158 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
	public static int anInt2250 = -1;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)Lclient!sb;")
	public static Class152 method2016(@OriginalArg(1) int arg0) {
		@Pc(6) Class152 local6 = (Class152) Static115.aClass175_18.method4295((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static188.aClass119_64.method3235(Static314.method4676(arg0), Static241.method3833(arg0));
		local6 = new Class152();
		local6.anInt4609 = arg0;
		if (local25 != null) {
			local6.method3914(new Class1_Sub13(local25));
		}
		local6.method3921();
		Static115.aClass175_18.method4285(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BLclient!kl;)I")
	public static int method2017(@OriginalArg(1) Class11_Sub4_Sub1 arg0) {
		@Pc(4) int local4 = arg0.anInt3007;
		@Pc(8) Class28 local8 = arg0.method3348();
		if (local8.anInt869 == arg0.anInt3828) {
			local4 = arg0.anInt3003;
		} else if (local8.anInt868 == arg0.anInt3828 || local8.anInt879 == arg0.anInt3828 || local8.anInt847 == arg0.anInt3828 || arg0.anInt3828 == local8.anInt849) {
			local4 = arg0.anInt3000;
		} else if (local8.anInt871 == arg0.anInt3828 || local8.anInt881 == arg0.anInt3828 || local8.anInt858 == arg0.anInt3828 || arg0.anInt3828 == local8.anInt882) {
			local4 = arg0.anInt3021;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2019(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static46.method879(arg1, arg0);
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(19) String[] local19 = new String[local10 + 1];
		for (@Pc(27) int local27 = 0; local27 < local10; local27++) {
			@Pc(36) int local36;
			for (local36 = local14; arg0 != arg1.charAt(local36); local36++) {
			}
			local19[local12++] = arg1.substring(local14, local36);
			local14 = local36 + 1;
		}
		local19[local10] = arg1.substring(local14);
		return local19;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(BI)V")
	public static void method2020(@OriginalArg(1) int arg0) {
		@Pc(2) Class13 local2 = Static184.aClass13_1;
		synchronized (Static184.aClass13_1) {
			Static112.anInt5355 = arg0;
		}
	}
}
