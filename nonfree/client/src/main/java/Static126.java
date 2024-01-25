import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!hb;I)I")
	public static int method2238(@OriginalArg(0) Class11_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt3595;
		@Pc(17) Class114 local17 = arg0.method6073();
		if (arg0.anInt7577 == -1 || arg0.aBoolean575) {
			local8 = arg0.anInt3577;
		} else if (local17.anInt2994 == arg0.anInt7577 || local17.anInt3009 == arg0.anInt7577 || local17.anInt3023 == arg0.anInt7577 || local17.anInt2993 == arg0.anInt7577) {
			local8 = arg0.anInt3590;
		} else if (arg0.anInt7577 == local17.anInt3006 || local17.anInt2989 == arg0.anInt7577 || arg0.anInt7577 == local17.anInt3002 || local17.anInt3018 == arg0.anInt7577) {
			local8 = arg0.anInt3608;
		}
		return local8;
	}
}
