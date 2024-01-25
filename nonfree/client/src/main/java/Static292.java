import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!on", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!on", name = "V", descriptor = "[I")
	public static final int[] anIntArray331 = new int[8];

	@OriginalMember(owner = "client!on", name = "W", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_184 = new Class103(3, 18);

	@OriginalMember(owner = "client!on", name = "bb", descriptor = "[I")
	public static final int[] anIntArray332 = new int[1];

	@OriginalMember(owner = "client!on", name = "db", descriptor = "[I")
	public static final int[] anIntArray333 = new int[8];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BLclient!fq;)[Lclient!it;")
	public static Class116[] method4000(@OriginalArg(1) Class83 arg0) {
		if (!arg0.method1869()) {
			return new Class116[0];
		}
		@Pc(16) Class232 local16 = arg0.method1872();
		while (local16.anInt6402 == 0) {
			Static223.method4582(10L);
		}
		if (local16.anInt6402 == 2) {
			return new Class116[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject8;
		@Pc(48) Class116[] local48 = new Class116[local35.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
			@Pc(56) Class116 local56 = new Class116();
			local48[local50] = local56;
			local56.anInt3138 = local35[local50 << 2];
			local56.anInt3141 = local35[(local50 << 2) + 1];
			local56.anInt3135 = local35[(local50 << 2) + 2];
			local56.anInt3139 = local35[(local50 << 2) + 3];
		}
		return local48;
	}
}
