import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	public static int anInt3272;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	public static int anInt3275;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "Lclient!iv;")
	public static final Class168 aClass168_3 = new Class168(2);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)I")
	public static int method2808(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(36) int local36 = (arg0 & 0x7F) * 96 >> 7;
			if (local36 < 2) {
				local36 = 2;
			} else if (local36 > 126) {
				local36 = 126;
			}
			return (arg0 & 0xFF80) + local36;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[F)[F")
	public static float[] method2809(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static651.method754(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!uu;Ljava/lang/String;Z)Lclient!dp;")
	public static Class76 method2810(@OriginalArg(1) Class343 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg0.method8158(arg1);
		if (local10 == -1) {
			return new Class76(0);
		}
		@Pc(24) int[] local24 = arg0.method8145(local10);
		@Pc(40) Class76 local40 = new Class76(local24.length);
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		while (true) {
			while (local40.anInt2176 > local42) {
				@Pc(58) Class3_Sub9 local58 = new Class3_Sub9(arg0.method8132(local10, local24[local44++]));
				@Pc(62) int local62 = local58.method5585();
				@Pc(66) int local66 = local58.method5610();
				@Pc(70) int local70 = local58.method5633();
				if (!arg2 && local70 == 1) {
					local40.anInt2176--;
				} else {
					local40.anIntArray144[local42] = local62;
					local40.anIntArray143[local42] = local66;
					local42++;
				}
			}
			return local40;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/awt/Canvas;III)Lclient!ev;")
	public static Class3_Sub16 method2811(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class3_Sub16_Sub1");
			@Pc(10) Class3_Sub16 local10 = (Class3_Sub16) local6.getDeclaredConstructor().newInstance();
			local10.method7950(arg2, arg1, arg0);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class3_Sub16_Sub2 local28 = new Class3_Sub16_Sub2();
			local28.method7950(arg2, arg1, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIIII)Z")
	public static boolean method2814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static546.aByteArrayArrayArray18[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static546.aByteArrayArrayArray18[arg1][arg3][arg0] & 0x10) == 0) {
			return arg2 == Static177.method2938(arg3, arg1, arg0);
		} else {
			return false;
		}
	}
}
