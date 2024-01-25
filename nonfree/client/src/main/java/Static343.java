import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!na", name = "o", descriptor = "I")
	public static int anInt6039;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
	public static int[] anIntArray471;

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Lclient!te;")
	public static final Class318 aClass318_4 = new Class318("", 17);

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_11 = new Class187(3, 5);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)Lclient!df;")
	public static Class63 method5228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static554.aClass63ArrayArrayArray4[0][arg1][arg2] != null && Static554.aClass63ArrayArrayArray4[0][arg1][arg2].aClass63_1 != null;
			if (local28 && arg0 >= Static499.anInt7950 - 1) {
				return null;
			}
			Static228.method1799(arg0, arg1, arg2);
		}
		return Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
	}
}
