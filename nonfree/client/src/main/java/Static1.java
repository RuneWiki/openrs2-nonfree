import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "[I")
	public static int[] anIntArray583;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray30;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!g;")
	public static Class83 aClass83_131;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_245 = new Class62("K", "T", "K", "K");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IBIII)V")
	public static void method6017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) float local13 = (float) Static20.anInt4603 / (float) Static20.anInt4612;
		@Pc(15) int local15 = arg1;
		@Pc(17) int local17 = arg3;
		if (local13 < 1.0F) {
			local17 = (int) ((float) arg1 * local13);
		} else {
			local15 = (int) ((float) arg3 / local13);
		}
		@Pc(44) int local44 = arg2 - (arg3 - local17) / 2;
		@Pc(52) int local52 = arg0 - (arg1 - local15) / 2;
		Static79.anInt1735 = -1;
		Static8.anInt492 = -1;
		Static208.anInt4249 = Static20.anInt4603 - local44 * Static20.anInt4603 / local17;
		Static375.anInt6902 = Static20.anInt4612 * local52 / local15;
		Static335.method5408();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIBZ)V")
	public static void method6018(@OriginalArg(3) boolean arg0) {
		Static392.anInt7144 = 22050;
		Static318.anInt5826 = 2;
		Static291.aBoolean399 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method6021(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static215.aString36 = arg2;
		Static375.aString62 = arg1;
		Static32.anInt483 = arg0;
		if (Static215.aString36.equals("") || Static375.aString62.equals("")) {
			Static228.anInt4595 = 3;
		} else if (Static4.anInt134 == -1) {
			Static22.anInt338 = 0;
			Static193.anInt4024 = 0;
			Static220.anInt4431 = 1;
			Static228.anInt4595 = -3;
			@Pc(40) Class2_Sub24 local40 = new Class2_Sub24(128);
			local40.method5746(10);
			local40.method5734((int) (Math.random() * 9.9999999E7D));
			local40.method5766(Static115.method2052(Static215.aString36));
			local40.method5734((int) (Math.random() * 9.9999999E7D));
			local40.method5772(Static375.aString62);
			local40.method5734((int) (Math.random() * 9.9999999E7D));
			local40.method5751(Static203.aBigInteger2, Static359.aBigInteger3);
			Static76.aClass2_Sub24_Sub2_7.anInt6669 = 0;
			Static76.aClass2_Sub24_Sub2_7.method5746(Static290.aClass15_10.anInt268);
			Static76.aClass2_Sub24_Sub2_7.method5746(local40.anInt6669 + 2);
			Static76.aClass2_Sub24_Sub2_7.method5721(574);
			Static76.aClass2_Sub24_Sub2_7.method5771(local40.aByteArray100, local40.anInt6669);
		} else {
			Static343.method5493();
		}
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)Z")
	public static boolean method6022() {
		return Static233.anInt4642 > 0;
	}
}
