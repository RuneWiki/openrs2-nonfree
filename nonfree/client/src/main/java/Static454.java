import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
	public static int anInt7852;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_131 = new Class237(17, -2);

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_26 = new Class225(1, 2, 2, 0);

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_106 = new Class84("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "[I")
	public static final int[] anIntArray690 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BII)Lclient!id;")
	public static Class112 method6087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class112 local7 = new Class112();
		local7.anInt3131 = arg0 + 6;
		local7.anInt3143 = arg1 + 1 + 5;
		local7.anInt3133 = -1;
		local7.anInt3142 = -1;
		local7.anIntArrayArray90 = new int[local7.anInt3143][local7.anInt3131];
		local7.method2686();
		return local7;
	}
}
