import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
	public static int anInt5144;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString198 = "shake:";

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString199 = "Loaded config";

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "[I")
	public static int[] anIntArray564 = new int[2];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!bh;")
	public static Class1_Sub5_Sub2 method4279(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub5_Sub2 local10 = (Class1_Sub5_Sub2) Static179.aClass112_10.method2951((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static76.aClass119_79.method3235(arg0, 11);
		local10 = new Class1_Sub5_Sub2();
		if (local26 != null) {
			local10.method468(new Class1_Sub13(local26));
		}
		Static179.aClass112_10.method2950((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)V")
	public static void method4283() {
		Static241.aClass175_35.method4288(5);
		Static85.aClass175_12.method4288(5);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!uo;BII)Ljava/awt/Frame;")
	public static Frame method4284(@OriginalArg(0) int arg0, @OriginalArg(2) Class176 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method4375()) {
			return null;
		}
		@Pc(20) Class115[] local20 = Static225.method3627(arg1);
		if (local20 == null) {
			return null;
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < local20.length; local30++) {
			if (arg3 == local20[local30].anInt3479 && arg0 == local20[local30].anInt3482 && (!local28 || local20[local30].anInt3481 > arg2)) {
				arg2 = local20[local30].anInt3481;
				local28 = true;
			}
		}
		if (!local28) {
			return null;
		}
		@Pc(101) Class153 local101 = arg1.method4361(arg2, arg0, arg3);
		while (local101.anInt4614 == 0) {
			Static16.method242(10L);
		}
		@Pc(121) Frame local121 = (Frame) local101.anObject6;
		if (local121 == null) {
			return null;
		} else if (local101.anInt4614 == 2) {
			Static258.method4025(arg1, local121);
			return null;
		} else {
			return local121;
		}
	}
}
