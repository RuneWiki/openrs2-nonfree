import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
	public static int anInt6719;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "[I")
	public static final int[] anIntArray471 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 };

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!cc;I)Z")
	public static boolean method5426(@OriginalArg(0) Class45 arg0) {
		return arg0 == Static89.aClass45_2 || Static336.aClass45_5 == arg0 || Static575.aClass45_8 == arg0 || Static409.aClass45_7 == arg0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILjava/lang/Object;BI)[B")
	public static byte[] method5427(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return Static331.method5080(arg1, local21);
		} else if (arg0 instanceof Class251) {
			@Pc(33) Class251 local33 = (Class251) arg0;
			return local33.method5845(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!pj;I)I")
	public static int method5428(@OriginalArg(0) Class248 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5804(Static181.anInt3477)) {
			local5++;
		}
		if (arg0.method5804(Static427.anInt7586)) {
			local5++;
		}
		if (arg0.method5804(Static503.anInt8755)) {
			local5++;
		}
		if (arg0.method5804(Static44.anInt833)) {
			local5++;
		}
		if (arg0.method5804(Static10.anInt139)) {
			local5++;
		}
		if (arg0.method5804(Static255.anInt4660)) {
			local5++;
		}
		if (arg0.method5804(Static194.anInt3795)) {
			local5++;
		}
		if (arg0.method5804(Static377.anInt6888)) {
			local5++;
		}
		if (arg0.method5804(Static450.anInt7953)) {
			local5++;
		}
		if (arg0.method5804(Static585.anInt6434)) {
			local5++;
		}
		if (arg0.method5804(Static493.anInt8640)) {
			local5++;
		}
		if (arg0.method5804(Static425.anInt7500)) {
			local5++;
		}
		if (arg0.method5804(Static24.anInt431)) {
			local5++;
		}
		if (arg0.method5804(Static574.anInt4894)) {
			local5++;
		}
		if (arg0.method5804(Static536.anInt9212)) {
			local5++;
		}
		if (arg0.method5804(Static389.anInt7106)) {
			local5++;
		}
		return local5;
	}
}
