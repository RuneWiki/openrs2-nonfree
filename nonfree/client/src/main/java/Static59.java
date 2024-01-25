import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!nca;")
	public static Class254 aClass254_33;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public static int anInt1028;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	public static int anInt1029;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
	public static int anInt1031;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	public static int anInt1030 = 0;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "[I")
	public static final int[] anIntArray91 = new int[200];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static void method921() {
		for (@Pc(3) int local3 = 0; local3 < Static217.anInt3445; local3++) {
			@Pc(11) int local11 = Static266.anIntArray305[local3];
			@Pc(18) Class2_Sub49 local18 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local11, 0);
			if (local18 != null) {
				@Pc(23) Class4_Sub2_Sub1_Sub2_Sub2 local23 = local18.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				Static435.method6318(local23, false);
			}
		}
		anInt1031++;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)V")
	public static void method922(@OriginalArg(1) int arg0) {
		Static181.anInt3030 = 3;
		Static482.anInt7725 = 100;
		Static444.anInt7209 = -1;
		Static368.anInt5903 = arg0;
	}
}
