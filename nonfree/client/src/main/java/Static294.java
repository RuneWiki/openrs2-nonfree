import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Lclient!ep;")
	public static Class69 aClass69_2;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "Lclient!eo;")
	public static Class68 aClass68_10 = null;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "[S")
	public static short[] aShortArray68 = new short[256];

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "J")
	public static volatile long aLong159 = 0L;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IB)I")
	public static int method4289(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
	public static void method4290() {
		@Pc(1) Class40[] local1 = Class3_Sub4_Sub7.aClass40Array1;
		synchronized (Class3_Sub4_Sub7.aClass40Array1) {
			for (@Pc(5) int local5 = 0; local5 < Class3_Sub4_Sub7.aClass40Array1.length; local5++) {
				Class3_Sub4_Sub7.aClass40Array1[local5] = new Class40();
				Static251.anIntArray365[local5] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)Z")
	public static boolean method4291(@OriginalArg(0) int arg0) {
		if (Static198.aBooleanArray13[arg0]) {
			return true;
		} else if (Static175.aClass56_59.method1379(arg0)) {
			@Pc(21) int local21 = Static175.aClass56_59.method1373(arg0);
			if (local21 == 0) {
				Static198.aBooleanArray13[arg0] = true;
				return true;
			}
			if (Static300.aClass68ArrayArray3[arg0] == null) {
				Static300.aClass68ArrayArray3[arg0] = new Class68[local21];
			}
			for (@Pc(45) int local45 = 0; local45 < local21; local45++) {
				if (Static300.aClass68ArrayArray3[arg0][local45] == null) {
					@Pc(58) byte[] local58 = Static175.aClass56_59.method1384(arg0, local45);
					if (local58 != null) {
						@Pc(70) Class68 local70 = Static300.aClass68ArrayArray3[arg0][local45] = new Class68();
						local70.anInt2177 = local45 + (arg0 << 16);
						if (local58[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local70.method1733(new Class3_Sub2(local58));
					}
				}
			}
			Static198.aBooleanArray13[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
