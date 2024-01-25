import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kka", name = "d", descriptor = "Lclient!je;")
	public static Class176 aClass176_2;

	@OriginalMember(owner = "client!kka", name = "c", descriptor = "Z")
	public static boolean aBoolean530 = true;

	@OriginalMember(owner = "client!kka", name = "e", descriptor = "[Lclient!go;")
	public static final Class5_Sub25[] aClass5_Sub25Array1 = new Class5_Sub25[1024];

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(IIZ)V")
	public static void method4981(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class5_Sub45 local9 = arg1 ? Static494.aClass5_Sub45_1 : Static613.aClass5_Sub45_2;
		if (local9 == null || arg0 < 0 || arg0 >= local9.anInt7909) {
			return;
		}
		@Pc(30) Class126 local30 = local9.aClass126Array1[arg0];
		if (local30.aByte41 != -1) {
			return;
		}
		@Pc(43) String local43 = local30.aString26;
		@Pc(48) Class5_Sub21 local48 = Static64.method905(Static263.aClass49_1, Static285.aClass305_44);
		local48.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(local43) + 3);
		local48.aClass5_Sub41_Sub2_1.method7798(arg1 ? 1 : 0);
		local48.aClass5_Sub41_Sub2_1.method7848(arg0);
		local48.aClass5_Sub41_Sub2_1.method7854(local43);
		Static495.method7092(local48);
	}
}
