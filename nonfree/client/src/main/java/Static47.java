import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cd", name = "A", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!kb;")
	public static final Class133 aClass133_1 = new Class133(2);

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	public static int anInt838 = -1;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([[BLclient!pu;I)V")
	public static void method675(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class118_Sub1 arg1) {
		@Pc(16) int local16 = Static378.aByteArrayArray51.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg0[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static225.anIntArray310[local18] >> 8) * 64 - Static275.anInt4506;
				@Pc(48) int local48 = (Static225.anIntArray310[local18] & 0xFF) * 64 - Static209.anInt3497;
				Static123.method5625();
				arg1.method4317(local48, local24, local37, Static82.aClass163_1, Static361.aClass71Array1);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILclient!at;)V")
	public static void method676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(8) Class35 local8 = arg2.method239(Static82.aClass163_1);
		if (local8 == null) {
			return;
		}
		Static82.aClass163_1.ba(arg0, arg1, arg2.anInt294 + arg0, arg2.anInt285 + arg1);
		if (Static288.anInt4731 < 3) {
			Static176.aClass13_2.method5671((float) arg2.anInt294 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.anInt285 / 2.0F, ((int) -Static113.aFloat19 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static82.aClass163_1.ra(-16777216, local8, arg0, arg1);
		}
	}
}
