import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!gp;I)I")
	public static int method259(@OriginalArg(0) Class117 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method2973(Static381.anInt6973)) {
			local5++;
		}
		if (arg0.method2973(Static260.anInt8431)) {
			local5++;
		}
		if (arg0.method2973(Static367.anInt6862)) {
			local5++;
		}
		if (arg0.method2973(Static444.anInt7777)) {
			local5++;
		}
		if (arg0.method2973(Static215.anInt4079)) {
			local5++;
		}
		if (arg0.method2973(Static504.anInt8610)) {
			local5++;
		}
		if (arg0.method2973(Static198.anInt3798)) {
			local5++;
		}
		if (arg0.method2973(Static366.anInt6857)) {
			local5++;
		}
		if (arg0.method2973(Static361.anInt6767)) {
			local5++;
		}
		if (arg0.method2973(Static209.anInt3904)) {
			local5++;
		}
		if (arg0.method2973(Static250.anInt5059)) {
			local5++;
		}
		if (arg0.method2973(Static320.anInt6181)) {
			local5++;
		}
		if (arg0.method2973(Static2.anInt64)) {
			local5++;
		}
		if (arg0.method2973(Static453.anInt7863)) {
			local5++;
		}
		if (arg0.method2973(Static56.anInt1180)) {
			local5++;
		}
		if (arg0.method2973(Static147.anInt3076)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!gp;II)Lclient!rl;")
	public static Class256 method260(@OriginalArg(0) Class117 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2964(arg1);
		return local8 == null ? null : new Class256(local8);
	}
}
