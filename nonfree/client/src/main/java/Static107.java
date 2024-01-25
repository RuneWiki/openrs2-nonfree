import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_35 = new Class359(69, 1);

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	public static int anInt2280 = -1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[Lclient!uaa;B)V")
	public static void method2040(@OriginalArg(0) int arg0, @OriginalArg(1) Class345[] arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			@Pc(10) Class345 local10 = arg1[local5];
			if (local10 != null) {
				if (local10.anInt9591 == 0) {
					if (local10.aClass345Array1 != null) {
						method2040(arg0, local10.aClass345Array1);
					}
					@Pc(31) Class5_Sub39 local31 = (Class5_Sub39) Static452.aClass300_33.method7188((long) local10.anInt9664);
					if (local31 != null) {
						Static162.method2876(local31.anInt6238, arg0);
					}
				}
				@Pc(47) Class5_Sub22 local47;
				if (arg0 == 0 && local10.anObjectArray32 != null) {
					local47 = new Class5_Sub22();
					local47.anObjectArray1 = local10.anObjectArray32;
					local47.aClass345_1 = local10;
					Static652.method8743(local47);
				}
				if (arg0 == 1 && local10.anObjectArray31 != null) {
					if (local10.anInt9611 >= 0) {
						@Pc(72) Class345 local72 = Static264.method4120(local10.anInt9664);
						if (local72 == null || local72.aClass345Array1 == null || local10.anInt9611 >= local72.aClass345Array1.length || local72.aClass345Array1[local10.anInt9611] != local10) {
							continue;
						}
					}
					local47 = new Class5_Sub22();
					local47.aClass345_1 = local10;
					local47.anObjectArray1 = local10.anObjectArray31;
					Static652.method8743(local47);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILclient!ck;[BZII)Lclient!rc;")
	public static Class80_Sub2_Sub1 method2042(@OriginalArg(0) int arg0, @OriginalArg(3) Class65_Sub1 arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) int arg3) {
		if (arg1.aBoolean103 || Static111.method4954(arg3) && Static111.method4954(arg0)) {
			return new Class80_Sub2_Sub1(arg1, 3553, 6406, arg3, arg0, false, arg2, 6406);
		} else if (arg1.aBoolean99) {
			return new Class80_Sub2_Sub1(arg1, 34037, 6406, arg3, arg0, false, arg2, 6406);
		} else {
			return new Class80_Sub2_Sub1(arg1, 6406, arg3, arg0, Static67.method917(arg3), Static67.method917(arg0), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Z")
	public static boolean method2043(@OriginalArg(0) int arg0) {
		if (Static593.aBooleanArray38[arg0]) {
			return true;
		} else if (Static113.aClass390_22.method8931(arg0)) {
			@Pc(26) int local26 = Static113.aClass390_22.method8913(arg0);
			if (local26 == 0) {
				Static593.aBooleanArray38[arg0] = true;
				return true;
			}
			if (Static648.aClass345ArrayArray2[arg0] == null) {
				Static648.aClass345ArrayArray2[arg0] = new Class345[local26];
			}
			for (@Pc(48) int local48 = 0; local48 < local26; local48++) {
				if (Static648.aClass345ArrayArray2[arg0][local48] == null) {
					@Pc(61) byte[] local61 = Static113.aClass390_22.method8914(arg0, local48);
					if (local61 != null) {
						@Pc(73) Class345 local73 = Static648.aClass345ArrayArray2[arg0][local48] = new Class345();
						local73.anInt9664 = local48 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method8064(new Class5_Sub41(local61));
					}
				}
			}
			Static593.aBooleanArray38[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
