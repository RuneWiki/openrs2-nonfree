import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "[S")
	public static final short[] aShortArray23 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt2824 = 0;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static final int anInt2825 = 1;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[Lclient!at;I)V")
	public static void method2321(@OriginalArg(1) Class16[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class16 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt298 == 0) {
					if (local9.aClass16Array1 != null) {
						method2321(local9.aClass16Array1, arg1);
					}
					@Pc(33) Class2_Sub21 local33 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local9.anInt293);
					if (local33 != null) {
						Static361.method4757(arg1, local33.anInt2585);
					}
				}
				@Pc(52) Class2_Sub44 local52;
				if (arg1 == 0 && local9.anObjectArray26 != null) {
					local52 = new Class2_Sub44();
					local52.anObjectArray36 = local9.anObjectArray26;
					local52.aClass16_20 = local9;
					Static191.method2562(local52);
				}
				if (arg1 == 1 && local9.anObjectArray12 != null) {
					if (local9.anInt320 >= 0) {
						@Pc(78) Class16 local78 = Static338.method4534(local9.anInt293);
						if (local78 == null || local78.aClass16Array1 == null || local78.aClass16Array1.length <= local9.anInt320 || local9 != local78.aClass16Array1[local9.anInt320]) {
							continue;
						}
					}
					local52 = new Class2_Sub44();
					local52.aClass16_20 = local9;
					local52.anObjectArray36 = local9.anObjectArray12;
					Static191.method2562(local52);
				}
			}
		}
	}
}
