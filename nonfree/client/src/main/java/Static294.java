import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "J")
	public static long aLong177;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!qe;")
	public static Class132 aClass132_2;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
	public static int[] anIntArray453;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
	public static int anInt5813 = 0;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
	public static int anInt5815 = -1;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "[[B")
	public static final byte[][] aByteArrayArray43 = new byte[1000][];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BJ)V")
	public static void method4879(@OriginalArg(1) long arg0) {
		if (Static212.aClass106ArrayArrayArray2 != null) {
			if (Static81.anInt1498 == 1 || Static81.anInt1498 == 5) {
				Static349.method5650(arg0);
			} else if (Static81.anInt1498 == 4) {
				Static53.method799(arg0);
			}
		}
		Static59.method899((long) Static293.anInt5807, Static107.aClass129_4);
		if (Static270.anInt5491 != -1) {
			Static37.method551(Static270.anInt5491);
		}
		for (@Pc(39) int local39 = 0; local39 < Static280.anInt219; local39++) {
			if (Static292.aBooleanArray22[local39]) {
				Static18.aBooleanArray1[local39] = true;
			}
			Static83.aBooleanArray8[local39] = Static292.aBooleanArray22[local39];
			Static292.aBooleanArray22[local39] = false;
		}
		Static62.anInt1150 = Static293.anInt5807;
		if (Static107.aClass129_4.method4927()) {
			Static261.aBoolean349 = true;
		}
		if (Static270.anInt5491 != -1) {
			Static280.anInt219 = 0;
			Static22.method311();
		}
		Static107.aClass129_4.method4966();
		Static181.method3070(Static107.aClass129_4);
		@Pc(96) int local96 = Static315.method5280();
		if (local96 == -1) {
			local96 = anInt5815;
		}
		Static63.method928(local96);
		Static22.method317(Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308, Static244.anInt4932, Static322.anInt6250);
		Static244.anInt4932 = 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)V")
	public static void method4880() {
		@Pc(9) Class26 local9 = Static193.aClass26_37;
		synchronized (Static193.aClass26_37) {
			Static193.aClass26_37.method329(5);
		}
	}
}
