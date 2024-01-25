import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class144_Sub1_Sub1 extends Class144_Sub1 {

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Lclient!ks;")
	private Interface16 anInterface16_1;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	private final int anInt7687;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	private final int anInt7689;

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	private final int anInt7681;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Lclient!pj;")
	private final Class137_Sub1 aClass137_Sub1_11;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	private final int anInt7685;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
	private final int anInt7688;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	private final int anInt7686;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!pj;IIIIII)V")
	public Class144_Sub1_Sub1(@OriginalArg(0) Class137_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt7687 = arg4;
		this.anInt7689 = arg1;
		this.anInt7681 = arg6;
		this.aClass137_Sub1_11 = arg0;
		this.anInt7685 = arg3;
		this.anInt7688 = arg5;
		this.anInt7686 = arg2;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lclient!ks;")
	@Override
	public Interface16 method6303() {
		if (this.anInterface16_1 == null) {
			Static476.anIntArray628[2] = this.anInt7685;
			Static476.anIntArray628[4] = this.anInt7688;
			@Pc(28) Interface3 local28 = this.aClass137_Sub1_11.anInterface3_11;
			Static476.anIntArray628[1] = this.anInt7686;
			Static476.anIntArray628[0] = this.anInt7689;
			Static476.anIntArray628[5] = this.anInt7681;
			Static476.anIntArray628[3] = this.anInt7687;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local28.method6181(Static476.anIntArray628[local54])) {
					return null;
				}
				@Pc(72) Class224 local72 = local28.method6177(Static476.anIntArray628[local54]);
				@Pc(79) int local79 = local72.aBoolean455 ? 64 : 128;
				if (local72.aByte95 > 0) {
					local50 = true;
				}
				if (local79 > local52) {
					local52 = local79;
				}
			}
			for (@Pc(98) int local98 = 0; local98 < 6; local98++) {
				Static257.anIntArrayArray33[local98] = local28.method6180(local52, local52, false, Static476.anIntArray628[local98], 1.0F);
			}
			this.anInterface16_1 = this.aClass137_Sub1_11.method8023(local50, local52, Static257.anIntArrayArray33);
		}
		return this.anInterface16_1;
	}
}
