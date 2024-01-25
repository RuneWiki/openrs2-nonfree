import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class29_Sub2_Sub2 extends Class29_Sub2 {

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "Lclient!od;")
	private Class32_Sub3 aClass32_Sub3_2;

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
	private final int anInt10834;

	@OriginalMember(owner = "client!ww", name = "v", descriptor = "I")
	private final int anInt10824;

	@OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
	private final int anInt10831;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_43;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
	private final int anInt10829;

	@OriginalMember(owner = "client!ww", name = "r", descriptor = "I")
	private final int anInt10827;

	@OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
	private final int anInt10823;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lclient!ffa;IIIIII)V")
	public Class29_Sub2_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10834 = arg4;
		this.anInt10824 = arg2;
		this.anInt10831 = arg5;
		this.aClass57_Sub2_43 = arg0;
		this.anInt10829 = arg3;
		this.anInt10827 = arg6;
		this.anInt10823 = arg1;
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)Lclient!od;")
	@Override
	public Class32_Sub3 method9316() {
		if (this.aClass32_Sub3_2 == null) {
			Static460.anIntArray471[5] = this.anInt10827;
			Static460.anIntArray471[2] = this.anInt10829;
			Static460.anIntArray471[0] = this.anInt10823;
			Static460.anIntArray471[4] = this.anInt10831;
			Static460.anIntArray471[3] = this.anInt10834;
			Static460.anIntArray471[1] = this.anInt10824;
			@Pc(50) Interface1 local50 = this.aClass57_Sub2_43.anInterface1_11;
			@Pc(52) boolean local52 = false;
			@Pc(54) int local54 = 0;
			for (@Pc(56) int local56 = 0; local56 < 6; local56++) {
				if (!local50.method2860(Static460.anIntArray471[local56])) {
					return null;
				}
				@Pc(77) Class233 local77 = local50.method2863(Static460.anIntArray471[local56]);
				@Pc(85) int local85 = local77.aBoolean485 ? 64 : 128;
				if (local77.aByte95 > 0) {
					local52 = true;
				}
				if (local85 > local54) {
					local54 = local85;
				}
			}
			for (@Pc(107) int local107 = 0; local107 < 6; local107++) {
				Static323.anIntArrayArray36[local107] = local50.method2861(false, Static460.anIntArray471[local107], local54, local54, 1.0F);
			}
			this.aClass32_Sub3_2 = new Class32_Sub3(this.aClass57_Sub2_43, 6407, local54, local52, Static323.anIntArrayArray36);
		}
		return this.aClass32_Sub3_2;
	}
}
