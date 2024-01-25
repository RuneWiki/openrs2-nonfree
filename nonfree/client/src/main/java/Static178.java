import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "Lclient!cm;")
	public static final Class52 aClass52_150 = new Class52();

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
	public static int anInt10781 = -1;

	@OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
	public static int anInt10783 = 0;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "([BZZ)V")
	public static void method8793(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static442.aClass6_Sub8_9 == null) {
			Static442.aClass6_Sub8_9 = new Class6_Sub8(20000);
		}
		Static442.aClass6_Sub8_9.method8234(arg0, arg0.length, 0);
		if (!arg1) {
			return;
		}
		Static62.method1767(Static442.aClass6_Sub8_9.aByteArray102);
		Static56.aClass67_Sub1Array1 = new Class67_Sub1[Static428.anInt7857];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static305.anInt6172; local40 <= Static181.anInt3989; local40++) {
			@Pc(46) Class67_Sub1 local46 = Static484.method7132(local40);
			if (local46 != null) {
				Static56.aClass67_Sub1Array1[local38++] = local46;
			}
		}
		Static223.aBoolean406 = false;
		Static470.aLong231 = Static582.method8056();
		Static442.aClass6_Sub8_9 = null;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIB)Z")
	public static boolean method8794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
