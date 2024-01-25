import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
	public static int anInt1083;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "[I")
	public static final int[] anIntArray51 = new int[2];

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "S")
	public static short aShort20 = 320;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lclient!ih;")
	public static Class11_Sub6 method963() {
		@Pc(10) Class11_Sub6 local10 = (Class11_Sub6) Static106.aClass196_2.method4027();
		if (local10 == null) {
			return new Class11_Sub6();
		} else {
			Static370.anInt6680--;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IBZLclient!r;)Lclient!hr;")
	public static Class144 method964(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class78 arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static411.anIntArray437 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static411.anIntArray437.length; local14++) {
				if (arg0 == Static411.anIntArray437[local14]) {
					return Static446.aClass144Array1[local14];
				}
			}
		}
		@Pc(49) Class144 local49 = (Class144) Static490.aClass207_51.method4390((long) arg0);
		if (local49 != null) {
			if (arg1 && local49.aClass352_14 == null) {
				@Pc(61) Class352 local61 = Static342.method5100(arg0, Static284.aClass308_177);
				if (local61 == null) {
					return null;
				}
				local49.aClass352_14 = local61;
			}
			return local49;
		}
		@Pc(74) Class282[] local74 = Static604.method6024(Static247.aClass308_96, arg0);
		if (local74 == null) {
			return null;
		}
		@Pc(83) Class352 local83 = Static342.method5100(arg0, Static284.aClass308_177);
		if (local83 == null) {
			return null;
		}
		if (arg1) {
			local49 = new Class144(arg2.method6837(local83, local74), local83);
		} else {
			local49 = new Class144(arg2.method6837(local83, local74));
		}
		Static490.aClass207_51.method4391((long) arg0, local49);
		return local49;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIII)I")
	public static int method966(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < arg1) {
			return arg1;
		} else if (arg0 < arg2) {
			return arg0;
		} else {
			return arg2;
		}
	}
}
