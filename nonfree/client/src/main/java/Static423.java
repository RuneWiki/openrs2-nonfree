import java.awt.Canvas;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "Lclient!oh;")
	public static Class237 aClass237_110;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("8ec751c370413db79c187a9a3438c82d7a4966290b1067b1960d9b3d8f8e63c63ca5fa905c274b8ed06fbaddcb0b2d8df64928ac618accc4494fb34e641232cb", 16);

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_105 = new Class71(55, 8);

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
	public static int anInt7961 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IC)Z")
	public static boolean method6600(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILjava/awt/Canvas;I)Lclient!qca;")
	public static Class8_Sub10 method6601(@OriginalArg(1) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class8_Sub10_Sub1");
			@Pc(15) Class8_Sub10 local15 = (Class8_Sub10) local11.getDeclaredConstructor().newInstance();
			local15.method3520(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class8_Sub10_Sub2 local28 = new Class8_Sub10_Sub2();
			local28.method3520(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIZII)V")
	public static void method6602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(14) long local14 = (long) (arg0 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(30) Class8_Sub18 local30 = (Class8_Sub18) Static329.aClass253_22.method6594(local14);
		if (local30 == null) {
			local30 = new Class8_Sub18();
			Static329.aClass253_22.method6591(local30, local14);
		}
		if (arg2 >= local30.anIntArray153.length) {
			@Pc(55) int[] local55 = new int[arg2 + 1];
			@Pc(60) int[] local60 = new int[arg2 + 1];
			for (@Pc(62) int local62 = 0; local62 < local30.anIntArray153.length; local62++) {
				local55[local62] = local30.anIntArray153[local62];
				local60[local62] = local30.anIntArray154[local62];
			}
			for (@Pc(92) int local92 = local30.anIntArray153.length; local92 < arg2; local92++) {
				local55[local92] = -1;
				local60[local92] = 0;
			}
			local30.anIntArray153 = local55;
			local30.anIntArray154 = local60;
		}
		local30.anIntArray153[arg2] = arg4;
		local30.anIntArray154[arg2] = arg1;
	}
}
