import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	public static int anInt415;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "Lclient!nd;")
	public static Class238 aClass238_12;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public static int anInt416;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_17 = new Class200(12, 0);

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "[I")
	public static final int[] anIntArray39 = new int[2];

	@OriginalMember(owner = "client!ak", name = "t", descriptor = "[J")
	public static final long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!cc;II[I)V")
	public static void method520(@OriginalArg(0) Class16_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray586 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray586.length; local8++) {
				if (arg0.anIntArray586[local8] != arg2[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt8049 != -1) {
				@Pc(45) Class228 local45 = Static479.aClass308_2.method7075(arg0.anInt8049);
				@Pc(48) int local48 = local45.anInt6220;
				if (local48 == 1) {
					arg0.anInt8083 = 0;
					arg0.anInt8087 = 0;
					arg0.anInt8121 = 1;
					arg0.anInt8060 = 0;
					arg0.lb = arg1;
					if (!arg0.aBoolean587) {
						Static145.method2602(arg0.anInt8083, arg0, local45);
					}
				}
				if (local48 == 2) {
					arg0.anInt8060 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg2.length; local8++) {
			if (arg2[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray586 == null || arg0.anIntArray586[local8] == -1 || Static479.aClass308_2.method7075(arg2[local8]).anInt6227 >= Static479.aClass308_2.method7075(arg0.anIntArray586[local8]).anInt6227) {
				arg0.anIntArray586 = arg2;
				arg0.lb = arg1;
				arg0.anInt8135 = arg0.anInt8133;
			}
		}
		if (local6) {
			arg0.anIntArray586 = arg2;
			arg0.lb = arg1;
			arg0.anInt8135 = arg0.anInt8133;
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	public static void method521() {
		if (Static265.aClass286_3.aBoolean536 && Static583.aClass155_14.anInt4152 != -1) {
			Static426.method6218(Static583.aClass155_14.aString38, Static583.aClass155_14.anInt4152);
		}
	}
}
