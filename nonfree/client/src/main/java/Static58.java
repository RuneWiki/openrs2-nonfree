import java.math.BigInteger;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
	public static int anInt1373;

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!ie;")
	public static Class53 aClass53_11 = new Class53(20);

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!ia;")
	public static Class51 aClass51_414 = Static64.method1101("labels)3dat");

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	public static int anInt1372 = 0;

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "[I")
	public static int[] anIntArray86 = new int[32];

	@OriginalMember(owner = "client!fh", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "Lclient!ia;")
	private static Class51 aClass51_415 = Static64.method1101("purple:");

	@OriginalMember(owner = "client!fh", name = "u", descriptor = "Lclient!ia;")
	private static Class51 aClass51_416 = Static64.method1101("Loading title screen )2 ");

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "Lclient!ia;")
	public static Class51 aClass51_417 = aClass51_415;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Lclient!ia;")
	public static Class51 aClass51_418 = aClass51_415;

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "Lclient!ia;")
	public static Class51 aClass51_419 = aClass51_416;

	@OriginalMember(owner = "client!fh", name = "y", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array9 = new Class51[1000];

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V")
	public static void method1031() {
		@Pc(9) int local9 = Static80.aClass1_Sub2_Sub11_2.method2040(Static28.aClass51_211);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static202.anInt4289; local11++) {
			local19 = Static80.aClass1_Sub2_Sub11_2.method2040(Static150.method2587(local11));
			if (local19 > local9) {
				local9 = local19;
			}
		}
		Static184.anInt3998 = Static202.anInt4289 * 15 + 22;
		local9 += 8;
		Static200.anInt4245 = local9;
		local19 = Static202.anInt4289 * 15 + 21;
		Static156.aBoolean164 = true;
		@Pc(56) int local56 = Static148.anInt3214 - local9 / 2;
		if (Static185.anInt4016 < local9 + local56) {
			local56 = Static185.anInt4016 - local9;
		}
		if (local56 < 0) {
			local56 = 0;
		}
		Static53.anInt1242 = local56;
		@Pc(74) int local74 = Static106.anInt2346;
		if (local74 + local19 > Static90.anInt4701) {
			local74 = Static90.anInt4701 - local19;
		}
		if (local74 < 0) {
			local74 = 0;
		}
		Static72.anInt1644 = local74;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	public static void method1032() {
		Static3.method66();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static228.aClass90Array1[local8].method2703();
		}
		System.gc();
	}
}
