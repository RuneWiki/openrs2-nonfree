import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!nk;")
	public static Class161 aClass161_2;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)Z", line = 5)
	public static boolean method1706() {
		return Class123.anInt3361 == 0 ? Static85.aClass2_Sub12_Sub3_1.method4271() : true;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!r;Lclient!r;)I", line = 68)
	public static int method1709(@OriginalArg(1) Class197 arg0, @OriginalArg(2) Class197 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method5088(Static171.anInt80)) {
			local5++;
		}
		if (arg1.method5088(Static346.anInt7001)) {
			local5++;
		}
		if (arg1.method5088(Static76.anInt6666)) {
			local5++;
		}
		if (arg0.method5088(Static171.anInt80)) {
			local5++;
		}
		if (arg0.method5088(Static346.anInt7001)) {
			local5++;
		}
		if (arg0.method5088(Static76.anInt6666)) {
			local5++;
		}
		return local5;
	}
}
