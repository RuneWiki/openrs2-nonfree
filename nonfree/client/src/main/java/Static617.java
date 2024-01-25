import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
	public static int anInt9691;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public static int anInt9687 = 0;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
	public static int anInt9695 = 0;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!vk;B)I")
	public static int method8307(@OriginalArg(0) Class3_Sub1_Sub2_Sub2_Sub2 arg0) {
		@Pc(8) Class345 local8 = arg0.aClass345_1;
		if (local8.anIntArray624 != null) {
			local8 = local8.method7529(Static526.aClass293_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt8813;
		@Pc(35) Class377 local35 = arg0.method8525();
		if (arg0.anInt9967 == -1 || arg0.aBoolean776) {
			local23 = local8.anInt8769;
		} else if (arg0.anInt9967 == local35.anInt10039 || local35.anInt10035 == arg0.anInt9967 || arg0.anInt9967 == local35.anInt10051 || local35.anInt10062 == arg0.anInt9967) {
			local23 = local8.anInt8782;
		} else if (arg0.anInt9967 == local35.anInt10063 || arg0.anInt9967 == local35.anInt10068 || arg0.anInt9967 == local35.anInt10054 || local35.anInt10044 == arg0.anInt9967) {
			local23 = local8.anInt8789;
		}
		return local23;
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)I")
	public static int method8312() {
		return Static31.aClass353_3.method7685();
	}
}
