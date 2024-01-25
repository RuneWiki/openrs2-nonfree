import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "[S")
	private static final short[] aShortArray39 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[S")
	private static final short[] aShortArray40 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "[S")
	private static final short[] aShortArray41 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!fd", name = "N", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { aShortArray40, aShortArray39, aShortArray41 };

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	public static int anInt3258 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!vo;II)V")
	public static void method3074(@OriginalArg(0) int arg0, @OriginalArg(1) Class381 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray29 != null) {
			@Pc(14) Class6_Sub53 local14 = new Class6_Sub53();
			local14.anObjectArray3 = arg1.anObjectArray29;
			local14.aClass381_11 = arg1;
			Static301.method4842(local14);
		}
		Static109.anInt2151 = arg0;
		Static227.anInt4416 = arg1.anInt10089;
		Static162.aBoolean266 = true;
		Static270.anInt5047 = arg1.anInt10149;
		Static475.anInt8093 = arg1.anInt10120;
		Static607.anInt9574 = arg1.anInt10112;
		Static607.anInt9573 = arg1.anInt10075;
		Static417.anInt7211 = arg2;
		Static168.method3312(arg1);
	}
}
