import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_86 = new Class119(54, -2);

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_63 = new Class217(69, 2);

	@OriginalMember(owner = "client!jv", name = "v", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_23 = new Class243();

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
	public static int anInt3933 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLclient!li;)[Lclient!kr;")
	public static Class136[] method3129(@OriginalArg(1) Class143 arg0) {
		if (!arg0.method3393()) {
			return new Class136[0];
		}
		@Pc(14) Class43 local14 = arg0.method3409();
		while (local14.anInt1521 == 0) {
			Static360.method4758(10L);
		}
		if (local14.anInt1521 == 2) {
			return new Class136[0];
		}
		@Pc(37) int[] local37 = (int[]) local14.anObject3;
		@Pc(43) Class136[] local43 = new Class136[local37.length >> 2];
		for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
			@Pc(58) Class136 local58 = new Class136();
			local43[local45] = local58;
			local58.anInt4114 = local37[local45 << 2];
			local58.anInt4110 = local37[(local45 << 2) + 1];
			local58.anInt4113 = local37[(local45 << 2) + 2];
			local58.anInt4109 = local37[(local45 << 2) + 3];
		}
		return local43;
	}
}
