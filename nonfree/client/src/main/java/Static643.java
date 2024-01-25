import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "F")
	public static float aFloat194;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
	public static int anInt10383;

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "F")
	public static float aFloat195;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!bla;)V")
	public static void method8690(@OriginalArg(0) Class19_Sub1 arg0) {
		Static626.aClass67_16.H(arg0.anInt11204, arg0.anInt11208 + (arg0.method9364() >> 1), arg0.anInt11211, Static667.anIntArray598);
		arg0.anInt11207 = Static667.anIntArray598[0];
		arg0.anInt11210 = Static667.anIntArray598[1];
		arg0.anInt11205 = Static667.anIntArray598[2];
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I[I)V")
	public static void method8691(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static624.anIntArray578 = null;
			Static252.aByteArrayArrayArray16 = null;
			Static121.anIntArray112 = null;
			return;
		}
		Static121.anIntArray112 = arg0;
		Static624.anIntArray578 = new int[arg0.length];
		Static252.aByteArrayArrayArray16 = new byte[arg0.length][][];
		for (@Pc(31) int local31 = 0; local31 < Static121.anIntArray112.length; local31++) {
			Static252.aByteArrayArrayArray16[local31] = new byte[arg1[local31]][];
		}
	}
}
