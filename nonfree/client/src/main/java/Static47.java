import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public static int anInt922 = 0;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	public static int anInt926 = -1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Lclient!mp;")
	public static Class25_Sub5 method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub5_2;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!cj;B)V")
	public static void method725(@OriginalArg(0) Class41_Sub1 arg0) {
		arg0.aClass25_1 = null;
		@Pc(16) int local16 = arg0.aClass41_Sub5Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			arg0.aClass41_Sub5Array1[local18].aBoolean494 = false;
		}
		@Pc(36) Class208[] local36 = Class1_Sub6_Sub13.aClass208Array1;
		synchronized (Class1_Sub6_Sub13.aClass208Array1) {
			if (local16 < Class1_Sub6_Sub13.aClass208Array1.length && Static262.anIntArray742[local16] < 200) {
				Class1_Sub6_Sub13.aClass208Array1[local16].method4664(arg0);
				@Pc(61) int local61 = Static262.anIntArray742[local16]++;
			}
		}
	}
}
