import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "Lclient!mg;")
	public static Class160 aClass160_81;

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
	public static int anInt7096;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "Lclient!vc;")
	public static final Class2_Sub23_Sub2 aClass2_Sub23_Sub2_1 = new Class2_Sub23_Sub2(5000);

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "[S")
	public static final short[] aShortArray112 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIILclient!dr;I)Ljava/awt/Frame;")
	public static Frame method5607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class59 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method1369()) {
			return null;
		}
		@Pc(20) Class137[] local20 = Static429.method5148(arg2);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (local20[local28].anInt3706 == arg3 && local20[local28].anInt3709 == arg1 && (!local26 || local20[local28].anInt3707 > arg0)) {
				local26 = true;
				arg0 = local20[local28].anInt3707;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(97) Class138 local97 = arg2.method1371(arg1, arg3, arg0);
		while (local97.anInt3723 == 0) {
			Static81.method1477(10L);
		}
		@Pc(111) Frame local111 = (Frame) local97.anObject7;
		if (local111 == null) {
			return null;
		} else if (local97.anInt3723 == 2) {
			Static20.method453(local111, arg2);
			return null;
		} else {
			return local111;
		}
	}
}
