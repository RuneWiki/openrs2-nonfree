import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ega", name = "x", descriptor = "Lclient!vf;")
	public static Class370 aClass370_2;

	@OriginalMember(owner = "client!ega", name = "r", descriptor = "Lclient!qj;")
	public static final Class295 aClass295_9 = new Class295(128, 4);

	@OriginalMember(owner = "client!ega", name = "s", descriptor = "[I")
	public static final int[] anIntArray143 = new int[2048];

	@OriginalMember(owner = "client!ega", name = "w", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_28 = new Class240(67, -1);

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!td;B)V")
	public static void method2274(@OriginalArg(0) Class3_Sub5_Sub18 arg0) {
		if (arg0 == null) {
			return;
		}
		Static582.aClass302_69.method6613(arg0);
		Static166.anInt3037++;
		@Pc(38) Class3_Sub5_Sub13 local38;
		if (arg0.aBoolean642 || "".equals(arg0.aString106)) {
			local38 = new Class3_Sub5_Sub13(arg0.aString106);
			Static610.anInt10153++;
		} else {
			@Pc(46) long local46 = arg0.aLong258;
			for (local38 = (Class3_Sub5_Sub13) Static141.aClass333_12.method7489(local46); local38 != null && !local38.aString79.equals(arg0.aString106); local38 = (Class3_Sub5_Sub13) Static141.aClass333_12.method7484()) {
			}
			if (local38 == null) {
				local38 = (Class3_Sub5_Sub13) Static294.aClass295_71.method6470(local46);
				if (local38 != null && !local38.aString79.equals(arg0.aString106)) {
					local38 = null;
				}
				if (local38 == null) {
					local38 = new Class3_Sub5_Sub13(arg0.aString106);
				}
				Static141.aClass333_12.method7488(local46, local38);
				Static610.anInt10153++;
			}
		}
		if (local38.method5267(arg0)) {
			Static591.method7803(local38);
		}
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(II)V")
	public static void method2275(@OriginalArg(1) int arg0) {
		Static426.anInt6954 = -1;
		Static594.anInt9606 = arg0;
		Static426.anInt6954 = -1;
		Static2.method25();
	}
}
