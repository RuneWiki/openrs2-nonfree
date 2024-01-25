import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lia", name = "j", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!lia", name = "o", descriptor = "I")
	public static int anInt6085 = 0;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIILclient!wh;[BIZI)Lclient!iba;")
	public static Class3_Sub2_Sub1 method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100_Sub3 arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2.aBoolean709 || Static316.method5292(arg1) && Static316.method5292(arg0)) {
			return new Class3_Sub2_Sub1(arg2, 3553, 6406, arg1, arg0, false, arg3, 6406);
		} else if (arg2.aBoolean710) {
			return new Class3_Sub2_Sub1(arg2, 34037, 6406, arg1, arg0, false, arg3, 6406);
		} else {
			return new Class3_Sub2_Sub1(arg2, 6406, arg1, arg0, Static567.method8129(arg1), Static567.method8129(arg0), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!oi;III)Lclient!ru;")
	public static Class6_Sub2_Sub18 method5303(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1 << 10 | arg0.anInt7524;
		@Pc(19) Class6_Sub2_Sub18 local19 = (Class6_Sub2_Sub18) Static561.aClass195_4.method5381((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static98.aClass353_20.method8419(Static98.aClass353_20.method8408(local10));
		if (local31 == null) {
			local10 = arg2 + 65536 << 10 | arg0.anInt7524;
			local19 = (Class6_Sub2_Sub18) Static561.aClass195_4.method5381((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static98.aClass353_20.method8419(Static98.aClass353_20.method8408(local10));
			if (local31 == null) {
				local10 = arg0.anInt7524 | 0x3FFFC00;
				local19 = (Class6_Sub2_Sub18) Static561.aClass195_4.method5381((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static98.aClass353_20.method8419(Static98.aClass353_20.method8408(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static544.method7951(local31);
					} catch (@Pc(191) Exception local191) {
						throw new RuntimeException(local191.getMessage() + " S: " + local10);
					}
					local19.aClass240_12 = arg0;
					Static561.aClass195_4.method5384((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static544.method7951(local31);
				} catch (@Pc(123) Exception local123) {
					throw new RuntimeException(local123.getMessage() + " S: " + local10);
				}
				local19.aClass240_12 = arg0;
				Static561.aClass195_4.method5384((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static544.method7951(local31);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45.getMessage() + " S: " + local10);
			}
			local19.aClass240_12 = arg0;
			Static561.aClass195_4.method5384((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V")
	public static void method5304(@OriginalArg(1) int arg0) {
		@Pc(21) Class6_Sub2_Sub9 local21 = Static144.method2332(8, arg0);
		local21.method3722();
	}
}
