import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZII)V")
	public static void method5565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class304 local14 = Static401.aClass304ArrayArray1[arg1][arg0];
		if (local14 != null) {
			Static364.anInt6149 = local14.anInt8400;
			Static253.anInt4791 = local14.anInt8403;
			Static282.anInt5124 = local14.anInt8402;
		}
		Static180.method3415();
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
	public static int method5566() {
		if (Static221.aFrame1 == null) {
			return Static318.aBoolean411 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)[Lclient!uu;")
	public static Class369[] method5568() {
		return new Class369[] { Static9.aClass369_1, Static378.aClass369_10, Static189.aClass369_8, Static172.aClass369_7, Static667.aClass369_12, Static12.aClass369_2, Static272.aClass369_4, Static158.aClass369_6, Static141.aClass369_11, Static207.aClass369_9 };
	}
}
