import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
	public static int anInt6095;

	@OriginalMember(owner = "client!nca", name = "B", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas9;

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_4 = new Class260(4, 1);

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
	public static int anInt6096 = -1;

	@OriginalMember(owner = "client!nca", name = "z", descriptor = "[I")
	public static final int[] anIntArray473 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "Lclient!aea;")
	public static Class3_Sub5 aClass3_Sub5_1 = null;

	@OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
	public static int anInt6098 = 0;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method5276(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(45) int local45 = 2;
		@Pc(49) int local49 = arg0 / 10;
		while (local49 != 0) {
			local49 /= 10;
			local45++;
		}
		@Pc(61) char[] local61 = new char[local45];
		local61[0] = '+';
		for (@Pc(69) int local69 = local45 - 1; local69 > 0; local69--) {
			@Pc(73) int local73 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local73 - arg0 * 10;
			if (local83 >= 10) {
				local61[local69] = (char) (local83 + 87);
			} else {
				local61[local69] = (char) (local83 + 48);
			}
		}
		return new String(local61);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILclient!us;I)Lclient!dea;")
	public static Class34_Sub2_Sub1 method5277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class43_Sub3 arg2) {
		if (arg2.aBoolean689 || Static159.method2855(arg0) && Static159.method2855(arg1)) {
			return new Class34_Sub2_Sub1(arg2, 3553, 6408, arg0, arg1);
		} else if (arg2.aBoolean667) {
			return new Class34_Sub2_Sub1(arg2, 34037, 6408, arg0, arg1);
		} else {
			return new Class34_Sub2_Sub1(arg2, 6408, arg0, arg1, Static114.method2375(arg0), Static114.method2375(arg1));
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)I")
	public static int method5278(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(44) int local44 = (arg0 & 0x7F) * 96 >> 7;
			if (local44 < 2) {
				local44 = 2;
			} else if (local44 > 126) {
				local44 = 126;
			}
			return (arg0 & 0xFF80) + local44;
		}
	}
}
