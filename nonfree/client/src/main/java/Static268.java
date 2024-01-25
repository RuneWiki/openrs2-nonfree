import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_90 = new Class186(81, -2);

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
	public static int anInt4872 = 0;

	@OriginalMember(owner = "client!ifa", name = "l", descriptor = "[I")
	public static final int[] anIntArray277 = new int[13];

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_91 = new Class186(105, 4);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	public static void method4108() {
		for (@Pc(11) Class3_Sub24 local11 = (Class3_Sub24) Static699.aClass136_50.method3509(); local11 != null; local11 = (Class3_Sub24) Static699.aClass136_50.method3506()) {
			if (local11.aBoolean270) {
				local11.aBoolean270 = false;
			} else {
				Static411.method5564(local11.anInt3357);
			}
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Z)V")
	public static void method4109() {
		if (Static178.anInt3225 == 3) {
			Static638.method8657(4);
		} else if (Static178.anInt3225 == 7) {
			Static638.method8657(8);
		} else if (Static178.anInt3225 == 9) {
			Static638.method8657(10);
		} else if (Static178.anInt3225 == 11) {
			Static638.method8657(12);
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method4110(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(13) byte[] local13 = new byte[arg0];
		Static735.method9185(arg1, 0, local13, 0, arg0);
		return local13;
	}
}
