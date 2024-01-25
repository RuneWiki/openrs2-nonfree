import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "[I")
	public static final int[] anIntArray648 = new int[3];

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
	public static int anInt10702 = 0;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public static void method8987() {
		Static389.aClass6_Sub2_Sub4_3 = new Class6_Sub2_Sub4(Static317.aClass192_4.method5299(Static307.anInt5931), "", Static351.anInt6586, 1009, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!cs;)V")
	public static void method8988(@OriginalArg(1) Class6_Sub2_Sub4 arg0) {
		if (arg0 == null) {
			return;
		}
		Static298.aClass8_34.method157(arg0);
		Static462.anInt8179++;
		@Pc(36) Class6_Sub2_Sub12 local36;
		if (arg0.aBoolean120 || "".equals(arg0.aString20)) {
			local36 = new Class6_Sub2_Sub12(arg0.aString20);
			Static608.anInt10066++;
		} else {
			@Pc(44) long local44 = arg0.aLong41;
			for (local36 = (Class6_Sub2_Sub12) Static494.aClass128_39.method3560(local44); local36 != null && !local36.aString58.equals(arg0.aString20); local36 = (Class6_Sub2_Sub12) Static494.aClass128_39.method3553()) {
			}
			if (local36 == null) {
				local36 = (Class6_Sub2_Sub12) Static69.aClass166_7.method4805(local44);
				if (local36 != null && !local36.aString58.equals(arg0.aString20)) {
					local36 = null;
				}
				if (local36 == null) {
					local36 = new Class6_Sub2_Sub12(arg0.aString20);
				}
				Static494.aClass128_39.method3551(local44, local36);
				Static608.anInt10066++;
			}
		}
		if (local36.method4846(arg0)) {
			Static422.method6626(local36);
		}
	}

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "(II)Lclient!ru;")
	public static Class6_Sub2_Sub18 method8991(@OriginalArg(1) int arg0) {
		@Pc(18) Class6_Sub2_Sub18 local18 = (Class6_Sub2_Sub18) Static561.aClass195_4.method5381((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static98.aClass353_20.method8404(arg0, 0);
		if (local28 == null || local28.length <= 1) {
			return null;
		}
		try {
			local18 = Static544.method7951(local28);
		} catch (@Pc(44) Exception local44) {
			throw new RuntimeException(local44.getMessage() + " S: " + arg0);
		}
		Static561.aClass195_4.method5384((long) arg0, local18);
		return local18;
	}
}
