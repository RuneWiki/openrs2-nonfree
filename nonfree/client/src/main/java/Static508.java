import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "J")
	public static long aLong251;

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
	public static int anInt8050 = 0;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BLclient!et;)Lclient!be;")
	public static Class33_Sub1 method7186(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(17) Class33 local17 = Static385.method5741(arg0);
		@Pc(23) int local23 = arg0.method8555(-9372);
		@Pc(27) int local27 = arg0.method8555(-9372);
		return new Class33_Sub1(local17.aClass18_12, local17.aClass239_13, local17.anInt7247, local17.anInt7249, local17.anInt7246, local17.anInt7251, local17.anInt7252, local17.anInt7250, local17.anInt7245, local23, local27);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BII)Z")
	public static boolean method7187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
