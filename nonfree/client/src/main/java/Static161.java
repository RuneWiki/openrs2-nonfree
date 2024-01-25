import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!wea;")
	public static final Class357 aClass357_3 = new Class357(7, 2);

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[S")
	private static final short[] aShortArray37 = new short[] { 957, 20418, -21587, 11209, -10300 };

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[S")
	private static final short[] aShortArray38 = new short[] { 967, 20428, -21577, 11219, -10290 };

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[S")
	private static final short[] aShortArray39 = new short[] { 962, 20423, -21582, 11214, -10295 };

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "[S")
	private static final short[] aShortArray40 = new short[] { 952, 20413, -21592, 11204, -10305 };

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { aShortArray38, aShortArray39, aShortArray37, aShortArray40 };

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
	public static boolean aBoolean284 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!rj;I)[Lclient!ro;")
	public static Class289[] method2858(@OriginalArg(0) Class287 arg0) {
		if (!arg0.method6542()) {
			return new Class289[0];
		}
		@Pc(16) Class347 local16 = arg0.method6537();
		while (local16.anInt9172 == 0) {
			Static459.method6498(10L);
		}
		if (local16.anInt9172 == 2) {
			return new Class289[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject49;
		@Pc(41) Class289[] local41 = new Class289[local35.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local41.length; local48++) {
			@Pc(54) Class289 local54 = new Class289();
			local41[local48] = local54;
			local54.anInt7996 = local35[local48 << 2];
			local54.anInt7993 = local35[(local48 << 2) + 1];
			local54.anInt7997 = local35[(local48 << 2) + 2];
			local54.anInt7994 = local35[(local48 << 2) + 3];
		}
		return local41;
	}
}
