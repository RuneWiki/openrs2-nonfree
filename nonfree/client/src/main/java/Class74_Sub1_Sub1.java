import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class74_Sub1_Sub1 extends Class74_Sub1 {

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "Lclient!on;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!waa", name = "u", descriptor = "I")
	private final int anInt10713;

	@OriginalMember(owner = "client!waa", name = "v", descriptor = "I")
	private final int anInt10718;

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
	private final int anInt10717;

	@OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
	private final int anInt10716;

	@OriginalMember(owner = "client!waa", name = "w", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_22;

	@OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
	private final int anInt10721;

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
	private final int anInt10719;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!lb;IIIIII)V")
	public Class74_Sub1_Sub1(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10713 = arg1;
		this.anInt10718 = arg6;
		this.anInt10717 = arg2;
		this.anInt10716 = arg5;
		this.aClass145_Sub1_22 = arg0;
		this.anInt10721 = arg3;
		this.anInt10719 = arg4;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)Lclient!on;")
	@Override
	public Interface18 method9373() {
		if (this.anInterface18_1 == null) {
			@Pc(18) Interface3 local18 = this.aClass145_Sub1_22.anInterface3_12;
			Static116.anIntArray153[0] = this.anInt10713;
			Static116.anIntArray153[5] = this.anInt10718;
			Static116.anIntArray153[1] = this.anInt10717;
			Static116.anIntArray153[3] = this.anInt10719;
			Static116.anIntArray153[2] = this.anInt10721;
			Static116.anIntArray153[4] = this.anInt10716;
			@Pc(50) byte local50 = 0;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local18.method2852(Static116.anIntArray153[local54])) {
					return null;
				}
				@Pc(75) Class8 local75 = local18.method2857(Static116.anIntArray153[local54]);
				@Pc(83) int local83 = local75.aBoolean28 ? 64 : 128;
				if (local83 > local52) {
					local52 = local83;
				}
				if (local75.aByte10 > 0) {
					local50 = 1;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static513.anIntArrayArray52[local102] = local18.method2853(Static116.anIntArray153[local102], 1.0F, local52, local52, false);
			}
			this.anInterface18_1 = this.aClass145_Sub1_22.method9740(local50 != 0, Static513.anIntArrayArray52, local52);
		}
		return this.anInterface18_1;
	}
}
