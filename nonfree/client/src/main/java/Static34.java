import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "Lclient!l;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "[I")
	public static final int[] anIntArray49 = new int[14];

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "[Lclient!ao;")
	public static final Class13[] aClass13Array1 = new Class13[4];

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public static int anInt781 = 0;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!tj;)V")
	public static void method638(@OriginalArg(0) Class122 arg0) {
		for (@Pc(1) int local1 = Static262.anInt6843; local1 < Static131.anInt2754; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static103.anInt2156; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static116.anInt2499; local7++) {
					@Pc(16) Class45 local16 = Static256.aClass45ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class5_Sub5 local21 = local16.aClass5_Sub5_1;
						@Pc(24) Class5_Sub5 local24 = local16.aClass5_Sub5_2;
						if (local21 != null && local21.method5327()) {
							Static20.method418(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5327()) {
								Static20.method418(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5333(0, arg0, 0, false, local21, 0);
								local24.method5328();
							}
							local21.method5328();
						}
						for (@Pc(70) Class160 local70 = local16.aClass160_1; local70 != null; local70 = local70.aClass160_3) {
							@Pc(74) Class5_Sub4 local74 = local70.aClass5_Sub4_1;
							if (local74 != null && local74.method5327()) {
								Static20.method418(arg0, local74, local1, local4, local7, local74.aShort89 + 1 - local74.aShort86, local74.aShort88 - local74.aShort87 + 1);
								local74.method5328();
							}
						}
						@Pc(111) Class5_Sub3 local111 = local16.aClass5_Sub3_1;
						if (local111 != null && local111.method5327()) {
							Static344.method5615(arg0, local111, local1, local4, local7);
							local111.method5328();
						}
					}
				}
			}
		}
	}
}
