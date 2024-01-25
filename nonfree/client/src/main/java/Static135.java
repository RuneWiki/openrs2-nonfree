import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!er", name = "r", descriptor = "I")
	public static int anInt3347;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_30 = new Class94(9, 8);

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I")
	public static int method3069(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static6.anInt117 - 1; local3++) {
			if (arg0 < Static208.anIntArray239[local3] + Static121.anIntArray631[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static6.anInt117 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)I")
	public static int method3070(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(28) int local28 = (local14 >>> 2 & 0x33333333) + (local14 & 0x33333333);
		@Pc(36) int local36 = (local28 >>> 4) + local28 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method3072(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub26 local17 = (Class2_Sub26) Static224.aClass99_38.method3056((long) arg0);
		if (local17 != null) {
			@Pc(26) Class2_Sub5_Sub4 local26 = local17.aClass165_Sub1_1.method7056();
			if (local26 != null) {
				@Pc(35) double local35 = local17.aClass165_Sub1_1.method7062();
				if ((double) local26.method8263() <= local35 && local35 <= (double) local26.method8264()) {
					return local26.method8269();
				}
			}
		}
		return null;
	}
}
