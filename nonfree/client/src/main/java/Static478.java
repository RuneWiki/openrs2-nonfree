import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "[Lclient!uf;")
	public static Class357[] aClass357Array1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)Z")
	public static boolean method7623(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!cea;I)[Lclient!pda;")
	public static Class277[] method7626(@OriginalArg(0) Class48 arg0) {
		if (!arg0.method1315()) {
			return new Class277[0];
		}
		@Pc(16) Class268 local16 = arg0.method1308();
		while (local16.anInt8008 == 0) {
			Static650.method9565(10L);
		}
		if (local16.anInt8008 == 2) {
			return new Class277[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject19;
		@Pc(43) Class277[] local43 = new Class277[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(51) Class277 local51 = new Class277();
			local43[local45] = local51;
			local51.anInt8153 = local37[local45 << 2];
			local51.anInt8154 = local37[(local45 << 2) + 1];
			local51.anInt8157 = local37[(local45 << 2) + 2];
			local51.anInt8156 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
