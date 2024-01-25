import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gw", name = "x", descriptor = "Lclient!fo;")
	public static Class82 aClass82_39;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "Lclient!o;")
	public static Class6 aClass6_28;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_75 = new Class12(6, -1);

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	public static int anInt2499 = -1;

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_76 = new Class12(76, 3);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Lclient!uc;")
	public static Class4_Sub7 method2157(@OriginalArg(0) int arg0) {
		@Pc(15) Class262[] local15 = Class38_Sub8.aClass262Array1;
		synchronized (Class38_Sub8.aClass262Array1) {
			@Pc(35) Class4_Sub7 local35;
			if (Class38_Sub8.aClass262Array1.length <= arg0 || Class38_Sub8.aClass262Array1[arg0].method5817()) {
				local35 = new Class4_Sub7();
				local35.aClass4_Sub8Array1 = new Class4_Sub8[arg0];
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					local35.aClass4_Sub8Array1[local41] = new Class4_Sub8();
				}
			} else {
				local35 = (Class4_Sub7) Class38_Sub8.aClass262Array1[arg0].method5811();
				local35.method5572();
				@Pc(70) int local70 = Static183.anIntArray205[arg0]--;
			}
			return local35;
		}
	}
}
