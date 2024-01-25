import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!aea;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public static int anInt3181;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
	public static final int anInt3177 = 1;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	public static int anInt3178 = -1;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)Z")
	public static boolean method2895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static469.method6991(arg0, arg1) | Static461.method6933(arg1, arg0)) & Static350.method5749(arg1, arg0);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!d;ZLjava/awt/Canvas;II)Lclient!ha;")
	public static Class33 method2896(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new oa(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public static void method2897() {
		for (@Pc(14) Class3_Sub24 local14 = (Class3_Sub24) Static493.aClass307_47.method7421(); local14 != null; local14 = (Class3_Sub24) Static493.aClass307_47.method7428()) {
			if (local14.aBoolean397) {
				local14.aBoolean397 = false;
			} else {
				Static3.method8622(local14.anInt4636);
			}
		}
	}
}
