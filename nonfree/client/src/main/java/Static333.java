import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!un", name = "N", descriptor = "I")
	public static int anInt6459;

	@OriginalMember(owner = "client!un", name = "O", descriptor = "I")
	public static int anInt6460;

	@OriginalMember(owner = "client!un", name = "G", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_205 = new Class157(57, 7);

	@OriginalMember(owner = "client!un", name = "M", descriptor = "I")
	public static int anInt6458 = 3;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)Z")
	public static boolean method5426(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static47.anInt779; local1 < Static32.anInt516; local1++) {
			@Pc(6) Class51[][] local6 = Static196.aClass51ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static26.anInt3838; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static250.anInt5229 + local9;
				@Pc(18) int local18 = Static250.anInt5229 - local9;
				if (local14 >= Static360.anInt6859 || local18 < Static275.anInt5641) {
					for (@Pc(27) int local27 = -Static26.anInt3838; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static328.anInt6686 + local27;
						@Pc(36) int local36 = Static328.anInt6686 - local27;
						@Pc(48) Class51 local48;
						if (local14 >= Static360.anInt6859) {
							if (local32 >= Static174.anInt5316) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean100) {
									Static251.aBoolean456 = arg0;
									Static328.aClass80_29.method3929(local48);
									Static328.aClass80_29.method3924();
								}
							}
							if (local36 < Static51.anInt874) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean100) {
									Static251.aBoolean456 = arg0;
									Static328.aClass80_29.method3929(local48);
									Static328.aClass80_29.method3924();
								}
							}
						}
						if (local18 < Static275.anInt5641) {
							if (local32 >= Static174.anInt5316) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean100) {
									Static251.aBoolean456 = arg0;
									Static328.aClass80_29.method3929(local48);
									Static328.aClass80_29.method3924();
								}
							}
							if (local36 < Static51.anInt874) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean100) {
									Static251.aBoolean456 = arg0;
									Static328.aClass80_29.method3929(local48);
									Static328.aClass80_29.method3924();
								}
							}
						}
						if (Static179.anInt3996 == 0) {
							if (Static74.aBoolean316) {
								Static328.aClass80_29.method3922(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5428(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(2, arg1);
		local8.method1801();
		local8.aString16 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V")
	public static void method5429() {
		Static79.method1604();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static182.aClass61Array2[local8].method1611();
		}
		Static81.method1661();
		Static51.method1022();
		System.gc();
	}
}
