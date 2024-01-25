import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "Lclient!aka;")
	public static final Class16 aClass16_4 = new Class16("WIP", 2);

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I[I[I)V")
	public static void method7320(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static649.aByteArrayArrayArray18 = null;
			Static169.anIntArray158 = null;
			Static175.anIntArray161 = null;
			return;
		}
		Static175.anIntArray161 = arg0;
		Static169.anIntArray158 = new int[arg0.length];
		Static649.aByteArrayArrayArray18 = new byte[arg0.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static175.anIntArray161.length; local32++) {
			Static649.aByteArrayArrayArray18[local32] = new byte[arg1[local32]][];
		}
	}
}
