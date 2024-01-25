import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Z")
	public static boolean aBoolean773;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray23;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "[I")
	public static final int[] anIntArray605 = new int[13];

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[I")
	public static final int[] anIntArray606 = new int[14];

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!qg;")
	public static final Class285 aClass285_3 = new Class285("WIP", 2);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!gk;I)Lclient!eo;")
	public static Class2_Sub4 method7438(@OriginalArg(0) Class2_Sub7 arg0) {
		arg0.method4464();
		@Pc(13) int local13 = arg0.method4464();
		@Pc(17) Class2_Sub4 local17 = Static143.method5994(local13);
		local17.anInt9462 = arg0.method4464();
		@Pc(31) int local31 = arg0.method4464();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method4464();
			local17.method7566(local39, arg0);
		}
		local17.method7562();
		return local17;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIII)Z")
	public static boolean method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static431.aBoolean567) {
			return false;
		} else if (Static427.anInt6937 < 100) {
			return false;
		} else if (Static158.method6599(arg0, arg3, arg1)) {
			@Pc(29) int local29 = arg1 << Static562.anInt9207;
			@Pc(33) int local33 = arg0 << Static562.anInt9207;
			if (Static216.method7683(local33, Static114.aClass151Array1[arg3].method7676(arg0, arg1), Static481.anInt7681, arg2, Static481.anInt7681, local29)) {
				Static471.anInt7543++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[S)[S")
	public static short[] method7440(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static598.method4264(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public static void method7441() {
		@Pc(7) Class317 local7 = null;
		try {
			@Pc(17) Class5 local17 = Static169.aClass99_2.method1789(true, "2");
			while (local17.anInt151 == 0) {
				Static263.method3671(1L);
			}
			if (local17.anInt151 == 1) {
				local7 = (Class317) local17.anObject1;
				@Pc(44) byte[] local44 = new byte[(int) local7.method6334()];
				@Pc(58) int local58;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local58) {
					local58 = local7.method6331(local44.length - local46, local44, local46);
					if (local58 == -1) {
						throw new IOException("EOF");
					}
				}
				Static331.method4764(new Class2_Sub7(local44));
			}
		} catch (@Pc(82) Exception local82) {
		}
		try {
			if (local7 != null) {
				local7.method6333();
			}
		} catch (@Pc(89) Exception local89) {
		}
	}
}
