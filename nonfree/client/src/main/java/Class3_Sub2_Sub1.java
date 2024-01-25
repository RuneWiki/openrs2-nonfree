import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Lclient!wf;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
	private final int anInt3688;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
	private final int anInt3689;

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
	private final int anInt3684;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
	private final int anInt3692;

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
	private final int anInt3690;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_7;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
	private final int anInt3687;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!mj;IIIIII)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3688 = arg4;
		this.anInt3689 = arg2;
		this.anInt3684 = arg5;
		this.anInt3692 = arg1;
		this.anInt3690 = arg3;
		this.aClass101_Sub1_7 = arg0;
		this.anInt3687 = arg6;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lclient!wf;")
	@Override
	public Interface26 method3428() {
		if (this.anInterface26_1 == null) {
			Static377.anIntArray347[0] = this.anInt3692;
			Static377.anIntArray347[3] = this.anInt3688;
			Static377.anIntArray347[1] = this.anInt3689;
			Static377.anIntArray347[5] = this.anInt3687;
			Static377.anIntArray347[2] = this.anInt3690;
			@Pc(43) Interface3 local43 = this.aClass101_Sub1_7.anInterface3_12;
			Static377.anIntArray347[4] = this.anInt3684;
			@Pc(50) boolean local50 = false;
			@Pc(52) int local52 = 0;
			for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
				if (!local43.method1940(Static377.anIntArray347[local54])) {
					return null;
				}
				@Pc(74) Class136 local74 = local43.method1941(Static377.anIntArray347[local54]);
				@Pc(81) int local81 = local74.aBoolean333 ? 64 : 128;
				if (local74.aByte63 > 0) {
					local50 = true;
				}
				if (local52 < local81) {
					local52 = local81;
				}
			}
			for (@Pc(104) int local104 = 0; local104 < 6; local104++) {
				Static78.anIntArrayArray7[local104] = local43.method1938(false, 1.0F, local52, Static377.anIntArray347[local104], local52);
			}
			this.anInterface26_1 = this.aClass101_Sub1_7.method5880(local50, Static78.anIntArrayArray7, local52);
		}
		return this.anInterface26_1;
	}
}
