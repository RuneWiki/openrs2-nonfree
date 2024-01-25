import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!jc;")
	public static final Class117 aClass117_1 = new Class117("WIP", 2);

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!de", name = "f", descriptor = "I")
	public static int anInt1369 = 16777215;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public static int anInt1373 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([[[Lclient!nt;I)V")
	public static void method1246(@OriginalArg(0) Class164[][][] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class164[][] local17 = arg0[local11];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < local17[local19].length; local23++) {
					@Pc(31) Class164 local31 = local17[local19][local23];
					if (local31 != null) {
						if (local31.aClass16_Sub4_2 instanceof Interface6) {
							((Interface6) local31.aClass16_Sub4_2).method5353();
						}
						if (local31.aClass16_Sub2_2 instanceof Interface6) {
							((Interface6) local31.aClass16_Sub2_2).method5353();
						}
						if (local31.aClass16_Sub2_3 instanceof Interface6) {
							((Interface6) local31.aClass16_Sub2_3).method5353();
						}
						if (local31.aClass16_Sub5_3 instanceof Interface6) {
							((Interface6) local31.aClass16_Sub5_3).method5353();
						}
						if (local31.aClass16_Sub5_2 instanceof Interface6) {
							((Interface6) local31.aClass16_Sub5_2).method5353();
						}
						for (@Pc(81) Class7 local81 = local31.aClass7_3; local81 != null; local81 = local81.aClass7_1) {
							@Pc(86) Class16_Sub1 local86 = local81.aClass16_Sub1_1;
							if (local86 instanceof Interface6) {
								((Interface6) local86).method5353();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!fs;I)V")
	public static void method1249(@OriginalArg(0) Class76 arg0) {
		Static146.aClass76_4 = arg0;
	}
}
