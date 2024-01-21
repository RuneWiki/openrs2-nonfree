import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public static int anInt4103;

	@OriginalMember(owner = "client!se", name = "j", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1129 = Static158.method3034("Location");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1126 = aClass60_1129;

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public static int anInt4101 = 0;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	public static int anInt4104 = 0;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1127 = Static158.method3034("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1128 = Static158.method3034("<col=ff0000>");

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1130 = Static158.method3034(": ");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!og;B)Lclient!af;")
	public static Class2_Sub2 method3108(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method218();
		@Pc(15) int local15 = arg0.method218();
		@Pc(19) Class2_Sub2 local19 = Static186.method3430(local15);
		local19.anInt4649 = arg0.method218();
		@Pc(28) int local28 = arg0.method218();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(41) int local41 = arg0.method218();
			local19.method3565(local41, arg0);
		}
		local19.method3563();
		return local19;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method3109() {
		Static183.aClass89_67.method3439();
		Static84.aClass89_27.method3439();
		Static65.aClass89_21.method3439();
		Static41.aClass89_13.method3439();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Z")
	public static boolean method3110(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}
}
