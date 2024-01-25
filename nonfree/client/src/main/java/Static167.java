import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Lclient!ni;")
	public static Class223 aClass223_45;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "Lclient!ni;")
	public static Class223 aClass223_46;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "[J")
	public static final long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt3749 = -1;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "Z")
	public static final boolean aBoolean302 = false;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Lclient!kfa;")
	public static Class168 method3171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass168_3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IBZ)Lclient!bd;")
	public static Class9_Sub2 method3172(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class234[] local7 = Class6_Sub5_Sub1_Sub2.aClass234Array1;
		synchronized (Class6_Sub5_Sub1_Sub2.aClass234Array1) {
			@Pc(35) Class9_Sub2 local35;
			if (Class6_Sub5_Sub1_Sub2.aClass234Array1.length <= arg0 || Class6_Sub5_Sub1_Sub2.aClass234Array1[arg0].method6101()) {
				local35 = new Class9_Sub2();
				local35.aClass9_Sub6Array1 = new Class9_Sub6[arg0];
				for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
					local35.aClass9_Sub6Array1[local57] = new Class9_Sub6();
				}
			} else {
				local35 = (Class9_Sub2) Class6_Sub5_Sub1_Sub2.aClass234Array1[arg0].method6099();
				local35.method8408();
				@Pc(42) int local42 = Static3.anIntArray1[arg0]--;
			}
			local35.aBoolean82 = arg1;
			return local35;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!ni;Lclient!ni;Lclient!ni;Lclient!ni;)V")
	public static void method3173(@OriginalArg(1) Class223 arg0, @OriginalArg(2) Class223 arg1, @OriginalArg(3) Class223 arg2, @OriginalArg(4) Class223 arg3) {
		Static182.aClass223_48 = arg0;
		Static579.aClass223_135 = arg3;
		Static308.aClass223_65 = arg2;
		Static299.aClass302ArrayArray2 = new Class302[Static182.aClass223_48.method5961()][];
		Static555.aBooleanArray22 = new boolean[Static182.aClass223_48.method5961()];
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BII)Z")
	public static boolean method3174(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static359.method5820(arg1, arg0) | (arg1 & 0x70000) != 0 || Static296.method5063(arg1, arg0);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3176(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg1, 2);
		local8.method5179();
		local8.aString68 = arg0;
	}
}
