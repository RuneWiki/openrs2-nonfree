import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class92_Sub2_Sub1 extends Class92_Sub2 {

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "Lclient!uba;")
	private Interface15 anInterface15_1;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	private final int anInt6176;

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
	private final int anInt6172;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
	private final int anInt6169;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
	private final int anInt6174;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
	private final int anInt6171;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
	private final int anInt6177;

	@OriginalMember(owner = "client!mw", name = "j", descriptor = "Lclient!nd;")
	private final Class62_Sub1 aClass62_Sub1_14;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!nd;IIIIII)V")
	public Class92_Sub2_Sub1(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6176 = arg6;
		this.anInt6172 = arg3;
		this.anInt6169 = arg4;
		this.anInt6174 = arg5;
		this.anInt6171 = arg1;
		this.anInt6177 = arg2;
		this.aClass62_Sub1_14 = arg0;
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)Lclient!uba;")
	@Override
	public Interface15 method5138() {
		if (this.anInterface15_1 == null) {
			Static545.anIntArray730[5] = this.anInt6176;
			Static545.anIntArray730[3] = this.anInt6169;
			Static545.anIntArray730[2] = this.anInt6172;
			Static545.anIntArray730[0] = this.anInt6171;
			Static545.anIntArray730[4] = this.anInt6174;
			Static545.anIntArray730[1] = this.anInt6177;
			@Pc(48) Interface8 local48 = this.aClass62_Sub1_14.anInterface8_145;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local48.method7236(Static545.anIntArray730[local54])) {
					return null;
				}
				@Pc(72) Class271 local72 = local48.method7237(Static545.anIntArray730[local54]);
				@Pc(79) int local79 = local72.aBoolean558 ? 64 : 128;
				if (local72.aByte77 > 0) {
					local50 = 1;
				}
				if (local79 > local52) {
					local52 = local79;
				}
			}
			for (@Pc(99) int local99 = 0; local99 < 6; local99++) {
				Static14.anIntArrayArray3[local99] = local48.method7234(local52, local52, false, Static545.anIntArray730[local99], 1.0F);
			}
			this.anInterface15_1 = this.aClass62_Sub1_14.method4761(local52, Static14.anIntArrayArray3, local50 != 0);
		}
		return this.anInterface15_1;
	}
}
