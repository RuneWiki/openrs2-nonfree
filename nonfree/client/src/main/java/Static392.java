import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!kk;)[Lclient!wm;")
	public static Class380[] method6100(@OriginalArg(1) Class192 arg0) {
		if (!arg0.method4325()) {
			return new Class380[0];
		}
		@Pc(16) Class330 local16 = arg0.method4323();
		while (local16.anInt9132 == 0) {
			Static452.method7478(10L);
		}
		if (local16.anInt9132 == 2) {
			return new Class380[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject19;
		@Pc(43) Class380[] local43 = new Class380[local37.length >> 2];
		for (@Pc(50) int local50 = 0; local50 < local43.length; local50++) {
			@Pc(56) Class380 local56 = new Class380();
			local43[local50] = local56;
			local56.anInt10349 = local37[local50 << 2];
			local56.anInt10348 = local37[(local50 << 2) + 1];
			local56.anInt10353 = local37[(local50 << 2) + 2];
			local56.anInt10347 = local37[(local50 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V")
	public static void method6101(@OriginalArg(1) int arg0) {
		Static283.anInt4649 = arg0;
		Static1.aClass293_43.method6930();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZIIIIZI)V")
	public static void method6102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if ((arg4 ? Static627.aClass5_Sub46_31.aClass11_Sub17_3.method5908() : Static627.aClass5_Sub46_31.aClass11_Sub17_2.method5908()) != 0 && arg1 != 0 && Static44.anInt730 < 50 && arg2 != -1) {
			Static113.aClass59Array1[Static44.anInt730++] = new Class59((byte) (arg4 ? 3 : 2), arg2, arg1, arg5, arg0, 0, arg3, (Class14_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "(B)V")
	public static void method6103() {
		Static368.aClass368_2.method8529();
	}
}
