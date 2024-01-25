import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "J")
	public static long aLong107;

	@OriginalMember(owner = "client!gq", name = "n", descriptor = "F")
	public static float aFloat84;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "[Lclient!th;")
	public static Class348[] aClass348Array2;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_108 = new Class169(52, 10);

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	public static int anInt4209 = 13156520;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZB)V")
	public static void method3842(@OriginalArg(0) boolean arg0) {
		if (Static356.aString80.length() == 0) {
			return;
		}
		Static455.method7295("--> " + Static356.aString80);
		Static154.method3163(false, arg0, Static356.aString80);
		Static376.anInt7119 = 0;
		Static154.anInt3391 = 0;
		Static356.aString80 = "";
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILclient!gga;Ljava/lang/String;)Lclient!dl;")
	public static Class75 method3844(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class124 arg1, @OriginalArg(3) String arg2) {
		@Pc(12) int local12 = arg1.method3638(arg2);
		if (local12 == -1) {
			return new Class75(0);
		}
		@Pc(31) int[] local31 = arg1.method3634(local12);
		@Pc(37) Class75 local37 = new Class75(local31.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local37.anInt1988 > local39) {
				@Pc(55) Class2_Sub8 local55 = new Class2_Sub8(arg1.method3641(local12, local31[local41++]));
				@Pc(59) int local59 = local55.method5172();
				@Pc(63) int local63 = local55.method5211();
				@Pc(67) int local67 = local55.method5203();
				if (!arg0 && local67 == 1) {
					local37.anInt1988--;
				} else {
					local37.anIntArray102[local39] = local59;
					local37.anIntArray103[local39] = local63;
					local39++;
				}
			}
			return local37;
		}
	}
}
