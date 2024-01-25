import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!bca;")
	public static Class30 aClass30_6;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_36 = new Class94(17, 8);

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Z")
	public static boolean aBoolean306 = true;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "Z")
	public static boolean aBoolean307 = false;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Z")
	public static boolean aBoolean309 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method3628(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static626.method1507(local13) : local13;
		} else if (arg1 instanceof Class12) {
			@Pc(32) Class12 local32 = (Class12) arg1;
			return local32.method5581();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)C")
	public static char method3629(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(41) char local41 = Static244.aCharArray1[local7 - 128];
			if (local41 == '\u0000') {
				local41 = '?';
			}
			local7 = local41;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!wm;Z)[I")
	public static int[] method3630(@OriginalArg(0) Class2_Sub52 arg0) {
		@Pc(10) Class2_Sub11 local10 = new Class2_Sub11(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8374(10);
		local10.method8387(local13[0]);
		local10.method8387(local13[1]);
		local10.method8387(local13[2]);
		local10.method8387(local13[3]);
		for (@Pc(60) int local60 = 0; local60 < 10; local60++) {
			local10.method8387((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8333((int) (Math.random() * 9.9999999E7D));
		local10.method8386(Static428.aBigInteger10, Static455.aBigInteger9);
		arg0.aClass2_Sub11_Sub2_7.method8376(local10.anInt10066, 0, local10.aByteArray128);
		return local13;
	}
}
