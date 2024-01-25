import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static282 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public static int anInt4369;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I")
	public static int method3473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static88.anIntArray521[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)[Lclient!mo;")
	public static Class163[] method3474() {
		return new Class163[] { Static258.aClass163_6, Static97.aClass163_2, Static377.aClass163_13, Static453.aClass163_12, Static287.aClass163_8, Static425.aClass163_15, Static366.aClass163_11, Static426.aClass163_16, Static439.aClass163_17, Static406.aClass163_14, Static180.aClass163_3, Static223.aClass163_4, Static280.aClass163_7, Static226.aClass163_5, Static5.aClass163_1 };
	}
}
