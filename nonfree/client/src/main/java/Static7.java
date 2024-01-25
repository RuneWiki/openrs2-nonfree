import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public static int anInt94;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!fl;B)I")
	public static int method70(@OriginalArg(0) Class23_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt3291;
		@Pc(12) Class351 local12 = arg0.method8630();
		if (arg0.anInt10148 == -1 || arg0.aBoolean748) {
			local8 = arg0.anInt3280;
		} else if (arg0.anInt10148 == local12.anInt9413 || local12.anInt9387 == arg0.anInt10148 || arg0.anInt10148 == local12.anInt9406 || arg0.anInt10148 == local12.anInt9404) {
			local8 = arg0.anInt3288;
		} else if (local12.anInt9417 == arg0.anInt10148 || local12.anInt9400 == arg0.anInt10148 || arg0.anInt10148 == local12.anInt9411 || arg0.anInt10148 == local12.anInt9386) {
			local8 = arg0.anInt3284;
		}
		return local8;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Z")
	public static boolean method71(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!lia;")
	public static RuntimeException_Sub1 method72(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString77 = local9.aString77 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
