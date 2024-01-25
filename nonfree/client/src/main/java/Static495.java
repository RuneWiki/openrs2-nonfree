import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
	public static int anInt7856;

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "Lclient!tq;")
	public static final Class343 aClass343_11 = new Class343("", 19);

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "[I")
	public static final int[] anIntArray422 = new int[2];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method6507(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(21) char local21 = arg0.charAt(local12);
			if (local21 == '<' || local21 == '>') {
				local10 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local10 + local8);
		for (@Pc(43) int local43 = 0; local43 < local8; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local41.append("<lt>");
			} else if (local49 == '>') {
				local41.append("<gt>");
			} else {
				local41.append(local49);
			}
		}
		return local41.toString();
	}

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
	public static void method6508() {
		@Pc(10) int local10 = Static336.aClass3_Sub41_18.aClass14_Sub19_2.method5938();
		if (local10 == 0) {
			Static366.aByteArrayArrayArray14 = null;
			Static234.method3521(0);
		} else if (local10 == 1) {
			Static265.method3918((byte) 0);
			Static234.method3521(512);
			if (Static315.aByteArrayArrayArray13 != null) {
				Static230.method3491();
			}
		} else {
			Static265.method3918((byte) (Static494.anInt7829 - 4 & 0xFF));
			Static234.method3521(2);
		}
		Static516.anInt8124 = Static570.anInt9192;
	}
}
