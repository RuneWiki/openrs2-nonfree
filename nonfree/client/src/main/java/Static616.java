import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public static int anInt10014;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_61 = new Class233(8);

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	public static int anInt10011 = 0;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	public static int anInt10012 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!g;I)V")
	public static void method8375(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		if (Static57.aBoolean85) {
			Static57.aBoolean85 = false;
			arg1 = 0;
		}
		if (Static560.aClass121_2 != null && Static560.aClass121_2.method3083(arg0)) {
			return;
		}
		Static560.aClass121_2 = arg0;
		Static176.aLong105 = Static438.method6517();
		Static330.anInt4375 = arg1;
		Static305.anInt5645 = arg1;
		if (Static305.anInt5645 != 0) {
			Static356.aFloat156 = Static3.aFloat1;
			Static144.anInt3308 = Static183.anInt4030;
			Static619.aFloat223 = Static345.aFloat154;
			Static472.anInt8096 = Static578.anInt9537;
			Static222.aFloat215 = Static442.aFloat194;
			Static531.aFloat216 = Static467.aFloat209;
			Static149.aFloat218 = Static267.aFloat190;
			Static57.aClass22_1 = Static353.aClass22_4;
			Static441.aFloat193 = Static41.aFloat24;
			Static412.anInt7550 = Static121.anInt2897;
			return;
		}
		Static617.method8391();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method8377() {
		Static78.anInt1695 = 0;
		Static260.anInt5098 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static207.anInt4335; local16++) {
			@Pc(21) int local21 = local16 * Static466.anInt4483;
			for (@Pc(23) int local23 = 0; local23 < Static466.anInt4483; local23++) {
				@Pc(28) int local28 = local23 + local21;
				Static5.anInterface24Array1[local28].method8381(Static531.anInt8888 * local23, local16 * Static155.anInt3544, Static531.anInt8888, Static155.anInt3544, true);
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method8379(@OriginalArg(0) Class2_Sub5_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static331.aClass112Array3 != Static164.aClass112Array1) {
			@Pc(12) int local12 = Static178.aClass112Array2[arg1].method7826(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class112 local19 = Static178.aClass112Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7826(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method7824(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
