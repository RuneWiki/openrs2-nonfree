import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bh", name = "P", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_12 = new Class81(73, -1);

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "[Lclient!wa;")
	public static final Class176_Sub1[] aClass176_Sub1Array1 = new Class176_Sub1[30];

	@OriginalMember(owner = "client!bh", name = "eb", descriptor = "[I")
	public static final int[] anIntArray33 = new int[100];

	@OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
	public static int anInt626 = 0;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Z")
	public static boolean method411(@OriginalArg(0) int arg0) {
		if (Static272.aBooleanArray51[arg0]) {
			return true;
		} else if (Static320.aClass188_129.method4287(arg0)) {
			@Pc(23) int local23 = Static320.aClass188_129.method4285(arg0);
			if (local23 == 0) {
				Static272.aBooleanArray51[arg0] = true;
				return true;
			}
			if (Static450.aClass41ArrayArray2[arg0] == null) {
				Static450.aClass41ArrayArray2[arg0] = new Class41[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static450.aClass41ArrayArray2[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static320.aClass188_129.method4283(arg0, local45);
					if (local59 != null) {
						@Pc(71) Class41 local71 = Static450.aClass41ArrayArray2[arg0][local45] = new Class41();
						local71.anInt1613 = local45 + (arg0 << 16);
						if (local59[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local71.method1177(new Class2_Sub20(local59));
					}
				}
			}
			Static272.aBooleanArray51[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIZ)I")
	public static int method412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class2_Sub44 local13 = Static432.method5828(arg2, arg1);
		if (local13 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local13.anIntArray499.length) {
			return local13.anIntArray499[arg0];
		} else {
			return -1;
		}
	}
}
