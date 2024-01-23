import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[Lclient!qb;")
	public static Class137[] aClass137Array1;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "Lclient!th;")
	public static Class168 aClass168_172;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "B")
	public static byte aByte23;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString361 = "Loading defaults - ";

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)[Lclient!bo;")
	public static Class22[] method3873() {
		if (Static250.aClass22Array1 == null) {
			@Pc(19) Class22[] local19 = Static23.method501(Static142.aClass112_2);
			@Pc(23) Class22[] local23 = new Class22[local19.length];
			@Pc(25) int local25 = 0;
			label54: for (@Pc(27) int local27 = 0; local27 < local19.length; local27++) {
				@Pc(39) Class22 local39 = local19[local27];
				if ((local39.anInt664 <= 0 || local39.anInt664 >= 24) && local39.anInt660 >= 800 && local39.anInt661 >= 600) {
					for (@Pc(65) int local65 = 0; local65 < local25; local65++) {
						@Pc(72) Class22 local72 = local23[local65];
						if (local39.anInt660 == local72.anInt660 && local72.anInt661 == local39.anInt661) {
							if (local39.anInt664 > local72.anInt664) {
								local23[local65] = local39;
							}
							continue label54;
						}
					}
					local23[local25] = local39;
					local25++;
				}
			}
			Static250.aClass22Array1 = new Class22[local25];
			Static319.method1422(local23, 0, Static250.aClass22Array1, 0, local25);
			@Pc(126) int[] local126 = new int[Static250.aClass22Array1.length];
			for (@Pc(128) int local128 = 0; local128 < Static250.aClass22Array1.length; local128++) {
				@Pc(136) Class22 local136 = Static250.aClass22Array1[local128];
				local126[local128] = local136.anInt660 * local136.anInt661;
			}
			Static89.method4587(local126, Static250.aClass22Array1);
		}
		return Static250.aClass22Array1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[Lclient!ua;)V")
	public static void method3874(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28[] arg1) {
		Static111.aClass1_Sub28ArrayArray1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!th;)V")
	public static void method3875(@OriginalArg(1) Class168 arg0) {
		Static266.aClass168_180 = arg0;
		Static71.anInt1652 = Static266.aClass168_180.method4068(16);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method3876() {
		@Pc(8) int local8 = Static153.method2465();
		if (local8 == 0) {
			Static53.aByteArrayArrayArray2 = null;
			Static1.method4718(0);
		} else if (local8 == 1) {
			Static16.method411((byte) 0);
			Static1.method4718(512);
			if (Static303.aByteArrayArrayArray19 != null) {
				Static241.method3785();
			}
		} else {
			Static16.method411((byte) (Static207.anInt4467 - 4 & 0xFF));
			Static1.method4718(2);
		}
		Static102.anInt860 = Static185.anInt4085;
	}
}
