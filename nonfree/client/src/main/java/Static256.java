import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mu", name = "C", descriptor = "[I")
	public static final int[] anIntArray320 = new int[25];

	@OriginalMember(owner = "client!mu", name = "Q", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_246 = new Class123(46, 4);

	@OriginalMember(owner = "client!mu", name = "S", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!mu", name = "V", descriptor = "I")
	public static int anInt4669 = -1;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method3936(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static383.aString57 = arg1;
		Static436.anInt7722 = arg2;
		Static392.aString35 = arg0;
		if (Static383.aString57.equals("") || Static392.aString35.equals("")) {
			Static107.anInt2300 = 3;
		} else if (Static118.anInt2485 == -1) {
			Static414.anInt7038 = 1;
			Static107.anInt2300 = -3;
			Static172.anInt3437 = 0;
			Static331.anInt5769 = 0;
			@Pc(39) Class6_Sub1 local39 = new Class6_Sub1(128);
			local39.method6439(10);
			local39.method6461((int) (Math.random() * 9.9999999E7D));
			local39.method6475(Static362.method5353(Static383.aString57));
			local39.method6461((int) (Math.random() * 9.9999999E7D));
			local39.method6448(Static392.aString35);
			local39.method6461((int) (Math.random() * 9.9999999E7D));
			local39.method6432(Static370.aBigInteger2, Static292.aBigInteger1);
			Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
			Static109.aClass6_Sub1_Sub1_5.method6439(Static356.aClass223_10.anInt6416);
			Static109.aClass6_Sub1_Sub1_5.method6439(local39.anInt7898 + 2);
			Static109.aClass6_Sub1_Sub1_5.method6453(582);
			Static109.aClass6_Sub1_Sub1_5.method6440(local39.aByteArray96, local39.anInt7898);
		} else {
			Static293.method297();
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)Lclient!ph;")
	public static Class193 method3937(@OriginalArg(0) int arg0) {
		@Pc(16) Class193[] local16 = Static380.method5654();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class193 local24 = local16[local18];
			if (local24.anInt5381 == arg0) {
				return local24;
			}
		}
		return null;
	}
}
