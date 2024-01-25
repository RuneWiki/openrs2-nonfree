import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "[I")
	public static final int[] anIntArray315 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_52 = new Class25(10, 16);

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public static int anInt3657 = 1;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Lclient!rp;")
	public static final Class220 aClass220_26 = new Class220(8);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lclient!pr;")
	public static Class6_Sub3 method3262(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class6_Sub3_Sub1");
			@Pc(15) Class6_Sub3 local15 = (Class6_Sub3) local6.getDeclaredConstructor().newInstance();
			local15.method3816(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class6_Sub3_Sub2 local26 = new Class6_Sub3_Sub2();
			local26.method3816(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)I")
	public static int method3263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 1);
	}
}
