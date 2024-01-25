import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static684 {

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array19;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
	public static int anInt10456 = 0;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLclient!laa;)Lclient!fu;")
	public static Class123 method9000(@OriginalArg(1) Class60_Sub1_Sub1 arg0) {
		@Pc(14) Class123 local14;
		if (Static679.aClass123_4 == null) {
			local14 = new Class123();
		} else {
			local14 = Static679.aClass123_4;
			Static679.aClass123_4 = Static679.aClass123_4.aClass123_1;
			local14.aClass123_1 = null;
			Static401.anInt6904--;
		}
		local14.aClass60_Sub1_Sub1_1 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(II)V")
	public static void method9003(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 11);
		local9.method2038();
	}
}
